package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CreateRtmpStreamBottomSheet;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.Paint.Views.EntityView;
import org.telegram.ui.Components.Paint.Views.LinkPreview;
import org.telegram.ui.Components.Paint.Views.LinkView;
import org.telegram.ui.Components.Paint.Views.PaintCancelView;
import org.telegram.ui.Components.Paint.Views.PaintDoneView;
import org.telegram.ui.Components.Paint.Views.PaintWeightChooserView;
import org.telegram.ui.Components.Paint.Views.TextPaintView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Stories.recorder.EmojiBottomSheet;
import org.telegram.ui.Stories.recorder.PaintView;
import org.telegram.ui.Stories.recorder.QRScanner;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.Stories.recorder.StoryPrivacySelector;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.Stories.recorder.StoryRecorder$$ExternalSyntheticLambda19;
import org.telegram.ui.Stories.recorder.StoryRecorder$13$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.recorder.TimelineView;
import org.telegram.ui.Stories.recorder.Weather;
import org.telegram.ui.bots.BotLocation;
import org.telegram.ui.bots.BotShareSheet$$ExternalSyntheticLambda4;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.community.CommunityCreateActivity;
import org.telegram.ui.community.CommunitySheet;
import org.telegram.ui.iv.ChatAttachAlertRichLayout;
import org.telegram.ui.iv.MathSpan;
import org.telegram.ui.iv.RichEditText;
import org.telegram.ui.iv.RichEditor;
import org.telegram.ui.iv.RichEditorHistory;
import org.telegram.ui.iv.RichEditorListView;
import org.telegram.ui.web.BotWebViewContainer;
import org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda12;
import org.telegram.ui.web.BrowserHistory;
import org.telegram.ui.web.HistoryFragment;
import org.telegram.ui.web.WebBrowserSettings;
import org.telegram.ui.web.WebInstantView;
import org.webrtc.EglRenderer$$ExternalSyntheticLambda6;

public final class ThemeActivity$$ExternalSyntheticLambda19 implements Utilities.Callback {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public ThemeActivity$$ExternalSyntheticLambda19(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run(Object obj) {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        boolean z;
        int i;
        int i2;
        MathSpan mathSpanCreate;
        int i3 = 0;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ThemeActivity themeActivity = (ThemeActivity) obj3;
                themeActivity.getClass();
                if (!((Boolean) obj).booleanValue()) {
                    SharedConfig.recordViaSco = false;
                    SharedConfig.saveConfig();
                    themeActivity.updateRecordViaSco = true;
                    ((Dialog) ((AtomicReference) obj2).get()).dismiss();
                    RecyclerListView recyclerListView = themeActivity.listView;
                    if (recyclerListView != null && recyclerListView.mIsAttached && (viewHolderFindViewHolderForAdapterPosition = recyclerListView.findViewHolderForAdapterPosition(themeActivity.bluetoothScoRow)) != null) {
                        themeActivity.listAdapter.onBindViewHolder(viewHolderFindViewHolderForAdapterPosition, themeActivity.bluetoothScoRow);
                        break;
                    }
                }
                break;
            case 1:
                Weather.State state = (Weather.State) obj;
                EmojiBottomSheet.StoryWidgetsCell storyWidgetsCell = (EmojiBottomSheet.StoryWidgetsCell) obj3;
                storyWidgetsCell.getClass();
                EmojiBottomSheet.StoryWidgetsCell.Button button = ((EmojiBottomSheet.StoryWidgetsCell.Button[]) obj2)[0];
                StringBuilder sb = new StringBuilder();
                sb.append(state == null ? "🌤" : state.emoji);
                sb.append(" ");
                sb.append(state == null ? Weather.isDefaultCelsius() ? "24°C" : "72°F" : state.getTemperature());
                StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(Emoji.replaceEmoji(sb.toString(), storyWidgetsCell.textPaint.getFontMetricsInt(), false), EmojiBottomSheet.StoryWidgetsCell.this.textPaint, AndroidUtilities.displaySize.x * 0.8f, TextUtils.TruncateAt.END), EmojiBottomSheet.StoryWidgetsCell.this.textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                button.layout = staticLayout;
                button.textWidth = staticLayout.getLineCount() > 0 ? button.layout.getLineWidth(0) : 0.0f;
                button.textLeft = button.layout.getLineCount() > 0 ? button.layout.getLineLeft(0) : 0.0f;
                button.width = AndroidUtilities.dpf2(17.6f) + button.textWidth;
                button.height = AndroidUtilities.dpf2(36.0f);
                storyWidgetsCell.invalidate();
                storyWidgetsCell.requestLayout();
                break;
            case 2:
                StoryRecorder.AnonymousClass24 anonymousClass24 = (StoryRecorder.AnonymousClass24) obj3;
                StoryRecorder.WindowView windowView = (StoryRecorder.WindowView) obj2;
                int iMax = Math.max(0, Math.max(((Integer) obj).intValue() - windowView.getBottomPadding2(), anonymousClass24.emojiPadding - windowView.getPaddingUnderContainer()));
                anonymousClass24.notifyHeightChanged();
                if (iMax > 0) {
                    EntityView entityView = anonymousClass24.currentEntityView;
                    if ((entityView instanceof TextPaintView) && ((TextPaintView) entityView).getEditText().isFocused()) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                AnimatorSet animatorSet = anonymousClass24.keyboardAnimator;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                anonymousClass24.keyboardAnimator = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                float[] fArr = {iMax > 0 ? Math.min(0.0f, ((-iMax) / 2.0f) - AndroidUtilities.dp(8.0f)) : 0.0f};
                Property property = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(anonymousClass24.weightChooserView, (Property<PaintWeightChooserView, Float>) property, fArr));
                arrayList.add(ObjectAnimator.ofFloat(anonymousClass24.bottomLayout, (Property<PaintView.AnonymousClass9, Float>) property, iMax > 0 ? Math.min(0, AndroidUtilities.dp(40.0f) + (-iMax)) : 0));
                GroupCallActivity.AnonymousClass61 anonymousClass61 = anonymousClass24.tabsLayout;
                float[] fArr2 = {z ? 0.0f : 1.0f};
                Property property2 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(anonymousClass61, (Property<GroupCallActivity.AnonymousClass61, Float>) property2, fArr2));
                arrayList.add(ObjectAnimator.ofFloat(anonymousClass24.doneButton, (Property<PaintDoneView, Float>) property2, (!z || anonymousClass24.isColorListShown) ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(anonymousClass24.cancelButton, (Property<PaintCancelView, Float>) property2, (!z || anonymousClass24.isColorListShown) ? 1.0f : 0.0f));
                anonymousClass24.updatePreviewViewTranslationY();
                anonymousClass24.keyboardAnimator.playTogether(arrayList);
                if (z) {
                    anonymousClass24.keyboardAnimator.setDuration(250L);
                    anonymousClass24.keyboardAnimator.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
                } else {
                    anonymousClass24.keyboardAnimator.setDuration(350L);
                    anonymousClass24.keyboardAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                }
                anonymousClass24.keyboardAnimator.start();
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    ((Animator) arrayList.get(i4)).setDuration(z ? 350L : 250L);
                    ((Animator) arrayList.get(i4)).setInterpolator(z ? CubicBezierInterpolator.EASE_OUT_QUINT : AdjustPanLayoutHelper.keyboardInterpolator);
                    ((Animator) arrayList.get(i4)).start();
                }
                if (!z) {
                    anonymousClass24.showTypefaceMenu$1(false);
                }
                if (anonymousClass24.wasKeyboardVisible != z) {
                    anonymousClass24.checkEntitiesIsVideo();
                }
                anonymousClass24.wasKeyboardVisible = z;
                break;
            case 3:
                Weather.State state2 = (Weather.State) obj;
                PaintView paintView = (PaintView) obj3;
                paintView.getClass();
                if (state2 != null) {
                    ((PaintView.AnonymousClass22) obj2).lambda$showGiftOfferSheet$15();
                    paintView.onOpenCloseStickersAlert(false);
                    paintView.appearAnimation(paintView.createWeatherView(state2));
                }
                break;
            case 4:
                LinkPreview.WebPagePreview webPagePreview = (LinkPreview.WebPagePreview) obj;
                PaintView paintView2 = (PaintView) obj3;
                LinkView linkView = (LinkView) obj2;
                if (linkView != null) {
                    paintView2.getClass();
                    linkView.link = webPagePreview;
                    linkView.marker.set(paintView2.currentAccount, webPagePreview, false);
                    EntityView.SelectionView selectionView = linkView.selectionView;
                    if (selectionView != null) {
                        selectionView.updatePosition();
                    }
                    paintView2.appearAnimation(linkView);
                } else {
                    paintView2.appearAnimation(paintView2.createLinkSticker(webPagePreview));
                }
                break;
            case 5:
                StoryPrivacyBottomSheet.Page page = (StoryPrivacyBottomSheet.Page) obj3;
                page.getClass();
                ((ItemOptions) obj2).dismiss();
                page.updateItems(true, true);
                StoryPrivacyBottomSheet storyPrivacyBottomSheet = StoryPrivacyBottomSheet.this;
                StoryRecorder$$ExternalSyntheticLambda19 storyRecorder$$ExternalSyntheticLambda19 = storyPrivacyBottomSheet.onSelectedAlbums;
                if (storyRecorder$$ExternalSyntheticLambda19 != null) {
                    storyRecorder$$ExternalSyntheticLambda19.run(new HashSet(storyPrivacyBottomSheet.selectedAlbums));
                }
                break;
            case 6:
                StoryPrivacyBottomSheet.Page page2 = (StoryPrivacyBottomSheet.Page) obj3;
                StoryPrivacyBottomSheet.this.isRtmpStream = true;
                ((CreateRtmpStreamBottomSheet[]) obj2)[0].lambda$showGiftOfferSheet$15();
                page2.updateItems(true, true);
                break;
            case 7:
                Integer num = (Integer) obj;
                StoryRecorder.AnonymousClass13 anonymousClass13 = (StoryRecorder.AnonymousClass13) obj3;
                StoryRecorder storyRecorder = StoryRecorder.this;
                if (storyRecorder.useDisplayFlashlight()) {
                    try {
                        storyRecorder.windowView.performHapticFeedback(3, 1);
                        break;
                    } catch (Exception unused) {
                    }
                }
                storyRecorder.takingPhoto = false;
                QRScanner qRScanner = storyRecorder.qrScanner;
                if (qRScanner != null) {
                    qRScanner.setPaused(false);
                }
                if (storyRecorder.outputFile != null) {
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(storyRecorder.outputFile.getAbsolutePath(), options);
                        i = options.outWidth;
                        try {
                            i2 = options.outHeight;
                        } catch (Exception unused2) {
                            i2 = -1;
                        }
                    } catch (Exception unused3) {
                        i = -1;
                    }
                    int i5 = num.intValue() == -1 ? 0 : 90;
                    if (num.intValue() == -1) {
                        if (i > i2) {
                            i5 = 270;
                        }
                    } else if (i2 > i && i5 != 0) {
                        i5 = 0;
                    }
                    StoryEntry storyEntryFromPhotoShoot = StoryEntry.fromPhotoShoot(i5, storyRecorder.outputFile);
                    storyEntryFromPhotoShoot.botId = storyRecorder.botId;
                    storyEntryFromPhotoShoot.botLang = storyRecorder.botLang;
                    boolean zHasLayout = storyRecorder.collageLayoutView.hasLayout();
                    Utilities.Callback callback = (Utilities.Callback) obj2;
                    int i6 = storyRecorder.currentAccount;
                    if (zHasLayout) {
                        storyRecorder.outputFile = null;
                        if (storyRecorder.collageLayoutView.push(storyEntryFromPhotoShoot)) {
                            StoryEntry storyEntryAsCollage = StoryEntry.asCollage(storyRecorder.collageLayoutView.getLayout(), storyRecorder.collageLayoutView.getContent());
                            storyRecorder.outputEntry = storyEntryAsCollage;
                            StoryPrivacySelector.applySaved(i6, storyEntryAsCollage);
                            storyRecorder.fromGallery = false;
                            if (callback != null) {
                                callback.run(null);
                            }
                        } else if (callback != null) {
                            callback.run(null);
                        }
                        storyRecorder.updateActionBarButtons(true);
                    } else {
                        storyRecorder.outputEntry = storyEntryFromPhotoShoot;
                        StoryPrivacySelector.applySaved(i6, storyEntryFromPhotoShoot);
                        storyRecorder.fromGallery = false;
                        if (callback != null) {
                            callback.run(new StoryRecorder$13$$ExternalSyntheticLambda0(anonymousClass13, 2));
                        } else {
                            storyRecorder.navigateTo(1, true);
                        }
                    }
                    break;
                }
                break;
            case 8:
                Float f = (Float) obj;
                TimelineView timelineView = (TimelineView) obj3;
                timelineView.getClass();
                TimelineView.Track track = (TimelineView.Track) obj2;
                track.volume = f.floatValue();
                TimelineView.TimelineDelegate timelineDelegate = timelineView.delegate;
                if (timelineDelegate != null) {
                    timelineDelegate.onVideoVolumeChange(f.floatValue(), track.index);
                }
                break;
            case 9:
                ThemeActivity themeActivity2 = (ThemeActivity) obj3;
                themeActivity2.getClass();
                if (((Boolean) obj).booleanValue()) {
                    ((TodoItemMenu$$ExternalSyntheticLambda9) obj2).run();
                } else {
                    BulletinFactory.of(themeActivity2).createSimpleBulletin(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).show();
                }
                break;
            case 10:
                int[] iArr = (int[]) obj;
                BotLocation botLocation = (BotLocation) obj3;
                botLocation.getClass();
                boolean z2 = false;
                while (i3 < iArr.length) {
                    if (iArr[i3] == 0) {
                        z2 = true;
                    }
                    i3++;
                }
                botLocation.requested = true;
                botLocation.granted = true;
                botLocation.save();
                Iterator it = botLocation.listeners.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                ((BotWebViewContainer$$ExternalSyntheticLambda12) obj2).run(Boolean.TRUE, Boolean.valueOf(z2));
                break;
            case 11:
                int[] iArr2 = (int[]) obj;
                BotLocation botLocation2 = (BotLocation) obj3;
                botLocation2.getClass();
                boolean z3 = false;
                while (i3 < iArr2.length) {
                    if (iArr2[i3] == 0) {
                        z3 = true;
                    }
                    i3++;
                }
                botLocation2.requested = z3;
                botLocation2.granted = z3;
                botLocation2.save();
                Iterator it2 = botLocation2.listeners.iterator();
                while (it2.hasNext()) {
                    ((Runnable) it2.next()).run();
                }
                QrActivity$$ExternalSyntheticLambda17 qrActivity$$ExternalSyntheticLambda17 = (QrActivity$$ExternalSyntheticLambda17) obj2;
                if (qrActivity$$ExternalSyntheticLambda17 != null) {
                    qrActivity$$ExternalSyntheticLambda17.run();
                }
                break;
            case 12:
                ((File[]) obj3)[0] = (File) obj;
                ((BotShareSheet$$ExternalSyntheticLambda4) obj2).run();
                break;
            case 13:
                BotWebViewSheet.this.webViewContainer.onInvoiceStatusUpdate((String) obj2, (String) obj, false);
                break;
            case 14:
                CommunityCreateActivity communityCreateActivity = (CommunityCreateActivity) obj3;
                communityCreateActivity.getClass();
                communityCreateActivity.linkToCommunity(((TLRPC.Chat) obj2).id, ((Boolean) obj).booleanValue());
                break;
            case 15:
                CommunityCreateActivity communityCreateActivity2 = (CommunityCreateActivity) obj3;
                communityCreateActivity2.getClass();
                communityCreateActivity2.createNewCommunity((String) obj2, ((Boolean) obj).booleanValue());
                break;
            case 16:
                CommunitySheet communitySheet = (CommunitySheet) obj3;
                communitySheet.linkToCommunity((TLRPC.Chat) obj2, communitySheet.communityId, ((Boolean) obj).booleanValue());
                break;
            case 17:
                String str = (String) obj;
                RichEditorListView richEditorListView = ((ChatAttachAlertRichLayout) obj3).listView;
                TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) obj2;
                if (pageblockmath != null) {
                    pageblockmath.source = str;
                    richEditorListView.adapter.update(false);
                } else {
                    TL_iv.pageBlockMath pageblockmath2 = new TL_iv.pageBlockMath();
                    pageblockmath2.source = str;
                    richEditorListView.addBlock(pageblockmath2);
                }
                break;
            case 18:
                String str2 = (String) obj;
                RichEditText richEditText = (RichEditText) obj3;
                richEditText.getClass();
                if (!TextUtils.isEmpty(str2)) {
                    Editable text = richEditText.getText();
                    MathSpan mathSpan = (MathSpan) obj2;
                    int spanStart = text.getSpanStart(mathSpan);
                    int spanEnd = text.getSpanEnd(mathSpan);
                    if (spanStart >= 0 && spanEnd >= 0 && (mathSpanCreate = MathSpan.create(str2, richEditText.getCurrentTextColor(), AndroidUtilities.dp(SharedConfig.fontSize + 4))) != null) {
                        boolean z4 = richEditText.locked;
                        if (z4) {
                            richEditText.setLocked(false);
                        }
                        SpannableString spannableString = new SpannableString(" ");
                        spannableString.setSpan(mathSpanCreate, 0, 1, 33);
                        int iMax2 = Math.max(0, Math.min(spanStart, richEditText.length()));
                        text.replace(iMax2, Math.max(iMax2, Math.min(spanEnd, richEditText.length())), spannableString);
                        richEditText.setSelection(Math.min(iMax2 + 1, richEditText.length()));
                        if (z4) {
                            richEditText.setLocked(true);
                        }
                        break;
                    }
                }
                break;
            case 19:
                String str3 = (String) obj;
                RichEditor richEditor = (RichEditor) obj3;
                richEditor.getClass();
                TL_iv.pageBlockMath pageblockmath3 = (TL_iv.pageBlockMath) obj2;
                if (pageblockmath3 != null) {
                    pageblockmath3.source = str3;
                    richEditor.listView.adapter.update(false);
                } else {
                    TL_iv.pageBlockMath pageblockmath4 = new TL_iv.pageBlockMath();
                    pageblockmath4.source = str3;
                    richEditor.listView.addBlock(pageblockmath4);
                }
                break;
            case 20:
                String str4 = (String) obj;
                RichEditorListView richEditorListView2 = (RichEditorListView) obj3;
                richEditorListView2.getClass();
                TL_iv.pageBlockMath pageblockmath5 = (TL_iv.pageBlockMath) obj2;
                if (!TextUtils.equals(str4, pageblockmath5.source)) {
                    RichEditorHistory richEditorHistory = richEditorListView2.history;
                    if (richEditorHistory != null) {
                        AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
                        richEditorHistory.commit();
                    }
                    pageblockmath5.source = str4;
                    richEditorListView2.adapter.update(false);
                    RichEditorHistory richEditorHistory2 = richEditorListView2.history;
                    if (richEditorHistory2 != null) {
                        richEditorHistory2.record();
                    }
                    richEditorListView2.delegate.onContentChanged();
                    break;
                }
                break;
            case 21:
                String str5 = (String) obj2;
                Boolean bool = (Boolean) obj;
                BotWebViewContainer botWebViewContainer = (BotWebViewContainer) obj3;
                botWebViewContainer.getClass();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("status", bool.booleanValue() ? TextUtils.isEmpty(str5) ? "removed" : "updated" : "failed");
                    botWebViewContainer.notifyEvent("biometry_token_updated", jSONObject);
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 22:
                BrowserHistory.Entry entry = (BrowserHistory.Entry) obj;
                WebBrowserSettings webBrowserSettings = (WebBrowserSettings) obj3;
                webBrowserSettings.getClass();
                ((HistoryFragment[]) obj2)[0].finishFragment();
                ArticleViewer$$ExternalSyntheticLambda10 articleViewer$$ExternalSyntheticLambda10 = webBrowserSettings.whenHistoryClicked;
                if (articleViewer$$ExternalSyntheticLambda10 != null) {
                    webBrowserSettings.finishFragment();
                    articleViewer$$ExternalSyntheticLambda10.run(entry);
                } else {
                    Browser.openUrl(webBrowserSettings.getParentActivity(), entry.url);
                }
                break;
            default:
                WebInstantView webInstantView = (WebInstantView) obj3;
                webInstantView.getClass();
                AndroidUtilities.runOnUIThread(new EglRenderer$$ExternalSyntheticLambda6(webInstantView, (WebInstantView.WebPhoto) obj2, (Bitmap) obj, 12));
                break;
        }
    }
}
