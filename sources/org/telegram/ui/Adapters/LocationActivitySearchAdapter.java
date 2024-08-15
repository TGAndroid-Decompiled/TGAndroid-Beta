package org.telegram.ui.Adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC$TL_messageMediaVenue;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.LocationCell;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.RecyclerListView;
public class LocationActivitySearchAdapter extends BaseLocationAdapter {
    private FlickerLoadingView globalGradientView;
    private Context mContext;
    private boolean myLocationDenied;
    private Theme.ResourcesProvider resourcesProvider;

    @Override
    public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
        return true;
    }

    public void setMyLocationDenied(boolean z) {
        if (this.myLocationDenied == z) {
            return;
        }
        this.myLocationDenied = z;
    }

    public LocationActivitySearchAdapter(Context context, Theme.ResourcesProvider resourcesProvider, boolean z, boolean z2) {
        super(z, z2);
        this.myLocationDenied = false;
        this.mContext = context;
        this.resourcesProvider = resourcesProvider;
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context);
        this.globalGradientView = flickerLoadingView;
        flickerLoadingView.setIsSingleCell(true);
    }

    @Override
    public int getItemCount() {
        int size = this.locations.isEmpty() ? 0 : 0 + this.locations.size() + 1;
        if (this.myLocationDenied) {
            return size;
        }
        if (isSearching()) {
            return size + 3;
        }
        if (!this.locations.isEmpty() && !this.places.isEmpty()) {
            size++;
        }
        return size + this.places.size();
    }

    public boolean isEmpty() {
        return this.places.size() == 0 && this.locations.size() == 0;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View graySectionCell;
        if (i == 0) {
            graySectionCell = new LocationCell(this.mContext, false, this.resourcesProvider);
        } else {
            graySectionCell = new GraySectionCell(this.mContext, this.resourcesProvider);
        }
        return new RecyclerListView.Holder(graySectionCell);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        TLRPC$TL_messageMediaVenue tLRPC$TL_messageMediaVenue;
        int i2;
        boolean z = true;
        if (viewHolder.getItemViewType() == 0) {
            int i3 = !this.locations.isEmpty() ? i - 1 : i;
            if (i3 >= 0 && i3 < this.locations.size()) {
                tLRPC$TL_messageMediaVenue = this.locations.get(i3);
                i2 = 2;
            } else {
                if (!isSearching()) {
                    int size = i3 - this.locations.size();
                    if (!this.searchingLocations && !this.locations.isEmpty()) {
                        size--;
                    }
                    i2 = size;
                    if (i2 >= 0 && i2 < this.places.size()) {
                        tLRPC$TL_messageMediaVenue = this.places.get(i2);
                    }
                }
                tLRPC$TL_messageMediaVenue = null;
                i2 = i;
            }
            LocationCell locationCell = (LocationCell) viewHolder.itemView;
            if (i == getItemCount() - 1 || (!this.searchingLocations && !this.locations.isEmpty() && i == this.locations.size())) {
                z = false;
            }
            locationCell.setLocation(tLRPC$TL_messageMediaVenue, i2, z);
        } else if (viewHolder.getItemViewType() == 1) {
            if (i == 0 && !this.locations.isEmpty()) {
                ((GraySectionCell) viewHolder.itemView).setText(LocaleController.getString("LocationOnMap", R.string.LocationOnMap));
            } else {
                ((GraySectionCell) viewHolder.itemView).setText(LocaleController.getString("NearbyVenue", R.string.NearbyVenue));
            }
        }
    }

    @Override
    public int getItemViewType(int i) {
        return ((i == 0 || i == this.locations.size() + 1) && !this.locations.isEmpty()) ? 1 : 0;
    }

    public TLRPC$TL_messageMediaVenue getItem(int i) {
        if (!this.locations.isEmpty()) {
            i--;
        }
        if (i >= 0 && i < this.locations.size()) {
            return this.locations.get(i);
        }
        if (isSearching()) {
            return null;
        }
        int size = i - this.locations.size();
        if (!this.locations.isEmpty()) {
            size--;
        }
        if (size < 0 || size >= this.places.size()) {
            return null;
        }
        return this.places.get(size);
    }
}
