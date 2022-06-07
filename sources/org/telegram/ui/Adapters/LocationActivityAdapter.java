package org.telegram.ui.Adapters;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.location.Location;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC$TL_channelLocation;
import org.telegram.tgnet.TLRPC$TL_geoPoint;
import org.telegram.tgnet.TLRPC$TL_messageMediaVenue;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.LocationCell;
import org.telegram.ui.Cells.LocationDirectionCell;
import org.telegram.ui.Cells.LocationLoadingCell;
import org.telegram.ui.Cells.LocationPoweredCell;
import org.telegram.ui.Cells.SendLocationCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.SharingLiveLocationCell;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.LocationActivity;

public class LocationActivityAdapter extends BaseLocationAdapter implements LocationController.LocationFetchCallback {
    private String addressName;
    private TLRPC$TL_channelLocation chatLocation;
    private MessageObject currentMessageObject;
    private Location customLocation;
    private long dialogId;
    private FrameLayout emptyCell;
    private boolean fetchingLocation;
    private FlickerLoadingView globalGradientView;
    private Location gpsLocation;
    private int locationType;
    private Context mContext;
    private boolean needEmptyView;
    private int overScrollHeight;
    private Location previousFetchedLocation;
    private final Theme.ResourcesProvider resourcesProvider;
    private SendLocationCell sendLocationCell;
    private Runnable updateRunnable;
    private int currentAccount = UserConfig.selectedAccount;
    private int shareLiveLocationPotistion = -1;
    private ArrayList<LocationActivity.LiveLocation> currentLiveLocations = new ArrayList<>();
    private boolean myLocationDenied = false;

    protected void onDirectionClick() {
    }

    public LocationActivityAdapter(Context context, int i, long j, boolean z, Theme.ResourcesProvider resourcesProvider) {
        this.mContext = context;
        this.locationType = i;
        this.dialogId = j;
        this.needEmptyView = z;
        this.resourcesProvider = resourcesProvider;
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context);
        this.globalGradientView = flickerLoadingView;
        flickerLoadingView.setIsSingleCell(true);
    }

    public void setMyLocationDenied(boolean z) {
        if (this.myLocationDenied != z) {
            this.myLocationDenied = z;
            notifyDataSetChanged();
        }
    }

    public void setOverScrollHeight(int i) {
        this.overScrollHeight = i;
        FrameLayout frameLayout = this.emptyCell;
        if (frameLayout != null) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) frameLayout.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new RecyclerView.LayoutParams(-1, this.overScrollHeight);
            } else {
                ((ViewGroup.MarginLayoutParams) layoutParams).height = this.overScrollHeight;
            }
            this.emptyCell.setLayoutParams(layoutParams);
            this.emptyCell.forceLayout();
        }
    }

    public void setUpdateRunnable(Runnable runnable) {
        this.updateRunnable = runnable;
    }

    public void setGpsLocation(Location location) {
        int i;
        boolean z = this.gpsLocation == null;
        this.gpsLocation = location;
        if (this.customLocation == null) {
            fetchLocationAddress();
        }
        if (z && (i = this.shareLiveLocationPotistion) > 0) {
            notifyItemChanged(i);
        }
        if (this.currentMessageObject != null) {
            notifyItemChanged(1, new Object());
            updateLiveLocations();
        } else if (this.locationType != 2) {
            updateCell();
        } else {
            updateLiveLocations();
        }
    }

    public void updateLiveLocationCell() {
        int i = this.shareLiveLocationPotistion;
        if (i > 0) {
            notifyItemChanged(i);
        }
    }

    public void updateLiveLocations() {
        if (!this.currentLiveLocations.isEmpty()) {
            notifyItemRangeChanged(2, this.currentLiveLocations.size(), new Object());
        }
    }

    public void setCustomLocation(Location location) {
        this.customLocation = location;
        fetchLocationAddress();
        updateCell();
    }

    public void setLiveLocations(ArrayList<LocationActivity.LiveLocation> arrayList) {
        this.currentLiveLocations = new ArrayList<>(arrayList);
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        for (int i = 0; i < this.currentLiveLocations.size(); i++) {
            if (this.currentLiveLocations.get(i).id == clientUserId || this.currentLiveLocations.get(i).object.out) {
                this.currentLiveLocations.remove(i);
                break;
            }
        }
        notifyDataSetChanged();
    }

    public void setMessageObject(MessageObject messageObject) {
        this.currentMessageObject = messageObject;
        notifyDataSetChanged();
    }

    public void setChatLocation(TLRPC$TL_channelLocation tLRPC$TL_channelLocation) {
        this.chatLocation = tLRPC$TL_channelLocation;
    }

    private void updateCell() {
        SendLocationCell sendLocationCell = this.sendLocationCell;
        if (sendLocationCell != null) {
            String str = "";
            if (this.locationType == 4 || this.customLocation != null) {
                if (!TextUtils.isEmpty(this.addressName)) {
                    str = this.addressName;
                } else {
                    Location location = this.customLocation;
                    if ((location == null && this.gpsLocation == null) || this.fetchingLocation) {
                        str = LocaleController.getString("Loading", R.string.Loading);
                    } else if (location != null) {
                        str = String.format(Locale.US, "(%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(this.customLocation.getLongitude()));
                    } else {
                        Location location2 = this.gpsLocation;
                        if (location2 != null) {
                            str = String.format(Locale.US, "(%f,%f)", Double.valueOf(location2.getLatitude()), Double.valueOf(this.gpsLocation.getLongitude()));
                        } else if (!this.myLocationDenied) {
                            str = LocaleController.getString("Loading", R.string.Loading);
                        }
                    }
                }
                if (this.locationType == 4) {
                    this.sendLocationCell.setText(LocaleController.getString("ChatSetThisLocation", R.string.ChatSetThisLocation), str);
                } else {
                    this.sendLocationCell.setText(LocaleController.getString("SendSelectedLocation", R.string.SendSelectedLocation), str);
                }
                this.sendLocationCell.setHasLocation(true);
            } else if (this.gpsLocation != null) {
                sendLocationCell.setText(LocaleController.getString("SendLocation", R.string.SendLocation), LocaleController.formatString("AccurateTo", R.string.AccurateTo, LocaleController.formatPluralString("Meters", (int) this.gpsLocation.getAccuracy(), new Object[0])));
                this.sendLocationCell.setHasLocation(true);
            } else {
                String string = LocaleController.getString("SendLocation", R.string.SendLocation);
                if (!this.myLocationDenied) {
                    str = LocaleController.getString("Loading", R.string.Loading);
                }
                sendLocationCell.setText(string, str);
                this.sendLocationCell.setHasLocation(!this.myLocationDenied);
            }
        }
    }

    @Override
    public void onLocationAddressAvailable(String str, String str2, Location location) {
        this.fetchingLocation = false;
        this.previousFetchedLocation = location;
        this.addressName = str;
        updateCell();
    }

    public void fetchLocationAddress() {
        if (this.locationType == 4) {
            Location location = this.customLocation;
            if (location != null || (location = this.gpsLocation) != null) {
                Location location2 = this.previousFetchedLocation;
                if (location2 == null || location2.distanceTo(location) > 100.0f) {
                    this.addressName = null;
                }
                this.fetchingLocation = true;
                updateCell();
                LocationController.fetchLocationAddress(location, this);
                return;
            }
            return;
        }
        Location location3 = this.customLocation;
        if (location3 != null) {
            Location location4 = this.previousFetchedLocation;
            if (location4 == null || location4.distanceTo(location3) > 20.0f) {
                this.addressName = null;
            }
            this.fetchingLocation = true;
            updateCell();
            LocationController.fetchLocationAddress(location3, this);
        }
    }

    @Override
    public int getItemCount() {
        int i = this.locationType;
        int i2 = 6;
        int i3 = 2;
        if (i == 6 || i == 5 || i == 4) {
            return 2;
        }
        int i4 = 1;
        if (this.currentMessageObject != null) {
            if (!this.currentLiveLocations.isEmpty()) {
                i4 = this.currentLiveLocations.size() + 3;
            }
            return i4 + 2;
        } else if (i == 2) {
            return this.currentLiveLocations.size() + 2;
        } else {
            if (this.searching || !this.searched || this.places.isEmpty()) {
                if (this.locationType == 0) {
                    i2 = 5;
                }
                boolean z = this.myLocationDenied;
                int i5 = i2 + ((z || (!this.searching && this.searched)) ? 0 : 2) + (this.needEmptyView ? 1 : 0);
                if (!z) {
                    i3 = 0;
                }
                return i5 - i3;
            }
            if (this.locationType != 1) {
                i2 = 5;
            }
            return i2 + this.places.size() + (this.needEmptyView ? 1 : 0);
        }
    }

    public void lambda$onCreateViewHolder$0(View view) {
        onDirectionClick();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LocationDirectionCell locationDirectionCell;
        FrameLayout frameLayout;
        switch (i) {
            case 0:
                FrameLayout frameLayout2 = new FrameLayout(this.mContext);
                this.emptyCell = frameLayout2;
                frameLayout2.setLayoutParams(new RecyclerView.LayoutParams(-1, this.overScrollHeight));
                locationDirectionCell = frameLayout2;
                break;
            case 1:
                frameLayout = new SendLocationCell(this.mContext, false, this.resourcesProvider);
                locationDirectionCell = frameLayout;
                break;
            case 2:
                locationDirectionCell = new HeaderCell(this.mContext, this.resourcesProvider);
                break;
            case 3:
                frameLayout = new LocationCell(this.mContext, false, this.resourcesProvider);
                locationDirectionCell = frameLayout;
                break;
            case 4:
                locationDirectionCell = new LocationLoadingCell(this.mContext, this.resourcesProvider);
                break;
            case 5:
                locationDirectionCell = new LocationPoweredCell(this.mContext, this.resourcesProvider);
                break;
            case 6:
                SendLocationCell sendLocationCell = new SendLocationCell(this.mContext, true, this.resourcesProvider);
                sendLocationCell.setDialogId(this.dialogId);
                locationDirectionCell = sendLocationCell;
                break;
            case 7:
                Context context = this.mContext;
                int i2 = this.locationType;
                locationDirectionCell = new SharingLiveLocationCell(context, true, (i2 == 4 || i2 == 5) ? 16 : 54, this.resourcesProvider);
                break;
            case 8:
                LocationDirectionCell locationDirectionCell2 = new LocationDirectionCell(this.mContext, this.resourcesProvider);
                locationDirectionCell2.setOnButtonClick(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        LocationActivityAdapter.this.lambda$onCreateViewHolder$0(view);
                    }
                });
                locationDirectionCell = locationDirectionCell2;
                break;
            case 9:
                View shadowSectionCell = new ShadowSectionCell(this.mContext);
                CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(getThemedColor("windowBackgroundGray")), Theme.getThemedDrawable(this.mContext, (int) R.drawable.greydivider_bottom, "windowBackgroundGrayShadow"));
                combinedDrawable.setFullsize(true);
                shadowSectionCell.setBackgroundDrawable(combinedDrawable);
                locationDirectionCell = shadowSectionCell;
                break;
            default:
                locationDirectionCell = new View(this.mContext);
                break;
        }
        return new RecyclerListView.Holder(locationDirectionCell);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int itemViewType = viewHolder.getItemViewType();
        if (itemViewType != 0) {
            boolean z = true;
            if (itemViewType != 1) {
                int i2 = 2;
                if (itemViewType == 2) {
                    HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                    if (this.currentMessageObject != null) {
                        headerCell.setText(LocaleController.getString("LiveLocations", R.string.LiveLocations));
                    } else {
                        headerCell.setText(LocaleController.getString("NearbyVenue", R.string.NearbyVenue));
                    }
                } else if (itemViewType == 3) {
                    LocationCell locationCell = (LocationCell) viewHolder.itemView;
                    int i3 = this.locationType == 0 ? i - 4 : i - 5;
                    String str = null;
                    TLRPC$TL_messageMediaVenue tLRPC$TL_messageMediaVenue = (i3 < 0 || i3 >= this.places.size() || !this.searched) ? null : this.places.get(i3);
                    if (i3 >= 0 && i3 < this.iconUrls.size() && this.searched) {
                        str = this.iconUrls.get(i3);
                    }
                    locationCell.setLocation(tLRPC$TL_messageMediaVenue, str, i3, true);
                } else if (itemViewType == 4) {
                    ((LocationLoadingCell) viewHolder.itemView).setLoading(this.searching);
                } else if (itemViewType == 6) {
                    SendLocationCell sendLocationCell = (SendLocationCell) viewHolder.itemView;
                    if (this.gpsLocation == null) {
                        z = false;
                    }
                    sendLocationCell.setHasLocation(z);
                } else if (itemViewType == 7) {
                    SharingLiveLocationCell sharingLiveLocationCell = (SharingLiveLocationCell) viewHolder.itemView;
                    if (this.locationType == 6) {
                        sharingLiveLocationCell.setDialog(this.currentMessageObject, this.gpsLocation, this.myLocationDenied);
                        return;
                    }
                    TLRPC$TL_channelLocation tLRPC$TL_channelLocation = this.chatLocation;
                    if (tLRPC$TL_channelLocation != null) {
                        sharingLiveLocationCell.setDialog(this.dialogId, tLRPC$TL_channelLocation);
                        return;
                    }
                    MessageObject messageObject = this.currentMessageObject;
                    if (messageObject == null || i != 1) {
                        ArrayList<LocationActivity.LiveLocation> arrayList = this.currentLiveLocations;
                        if (messageObject != null) {
                            i2 = 5;
                        }
                        sharingLiveLocationCell.setDialog(arrayList.get(i - i2), this.gpsLocation);
                        return;
                    }
                    sharingLiveLocationCell.setDialog(messageObject, this.gpsLocation, this.myLocationDenied);
                } else if (itemViewType == 10) {
                    viewHolder.itemView.setBackgroundColor(Theme.getColor(this.myLocationDenied ? "dialogBackgroundGray" : "dialogBackground"));
                }
            } else {
                this.sendLocationCell = (SendLocationCell) viewHolder.itemView;
                updateCell();
            }
        } else {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) viewHolder.itemView.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new RecyclerView.LayoutParams(-1, this.overScrollHeight);
            } else {
                ((ViewGroup.MarginLayoutParams) layoutParams).height = this.overScrollHeight;
            }
            viewHolder.itemView.setLayoutParams(layoutParams);
        }
    }

    public Object getItem(int i) {
        int i2 = this.locationType;
        if (i2 != 4) {
            MessageObject messageObject = this.currentMessageObject;
            if (messageObject != null) {
                if (i == 1) {
                    return messageObject;
                }
                if (i > 4 && i < this.places.size() + 4) {
                    return this.currentLiveLocations.get(i - 5);
                }
            } else if (i2 == 2) {
                if (i >= 2) {
                    return this.currentLiveLocations.get(i - 2);
                }
                return null;
            } else if (i2 == 1) {
                if (i > 4 && i < this.places.size() + 5) {
                    return this.places.get(i - 5);
                }
            } else if (i > 3 && i < this.places.size() + 4) {
                return this.places.get(i - 4);
            }
            return null;
        } else if (this.addressName == null) {
            return null;
        } else {
            TLRPC$TL_messageMediaVenue tLRPC$TL_messageMediaVenue = new TLRPC$TL_messageMediaVenue();
            tLRPC$TL_messageMediaVenue.address = this.addressName;
            TLRPC$TL_geoPoint tLRPC$TL_geoPoint = new TLRPC$TL_geoPoint();
            tLRPC$TL_messageMediaVenue.geo = tLRPC$TL_geoPoint;
            Location location = this.customLocation;
            if (location != null) {
                tLRPC$TL_geoPoint.lat = location.getLatitude();
                tLRPC$TL_messageMediaVenue.geo._long = this.customLocation.getLongitude();
            } else {
                Location location2 = this.gpsLocation;
                if (location2 != null) {
                    tLRPC$TL_geoPoint.lat = location2.getLatitude();
                    tLRPC$TL_messageMediaVenue.geo._long = this.gpsLocation.getLongitude();
                }
            }
            return tLRPC$TL_messageMediaVenue;
        }
    }

    @Override
    public int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        if (this.locationType == 6) {
            return 7;
        }
        if (this.needEmptyView && i == getItemCount() - 1) {
            return 10;
        }
        int i2 = this.locationType;
        if (i2 == 5) {
            return 7;
        }
        if (i2 == 4) {
            return 1;
        }
        if (this.currentMessageObject != null) {
            if (this.currentLiveLocations.isEmpty()) {
                if (i == 2) {
                    return 8;
                }
            } else if (i == 2) {
                return 9;
            } else {
                if (i == 3) {
                    return 2;
                }
                if (i == 4) {
                    this.shareLiveLocationPotistion = i;
                    return 6;
                }
            }
            return 7;
        } else if (i2 != 2) {
            if (i2 == 1) {
                if (i == 1) {
                    return 1;
                }
                if (i == 2) {
                    this.shareLiveLocationPotistion = i;
                    return 6;
                } else if (i == 3) {
                    return 9;
                } else {
                    if (i == 4) {
                        return 2;
                    }
                    if (this.searching || this.places.isEmpty() || !this.searched) {
                        return (i > 7 || (!this.searching && this.searched) || this.myLocationDenied) ? 4 : 3;
                    }
                    if (i == this.places.size() + 5) {
                        return 5;
                    }
                }
            } else if (i == 1) {
                return 1;
            } else {
                if (i == 2) {
                    return 9;
                }
                if (i == 3) {
                    return 2;
                }
                if (this.searching || this.places.isEmpty()) {
                    return (i > 6 || (!this.searching && this.searched) || this.myLocationDenied) ? 4 : 3;
                }
                if (i == this.places.size() + 4) {
                    return 5;
                }
            }
            return 3;
        } else if (i != 1) {
            return 7;
        } else {
            this.shareLiveLocationPotistion = i;
            return 6;
        }
    }

    @Override
    public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
        int itemViewType = viewHolder.getItemViewType();
        return itemViewType == 6 ? (LocationController.getInstance(this.currentAccount).getSharingLocationInfo(this.dialogId) == null && this.gpsLocation == null) ? false : true : itemViewType == 1 || itemViewType == 3 || itemViewType == 7;
    }

    private int getThemedColor(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Integer color = resourcesProvider != null ? resourcesProvider.getColor(str) : null;
        return color != null ? color.intValue() : Theme.getColor(str);
    }
}
