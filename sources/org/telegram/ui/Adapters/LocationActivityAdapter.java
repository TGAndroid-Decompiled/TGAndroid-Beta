package org.telegram.ui.Adapters;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.location.Location;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticLambda38;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.LocationCell;
import org.telegram.ui.Cells.LocationDirectionCell;
import org.telegram.ui.Cells.LocationLoadingCell;
import org.telegram.ui.Cells.LocationPoweredCell;
import org.telegram.ui.Cells.SendLocationCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.SharingLiveLocationCell;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.LocationActivity;

public class LocationActivityAdapter extends BaseLocationAdapter implements LocationController.LocationFetchCallback {
    public String addressName;
    public boolean animated;
    public boolean askingForMyLocation;
    public TLRPC.TL_channelLocation chatLocation;
    public TLRPC.TL_messageMediaVenue city;
    public final int currentAccount;
    public ArrayList currentLiveLocations;
    public MessageObject currentMessageObject;
    public Location customLocation;
    public final long dialogId;
    public FrameLayout emptyCell;
    public boolean fetchingLocation;
    public final boolean fromStories;
    public Location gpsLocation;
    public boolean isPollAttach;
    public final int locationType;
    public final Context mContext;
    public boolean myLocationDenied;
    public final boolean needEmptyView;
    public int overScrollHeight;
    public String overrideAddressName;
    public Location previousFetchedLocation;
    public final Theme.ResourcesProvider resourcesProvider;
    public SendLocationCell sendLocationCell;
    public int shareLiveLocationPotistion;
    public LocationActivity.AnonymousClass6 sharedMediaLayout;
    public boolean sharedMediaLayoutVisible;
    public TLRPC.TL_messageMediaVenue street;

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

    public final void fetchLocationAddress() {
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
        if (i != 4) {
            Location location2 = this.customLocation;
            if (location2 != null) {
                Location location3 = this.previousFetchedLocation;
                if (location3 == null || location3.distanceTo(location2) > 20.0f) {
                    this.addressName = null;
                }
                this.fetchingLocation = true;
                updateCell();
                LocationController.fetchLocationAddress(location2, this.stories ? 2 : 0, this);
                return;
            }
            return;
        }
        Location location4 = this.customLocation;
        if (location4 == null && (location4 = this.gpsLocation) == null) {
            return;
        }
        Location location5 = this.previousFetchedLocation;
        if (location5 == null || location5.distanceTo(location4) > 100.0f) {
            this.addressName = null;
        }
        this.fetchingLocation = true;
        updateCell();
        LocationController.fetchLocationAddress(location4, this);
    }

    public final Object getItem(int i) {
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
                return tL_messageMediaVenue;
            }
            Location location2 = this.gpsLocation;
            if (location2 != null) {
                tL_geoPoint.lat = location2.getLatitude();
                tL_messageMediaVenue.geo._long = this.gpsLocation.getLongitude();
            }
            return tL_messageMediaVenue;
        }
        MessageObject messageObject = this.currentMessageObject;
        ArrayList arrayList = this.places;
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
                if (i > 4 && i < arrayList.size() + 5) {
                    return arrayList.get(i - 5);
                }
            } else if (i2 == 7) {
                int i4 = this.street == null ? 3 : 4;
                ArrayList arrayList2 = this.locations;
                if (i > i4) {
                    int i5 = i4 + 1;
                    if (i < arrayList2.size() + i5) {
                        return arrayList2.get(i - i5);
                    }
                }
                int size = arrayList2.size() + i4;
                if (i > size) {
                    int i6 = size + 1;
                    if (i < arrayList.size() + i6) {
                        return arrayList.get(i - i6);
                    }
                }
            } else if (i > 3 && i < arrayList.size() + 4) {
                return arrayList.get(i - 4);
            }
        } else {
            if (i == 1) {
                return messageObject;
            }
            if (i > 4 && i < arrayList.size() + 4) {
                return this.currentLiveLocations.get(i - 5);
            }
        }
        return null;
    }

    @Override
    public final int getItemCount() {
        int i;
        boolean z;
        int i2;
        int size = 2;
        int i3 = this.locationType;
        int i4 = 6;
        if (i3 != 6 && i3 != 5 && i3 != 4 && !this.biz) {
            int size2 = 0;
            if (this.currentMessageObject != null) {
                if (!this.currentLiveLocations.isEmpty()) {
                    size2 = this.currentLiveLocations.size() + 3;
                } else if (!this.fromStories) {
                    size2 = 1;
                }
                size = 2 + size2;
            } else if (i3 == 2) {
                LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(this.currentAccount).getSharingLocationInfo(this.dialogId);
                int size3 = this.currentLiveLocations.size() + 2;
                if (sharingLocationInfo != null && sharingLocationInfo.period != Integer.MAX_VALUE) {
                    size2 = 1;
                }
                size = size3 + size2;
            } else {
                boolean z2 = this.searching;
                boolean z3 = this.needEmptyView;
                if (z2 || !this.searched) {
                    if (i3 == 0) {
                        i4 = 5;
                    } else if (i3 == 7) {
                        if (this.street != null) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        i4 = i + 5;
                    }
                    z = this.myLocationDenied;
                    if (!z || (!this.searching && this.searched)) {
                        i2 = 0;
                    } else {
                        i2 = 2;
                    }
                    size = ((i2 + (z3 ? 1 : 0)) - (z ? 2 : 0)) + i4;
                } else {
                    ArrayList arrayList = this.places;
                    if (arrayList.isEmpty()) {
                        if (i3 == 0) {
                            i4 = 5;
                        } else if (i3 == 7) {
                            if (this.street != null) {
                                i = 1;
                            } else {
                                i = 0;
                            }
                            i4 = i + 5;
                        }
                        z = this.myLocationDenied;
                        if (z) {
                            i2 = 0;
                        } else {
                            i2 = 0;
                        }
                        size = ((i2 + (z3 ? 1 : 0)) - (z ? 2 : 0)) + i4;
                    } else {
                        size = arrayList.size() + this.locations.size() + (z3 ? 1 : 0) + (i3 != 1 ? 5 : 6);
                    }
                }
            }
        }
        return (this.sharedMediaLayout == null || !this.sharedMediaLayoutVisible) ? size : size + 1;
    }

    @Override
    public final int getItemViewType(int i) {
        int i2;
        if (i == getItemCount() - 1 && this.sharedMediaLayout != null && this.sharedMediaLayoutVisible) {
            return 13;
        }
        if (i == 0) {
            return 0;
        }
        int i3 = this.locationType;
        if (i3 == 6) {
            return 8;
        }
        if (this.needEmptyView && i == getItemCount() - 1) {
            return 11;
        }
        if (i3 == 5) {
            return 8;
        }
        if (i3 != 4) {
            LocationController.SharingLocationInfo sharingLocationInfo = (i3 == 2 || i3 == 1) ? LocationController.getInstance(this.currentAccount).getSharingLocationInfo(this.dialogId) : null;
            if (this.currentMessageObject != null) {
                if (this.currentLiveLocations.isEmpty()) {
                    return i == 2 ? 9 : 8;
                }
                if (i == 2) {
                    return 10;
                }
                if (i != 3) {
                    if (i != 4) {
                        return 8;
                    }
                    this.shareLiveLocationPotistion = i;
                    return 6;
                }
            } else {
                if (i3 == 2) {
                    if (i != 2 || sharingLocationInfo == null || sharingLocationInfo.period == Integer.MAX_VALUE) {
                        if (i != 1) {
                            return 8;
                        }
                        if (sharingLocationInfo == null || sharingLocationInfo.period != Integer.MAX_VALUE) {
                            this.shareLiveLocationPotistion = i;
                            return 6;
                        }
                    }
                    return 7;
                }
                ArrayList arrayList = this.places;
                if (i3 != 1) {
                    int size = arrayList.size();
                    ArrayList arrayList2 = this.locations;
                    int size2 = arrayList2.size() + size;
                    if (i3 != 7) {
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
                    if (i != 1) {
                        if (i == 2) {
                            return 10;
                        }
                        if (i != 3) {
                            if (this.searching || (arrayList.isEmpty() && arrayList2.isEmpty())) {
                                if (i > 6 || ((!this.searching && this.searched) || this.myLocationDenied)) {
                                    return 4;
                                }
                            } else if (i == size2 + i2) {
                                return 5;
                            }
                            return 3;
                        }
                    }
                } else if (i != 1) {
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
                    if (i != 4) {
                        if (this.searching || arrayList.isEmpty() || !this.searched) {
                            if (i > 7 || ((!this.searching && this.searched) || this.myLocationDenied)) {
                                return 4;
                            }
                        } else if (i == arrayList.size() + 5) {
                            return 5;
                        }
                        return 3;
                    }
                }
            }
            return 2;
        }
        return 1;
    }

    @Override
    public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
        int i = viewHolder.mItemViewType;
        if (i == 6) {
            if (LocationController.getInstance(this.currentAccount).getSharingLocationInfo(this.dialogId) == null && this.gpsLocation == null) {
                return false;
            }
        } else if (i != 1 && i != 3 && i != 8 && i != 12 && i != 7) {
            return false;
        }
        return true;
    }

    @Override
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        String userName;
        int i3 = viewHolder.mItemViewType;
        int i4 = this.locationType;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = null;
        int i5 = 2;
        boolean z = false;
        View view = viewHolder.itemView;
        switch (i3) {
            case 0:
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new RecyclerView.LayoutParams(-1, this.overScrollHeight);
                } else {
                    ((ViewGroup.MarginLayoutParams) layoutParams).height = this.overScrollHeight;
                }
                view.setLayoutParams(layoutParams);
                break;
            case 1:
                this.sendLocationCell = (SendLocationCell) view;
                updateCell();
                break;
            case 2:
                HeaderCell headerCell = (HeaderCell) view;
                if (this.currentMessageObject == null) {
                    headerCell.setText(LocaleController.getString(R.string.NearbyVenue));
                } else {
                    headerCell.setText(LocaleController.getString(R.string.LiveLocations));
                }
                break;
            case 3:
                LocationCell locationCell = (LocationCell) view;
                if (i4 == 0) {
                    i2 = i - 4;
                } else if (i4 == 7 || i4 == 8) {
                    int i6 = i - 4;
                    if (this.street != null) {
                        i2 = i - 5;
                    } else {
                        i2 = i6;
                    }
                } else {
                    i2 = i - 5;
                }
                if (!this.searched || (i4 == 7 && this.searching)) {
                    i5 = i2;
                } else {
                    ArrayList arrayList = this.locations;
                    if (i2 < 0 || i2 >= arrayList.size()) {
                        int size = i2 - arrayList.size();
                        if (size >= 0) {
                            ArrayList arrayList2 = this.places;
                            if (size < arrayList2.size()) {
                                tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList2.get(size);
                            }
                        }
                        i5 = i2;
                    } else {
                        tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i2);
                    }
                }
                locationCell.setLocation(tL_messageMediaVenue, i5, true, false);
                break;
            case 4:
                ((LocationLoadingCell) view).setLoading(this.searching);
                break;
            case 6:
                SendLocationCell sendLocationCell = (SendLocationCell) view;
                sendLocationCell.setHasLocation(this.gpsLocation != null);
                int i7 = i + 1;
                if (i7 < getItemCount() && getItemViewType(i7) == 7) {
                    z = true;
                }
                sendLocationCell.useDivider = z;
                sendLocationCell.invalidate();
                break;
            case 7:
                ((SendLocationCell) view).setHasLocation(this.gpsLocation != null);
                break;
            case 8:
                SharingLiveLocationCell sharingLiveLocationCell = (SharingLiveLocationCell) view;
                if (i4 == 6) {
                    sharingLiveLocationCell.setDialog(this.currentMessageObject, this.gpsLocation, this.myLocationDenied);
                    break;
                } else {
                    TLRPC.TL_channelLocation tL_channelLocation = this.chatLocation;
                    long j = this.dialogId;
                    if (tL_channelLocation != null) {
                        sharingLiveLocationCell.currentAccount = UserConfig.selectedAccount;
                        String str = tL_channelLocation.address;
                        sharingLiveLocationCell.avatarDrawable = null;
                        boolean zIsUserDialog = DialogObject.isUserDialog(j);
                        BackupImageView backupImageView = sharingLiveLocationCell.avatarImageView;
                        if (zIsUserDialog) {
                            TLRPC.User user = MessagesController.getInstance(sharingLiveLocationCell.currentAccount).getUser(Long.valueOf(j));
                            if (user != null) {
                                sharingLiveLocationCell.avatarDrawable = new AvatarDrawable(user);
                                userName = UserObject.getUserName(user);
                                backupImageView.imageReceiver.setForUserOrChat(user, sharingLiveLocationCell.avatarDrawable);
                                backupImageView.onNewImageSet();
                            } else {
                                userName = "";
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(sharingLiveLocationCell.currentAccount).getChat(Long.valueOf(-j));
                            if (chat != null) {
                                AvatarDrawable avatarDrawable = new AvatarDrawable(chat);
                                sharingLiveLocationCell.avatarDrawable = avatarDrawable;
                                String str2 = chat.title;
                                backupImageView.imageReceiver.setForUserOrChat(chat, avatarDrawable);
                                backupImageView.onNewImageSet();
                                userName = str2;
                            } else {
                                userName = "";
                            }
                        }
                        sharingLiveLocationCell.nameTextView.setText(userName, false);
                        Location location = sharingLiveLocationCell.location;
                        location.setLatitude(tL_channelLocation.geo_point.lat);
                        location.setLongitude(tL_channelLocation.geo_point._long);
                        TextView textView = sharingLiveLocationCell.distanceTextView;
                        sharingLiveLocationCell.distanceTextViewSingle = true;
                        textView.setSingleLine(true);
                        textView.setText(str);
                        break;
                    } else {
                        MessageObject messageObject = this.currentMessageObject;
                        if (messageObject != null && i == 1) {
                            sharingLiveLocationCell.setDialog(messageObject, this.gpsLocation, this.myLocationDenied);
                            break;
                        } else {
                            int i8 = i - (messageObject != null ? 5 : 2);
                            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(this.currentAccount).getSharingLocationInfo(j);
                            if (sharingLocationInfo != null && sharingLocationInfo.period != Integer.MAX_VALUE) {
                                i8--;
                            }
                            if (i8 >= 0 && i8 < this.currentLiveLocations.size()) {
                                LocationActivity.LiveLocation liveLocation = (LocationActivity.LiveLocation) this.currentLiveLocations.get(i8);
                                Location location2 = this.gpsLocation;
                                sharingLiveLocationCell.liveLocation = liveLocation;
                                boolean zIsUserDialog2 = DialogObject.isUserDialog(liveLocation.id);
                                BackupImageView backupImageView2 = sharingLiveLocationCell.avatarImageView;
                                SimpleTextView simpleTextView = sharingLiveLocationCell.nameTextView;
                                if (zIsUserDialog2) {
                                    TLRPC.User user2 = MessagesController.getInstance(sharingLiveLocationCell.currentAccount).getUser(Long.valueOf(liveLocation.id));
                                    if (user2 != null) {
                                        sharingLiveLocationCell.avatarDrawable.setInfo(sharingLiveLocationCell.currentAccount, user2);
                                        simpleTextView.setText(ContactsController.formatName(user2.first_name, user2.last_name), false);
                                        backupImageView2.imageReceiver.setForUserOrChat(user2, sharingLiveLocationCell.avatarDrawable);
                                        backupImageView2.onNewImageSet();
                                    }
                                } else {
                                    TLRPC.Chat chat2 = MessagesController.getInstance(sharingLiveLocationCell.currentAccount).getChat(Long.valueOf(-liveLocation.id));
                                    if (chat2 != null) {
                                        sharingLiveLocationCell.avatarDrawable.setInfo(sharingLiveLocationCell.currentAccount, chat2);
                                        simpleTextView.setText(chat2.title, false);
                                        backupImageView2.imageReceiver.setForUserOrChat(chat2, sharingLiveLocationCell.avatarDrawable);
                                        backupImageView2.onNewImageSet();
                                    }
                                }
                                IMapsProvider.LatLng position = liveLocation.marker.getPosition();
                                Location location3 = sharingLiveLocationCell.location;
                                location3.setLatitude(position.latitude);
                                location3.setLongitude(position.longitude);
                                TLRPC.Message message = liveLocation.object;
                                int i9 = message.edit_date;
                                String locationUpdateDate = LocaleController.formatLocationUpdateDate(i9 != 0 ? i9 : message.date);
                                TextView textView2 = sharingLiveLocationCell.distanceTextView;
                                if (location2 == null) {
                                    textView2.setText(locationUpdateDate);
                                } else {
                                    textView2.setText(locationUpdateDate + " - " + LocaleController.formatDistance(location3.distanceTo(location2), 0));
                                }
                                break;
                            }
                        }
                    }
                }
                break;
            case 11:
                view.setBackgroundColor(Theme.getColor(this.myLocationDenied ? Theme.key_dialogBackgroundGray : Theme.key_dialogBackground, this.resourcesProvider));
                break;
            case 12:
                LocationCell locationCell2 = (LocationCell) view;
                if (this.askingForMyLocation) {
                    locationCell2.setLocation(null, 2, i == 1 && this.street != null, false);
                } else if (i != 1) {
                    locationCell2.setLocation(this.street, 2, false, this.animated);
                } else {
                    locationCell2.setLocation(this.city, 2, this.street != null, this.animated);
                }
                break;
        }
    }

    @Override
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ?? sendLocationCell;
        ?? headerCell;
        long j = this.dialogId;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Context context = this.mContext;
        switch (i) {
            case 0:
                FrameLayout frameLayout = new FrameLayout(context);
                this.emptyCell = frameLayout;
                frameLayout.setTag(-33024);
                this.emptyCell.setLayoutParams(new RecyclerView.LayoutParams(-1, this.overScrollHeight));
                headerCell = frameLayout;
                break;
            case 1:
                sendLocationCell = new SendLocationCell(context, resourcesProvider, false, false);
                headerCell = sendLocationCell;
                break;
            case 2:
                headerCell = new HeaderCell(context, resourcesProvider);
                break;
            case 3:
                headerCell = new LocationCell(context, resourcesProvider);
                break;
            case 4:
                headerCell = new LocationLoadingCell(context, resourcesProvider);
                break;
            case 5:
                ?? locationPoweredCell = new LocationPoweredCell(context);
                LinearLayout linearLayout = new LinearLayout(context);
                locationPoweredCell.addView(linearLayout, LayoutHelper.createFrame(-2, -2, 17));
                TextView textViewM = RichMessageLayout$$ExternalSyntheticOutline0.m(context, 1, 16.0f);
                int i2 = Theme.key_windowBackgroundWhiteGrayText3;
                textViewM.setTextColor(Theme.getColor(i2, resourcesProvider));
                textViewM.setText("Powered by");
                linearLayout.addView(textViewM, LayoutHelper.createLinear(-2, -2));
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.foursquare);
                imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2, resourcesProvider), PorterDuff.Mode.MULTIPLY));
                imageView.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
                linearLayout.addView(imageView, LayoutHelper.createLinear(35, -2));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(Theme.getColor(i2, resourcesProvider));
                textView.setText("Foursquare");
                linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2));
                sendLocationCell = locationPoweredCell;
                headerCell = sendLocationCell;
                break;
            case 6:
                SendLocationCell sendLocationCell2 = new SendLocationCell(context, resourcesProvider, true, false);
                sendLocationCell2.setDialogId(j);
                sendLocationCell = sendLocationCell2;
                headerCell = sendLocationCell;
                break;
            case 7:
                SendLocationCell sendLocationCell3 = new SendLocationCell(context, resourcesProvider, true, true);
                sendLocationCell3.setDialogId(j);
                headerCell = sendLocationCell3;
                break;
            case 8:
                int i3 = this.locationType;
                headerCell = new SharingLiveLocationCell((i3 == 4 || i3 == 5 || i3 == 3) ? 16 : 54, context, resourcesProvider, true);
                break;
            case 9:
                LocationDirectionCell locationDirectionCell = new LocationDirectionCell(context, resourcesProvider);
                locationDirectionCell.setOnButtonClick(new CallLogActivity$$ExternalSyntheticLambda38(this, 5));
                headerCell = locationDirectionCell;
                break;
            case 10:
                ShadowSectionCell shadowSectionCell = new ShadowSectionCell(context, (Object) null);
                new CombinedDrawable(new ColorDrawable(Theme.getColor(Theme.key_windowBackgroundGray, resourcesProvider)), Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow)).fullSize = true;
                headerCell = shadowSectionCell;
                break;
            case 11:
            default:
                headerCell = new View(context);
                break;
            case 12:
                LocationCell locationCell = new LocationCell(context, resourcesProvider);
                locationCell.setAllowTextAnimation(true);
                headerCell = locationCell;
                break;
            case 13:
                headerCell = this.sharedMediaLayout;
                break;
        }
        return new RecyclerListView.Holder(headerCell);
    }

    public void onDirectionClick() {
    }

    @Override
    public final void onLocationAddressAvailable(String str, String str2, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, TLRPC.TL_messageMediaVenue tL_messageMediaVenue2, Location location) {
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
        if (i != 7) {
            updateCell();
            return;
        }
        this.city = tL_messageMediaVenue;
        this.street = tL_messageMediaVenue2;
        boolean z2 = tL_messageMediaVenue2 == null;
        RecyclerView.AdapterDataObservable adapterDataObservable = this.mObservable;
        if (z != z2) {
            adapterDataObservable.notifyItemRangeChanged(1, 2, null);
            return;
        }
        notifyItemChanged(1);
        if (this.street == null) {
            adapterDataObservable.notifyItemRangeRemoved(2, 1);
        } else {
            adapterDataObservable.notifyItemRangeInserted(2, 1);
        }
    }

    public final void setGpsLocation(Location location) {
        int i;
        boolean z = this.gpsLocation == null;
        this.gpsLocation = location;
        if (this.customLocation == null) {
            fetchLocationAddress();
        }
        if (z && (i = this.shareLiveLocationPotistion) > 0) {
            notifyItemChanged(i);
        }
        MessageObject messageObject = this.currentMessageObject;
        RecyclerView.AdapterDataObservable adapterDataObservable = this.mObservable;
        if (messageObject != null) {
            adapterDataObservable.notifyItemRangeChanged(1, 1, new Object());
            if (this.currentLiveLocations.isEmpty()) {
                return;
            }
            adapterDataObservable.notifyItemRangeChanged(2, this.currentLiveLocations.size(), new Object());
            return;
        }
        if (this.locationType != 2) {
            updateCell();
        } else {
            if (this.currentLiveLocations.isEmpty()) {
                return;
            }
            adapterDataObservable.notifyItemRangeChanged(2, this.currentLiveLocations.size(), new Object());
        }
    }

    public final void setMyLocationDenied(boolean z, boolean z2) {
        if (this.myLocationDenied == z && this.askingForMyLocation == z2) {
            return;
        }
        this.myLocationDenied = z;
        this.askingForMyLocation = z2;
        if (z2) {
            this.city = null;
            this.street = null;
        }
        this.mObservable.notifyChanged();
    }

    public final void setOverScrollHeight(int i) {
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

    public final void updateCell() {
        String string;
        SendLocationCell sendLocationCell = this.sendLocationCell;
        if (sendLocationCell != null) {
            int i = this.locationType;
            if (i == 8) {
                if (!TextUtils.isEmpty(this.overrideAddressName)) {
                    string = this.overrideAddressName;
                } else if (TextUtils.isEmpty(this.addressName)) {
                    string = this.fetchingLocation ? LocaleController.getString(R.string.Loading) : LocaleController.getString(R.string.UnknownLocation);
                } else {
                    string = this.addressName;
                }
                this.sendLocationCell.setText(LocaleController.getString(R.string.SetThisLocation), string);
                this.sendLocationCell.setHasLocation(true);
                return;
            }
            String string2 = "";
            if (i != 4 && this.customLocation == null) {
                if (this.gpsLocation != null) {
                    sendLocationCell.setText(LocaleController.getString(R.string.SendLocation), LocaleController.formatString(R.string.AccurateTo, LocaleController.formatPluralString("Meters", (int) this.gpsLocation.getAccuracy(), new Object[0])));
                    this.sendLocationCell.setHasLocation(true);
                    return;
                } else {
                    sendLocationCell.setText(LocaleController.getString(R.string.SendLocation), this.myLocationDenied ? "" : LocaleController.getString(R.string.Loading));
                    this.sendLocationCell.setHasLocation(!this.myLocationDenied);
                    return;
                }
            }
            if (!TextUtils.isEmpty(this.overrideAddressName)) {
                string2 = this.overrideAddressName;
            } else if (TextUtils.isEmpty(this.addressName)) {
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
            } else {
                string2 = this.addressName;
            }
            if (this.isPollAttach) {
                this.sendLocationCell.setText(LocaleController.getString(R.string.AttachSelectedLocation), string2);
            } else if (i == 4) {
                this.sendLocationCell.setText(LocaleController.getString(R.string.ChatSetThisLocation), string2);
            } else {
                this.sendLocationCell.setText(LocaleController.getString(R.string.SendSelectedLocation), string2);
            }
            this.sendLocationCell.setHasLocation(true);
        }
    }
}
