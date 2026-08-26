package org.telegram.ui.Adapters;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.LocationCell;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.RecyclerListView;

public abstract class LocationActivitySearchAdapter extends BaseLocationAdapter {
    private static final int VIEW_TYPE_LOCATION = 0;
    private static final int VIEW_TYPE_SECTION = 1;
    private FlickerLoadingView globalGradientView;
    private Context mContext;
    private boolean myLocationDenied;
    private Theme.ResourcesProvider resourcesProvider;

    public LocationActivitySearchAdapter(Context context, boolean z, boolean z2, Theme.ResourcesProvider resourcesProvider) {
        super(z, z2);
        this.myLocationDenied = false;
        this.mContext = context;
        this.resourcesProvider = resourcesProvider;
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context);
        this.globalGradientView = flickerLoadingView;
        flickerLoadingView.setIsSingleCell(true);
    }

    public TLRPC.TL_messageMediaVenue getItem(int i) {
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

    @Override
    public int getItemCount() {
        int size = !this.locations.isEmpty() ? this.locations.size() + 1 : 0;
        if (this.myLocationDenied) {
            return size;
        }
        if (isSearching()) {
            return size + 3;
        }
        if (!this.locations.isEmpty() && !this.places.isEmpty()) {
            size++;
        }
        return this.places.size() + size;
    }

    @Override
    public int getItemViewType(int i) {
        return ((i == 0 || i == this.locations.size() + 1) && !this.locations.isEmpty()) ? 1 : 0;
    }

    public boolean isEmpty() {
        return this.places.size() == 0 && this.locations.size() == 0;
    }

    @Override
    public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
        return true;
    }

    @Override
    public void notifyStartSearch(boolean z, int i, boolean z2) {
        if (z) {
            return;
        }
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        int i2;
        boolean z = true;
        if (viewHolder.getItemViewType() != 0) {
            if (viewHolder.getItemViewType() == 1) {
                if (i != 0 || this.locations.isEmpty()) {
                    ((GraySectionCell) viewHolder.itemView).setText(LocaleController.getString(R.string.NearbyVenue));
                    return;
                } else {
                    ((GraySectionCell) viewHolder.itemView).setText(LocaleController.getString(R.string.LocationOnMap));
                    return;
                }
            }
            return;
        }
        int i3 = !this.locations.isEmpty() ? i - 1 : i;
        if (i3 >= 0 && i3 < this.locations.size()) {
            tL_messageMediaVenue = this.locations.get(i3);
            i2 = 2;
        } else if (isSearching()) {
            tL_messageMediaVenue = null;
            i2 = i;
        } else {
            int size = i3 - this.locations.size();
            if (!this.searchingLocations && !this.locations.isEmpty()) {
                size--;
            }
            i2 = size;
            if (i2 < 0 || i2 >= this.places.size()) {
                tL_messageMediaVenue = null;
                i2 = i;
            } else {
                tL_messageMediaVenue = this.places.get(i2);
            }
        }
        LocationCell locationCell = (LocationCell) viewHolder.itemView;
        if (i == getItemCount() - 1 || (!this.searchingLocations && !this.locations.isEmpty() && i == this.locations.size())) {
            z = false;
        }
        locationCell.setLocation(tL_messageMediaVenue, i2, z, false);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new RecyclerListView.Holder(i == 0 ? new LocationCell(this.mContext, this.resourcesProvider) : new GraySectionCell(this.mContext, 16, this.resourcesProvider));
    }

    public void setMyLocationDenied(boolean z) {
        if (this.myLocationDenied == z) {
            return;
        }
        this.myLocationDenied = z;
    }
}
