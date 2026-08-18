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
import org.telegram.tgnet.TLRPC;
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
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.LocationActivity;

public class LocationActivityAdapter extends BaseLocationAdapter implements LocationController.LocationFetchCallback {
    private String addressName;
    public boolean animated;
    private boolean askingForMyLocation;
    private TLRPC.TL_channelLocation chatLocation;
    public TLRPC.TL_messageMediaVenue city;
    private int currentAccount;
    private ArrayList currentLiveLocations;
    private MessageObject currentMessageObject;
    private Location customLocation;
    private long dialogId;
    private FrameLayout emptyCell;
    private boolean fetchingLocation;
    private boolean fromStories;
    private Location gpsLocation;
    public boolean isPollAttach;
    private int locationType;
    private Context mContext;
    private boolean myLocationDenied;
    private boolean needEmptyView;
    private int overScrollHeight;
    private String overrideAddressName;
    private Location previousFetchedLocation;
    private final Theme.ResourcesProvider resourcesProvider;
    private SendLocationCell sendLocationCell;
    private int shareLiveLocationPotistion;
    private SharedMediaLayout sharedMediaLayout;
    private boolean sharedMediaLayoutVisible;
    public TLRPC.TL_messageMediaVenue street;
    private Runnable updateRunnable;

    protected void onDirectionClick() {
    }

    public void setAddressNameOverride(String str) {
        this.overrideAddressName = str;
        updateCell();
    }

    public LocationActivityAdapter(Context context, int i, long j, boolean z, Theme.ResourcesProvider resourcesProvider, boolean z2, boolean z3, boolean z4) {
        super(z2, z4);
        this.currentAccount = UserConfig.selectedAccount;
        this.shareLiveLocationPotistion = -1;
        this.currentLiveLocations = new ArrayList();
        this.animated = true;
        this.myLocationDenied = false;
        this.askingForMyLocation = false;
        this.fromStories = z3;
        this.mContext = context;
        this.locationType = i;
        this.dialogId = j;
        this.needEmptyView = z;
        this.resourcesProvider = resourcesProvider;
    }

    public void setSharedMediaLayout(SharedMediaLayout sharedMediaLayout) {
        this.sharedMediaLayout = sharedMediaLayout;
    }

    public boolean setSharedMediaLayoutVisible(boolean z) {
        if (this.sharedMediaLayoutVisible == z) {
            return false;
        }
        this.sharedMediaLayoutVisible = z;
        notifyDataSetChanged();
        return true;
    }

    public void setMyLocationDenied(boolean z, boolean z2) {
        if (this.myLocationDenied == z && this.askingForMyLocation == z2) {
            return;
        }
        this.myLocationDenied = z;
        this.askingForMyLocation = z2;
        if (z2) {
            this.city = null;
            this.street = null;
        }
        notifyDataSetChanged();
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

    public void updateLiveLocations() {
        if (this.currentLiveLocations.isEmpty()) {
            return;
        }
        notifyItemRangeChanged(2, this.currentLiveLocations.size(), new Object());
    }

    public void setCustomLocation(Location location) {
        this.customLocation = location;
        fetchLocationAddress();
        updateCell();
    }

    public void setLiveLocations(ArrayList arrayList) {
        this.currentLiveLocations = new ArrayList(arrayList);
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        for (int i = 0; i < this.currentLiveLocations.size(); i++) {
            if (((LocationActivity.LiveLocation) this.currentLiveLocations.get(i)).id == clientUserId || ((LocationActivity.LiveLocation) this.currentLiveLocations.get(i)).object.out) {
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

    public void setChatLocation(TLRPC.TL_channelLocation tL_channelLocation) {
        this.chatLocation = tL_channelLocation;
    }

    private void updateCell() {
        String string;
        SendLocationCell sendLocationCell = this.sendLocationCell;
        if (sendLocationCell != null) {
            int i = this.locationType;
            if (i == 8) {
                if (!TextUtils.isEmpty(this.overrideAddressName)) {
                    string = this.overrideAddressName;
                } else if (!TextUtils.isEmpty(this.addressName)) {
                    string = this.addressName;
                } else if (this.fetchingLocation) {
                    string = LocaleController.getString(R.string.Loading);
                } else {
                    string = LocaleController.getString(R.string.UnknownLocation);
                }
                this.sendLocationCell.setText(LocaleController.getString(R.string.SetThisLocation), string);
                this.sendLocationCell.setHasLocation(true);
                return;
            }
            String string2 = "";
            if (i == 4 || this.customLocation != null) {
                if (!TextUtils.isEmpty(this.overrideAddressName)) {
                    string2 = this.overrideAddressName;
                } else if (!TextUtils.isEmpty(this.addressName)) {
                    string2 = this.addressName;
                } else {
                    Location location = this.customLocation;
                    if ((location == null && this.gpsLocation == null) || this.fetchingLocation) {
                        string2 = LocaleController.getString(R.string.Loading);
                    } else if (location != null) {
                        string2 = String.format(Locale.US, "(%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(this.customLocation.getLongitude()));
                    } else {
                        Location location2 = this.gpsLocation;
                        if (location2 != null) {
                            string2 = String.format(Locale.US, "(%f,%f)", Double.valueOf(location2.getLatitude()), Double.valueOf(this.gpsLocation.getLongitude()));
                        } else if (!this.myLocationDenied) {
                            string2 = LocaleController.getString(R.string.Loading);
                        }
                    }
                }
                if (this.isPollAttach) {
                    this.sendLocationCell.setText(LocaleController.getString(R.string.AttachSelectedLocation), string2);
                } else if (this.locationType == 4) {
                    this.sendLocationCell.setText(LocaleController.getString(R.string.ChatSetThisLocation), string2);
                } else {
                    this.sendLocationCell.setText(LocaleController.getString(R.string.SendSelectedLocation), string2);
                }
                this.sendLocationCell.setHasLocation(true);
                return;
            }
            if (this.gpsLocation != null) {
                sendLocationCell.setText(LocaleController.getString(R.string.SendLocation), LocaleController.formatString(R.string.AccurateTo, LocaleController.formatPluralString("Meters", (int) this.gpsLocation.getAccuracy(), new Object[0])));
                this.sendLocationCell.setHasLocation(true);
            } else {
                sendLocationCell.setText(LocaleController.getString(R.string.SendLocation), this.myLocationDenied ? "" : LocaleController.getString(R.string.Loading));
                this.sendLocationCell.setHasLocation(!this.myLocationDenied);
            }
        }
    }

    public String getAddressName() {
        return this.addressName;
    }

    @Override
    public void onLocationAddressAvailable(String str, String str2, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, TLRPC.TL_messageMediaVenue tL_messageMediaVenue2, Location location) {
        this.fetchingLocation = false;
        this.previousFetchedLocation = location;
        int i = this.locationType;
        if (i == 8) {
            this.addressName = str2;
        } else {
            this.addressName = str;
        }
        if (i == 7 && this.askingForMyLocation) {
            this.city = null;
            this.street = null;
        }
        boolean z = this.street != null;
        if (i == 7) {
            this.city = tL_messageMediaVenue;
            this.street = tL_messageMediaVenue2;
            if (z == (tL_messageMediaVenue2 == null)) {
                notifyItemChanged(1);
                if (this.street == null) {
                    notifyItemRemoved(2);
                    return;
                } else {
                    notifyItemInserted(2);
                    return;
                }
            }
            notifyItemRangeChanged(1, 2);
            return;
        }
        updateCell();
    }

    public void fetchLocationAddress() {
        int i = this.locationType;
        if (i == 8) {
            Location location = this.customLocation;
            if (location == null && (location = this.gpsLocation) == null) {
                return;
            }
            this.fetchingLocation = true;
            updateCell();
            LocationController.fetchLocationAddress(location, this.biz ? 1 : 0, this);
            return;
        }
        if (i == 4) {
            Location location2 = this.customLocation;
            if (location2 == null && (location2 = this.gpsLocation) == null) {
                return;
            }
            Location location3 = this.previousFetchedLocation;
            if (location3 == null || location3.distanceTo(location2) > 100.0f) {
                this.addressName = null;
            }
            this.fetchingLocation = true;
            updateCell();
            LocationController.fetchLocationAddress(location2, this);
            return;
        }
        Location location4 = this.customLocation;
        if (location4 != null) {
            Location location5 = this.previousFetchedLocation;
            if (location5 == null || location5.distanceTo(location4) > 20.0f) {
                this.addressName = null;
            }
            this.fetchingLocation = true;
            updateCell();
            LocationController.fetchLocationAddress(location4, this.stories ? 2 : 0, this);
        }
    }

    @Override
    public int getItemCount() {
        int i = this.locationType;
        int size = 2;
        int i2 = 6;
        if (i != 6 && i != 5 && i != 4 && !this.biz) {
            int size2 = 1;
            if (this.currentMessageObject != null) {
                if (!this.currentLiveLocations.isEmpty()) {
                    size2 = this.currentLiveLocations.size() + 3;
                } else if (this.fromStories) {
                    size2 = 0;
                }
                size = 2 + size2;
            } else if (i == 2) {
                LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(this.currentAccount).getSharingLocationInfo(this.dialogId);
                size = this.currentLiveLocations.size() + 2 + ((sharingLocationInfo == null || sharingLocationInfo.period == Integer.MAX_VALUE) ? 0 : 1);
            } else if (this.searching || !this.searched || this.places.isEmpty()) {
                int i3 = this.locationType;
                if (i3 == 0) {
                    i2 = 5;
                } else if (i3 == 7) {
                    i2 = (this.street == null ? 0 : 1) + 5;
                }
                boolean z = this.myLocationDenied;
                size = i2 + ((((z || (!this.searching && this.searched)) ? 0 : 2) + (this.needEmptyView ? 1 : 0)) - (z ? 2 : 0));
            } else {
                size = (this.locationType != 1 ? 5 : 6) + this.locations.size() + this.places.size() + (this.needEmptyView ? 1 : 0);
            }
        }
        return (this.sharedMediaLayout == null || !this.sharedMediaLayoutVisible) ? size : size + 1;
    }

    public void lambda$onCreateViewHolder$0(View view) {
        onDirectionClick();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View sendLocationCell;
        View headerCell;
        switch (i) {
            case 0:
                FrameLayout frameLayout = new FrameLayout(this.mContext);
                this.emptyCell = frameLayout;
                frameLayout.setTag(-33024);
                this.emptyCell.setLayoutParams(new RecyclerView.LayoutParams(-1, this.overScrollHeight));
                headerCell = frameLayout;
                break;
            case 1:
                sendLocationCell = new SendLocationCell(this.mContext, false, false, this.resourcesProvider);
                headerCell = sendLocationCell;
                break;
            case 2:
                headerCell = new HeaderCell(this.mContext, this.resourcesProvider);
                break;
            case 3:
                sendLocationCell = new LocationCell(this.mContext, false, this.resourcesProvider);
                headerCell = sendLocationCell;
                break;
            case 4:
                headerCell = new LocationLoadingCell(this.mContext, this.resourcesProvider);
                break;
            case 5:
                headerCell = new LocationPoweredCell(this.mContext, this.resourcesProvider);
                break;
            case 6:
                SendLocationCell sendLocationCell2 = new SendLocationCell(this.mContext, true, false, this.resourcesProvider);
                sendLocationCell2.setDialogId(this.dialogId);
                sendLocationCell = sendLocationCell2;
                headerCell = sendLocationCell;
                break;
            case 7:
                SendLocationCell sendLocationCell3 = new SendLocationCell(this.mContext, true, true, this.resourcesProvider);
                sendLocationCell3.setDialogId(this.dialogId);
                headerCell = sendLocationCell3;
                break;
            case 8:
                Context context = this.mContext;
                int i2 = this.locationType;
                headerCell = new SharingLiveLocationCell(context, true, (i2 == 4 || i2 == 5 || i2 == 3) ? 16 : 54, this.resourcesProvider);
                break;
            case 9:
                LocationDirectionCell locationDirectionCell = new LocationDirectionCell(this.mContext, this.resourcesProvider);
                locationDirectionCell.setOnButtonClick(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        this.f$0.lambda$onCreateViewHolder$0(view);
                    }
                });
                headerCell = locationDirectionCell;
                break;
            case 10:
                ShadowSectionCell shadowSectionCell = new ShadowSectionCell(this.mContext);
                new CombinedDrawable(new ColorDrawable(getThemedColor(Theme.key_windowBackgroundGray)), Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow)).setFullsize(true);
                headerCell = shadowSectionCell;
                break;
            case 11:
            default:
                headerCell = new View(this.mContext);
                break;
            case 12:
                LocationCell locationCell = new LocationCell(this.mContext, false, this.resourcesProvider);
                locationCell.setAllowTextAnimation(true);
                sendLocationCell = locationCell;
                headerCell = sendLocationCell;
                break;
            case 13:
                headerCell = this.sharedMediaLayout;
                break;
        }
        return new RecyclerListView.Holder(headerCell);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = null;
        int i3 = 2;
        boolean z = false;
        switch (viewHolder.getItemViewType()) {
            case 0:
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) viewHolder.itemView.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new RecyclerView.LayoutParams(-1, this.overScrollHeight);
                } else {
                    ((ViewGroup.MarginLayoutParams) layoutParams).height = this.overScrollHeight;
                }
                viewHolder.itemView.setLayoutParams(layoutParams);
                break;
            case 1:
                this.sendLocationCell = (SendLocationCell) viewHolder.itemView;
                updateCell();
                break;
            case 2:
                HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                if (this.currentMessageObject != null) {
                    headerCell.setText(LocaleController.getString(R.string.LiveLocations));
                } else {
                    headerCell.setText(LocaleController.getString(R.string.NearbyVenue));
                }
                break;
            case 3:
                LocationCell locationCell = (LocationCell) viewHolder.itemView;
                int i4 = this.locationType;
                if (i4 == 0) {
                    i2 = i - 4;
                } else if (i4 == 7 || i4 == 8) {
                    int i5 = i - 4;
                    if (this.street != null) {
                        i2 = i - 5;
                    } else {
                        i2 = i5;
                    }
                } else {
                    i2 = i - 5;
                }
                if (this.searched && (i4 != 7 || !this.searching)) {
                    z = true;
                }
                if (!z) {
                    i3 = i2;
                } else if (i2 >= 0 && i2 < this.locations.size()) {
                    tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) this.locations.get(i2);
                } else {
                    int size = i2 - this.locations.size();
                    if (size >= 0 && size < this.places.size()) {
                        tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) this.places.get(size);
                    }
                    i3 = i2;
                }
                locationCell.setLocation(tL_messageMediaVenue, i3, true);
                break;
            case 4:
                ((LocationLoadingCell) viewHolder.itemView).setLoading(this.searching);
                break;
            case 6:
                SendLocationCell sendLocationCell = (SendLocationCell) viewHolder.itemView;
                sendLocationCell.setHasLocation(this.gpsLocation != null);
                int i6 = i + 1;
                if (i6 < getItemCount() && getItemViewType(i6) == 7) {
                    z = true;
                }
                sendLocationCell.useDivider = z;
                sendLocationCell.invalidate();
                break;
            case 7:
                ((SendLocationCell) viewHolder.itemView).setHasLocation(this.gpsLocation != null);
                break;
            case 8:
                SharingLiveLocationCell sharingLiveLocationCell = (SharingLiveLocationCell) viewHolder.itemView;
                if (this.locationType == 6) {
                    sharingLiveLocationCell.setDialog(this.currentMessageObject, this.gpsLocation, this.myLocationDenied);
                    break;
                } else {
                    TLRPC.TL_channelLocation tL_channelLocation = this.chatLocation;
                    if (tL_channelLocation != null) {
                        sharingLiveLocationCell.setDialog(this.dialogId, tL_channelLocation);
                        break;
                    } else {
                        MessageObject messageObject = this.currentMessageObject;
                        if (messageObject != null && i == 1) {
                            sharingLiveLocationCell.setDialog(messageObject, this.gpsLocation, this.myLocationDenied);
                            break;
                        } else {
                            int i7 = i - (messageObject != null ? 5 : 2);
                            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(this.currentAccount).getSharingLocationInfo(this.dialogId);
                            if (sharingLocationInfo != null && sharingLocationInfo.period != Integer.MAX_VALUE) {
                                i7--;
                            }
                            if (i7 >= 0 && i7 < this.currentLiveLocations.size()) {
                                sharingLiveLocationCell.setDialog((LocationActivity.LiveLocation) this.currentLiveLocations.get(i7), this.gpsLocation);
                                break;
                            }
                        }
                    }
                }
                break;
            case 11:
                viewHolder.itemView.setBackgroundColor(Theme.getColor(this.myLocationDenied ? Theme.key_dialogBackgroundGray : Theme.key_dialogBackground, this.resourcesProvider));
                break;
            case 12:
                LocationCell locationCell2 = (LocationCell) viewHolder.itemView;
                if (this.askingForMyLocation) {
                    if (i == 1 && this.street != null) {
                        z = true;
                    }
                    locationCell2.setLocation(null, 2, z);
                } else if (i == 1) {
                    locationCell2.setLocation(this.city, null, 2, this.street != null, this.animated);
                } else {
                    locationCell2.setLocation(this.street, null, 2, false, this.animated);
                }
                break;
        }
    }

    public Object getItem(int i) {
        int i2 = this.locationType;
        if (i2 == 4) {
            if (this.addressName == null) {
                return null;
            }
            TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
            tL_messageMediaVenue.address = this.addressName;
            TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
            tL_messageMediaVenue.geo = tL_geoPoint;
            Location location = this.customLocation;
            if (location != null) {
                tL_geoPoint.lat = location.getLatitude();
                tL_messageMediaVenue.geo._long = this.customLocation.getLongitude();
            } else {
                Location location2 = this.gpsLocation;
                if (location2 != null) {
                    tL_geoPoint.lat = location2.getLatitude();
                    tL_messageMediaVenue.geo._long = this.gpsLocation.getLongitude();
                }
            }
            return tL_messageMediaVenue;
        }
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject == null) {
            int i3 = 2;
            if (i2 == 2) {
                LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(this.currentAccount).getSharingLocationInfo(this.dialogId);
                if (sharingLocationInfo != null && sharingLocationInfo.period != Integer.MAX_VALUE) {
                    i3 = 3;
                }
                if (i >= i3) {
                    return this.currentLiveLocations.get(i - i3);
                }
                return null;
            }
            if (i2 == 1) {
                if (i > 4 && i < this.places.size() + 5) {
                    return this.places.get(i - 5);
                }
            } else if (i2 == 7) {
                int i4 = this.street == null ? 3 : 4;
                if (i > i4) {
                    int i5 = i4 + 1;
                    if (i < this.locations.size() + i5) {
                        return this.locations.get(i - i5);
                    }
                }
                int size = i4 + this.locations.size();
                if (i > size) {
                    int i6 = size + 1;
                    if (i < this.places.size() + i6) {
                        return this.places.get(i - i6);
                    }
                }
            } else if (i > 3 && i < this.places.size() + 4) {
                return this.places.get(i - 4);
            }
        } else {
            if (i == 1) {
                return messageObject;
            }
            if (i > 4 && i < this.places.size() + 4) {
                return this.currentLiveLocations.get(i - 5);
            }
        }
        return null;
    }

    @Override
    public int getItemViewType(int i) {
        int i2;
        if (i == getItemCount() - 1 && this.sharedMediaLayout != null && this.sharedMediaLayoutVisible) {
            return 13;
        }
        if (i == 0) {
            return 0;
        }
        if (this.locationType == 6) {
            return 8;
        }
        if (this.needEmptyView && i == getItemCount() - 1) {
            return 11;
        }
        int i3 = this.locationType;
        if (i3 == 5) {
            return 8;
        }
        if (i3 == 4) {
            return 1;
        }
        LocationController.SharingLocationInfo sharingLocationInfo = (i3 == 2 || i3 == 1) ? LocationController.getInstance(this.currentAccount).getSharingLocationInfo(this.dialogId) : null;
        if (this.currentMessageObject != null) {
            if (this.currentLiveLocations.isEmpty()) {
                if (i == 2) {
                    return 9;
                }
            } else {
                if (i == 2) {
                    return 10;
                }
                if (i == 3) {
                    return 2;
                }
                if (i == 4) {
                    this.shareLiveLocationPotistion = i;
                    return 6;
                }
            }
            return 8;
        }
        int i4 = this.locationType;
        if (i4 == 2) {
            if (i == 2 && sharingLocationInfo != null && sharingLocationInfo.period != Integer.MAX_VALUE) {
                return 7;
            }
            if (i != 1) {
                return 8;
            }
            if (sharingLocationInfo != null && sharingLocationInfo.period == Integer.MAX_VALUE) {
                return 7;
            }
            this.shareLiveLocationPotistion = i;
            return 6;
        }
        if (i4 != 1) {
            int size = this.places.size() + this.locations.size();
            if (this.locationType != 7) {
                i2 = 4;
            } else {
                if (i == 1) {
                    return 12;
                }
                if (this.street == null) {
                    i2 = 4;
                } else {
                    if (i == 2) {
                        return 12;
                    }
                    i--;
                    i2 = 3;
                }
            }
            if (i == 1) {
                return 1;
            }
            if (i == 2) {
                return 10;
            }
            if (i == 3) {
                return 2;
            }
            if (this.searching || (this.places.isEmpty() && this.locations.isEmpty())) {
                return (i > 6 || (!this.searching && this.searched) || this.myLocationDenied) ? 4 : 3;
            }
            if (i == size + i2) {
                return 5;
            }
        } else {
            if (i == 1) {
                return 1;
            }
            if (i == 2) {
                if (sharingLocationInfo != null) {
                    this.shareLiveLocationPotistion = -1;
                    return 7;
                }
                this.shareLiveLocationPotistion = i;
                return 6;
            }
            if (i == 3) {
                return 10;
            }
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
        return 3;
    }

    @Override
    public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
        int itemViewType = viewHolder.getItemViewType();
        if (itemViewType == 6) {
            return (LocationController.getInstance(this.currentAccount).getSharingLocationInfo(this.dialogId) == null && this.gpsLocation == null) ? false : true;
        }
        return itemViewType == 1 || itemViewType == 3 || itemViewType == 8 || itemViewType == 12 || itemViewType == 7;
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }
}
