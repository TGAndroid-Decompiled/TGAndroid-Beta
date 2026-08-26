package org.telegram.ui.Adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.LocationCell;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.RecyclerListView;

public abstract class LocationActivitySearchAdapter extends BaseLocationAdapter {
    public final Context mContext;
    public boolean myLocationDenied;
    public final Theme.ResourcesProvider resourcesProvider;

    public LocationActivitySearchAdapter(Context context, Theme.ResourcesProvider resourcesProvider, boolean z, boolean z2) {
        super(z, z2);
        this.myLocationDenied = false;
        this.mContext = context;
        this.resourcesProvider = resourcesProvider;
        new FlickerLoadingView(context, null).setIsSingleCell(true);
    }

    public final TLRPC.TL_messageMediaVenue getItem(int i) {
        ArrayList arrayList = this.locations;
        if (!arrayList.isEmpty()) {
            i--;
        }
        if (i >= 0 && i < arrayList.size()) {
            return (TLRPC.TL_messageMediaVenue) arrayList.get(i);
        }
        if (this.searchInProgress) {
            return null;
        }
        int size = i - arrayList.size();
        if (!arrayList.isEmpty()) {
            size--;
        }
        if (size < 0) {
            return null;
        }
        ArrayList arrayList2 = this.places;
        if (size < arrayList2.size()) {
            return (TLRPC.TL_messageMediaVenue) arrayList2.get(size);
        }
        return null;
    }

    @Override
    public final int getItemCount() {
        ArrayList arrayList = this.locations;
        int size = !arrayList.isEmpty() ? arrayList.size() + 1 : 0;
        if (this.myLocationDenied) {
            return size;
        }
        if (this.searchInProgress) {
            return size + 3;
        }
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.places;
        if (!zIsEmpty && !arrayList2.isEmpty()) {
            size++;
        }
        return arrayList2.size() + size;
    }

    @Override
    public final int getItemViewType(int i) {
        ArrayList arrayList = this.locations;
        return ((i == 0 || i == arrayList.size() + 1) && !arrayList.isEmpty()) ? 1 : 0;
    }

    @Override
    public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
        return true;
    }

    @Override
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        int i2;
        int i3 = viewHolder.mItemViewType;
        ArrayList arrayList = this.locations;
        boolean z = true;
        View view = viewHolder.itemView;
        if (i3 != 0) {
            if (i3 == 1) {
                if (i != 0 || arrayList.isEmpty()) {
                    ((GraySectionCell) view).setText(LocaleController.getString(R.string.NearbyVenue));
                    return;
                } else {
                    ((GraySectionCell) view).setText(LocaleController.getString(R.string.LocationOnMap));
                    return;
                }
            }
            return;
        }
        int i4 = !arrayList.isEmpty() ? i - 1 : i;
        if (i4 >= 0 && i4 < arrayList.size()) {
            tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i4);
            i2 = 2;
        } else if (this.searchInProgress) {
            tL_messageMediaVenue = null;
            i2 = i;
        } else {
            int size = i4 - arrayList.size();
            if (!this.searchingLocations && !arrayList.isEmpty()) {
                size--;
            }
            i2 = size;
            if (i2 >= 0) {
                ArrayList arrayList2 = this.places;
                if (i2 < arrayList2.size()) {
                    tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList2.get(i2);
                } else {
                    tL_messageMediaVenue = null;
                    i2 = i;
                }
            } else {
                tL_messageMediaVenue = null;
                i2 = i;
            }
        }
        LocationCell locationCell = (LocationCell) view;
        if (i == getItemCount() - 1 || (!this.searchingLocations && !arrayList.isEmpty() && i == arrayList.size())) {
            z = false;
        }
        locationCell.setLocation(tL_messageMediaVenue, i2, z, false);
    }

    @Override
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Context context = this.mContext;
        return new RecyclerListView.Holder(i == 0 ? new LocationCell(context, resourcesProvider) : new GraySectionCell(context, 16, resourcesProvider));
    }
}
