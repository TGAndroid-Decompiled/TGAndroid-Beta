package org.telegram.ui.Cells;

import android.location.Address;
import android.location.Geocoder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.Components.ChatAttachAlertLocationLayout;

public final class SharingLiveLocationCell$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final FrameLayout f$0;
    public final double f$1;
    public final double f$2;

    public SharingLiveLocationCell$$ExternalSyntheticLambda0(FrameLayout frameLayout, double d, double d2, int i) {
        this.$r8$classId = i;
        this.f$0 = frameLayout;
        this.f$1 = d;
        this.f$2 = d2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                SharingLiveLocationCell sharingLiveLocationCell = (SharingLiveLocationCell) this.f$0;
                double d = this.f$1;
                double d2 = this.f$2;
                sharingLiveLocationCell.getClass();
                try {
                    List<Address> fromLocation = new Geocoder(ApplicationLoader.applicationContext, LocaleController.getInstance().getCurrentLocale()).getFromLocation(d, d2, 1);
                    if (fromLocation.isEmpty()) {
                        String strDetectOcean = LocationController.detectOcean(d2, d);
                        sharingLiveLocationCell.lastName = strDetectOcean;
                        if (strDetectOcean == null) {
                            sharingLiveLocationCell.lastName = "";
                        } else {
                            sharingLiveLocationCell.lastName = "🌊 " + ((Object) sharingLiveLocationCell.lastName);
                        }
                    } else {
                        Address address = fromLocation.get(0);
                        StringBuilder sb = new StringBuilder();
                        HashSet<String> hashSet = new HashSet();
                        hashSet.add(address.getSubAdminArea());
                        hashSet.add(address.getAdminArea());
                        hashSet.add(address.getLocality());
                        hashSet.add(address.getCountryName());
                        for (String str : hashSet) {
                            if (!TextUtils.isEmpty(str)) {
                                if (sb.length() > 0) {
                                    sb.append(", ");
                                }
                                sb.append(str);
                            }
                        }
                        sharingLiveLocationCell.lastName = sb.toString();
                        String strCountryCodeToEmoji = LocationController.countryCodeToEmoji(address.getCountryCode());
                        if (strCountryCodeToEmoji != null && Emoji.getEmojiDrawable(strCountryCodeToEmoji) != null) {
                            sharingLiveLocationCell.lastName = strCountryCodeToEmoji + " " + ((Object) sharingLiveLocationCell.lastName);
                        }
                    }
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new SharingLiveLocationCell$$ExternalSyntheticLambda0(sharingLiveLocationCell, d, d2, 1));
                break;
            case 1:
                SharingLiveLocationCell sharingLiveLocationCell2 = (SharingLiveLocationCell) this.f$0;
                sharingLiveLocationCell2.lastLat = this.f$1;
                sharingLiveLocationCell2.lastLong = this.f$2;
                sharingLiveLocationCell2.loading = false;
                CharSequence charSequence = sharingLiveLocationCell2.lastName;
                SimpleTextView simpleTextView = sharingLiveLocationCell2.nameTextView;
                CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(charSequence, simpleTextView.getPaint().getFontMetricsInt(), false);
                sharingLiveLocationCell2.lastName = charSequenceReplaceEmoji;
                simpleTextView.setText(charSequenceReplaceEmoji, false);
                break;
            default:
                ((ChatAttachAlertLocationLayout) this.f$0).resetMapPosition(this.f$1, this.f$2);
                break;
        }
    }
}
