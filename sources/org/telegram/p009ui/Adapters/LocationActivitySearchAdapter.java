package org.telegram.p009ui.Adapters;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.p009ui.Cells.LocationCell;
import org.telegram.p009ui.Components.FlickerLoadingView;
import org.telegram.p009ui.Components.RecyclerListView;
import org.telegram.tgnet.TLRPC$TL_messageMediaVenue;

public class LocationActivitySearchAdapter extends BaseLocationAdapter {
    private FlickerLoadingView globalGradientView;
    private Context mContext;

    @Override
    public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
        return true;
    }

    public LocationActivitySearchAdapter(Context context) {
        this.mContext = context;
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context);
        this.globalGradientView = flickerLoadingView;
        flickerLoadingView.setIsSingleCell(true);
    }

    @Override
    public int getItemCount() {
        if (isSearching()) {
            return 3;
        }
        return this.places.size();
    }

    public boolean isEmpty() {
        return this.places.size() == 0;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new RecyclerListView.Holder(new LocationCell(this.mContext, false, null));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        TLRPC$TL_messageMediaVenue item = getItem(i);
        String str = (isSearching() || i < 0 || i >= this.iconUrls.size()) ? null : this.iconUrls.get(i);
        LocationCell locationCell = (LocationCell) viewHolder.itemView;
        boolean z = true;
        if (i == getItemCount() - 1) {
            z = false;
        }
        locationCell.setLocation(item, str, i, z);
    }

    public TLRPC$TL_messageMediaVenue getItem(int i) {
        if (!isSearching() && i >= 0 && i < this.places.size()) {
            return this.places.get(i);
        }
        return null;
    }
}
