package org.telegram.ui.ActionBar;

import android.graphics.RectF;
import android.view.MenuItem;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.dash.manifest.BaseUrl;
import com.google.android.exoplayer2.text.cea.Cea708Decoder;
import com.google.android.exoplayer2.text.webvtt.WebvttCueInfo;
import com.google.android.exoplayer2.text.webvtt.WebvttCueParser;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.upstream.SlidingPercentile;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Ordering;
import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_CustomAttribute;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.Size;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Adapters.DialogsSearchAdapter;
import org.telegram.ui.Adapters.SearchAdapterHelper;

public final class Theme$$ExternalSyntheticLambda5 implements Comparator {
    public final int $r8$classId;

    public Theme$$ExternalSyntheticLambda5(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i = 12;
        int i2 = 13;
        switch (this.$r8$classId) {
            case 0:
                Theme.ThemeInfo themeInfo = (Theme.ThemeInfo) obj;
                Theme.ThemeInfo themeInfo2 = (Theme.ThemeInfo) obj2;
                if (themeInfo.pathToFile == null && themeInfo.assetName == null) {
                    return -1;
                }
                if (themeInfo2.pathToFile == null && themeInfo2.assetName == null) {
                    return 1;
                }
                return themeInfo.name.compareTo(themeInfo2.name);
            case 1:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    byte b = bArr[i3];
                    byte b2 = bArr2[i3];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 2:
                BaseUrl baseUrl = (BaseUrl) obj;
                BaseUrl baseUrl2 = (BaseUrl) obj2;
                int iCompare = Integer.compare(baseUrl.priority, baseUrl2.priority);
                return iCompare != 0 ? iCompare : baseUrl.serviceLocation.compareTo(baseUrl2.serviceLocation);
            case 3:
                return Integer.compare(((Cea708Decoder.Cea708CueInfo) obj2).priority, ((Cea708Decoder.Cea708CueInfo) obj).priority);
            case 4:
                return Integer.compare(((WebvttCueParser.Element) obj).startTag.position, ((WebvttCueParser.Element) obj2).startTag.position);
            case 5:
                return Long.compare(((WebvttCueInfo) obj).startTimeUs, ((WebvttCueInfo) obj2).startTimeUs);
            case 6:
                return ((Format) obj2).bitrate - ((Format) obj).bitrate;
            case 7:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 8:
                Ordering ordering = DefaultTrackSelector.FORMAT_VALUE_ORDERING;
                return 0;
            case 9:
                List list = (List) obj;
                List list2 = (List) obj2;
                return ComparisonChain.AnonymousClass1.classify(DefaultTrackSelector.VideoTrackInfo.compareNonQualityPreferences((DefaultTrackSelector.VideoTrackInfo) Collections.max(list, new Theme$$ExternalSyntheticLambda5(i)), (DefaultTrackSelector.VideoTrackInfo) Collections.max(list2, new Theme$$ExternalSyntheticLambda5(i)))).compare(list.size(), list2.size()).compare((DefaultTrackSelector.VideoTrackInfo) Collections.max(list, new Theme$$ExternalSyntheticLambda5(i2)), (DefaultTrackSelector.VideoTrackInfo) Collections.max(list2, new Theme$$ExternalSyntheticLambda5(i2)), new Theme$$ExternalSyntheticLambda5(i2)).result();
            case 10:
                return ((DefaultTrackSelector.AudioTrackInfo) Collections.max((List) obj)).compareTo((DefaultTrackSelector.AudioTrackInfo) Collections.max((List) obj2));
            case 11:
                return ((DefaultTrackSelector.TextTrackInfo) ((List) obj).get(0)).compareTo((DefaultTrackSelector.TextTrackInfo) ((List) obj2).get(0));
            case 12:
                return DefaultTrackSelector.VideoTrackInfo.compareNonQualityPreferences((DefaultTrackSelector.VideoTrackInfo) obj, (DefaultTrackSelector.VideoTrackInfo) obj2);
            case 13:
                DefaultTrackSelector.VideoTrackInfo videoTrackInfo = (DefaultTrackSelector.VideoTrackInfo) obj;
                DefaultTrackSelector.VideoTrackInfo videoTrackInfo2 = (DefaultTrackSelector.VideoTrackInfo) obj2;
                Ordering orderingReverse = (videoTrackInfo.isWithinMaxConstraints && videoTrackInfo.isWithinRendererCapabilities) ? DefaultTrackSelector.FORMAT_VALUE_ORDERING : DefaultTrackSelector.FORMAT_VALUE_ORDERING.reverse();
                ComparisonChain.AnonymousClass1 anonymousClass1 = ComparisonChain.ACTIVE;
                int i4 = videoTrackInfo.bitrate;
                return anonymousClass1.compare(Integer.valueOf(i4), Integer.valueOf(videoTrackInfo2.bitrate), videoTrackInfo.parameters.forceLowestBitrate ? DefaultTrackSelector.FORMAT_VALUE_ORDERING.reverse() : DefaultTrackSelector.NO_ORDER).compare(Integer.valueOf(videoTrackInfo.pixelCount), Integer.valueOf(videoTrackInfo2.pixelCount), orderingReverse).compare(Integer.valueOf(i4), Integer.valueOf(videoTrackInfo2.bitrate), orderingReverse).result();
            case 14:
                return ((SlidingPercentile.Sample) obj).index - ((SlidingPercentile.Sample) obj2).index;
            case 15:
                return Float.compare(((SlidingPercentile.Sample) obj).value, ((SlidingPercentile.Sample) obj2).value);
            case 16:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 17:
                return ((AutoValue_CrashlyticsReport_CustomAttribute) ((CrashlyticsReport.CustomAttribute) obj)).key.compareTo(((AutoValue_CrashlyticsReport_CustomAttribute) ((CrashlyticsReport.CustomAttribute) obj2)).key);
            case 18:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 19:
                String name = ((File) obj).getName();
                int i5 = CrashlyticsReportPersistence.EVENT_NAME_LENGTH;
                return name.substring(0, i5).compareTo(((File) obj2).getName().substring(0, i5));
            case 20:
                return CameraController.lambda$initCamera$0((Size) obj, (Size) obj2);
            case 21:
                RectF rectF = (RectF) obj;
                RectF rectF2 = (RectF) obj2;
                if (Math.abs(rectF.top - rectF2.top) <= 1.0E-4f) {
                    if (Math.abs(rectF.left - rectF2.left) <= 1.0E-4f) {
                        return 0;
                    }
                    if (rectF.left < rectF2.left) {
                        return -1;
                    }
                } else if (rectF.top < rectF2.top) {
                    return -1;
                }
                return 1;
            case 22:
                return Long.compare(((TLRPC.PollAnswer) obj).shuffle_hash ^ Long.MIN_VALUE, ((TLRPC.PollAnswer) obj2).shuffle_hash ^ Long.MIN_VALUE);
            case 23:
                return ((MenuItem) obj).getOrder() - ((MenuItem) obj2).getOrder();
            case 24:
                List list3 = FloatingToolbar.premiumOptions;
                return (list3.contains(Integer.valueOf(((MenuItem) obj).getItemId())) ? 1 : 0) - (list3.contains(Integer.valueOf(((MenuItem) obj2).getItemId())) ? 1 : 0);
            case 25:
                Theme.ThemeAccent themeAccent = (Theme.ThemeAccent) obj;
                Theme.ThemeAccent themeAccent2 = (Theme.ThemeAccent) obj2;
                if (Theme.isHome(themeAccent)) {
                    return -1;
                }
                if (!Theme.isHome(themeAccent2)) {
                    ?? r0 = themeAccent.isDefault;
                    ?? r1 = themeAccent2.isDefault;
                    if (r0 == r1) {
                        if (r0 != 0) {
                            int i6 = themeAccent.id;
                            int i7 = themeAccent2.id;
                            if (i6 <= i7) {
                                if (i6 < i7) {
                                    return -1;
                                }
                                return 0;
                            }
                        } else {
                            int i8 = themeAccent.id;
                            int i9 = themeAccent2.id;
                            if (i8 > i9) {
                                return -1;
                            }
                            if (i8 >= i9) {
                                return 0;
                            }
                        }
                    } else if (r0 > r1) {
                        return -1;
                    }
                }
                return 1;
            case 26:
                return DialogsSearchAdapter.lambda$loadRecentSearch$6((DialogsSearchAdapter.RecentSearchObject) obj, (DialogsSearchAdapter.RecentSearchObject) obj2);
            case 27:
                return Double.compare(((TLRPC.TL_topPeer) obj2).rating, ((TLRPC.TL_topPeer) obj).rating);
            case 28:
                return SearchAdapterHelper.lambda$loadRecentHashtags$4((SearchAdapterHelper.HashtagObject) obj, (SearchAdapterHelper.HashtagObject) obj2);
            default:
                return ((TL_account.TL_businessWeeklyOpen) obj).start_minute - ((TL_account.TL_businessWeeklyOpen) obj2).start_minute;
        }
    }
}
