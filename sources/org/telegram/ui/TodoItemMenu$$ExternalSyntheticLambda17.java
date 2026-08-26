package org.telegram.ui;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda10;
import org.telegram.ui.Cells.SlideIntChooseView;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceBitmap;
import org.telegram.ui.Components.blur3.utils.Blur3Utils;
import org.telegram.ui.Stories.recorder.PaintView;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.StoryLinkSheet;
import org.telegram.ui.Stories.recorder.StoryLinkSheet$$ExternalSyntheticLambda5;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.Stories.recorder.TimelineView;
import org.telegram.ui.TON.TONIntroActivity;
import org.telegram.ui.bots.AffiliateProgramFragment;
import org.telegram.ui.bots.AffiliateProgramFragment$$ExternalSyntheticLambda0;
import org.telegram.ui.bots.BotAdView$$ExternalSyntheticLambda1;
import org.telegram.ui.bots.BotBiometrySettings;
import org.telegram.ui.bots.BotShareSheet;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.bots.ChannelAffiliateProgramsFragment;
import org.telegram.ui.bots.SuggestedAffiliateProgramsFragment;
import org.telegram.ui.bots.WebViewRequestProps;
import org.telegram.ui.community.CommunityPendingRequestsActivity;
import org.telegram.ui.community.sheet.CommunityAddOptionsSheet;
import org.telegram.ui.community.sheet.CommunityInviteOnlySheet;
import org.telegram.ui.iv.BlockRow;
import org.telegram.ui.iv.RichAIComposeSheet;
import org.telegram.ui.iv.RichAudioCell;
import org.telegram.ui.iv.RichButtonRowCell;
import org.telegram.ui.iv.RichDetailsCell;
import org.telegram.ui.iv.RichDetailsEndCell;
import org.telegram.ui.iv.RichDividerCell;
import org.telegram.ui.iv.RichDocumentCell;
import org.telegram.ui.iv.RichEditorHistory;
import org.telegram.ui.iv.RichEditorListView;
import org.telegram.ui.iv.RichEditorListView$$ExternalSyntheticLambda66;
import org.telegram.ui.iv.RichMapCell;
import org.telegram.ui.iv.RichMathCell;
import org.telegram.ui.iv.RichMediaCell;
import org.telegram.ui.iv.RichTableCell;
import org.telegram.ui.iv.RichTableCell$$ExternalSyntheticLambda3;
import org.telegram.ui.iv.RichTextCell;
import org.telegram.ui.web.AddressBarList;

public final class TodoItemMenu$$ExternalSyntheticLambda17 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final Object f$0;

    public TodoItemMenu$$ExternalSyntheticLambda17(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    private final void run$org$telegram$ui$iv$RichEditorListView$$ExternalSyntheticLambda38(Object obj, Object obj2) {
        boolean z;
        int iIndexOf;
        ((Integer) obj).getClass();
        ArrayList arrayList = (ArrayList) obj2;
        RichEditorListView richEditorListView = (RichEditorListView) this.f$0;
        richEditorListView.getClass();
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj3 = arrayList.get(i);
            i++;
            Object obj4 = ((UItem) obj3).object;
            if (obj4 instanceof BlockRow) {
                arrayList2.add((BlockRow) obj4);
            }
        }
        if (arrayList2.size() < 2) {
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        int iMin = Integer.MAX_VALUE;
        int iMax = -1;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            ArrayList arrayList4 = richEditorListView.rows;
            if (i2 >= size2) {
                if (i3 != iMax - iMin) {
                    return;
                }
                ArrayList arrayList5 = new ArrayList(i3);
                int size3 = arrayList3.size();
                int i4 = 0;
                while (i4 < size3) {
                    Object obj5 = arrayList3.get(i4);
                    i4++;
                    arrayList5.addAll((ArrayList) obj5);
                }
                for (int i5 = 0; i5 < arrayList5.size(); i5++) {
                    if (arrayList4.get(iMin + i5) != arrayList5.get(i5)) {
                        RichEditorHistory richEditorHistory = richEditorListView.history;
                        if (richEditorHistory != null) {
                            AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
                            richEditorHistory.commit();
                        }
                        for (int i6 = 0; i6 < arrayList5.size(); i6++) {
                            arrayList4.set(iMin + i6, (BlockRow) arrayList5.get(i6));
                        }
                        BlockRow blockRow = richEditorListView.draggingRow;
                        if (blockRow != null && (iIndexOf = arrayList4.indexOf(blockRow)) >= 0) {
                            ArrayList arrayList6 = RichEditorListView.EMPTY_QUOTE_IDS;
                            ArrayList arrayList7 = iIndexOf > 0 ? ((BlockRow) arrayList4.get(iIndexOf - 1)).quoteIds : arrayList6;
                            int i7 = iIndexOf + 1;
                            if (i7 < arrayList4.size()) {
                                arrayList6 = ((BlockRow) arrayList4.get(i7)).quoteIds;
                            }
                            if (arrayList7.size() < arrayList6.size()) {
                                arrayList7 = arrayList6;
                            }
                            ArrayList arrayList8 = blockRow.quoteIds;
                            if (arrayList8.equals(arrayList7)) {
                                z = false;
                            } else {
                                arrayList8.clear();
                                arrayList8.addAll(arrayList7);
                                z = true;
                            }
                        } else {
                            z = false;
                        }
                        boolean zCollapseSingleBlockQuotes = richEditorListView.collapseSingleBlockQuotes();
                        int i8 = 0;
                        while (i8 < arrayList4.size()) {
                            BlockRow blockRow2 = (BlockRow) arrayList4.get(i8);
                            if (!blockRow2.detailsEnd && !RichEditorListView.isDetailsHeader(blockRow2)) {
                                BlockRow blockRow3 = i8 > 0 ? (BlockRow) arrayList4.get(i8 - 1) : null;
                                int iMax2 = blockRow3 != null ? Math.max(0, blockRow3.level) : 0;
                                if (RichEditorListView.isNonText(blockRow2.block)) {
                                    blockRow2.level = iMax2;
                                    if (iMax2 > 0) {
                                        blockRow2.num = blockRow3.num > 0 ? 1 : 0;
                                        blockRow2.checkbox = false;
                                        blockRow2.checked = false;
                                    }
                                } else {
                                    int i9 = iMax2 + 1;
                                    if (blockRow2.level > i9) {
                                        blockRow2.level = i9;
                                    }
                                }
                                if (blockRow2.level <= 0) {
                                    blockRow2.level = 0;
                                    blockRow2.num = 0;
                                    blockRow2.checkbox = false;
                                    blockRow2.checked = false;
                                }
                            }
                            i8++;
                        }
                        richEditorListView.renumberAllRuns();
                        richEditorListView.assignContainers();
                        if (z || zCollapseSingleBlockQuotes) {
                            richEditorListView.adapter.update(true);
                            richEditorListView.resyncInsetCells();
                        } else {
                            richEditorListView.resyncInsetCells();
                        }
                        RichEditorHistory richEditorHistory2 = richEditorListView.history;
                        if (richEditorHistory2 != null) {
                            richEditorHistory2.record();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            Object obj6 = arrayList2.get(i2);
            i2++;
            BlockRow blockRow4 = (BlockRow) obj6;
            int iIndexOf2 = arrayList4.indexOf(blockRow4);
            if (iIndexOf2 < 0) {
                return;
            }
            int size4 = iIndexOf2 + 1;
            if (RichEditorListView.isDetailsHeader(blockRow4) && !((TL_iv.pageBlockDetails) blockRow4.block).open) {
                int iMatchingDetailsEnd = richEditorListView.matchingDetailsEnd(iIndexOf2);
                size4 = iMatchingDetailsEnd >= arrayList4.size() ? arrayList4.size() : iMatchingDetailsEnd + 1;
            }
            arrayList3.add(new ArrayList(arrayList4.subList(iIndexOf2, size4)));
            iMin = Math.min(iMin, iIndexOf2);
            iMax = Math.max(iMax, size4);
            i3 += size4 - iIndexOf2;
        }
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i;
        CharSequence charSequence;
        String lowerCase;
        String upperCase;
        int i2;
        int i3;
        UniversalAdapter universalAdapter;
        boolean z;
        ArrayList arrayList;
        int i4;
        int i5;
        int i6;
        AddressBarList addressBarList;
        final AddressBarList addressBarList2;
        int i7;
        AddressBarList.BookmarksList bookmarksList;
        ArrayList arrayList2;
        MessageObject messageObject;
        int i8;
        int i9;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i10 = 10;
        int i11 = 23;
        int i12 = 7;
        int i13 = 6;
        int i14 = -1;
        final int i15 = 0;
        switch (this.$r8$classId) {
            case 0:
                Bitmap bitmap = (Bitmap) obj2;
                TodoItemMenu todoItemMenu = (TodoItemMenu) this.f$0;
                todoItemMenu.blurBitmap = (Bitmap) obj;
                Paint paint = new Paint(1);
                todoItemMenu.blurBitmapPaint = paint;
                Bitmap bitmap2 = todoItemMenu.blurBitmap;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                todoItemMenu.blurBitmapShader = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, Theme.currentTheme.isDark() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, Theme.currentTheme.isDark() ? -0.02f : -0.04f);
                todoItemMenu.blurBitmapPaint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                todoItemMenu.blurMatrix = new Matrix();
                BlurredBackgroundSourceBitmap blurredBackgroundSourceBitmap = todoItemMenu.iBlur3SourceBitmap;
                blurredBackgroundSourceBitmap.setBitmap(bitmap);
                Blur3Utils.checkBitmapSourceMatrixScale(blurredBackgroundSourceBitmap, todoItemMenu.windowView);
                todoItemMenu.iBlur3Factory.invalidateAllLinkedViews();
                break;
            case 1:
                ((StoryRecorder.WindowView) this.f$0).drawBlurBitmap((Bitmap) obj, ((Float) obj2).floatValue());
                break;
            case 2:
                PaintView paintView = (PaintView) this.f$0;
                paintView.appearAnimation(paintView.createLocationSticker((TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2));
                break;
            case 3:
                ArrayList arrayList3 = (ArrayList) obj;
                StoryLinkSheet storyLinkSheet = (StoryLinkSheet) this.f$0;
                if (storyLinkSheet.loading || storyLinkSheet.webpage != null) {
                    TLRPC.WebPage webPage = storyLinkSheet.webpage;
                    i = 1;
                    StoryLinkSheet$$ExternalSyntheticLambda5 storyLinkSheet$$ExternalSyntheticLambda5 = new StoryLinkSheet$$ExternalSyntheticLambda5(storyLinkSheet, 1);
                    int i16 = StoryLinkSheet.WebpagePreviewView.Factory.$r8$clinit;
                    UItem uItemOfFactory = UItem.ofFactory(StoryLinkSheet.WebpagePreviewView.Factory.class);
                    uItemOfFactory.object = webPage;
                    uItemOfFactory.clickCallback = storyLinkSheet$$ExternalSyntheticLambda5;
                    arrayList3.add(uItemOfFactory);
                } else {
                    i = 1;
                }
                arrayList3.add(UItem.asCustom(storyLinkSheet.urlEditText));
                arrayList3.add(UItem.asShadow(i, null));
                UItem uItemAsCheck = UItem.asCheck(2, LocaleController.getString(R.string.StoryLinkNameHeader));
                uItemAsCheck.setChecked(storyLinkSheet.nameOpen);
                arrayList3.add(uItemAsCheck);
                if (storyLinkSheet.nameOpen) {
                    arrayList3.add(UItem.asCustom(storyLinkSheet.nameEditText));
                }
                arrayList3.add(UItem.asShadow(3, null));
                arrayList3.add(UItem.asCustom(storyLinkSheet.buttonContainer));
                break;
            case 4:
                Float f = (Float) obj2;
                StoryRecorder storyRecorder = (StoryRecorder) this.f$0;
                long duration = storyRecorder.previewView.getDuration() < 100 ? storyRecorder.outputEntry.duration : storyRecorder.previewView.getDuration();
                float fFloatValue = ((f.floatValue() / 0.96f) * 0.04f) + f.floatValue();
                StoryEntry storyEntry = storyRecorder.outputEntry;
                float f2 = storyEntry.right;
                float f3 = storyEntry.left;
                float f4 = (f2 - f3) * fFloatValue;
                float f5 = duration;
                long j = (long) (f4 * f5);
                StoryRecorder.AnonymousClass7 anonymousClass7 = storyRecorder.previewView;
                long j2 = (long) ((f3 * f5) + j);
                storyRecorder.coverValue = j2;
                anonymousClass7.seekTo(j2);
                StoryRecorder.AnonymousClass24 anonymousClass24 = storyRecorder.paintView;
                if (anonymousClass24 != null) {
                    anonymousClass24.setCoverTime(storyRecorder.coverValue);
                }
                StoryEntry storyEntry2 = storyRecorder.outputEntry;
                if (storyEntry2 != null && storyEntry2.isEdit) {
                    storyEntry2.editedMedia = true;
                    break;
                }
                break;
            case 5:
                ((TimelineView.AudioWaveformLoader) this.f$0).receiveData((short[]) obj, ((Integer) obj2).intValue());
                break;
            case 6:
                ((TONIntroActivity) this.f$0).fillItems$1((ArrayList) obj, (UniversalAdapter) obj2);
                break;
            case 7:
                ArrayList arrayList4 = (ArrayList) obj;
                TONIntroActivity.StarsNeededSheet starsNeededSheet = (TONIntroActivity.StarsNeededSheet) this.f$0;
                arrayList4.add(UItem.asCustom(starsNeededSheet.headerView));
                arrayList4.add(UItem.asCustom(starsNeededSheet.footerView));
                break;
            case 8:
                ArrayList arrayList5 = (ArrayList) obj;
                AffiliateProgramFragment affiliateProgramFragment = (AffiliateProgramFragment) this.f$0;
                if (affiliateProgramFragment.getParentActivity() != null) {
                    QrActivity.AnonymousClass2 anonymousClass2 = new QrActivity.AnonymousClass2(affiliateProgramFragment, affiliateProgramFragment.getParentActivity(), 21);
                    anonymousClass2.setTag(-33024);
                    UItem uItem = new UItem(-2);
                    uItem.view = anonymousClass2;
                    arrayList5.add(uItem);
                    arrayList5.add(AffiliateProgramFragment.FeatureCell.Factory.as(R.drawable.menu_feature_premium, LocaleController.getString(R.string.BotAffiliateProgramFeature1Title), LocaleController.getString(R.string.BotAffiliateProgramFeature1)));
                    arrayList5.add(AffiliateProgramFragment.FeatureCell.Factory.as(R.drawable.msg_channel, LocaleController.getString(R.string.BotAffiliateProgramFeature2Title), LocaleController.getString(R.string.BotAffiliateProgramFeature2)));
                    arrayList5.add(AffiliateProgramFragment.FeatureCell.Factory.as(R.drawable.menu_feature_links2, LocaleController.getString(R.string.BotAffiliateProgramFeature3Title), LocaleController.getString(R.string.BotAffiliateProgramFeature3)));
                    arrayList5.add(UItem.asShadow(1, null));
                    String string = LocaleController.getString(R.string.AffiliateProgramCommission);
                    UItem uItem2 = new UItem(0);
                    uItem2.text = string;
                    arrayList5.add(uItem2);
                    int i17 = affiliateProgramFragment.getMessagesController().starrefMinCommissionPermille;
                    int i18 = affiliateProgramFragment.program.commission_permille;
                    int i19 = affiliateProgramFragment.getMessagesController().starrefMaxCommissionPermille;
                    ChatActivity$$ExternalSyntheticLambda29 chatActivity$$ExternalSyntheticLambda29 = new ChatActivity$$ExternalSyntheticLambda29(i13);
                    AffiliateProgramFragment$$ExternalSyntheticLambda0 affiliateProgramFragment$$ExternalSyntheticLambda0 = new AffiliateProgramFragment$$ExternalSyntheticLambda0(affiliateProgramFragment, 1);
                    UItem uItem3 = new UItem(15);
                    uItem3.intValue = i18;
                    uItem3.intCallback = affiliateProgramFragment$$ExternalSyntheticLambda0;
                    SlideIntChooseView.Options options = new SlideIntChooseView.Options();
                    options.min = i17;
                    options.max = i19;
                    options.toString = new ChatActivity$$ExternalSyntheticLambda356(chatActivity$$ExternalSyntheticLambda29, i12);
                    uItem3.object = options;
                    uItem3.longValue = -1L;
                    TL_payments.starRefProgram starrefprogram = affiliateProgramFragment.initialProgram;
                    uItem3.longValue = starrefprogram == null ? -1 : starrefprogram.commission_permille;
                    arrayList5.add(uItem3);
                    String string2 = LocaleController.getString(R.string.AffiliateProgramCommissionInfo);
                    UItem uItem4 = new UItem(7);
                    uItem4.text = string2;
                    arrayList5.add(uItem4);
                    String string3 = LocaleController.getString(R.string.AffiliateProgramDuration);
                    UItem uItem5 = new UItem(0);
                    uItem5.text = string3;
                    arrayList5.add(uItem5);
                    String[] strArr = affiliateProgramFragment.durationTexts;
                    List list = affiliateProgramFragment.durationValues;
                    if (strArr == null) {
                        affiliateProgramFragment.durationTexts = new String[list.size()];
                        for (int i20 = 0; i20 < list.size(); i20++) {
                            int iIntValue = ((Integer) list.get(i20)).intValue();
                            if (iIntValue == 0) {
                                affiliateProgramFragment.durationTexts[i20] = LocaleController.getString(R.string.Infinity);
                            } else if (iIntValue < 12 || iIntValue % 12 != 0) {
                                affiliateProgramFragment.durationTexts[i20] = LocaleController.formatPluralString("MonthsShort", iIntValue, new Object[0]);
                            } else {
                                affiliateProgramFragment.durationTexts[i20] = LocaleController.formatPluralString("YearsShort", iIntValue / 12, new Object[0]);
                            }
                        }
                    }
                    String[] strArr2 = affiliateProgramFragment.durationTexts;
                    int iIndexOf = list.indexOf(Integer.valueOf(affiliateProgramFragment.program.duration_months));
                    AffiliateProgramFragment$$ExternalSyntheticLambda0 affiliateProgramFragment$$ExternalSyntheticLambda1 = new AffiliateProgramFragment$$ExternalSyntheticLambda0(affiliateProgramFragment, 2);
                    UItem uItem6 = new UItem(14);
                    uItem6.texts = strArr2;
                    uItem6.intValue = iIndexOf;
                    uItem6.intCallback = affiliateProgramFragment$$ExternalSyntheticLambda1;
                    uItem6.longValue = -1L;
                    TL_payments.starRefProgram starrefprogram2 = affiliateProgramFragment.initialProgram;
                    if (starrefprogram2 != null) {
                        if (starrefprogram2.duration_months <= 0) {
                            uItem6.longValue = list.size() - 1;
                        } else {
                            for (int size = list.size() - 1; size >= 0; size--) {
                                if (((Integer) list.get(size)).intValue() > 0 && ((Integer) list.get(size)).intValue() <= affiliateProgramFragment.initialProgram.duration_months) {
                                    uItem6.longValue = size;
                                }
                            }
                        }
                    }
                    arrayList5.add(uItem6);
                    String string4 = LocaleController.getString(R.string.AffiliateProgramDurationInfo);
                    UItem uItem7 = new UItem(7);
                    uItem7.text = string4;
                    arrayList5.add(uItem7);
                    int themedColor = affiliateProgramFragment.getThemedColor(Theme.key_color_green);
                    int i21 = R.drawable.filled_earn_stars;
                    String string5 = LocaleController.getString(R.string.AffiliateProgramExistingProgramsTitle);
                    String string6 = LocaleController.getString(R.string.AffiliateProgramExistingProgramsText);
                    int i22 = AffiliateProgramFragment.ColorfulTextCell.Factory.$r8$clinit;
                    UItem uItemOfFactory2 = UItem.ofFactory(AffiliateProgramFragment.ColorfulTextCell.Factory.class);
                    uItemOfFactory2.id = 2;
                    uItemOfFactory2.intValue = themedColor;
                    uItemOfFactory2.iconResId = i21;
                    uItemOfFactory2.text = string5;
                    uItemOfFactory2.subtext = string6;
                    arrayList5.add(uItemOfFactory2);
                    arrayList5.add(UItem.asShadow(3, null));
                    if (affiliateProgramFragment.new_program || affiliateProgramFragment.program.end_date != 0) {
                        charSequence = null;
                    } else {
                        UItem uItemAsButton = UItem.asButton(4, LocaleController.getString(R.string.AffiliateProgramStop));
                        uItemAsButton.red = true;
                        arrayList5.add(uItemAsButton);
                        charSequence = null;
                        arrayList5.add(UItem.asShadow(5, null));
                    }
                    arrayList5.add(UItem.asShadow(6, charSequence));
                    arrayList5.add(UItem.asShadow(7, charSequence));
                    break;
                }
                break;
            case 9:
                ((BotBiometrySettings) this.f$0).fillItems$53((ArrayList) obj);
                break;
            case 10:
                String strSubstring = (String) obj;
                Long l = (Long) obj2;
                StringBuilder sb = new StringBuilder();
                if (l.longValue() > 0) {
                    sb.append("~");
                    sb.append(AndroidUtilities.formatFileSize(l.longValue()));
                }
                if (strSubstring == null) {
                    upperCase = null;
                } else {
                    if (!strSubstring.isEmpty()) {
                        switch (strSubstring) {
                            case "application/epub+zip":
                                lowerCase = "epub";
                                break;
                            case "application/vnd.oasis.opendocument.text":
                                lowerCase = "odt";
                                break;
                            case "video/3gpp":
                            case "audio/3gpp":
                                lowerCase = "3gp";
                                break;
                            case "application/vnd.ms-fontobject":
                                lowerCase = "eot";
                                break;
                            case "application/x-cdf":
                                lowerCase = "cda";
                                break;
                            case "application/x-csh":
                                lowerCase = "csh";
                                break;
                            case "video/x-msvideo":
                                lowerCase = "avi";
                                break;
                            case "application/vnd.openxmlformats-officedocument.presentationml.presentation":
                                lowerCase = "pptx";
                                break;
                            case "application/vnd.ms-powerpoint":
                                lowerCase = "ppt";
                                break;
                            case "application/vnd.openxmlformats-officedocument.wordprocessingml.document":
                                lowerCase = "docx";
                                break;
                            case "audio/x-midi":
                                lowerCase = "midi";
                                break;
                            case "text/calendar":
                                lowerCase = "ics";
                                break;
                            case "application/x-httpd-php":
                                lowerCase = "php";
                                break;
                            case "audio/3gpp2":
                            case "video/3gpp2":
                                lowerCase = "3g2";
                                break;
                            case "application/vnd.apple.installer+xml":
                                lowerCase = "mpkg";
                                break;
                            case "application/vnd.ms-excel":
                                lowerCase = "xls";
                                break;
                            case "application/gzip":
                            case "application/x-gzip":
                                lowerCase = "gz";
                                break;
                            case "application/x-sh":
                                lowerCase = "sh";
                                break;
                            case "audio/ogg":
                                lowerCase = "opus";
                                break;
                            case "text/plain":
                                lowerCase = "txt";
                                break;
                            case "application/x-abiword":
                                lowerCase = "abw";
                                break;
                            case "application/ld+json":
                                lowerCase = "jsonld";
                                break;
                            case "application/msword":
                                lowerCase = "doc";
                                break;
                            case "application/x-bzip":
                                lowerCase = "bz";
                                break;
                            case "application/octet-stream":
                                lowerCase = "bin";
                                break;
                            case "application/x-bzip2":
                                lowerCase = "bz2";
                                break;
                            case "application/vnd.oasis.opendocument.presentation":
                                lowerCase = "odp";
                                break;
                            case "application/x-7z-compressed":
                                lowerCase = "7z";
                                break;
                            case "application/x-freearc":
                                lowerCase = "arc";
                                break;
                            case "audio/mpeg":
                                lowerCase = "mp3";
                                break;
                            case "application/vnd.rar":
                                lowerCase = "rar";
                                break;
                            case "image/vnd.microsoft.icon":
                                lowerCase = "ico";
                                break;
                            case "application/vnd.oasis.opendocument.spreadsheet":
                                lowerCase = "ods";
                                break;
                            case "application/vnd.amazon.ebook":
                                lowerCase = "azw";
                                break;
                            case "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet":
                                lowerCase = "xlsx";
                                break;
                            case "application/java-archive":
                                lowerCase = "jar";
                                break;
                            case "text/javascript":
                                lowerCase = "js";
                                break;
                            default:
                                if (strSubstring.contains("/")) {
                                    strSubstring = strSubstring.substring(strSubstring.indexOf("/") + 1);
                                }
                                if (strSubstring.contains("-")) {
                                    strSubstring = strSubstring.substring(strSubstring.indexOf("-") + 1);
                                }
                                if (strSubstring.contains("+")) {
                                    strSubstring = strSubstring.substring(0, strSubstring.indexOf("+"));
                                }
                                lowerCase = strSubstring.toLowerCase();
                                break;
                        }
                    } else {
                        lowerCase = "";
                    }
                    upperCase = lowerCase.toUpperCase();
                }
                if (!TextUtils.isEmpty(upperCase)) {
                    if (sb.length() > 0) {
                        sb.append(" ");
                    }
                    sb.append(upperCase.toUpperCase());
                }
                if (sb.length() <= 0) {
                    sb.append(LocaleController.getString(R.string.AttachDocument));
                }
                ((AnimatedTextView) this.f$0).setText(sb);
                break;
            case 11:
                ArrayList arrayList6 = (ArrayList) obj;
                BotShareSheet botShareSheet = (BotShareSheet) this.f$0;
                arrayList6.add(UItem.asCustom(-1, botShareSheet.chatView));
                SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotShareMessageInfo, botShareSheet.botName));
                UItem uItem8 = new UItem(7);
                uItem8.text = spannableStringBuilderReplaceTags;
                arrayList6.add(uItem8);
                break;
            case 12:
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                BotWebViewSheet botWebViewSheet = (BotWebViewSheet) this.f$0;
                if (tL_error != null) {
                    botWebViewSheet.getClass();
                } else {
                    WebViewRequestProps webViewRequestProps = botWebViewSheet.requestProps;
                    if (webViewRequestProps != null) {
                        webViewRequestProps.response = tL_webViewResultUrl;
                        webViewRequestProps.responseTime = System.currentTimeMillis();
                        botWebViewSheet.loadFromResponse();
                    }
                }
                break;
            case 13:
                ((ChannelAffiliateProgramsFragment) this.f$0).fillItems$1((ArrayList) obj, (UniversalAdapter) obj2);
                break;
            case 14:
                ((SuggestedAffiliateProgramsFragment) this.f$0).fillItems$1((ArrayList) obj, (UniversalAdapter) obj2);
                break;
            case 15:
                ((CommunityPendingRequestsActivity) this.f$0).pendingRequestsList.fillItems((ArrayList) obj);
                break;
            case 16:
                ArrayList arrayList7 = (ArrayList) obj;
                CommunityAddOptionsSheet communityAddOptionsSheet = (CommunityAddOptionsSheet) this.f$0;
                arrayList7.add(UItem.asSpace(0, AndroidUtilities.dp(12.0f)));
                arrayList7.add(UItem.asCustom(1, communityAddOptionsSheet.cell));
                arrayList7.add(UItem.asSpace(2, AndroidUtilities.dp(12.0f)));
                arrayList7.add(UItem.asHeader(3, LocaleController.getString(R.string.CommunityChatVisibilitySection)));
                communityAddOptionsSheet.visibleRow = arrayList7.size();
                String string7 = LocaleController.getString(R.string.CommunityChatVisibilityVisible);
                boolean z6 = communityAddOptionsSheet.isBot;
                String string8 = LocaleController.getString(z6 ? R.string.CommunityChatVisibilityVisibleBotInfo : R.string.CommunityChatVisibilityVisibleInfo);
                UItem uItem9 = new UItem(44);
                uItem9.id = 151;
                uItem9.text = string7;
                uItem9.textValue = string8;
                uItem9.setChecked(!communityAddOptionsSheet.isHidden);
                arrayList7.add(uItem9);
                String string9 = LocaleController.getString(R.string.CommunityChatVisibilityHidden);
                String string10 = LocaleController.getString(z6 ? R.string.CommunityChatVisibilityHiddenBotInfo : R.string.CommunityChatVisibilityHiddenInfo);
                UItem uItem10 = new UItem(44);
                uItem10.id = 150;
                uItem10.text = string9;
                uItem10.textValue = string10;
                uItem10.setChecked(communityAddOptionsSheet.isHidden);
                arrayList7.add(uItem10);
                arrayList7.add(UItem.asShadow(6, LocaleController.getString(R.string.CommunityChatVisibilityCannotChange)));
                break;
            case 17:
                ((ArrayList) obj).add(UItem.asCustom(0, ((CommunityInviteOnlySheet) this.f$0).cell));
                break;
            case 18:
                Utilities.themeQueue.postRunnable(new RichTableCell$$ExternalSyntheticLambda3(i10, (String[]) this.f$0, (Utilities.Callback2) obj2));
                break;
            case 19:
                ArrayList arrayList8 = (ArrayList) obj;
                RichAIComposeSheet richAIComposeSheet = (RichAIComposeSheet) this.f$0;
                arrayList8.add(UItem.asCustom(1, richAIComposeSheet.topView));
                arrayList8.add(UItem.asCustom(3, richAIComposeSheet.promptBox));
                if (richAIComposeSheet.result != null) {
                    arrayList8.add(UItem.asCustom(2, richAIComposeSheet.previewBox));
                }
                break;
            case 20:
                ArrayList arrayList9 = (ArrayList) obj;
                UniversalAdapter universalAdapter2 = (UniversalAdapter) obj2;
                RichEditorListView richEditorListView = ((RichEditorListView[]) this.f$0)[0];
                if (richEditorListView != null) {
                    richEditorListView.assignContainers();
                    ArrayList arrayList10 = richEditorListView.itemRows;
                    arrayList10.clear();
                    HashMap map = new HashMap();
                    int i23 = 0;
                    int i24 = 0;
                    while (true) {
                        ArrayList arrayList11 = richEditorListView.rows;
                        if (i23 >= arrayList11.size()) {
                            boolean z7 = i24 == 1;
                            ArrayList arrayList12 = new ArrayList();
                            BlockRow blockRow = null;
                            int i25 = 0;
                            boolean z8 = false;
                            int size2 = -1;
                            while (i25 < arrayList11.size()) {
                                BlockRow blockRow2 = (BlockRow) arrayList11.get(i25);
                                if (blockRow2.detailsEnd) {
                                    boolean z9 = size2 != i14;
                                    if (!arrayList12.isEmpty()) {
                                        SurfaceContainer$$ExternalSyntheticOutline0.m5m(1, arrayList12);
                                        i14 = -1;
                                    }
                                    if (size2 == i14 || arrayList12.size() >= size2) {
                                        if (z9) {
                                            universalAdapter = universalAdapter2;
                                        } else {
                                            if (z8) {
                                                universalAdapter2.reorderSectionEnd();
                                                z8 = false;
                                            }
                                            int i26 = RichDetailsEndCell.Factory.$r8$clinit;
                                            UItem uItemOfFactory3 = UItem.ofFactory(RichDetailsEndCell.Factory.class);
                                            uItemOfFactory3.object = blockRow2;
                                            arrayList9.add(uItemOfFactory3);
                                            arrayList10.add(blockRow2);
                                            universalAdapter = universalAdapter2;
                                        }
                                        z = z7;
                                        arrayList = arrayList12;
                                    } else {
                                        universalAdapter = universalAdapter2;
                                        z = z7;
                                        arrayList = arrayList12;
                                        size2 = -1;
                                    }
                                } else {
                                    boolean z10 = size2 != i14;
                                    if (RichEditorListView.isDetailsHeader(blockRow2)) {
                                        if (z10) {
                                            universalAdapter = universalAdapter2;
                                        } else {
                                            boolean z11 = ((TL_iv.pageBlockDetails) blockRow2.block).open;
                                            if (!arrayList12.isEmpty() || z11) {
                                                if (z8) {
                                                    universalAdapter2.reorderSectionEnd();
                                                    z8 = false;
                                                }
                                            } else if (!z8) {
                                                universalAdapter2.reorderSectionStart();
                                                z8 = true;
                                            }
                                            int i27 = RichDetailsCell.Factory.$r8$clinit;
                                            UItem uItemOfFactory4 = UItem.ofFactory(RichDetailsCell.Factory.class);
                                            uItemOfFactory4.object = blockRow2;
                                            universalAdapter = universalAdapter2;
                                            uItemOfFactory4.object2 = richEditorListView.detailsDelegate;
                                            arrayList9.add(uItemOfFactory4);
                                            arrayList10.add(blockRow2);
                                            if (!z11) {
                                                size2 = arrayList12.size() + 1;
                                            }
                                        }
                                        arrayList12.add(blockRow2);
                                    } else {
                                        universalAdapter = universalAdapter2;
                                        if (!z10) {
                                            ArrayList arrayList13 = blockRow2.quoteIds;
                                            if (blockRow != null) {
                                                ArrayList arrayList14 = blockRow.quoteIds;
                                                int size3 = arrayList14.size();
                                                z = z7;
                                                int i28 = 0;
                                                while (true) {
                                                    i4 = size3;
                                                    if (i28 >= size3 || i28 >= arrayList13.size()) {
                                                        arrayList = arrayList12;
                                                    } else {
                                                        arrayList = arrayList12;
                                                        if (((Long) arrayList14.get(i28)).equals(arrayList13.get(i28))) {
                                                            i28++;
                                                            size3 = i4;
                                                            arrayList12 = arrayList;
                                                        }
                                                    }
                                                }
                                                int i29 = i4 - 1;
                                                while (i29 >= i28) {
                                                    Long l2 = (Long) arrayList14.get(i29);
                                                    l2.getClass();
                                                    Integer num = (Integer) map.get(l2);
                                                    ArrayList arrayList15 = arrayList14;
                                                    if (num != null) {
                                                        int iIntValue2 = num.intValue();
                                                        i5 = i29;
                                                        if (iIntValue2 >= 2 || i5 > 0 || richEditorListView.quoteAuthors.containsKey(l2)) {
                                                            if (z8) {
                                                                universalAdapter.reorderSectionEnd();
                                                                z8 = false;
                                                            }
                                                        }
                                                    } else {
                                                        i5 = i29;
                                                    }
                                                    i29 = i5 - 1;
                                                    arrayList14 = arrayList15;
                                                }
                                            } else {
                                                z = z7;
                                                arrayList = arrayList12;
                                            }
                                            if (blockRow != null) {
                                                richEditorListView.injectClosingQuoteAuthors(blockRow, arrayList13, map, arrayList9);
                                            }
                                            if (arrayList.isEmpty()) {
                                                if (!z8) {
                                                    universalAdapter.reorderSectionStart();
                                                    z8 = true;
                                                }
                                            } else if (z8) {
                                                universalAdapter.reorderSectionEnd();
                                                z8 = false;
                                            }
                                            TL_iv.PageBlock pageBlock = blockRow2.block;
                                            if (pageBlock instanceof TL_iv.pageBlockDivider) {
                                                int i30 = RichDividerCell.Factory.$r8$clinit;
                                                UItem uItemOfFactory5 = UItem.ofFactory(RichDividerCell.Factory.class);
                                                uItemOfFactory5.object = blockRow2;
                                                uItemOfFactory5.object2 = richEditorListView.dividerDelegate;
                                                arrayList9.add(uItemOfFactory5);
                                            } else if (RichEditorListView.isMedia(pageBlock)) {
                                                int i31 = RichMediaCell.Factory.$r8$clinit;
                                                UItem uItemOfFactory6 = UItem.ofFactory(RichMediaCell.Factory.class);
                                                uItemOfFactory6.id = (int) blockRow2.id;
                                                uItemOfFactory6.object = blockRow2;
                                                uItemOfFactory6.object2 = richEditorListView.mediaDelegate;
                                                arrayList9.add(uItemOfFactory6);
                                            } else {
                                                TL_iv.PageBlock pageBlock2 = blockRow2.block;
                                                if (pageBlock2 instanceof TL_iv.pageBlockAudio) {
                                                    int i32 = RichAudioCell.Factory.$r8$clinit;
                                                    UItem uItemOfFactory7 = UItem.ofFactory(RichAudioCell.Factory.class);
                                                    uItemOfFactory7.object = blockRow2;
                                                    uItemOfFactory7.object2 = richEditorListView.audioDelegate;
                                                    arrayList9.add(uItemOfFactory7);
                                                } else if (pageBlock2 instanceof TL_iv.pageBlockDocument) {
                                                    int i33 = RichDocumentCell.Factory.$r8$clinit;
                                                    UItem uItemOfFactory8 = UItem.ofFactory(RichDocumentCell.Factory.class);
                                                    uItemOfFactory8.object = blockRow2;
                                                    uItemOfFactory8.object2 = richEditorListView.documentDelegate;
                                                    arrayList9.add(uItemOfFactory8);
                                                } else if (pageBlock2 instanceof TL_iv.pageBlockMap) {
                                                    int i34 = RichMapCell.Factory.$r8$clinit;
                                                    UItem uItemOfFactory9 = UItem.ofFactory(RichMapCell.Factory.class);
                                                    uItemOfFactory9.object = blockRow2;
                                                    uItemOfFactory9.object2 = richEditorListView.mapDelegate;
                                                    arrayList9.add(uItemOfFactory9);
                                                } else if (pageBlock2 instanceof TL_iv.pageBlockMath) {
                                                    int i35 = RichMathCell.Factory.$r8$clinit;
                                                    UItem uItemOfFactory10 = UItem.ofFactory(RichMathCell.Factory.class);
                                                    uItemOfFactory10.object = blockRow2;
                                                    uItemOfFactory10.object2 = richEditorListView.mathDelegate;
                                                    arrayList9.add(uItemOfFactory10);
                                                } else if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                                                    int i36 = RichTableCell.Factory.$r8$clinit;
                                                    UItem uItemOfFactory11 = UItem.ofFactory(RichTableCell.Factory.class);
                                                    uItemOfFactory11.object = blockRow2;
                                                    uItemOfFactory11.object2 = richEditorListView.tableDelegate;
                                                    arrayList9.add(uItemOfFactory11);
                                                } else if (pageBlock2 instanceof TL_iv.pageBlockButtonRow) {
                                                    int i37 = RichButtonRowCell.Factory.$r8$clinit;
                                                    UItem uItemOfFactory12 = UItem.ofFactory(RichButtonRowCell.Factory.class);
                                                    uItemOfFactory12.object = blockRow2;
                                                    uItemOfFactory12.object2 = richEditorListView.buttonRowDelegate;
                                                    arrayList9.add(uItemOfFactory12);
                                                } else {
                                                    blockRow2.firstBlock = i25 == 0;
                                                    blockRow2.singleParagraph = z && (pageBlock2 instanceof TL_iv.pageBlockParagraph);
                                                    boolean z12 = arrayList11.size() == 2 && i25 == 1 && (blockRow2.block instanceof TL_iv.pageBlockParagraph) && (((BlockRow) arrayList11.get(0)).block instanceof TL_iv.pageBlockHeading1);
                                                    int i38 = RichTextCell.Factory.$r8$clinit;
                                                    UItem uItemOfFactory13 = UItem.ofFactory(RichTextCell.Factory.class);
                                                    uItemOfFactory13.object = blockRow2;
                                                    uItemOfFactory13.object2 = richEditorListView.cellDelegate;
                                                    uItemOfFactory13.red = z12;
                                                    arrayList9.add(uItemOfFactory13);
                                                }
                                            }
                                            arrayList10.add(blockRow2);
                                            blockRow = blockRow2;
                                        }
                                    }
                                    z = z7;
                                    arrayList = arrayList12;
                                }
                                i25++;
                                universalAdapter2 = universalAdapter;
                                z7 = z;
                                arrayList12 = arrayList;
                                i14 = -1;
                            }
                            UniversalAdapter universalAdapter3 = universalAdapter2;
                            if (z8) {
                                universalAdapter3.reorderSectionEnd();
                            }
                            if (blockRow != null) {
                                richEditorListView.injectClosingQuoteAuthors(blockRow, RichEditorListView.EMPTY_QUOTE_IDS, map, arrayList9);
                            }
                            int i39 = 0;
                            while (i39 < arrayList10.size()) {
                                BlockRow blockRow3 = (BlockRow) arrayList10.get(i39);
                                blockRow3.quoteFirst = false;
                                blockRow3.quoteLast = false;
                                blockRow3.quoteTopEdge = 0;
                                blockRow3.quoteBottomEdge = 0;
                                ArrayList arrayList16 = blockRow3.quoteIds;
                                int size4 = arrayList16.size();
                                if (size4 != 0) {
                                    BlockRow blockRow4 = i39 > 0 ? (BlockRow) arrayList10.get(i39 - 1) : null;
                                    int i40 = i39 + 1;
                                    BlockRow blockRow5 = i40 < arrayList10.size() ? (BlockRow) arrayList10.get(i40) : null;
                                    if (blockRow4 == null) {
                                        i2 = 0;
                                    } else {
                                        int size5 = arrayList16.size();
                                        ArrayList arrayList17 = blockRow4.quoteIds;
                                        int iMin = Math.min(size5, arrayList17.size());
                                        i2 = 0;
                                        while (i2 < iMin && ((Long) arrayList16.get(i2)).equals(arrayList17.get(i2))) {
                                            i2++;
                                        }
                                    }
                                    blockRow3.quoteTopEdge = size4 - i2;
                                    if (blockRow5 == null) {
                                        i3 = 0;
                                    } else {
                                        int size6 = arrayList16.size();
                                        ArrayList arrayList18 = blockRow5.quoteIds;
                                        int iMin2 = Math.min(size6, arrayList18.size());
                                        i3 = 0;
                                        while (i3 < iMin2 && ((Long) arrayList16.get(i3)).equals(arrayList18.get(i3))) {
                                            i3++;
                                        }
                                    }
                                    int i41 = size4 - i3;
                                    blockRow3.quoteBottomEdge = i41;
                                    blockRow3.quoteFirst = blockRow3.quoteTopEdge > 0;
                                    blockRow3.quoteLast = i41 > 0;
                                }
                                i39++;
                            }
                        } else {
                            BlockRow blockRow6 = (BlockRow) arrayList11.get(i23);
                            if (blockRow6.detailsEnd) {
                                i6 = 1;
                            } else {
                                int i42 = 0;
                                while (true) {
                                    ArrayList arrayList19 = blockRow6.quoteIds;
                                    if (i42 < arrayList19.size()) {
                                        Map.EL.merge(map, (Long) arrayList19.get(i42), 1, new RichEditorListView$$ExternalSyntheticLambda66());
                                        i42++;
                                    } else {
                                        i6 = 1;
                                        if (blockRow6.block instanceof TL_iv.pageBlockParagraph) {
                                            i24++;
                                        }
                                    }
                                }
                            }
                            i23 += i6;
                        }
                    }
                }
                break;
            case 21:
                run$org$telegram$ui$iv$RichEditorListView$$ExternalSyntheticLambda38(obj, obj2);
                break;
            default:
                ArrayList arrayList20 = (ArrayList) obj;
                AddressBarList addressBarList3 = (AddressBarList) this.f$0;
                boolean z13 = addressBarList3.hideCurrent;
                ArrayList arrayList21 = addressBarList3.suggestions;
                if (!z13 && arrayList21.isEmpty()) {
                    arrayList20.add(UItem.asCustom(addressBarList3.currentContainer));
                }
                SharedPreferences sharedPreferences = addressBarList3.getContext().getSharedPreferences("webhistory", 0);
                ArrayList arrayList22 = new ArrayList();
                String string11 = sharedPreferences.getString("queries_json", null);
                if (string11 != null) {
                    try {
                        ArrayList arrayList23 = new ArrayList();
                        JSONArray jSONArray = new JSONArray(string11);
                        int i43 = 0;
                        while (i43 < jSONArray.length()) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i43);
                            addressBarList = addressBarList3;
                            try {
                                AddressBarList.QueryEntry queryEntry = new AddressBarList.QueryEntry(jSONObject.optString("name"), jSONObject.optLong("usage", System.currentTimeMillis()));
                                queryEntry.rank = jSONObject.optDouble("rank", 0.0d);
                                arrayList23.add(queryEntry);
                                i43++;
                                addressBarList3 = addressBarList;
                            } catch (Exception unused) {
                                arrayList21.size();
                                arrayList22.size();
                                addressBarList2 = addressBarList;
                                if (!arrayList21.isEmpty()) {
                                    arrayList20.add(UItem.asCustom(addressBarList2.space));
                                }
                                for (i7 = 0; i7 < arrayList21.size(); i7++) {
                                    final String str = (String) arrayList21.get(i7);
                                    if (i7 == 0) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (i7 == arrayList21.size() - 1) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    View.OnClickListener onClickListener = new View.OnClickListener() {
                                        @Override
                                        public final void onClick(View view) {
                                            switch (i15) {
                                                case 0:
                                                    ArticleViewer$$ExternalSyntheticLambda10 articleViewer$$ExternalSyntheticLambda10 = addressBarList2.onQueryInsertClick;
                                                    if (articleViewer$$ExternalSyntheticLambda10 != null) {
                                                        articleViewer$$ExternalSyntheticLambda10.run(str);
                                                    }
                                                    break;
                                                default:
                                                    ArticleViewer$$ExternalSyntheticLambda10 articleViewer$$ExternalSyntheticLambda11 = addressBarList2.onQueryInsertClick;
                                                    if (articleViewer$$ExternalSyntheticLambda11 != null) {
                                                        articleViewer$$ExternalSyntheticLambda11.run(str);
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                    int i44 = AddressBarList.Address2View.Factory.$r8$clinit;
                                    UItem uItemOfFactory14 = UItem.ofFactory(AddressBarList.Address2View.Factory.class);
                                    uItemOfFactory14.intValue = 1;
                                    uItemOfFactory14.text = str;
                                    uItemOfFactory14.clickCallback = onClickListener;
                                    uItemOfFactory14.accent = z4;
                                    uItemOfFactory14.red = z5;
                                    uItemOfFactory14.object = Boolean.TRUE;
                                    uItemOfFactory14.object2 = addressBarList2;
                                    arrayList20.add(uItemOfFactory14);
                                }
                                if (!arrayList22.isEmpty()) {
                                    String string12 = LocaleController.getString(R.string.WebSectionRecent);
                                    String string13 = LocaleController.getString(R.string.WebRecentClear);
                                    BotAdView$$ExternalSyntheticLambda1 botAdView$$ExternalSyntheticLambda1 = new BotAdView$$ExternalSyntheticLambda1(addressBarList2, 13);
                                    UItem uItem11 = new UItem(31);
                                    uItem11.text = string12;
                                    uItem11.subtext = string13;
                                    uItem11.clickCallback = botAdView$$ExternalSyntheticLambda1;
                                    arrayList20.add(uItem11);
                                    for (i9 = 0; i9 < arrayList22.size(); i9++) {
                                        final String str2 = (String) arrayList22.get(i9);
                                        if (i9 == 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        final int i45 = 1;
                                        if (i9 == arrayList22.size() - 1) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        View.OnClickListener onClickListener2 = new View.OnClickListener() {
                                            @Override
                                            public final void onClick(View view) {
                                                switch (i45) {
                                                    case 0:
                                                        ArticleViewer$$ExternalSyntheticLambda10 articleViewer$$ExternalSyntheticLambda10 = addressBarList2.onQueryInsertClick;
                                                        if (articleViewer$$ExternalSyntheticLambda10 != null) {
                                                            articleViewer$$ExternalSyntheticLambda10.run(str2);
                                                        }
                                                        break;
                                                    default:
                                                        ArticleViewer$$ExternalSyntheticLambda10 articleViewer$$ExternalSyntheticLambda11 = addressBarList2.onQueryInsertClick;
                                                        if (articleViewer$$ExternalSyntheticLambda11 != null) {
                                                            articleViewer$$ExternalSyntheticLambda11.run(str2);
                                                        }
                                                        break;
                                                }
                                            }
                                        };
                                        int i46 = AddressBarList.Address2View.Factory.$r8$clinit;
                                        UItem uItemOfFactory15 = UItem.ofFactory(AddressBarList.Address2View.Factory.class);
                                        uItemOfFactory15.intValue = 0;
                                        uItemOfFactory15.text = str2;
                                        uItemOfFactory15.clickCallback = onClickListener2;
                                        uItemOfFactory15.accent = z2;
                                        uItemOfFactory15.red = z3;
                                        uItemOfFactory15.object = Boolean.TRUE;
                                        uItemOfFactory15.object2 = addressBarList2;
                                        arrayList20.add(uItemOfFactory15);
                                    }
                                }
                                bookmarksList = addressBarList2.bookmarksList;
                                if (bookmarksList != null) {
                                    arrayList2 = bookmarksList.links;
                                    if (arrayList2.isEmpty()) {
                                        return;
                                    }
                                    String string14 = LocaleController.getString(R.string.WebSectionBookmarks);
                                    UItem uItem12 = new UItem(31);
                                    uItem12.text = string14;
                                    arrayList20.add(uItem12);
                                    while (i15 < arrayList2.size()) {
                                        messageObject = (MessageObject) arrayList2.get(i15);
                                        if (TextUtils.isEmpty(AddressBarList.getLink(messageObject))) {
                                            i8 = 1;
                                        } else {
                                            int i47 = AddressBarList.BookmarkView.Factory.$r8$clinit;
                                            UItem uItemOfFactory16 = UItem.ofFactory(AddressBarList.BookmarkView.Factory.class);
                                            uItemOfFactory16.intValue = 3;
                                            i8 = 1;
                                            uItemOfFactory16.accent = true;
                                            uItemOfFactory16.object2 = messageObject;
                                            arrayList20.add(uItemOfFactory16);
                                        }
                                        i15 += i8;
                                    }
                                    if (bookmarksList.endReached) {
                                        return;
                                    }
                                    arrayList20.add(UItem.asFlicker(arrayList20.size(), 32));
                                    arrayList20.add(UItem.asFlicker(arrayList20.size(), 32));
                                    arrayList20.add(UItem.asFlicker(arrayList20.size(), 32));
                                }
                                return;
                            }
                        }
                        addressBarList = addressBarList3;
                        Collections.sort(arrayList23, new OAuthSheet$$ExternalSyntheticLambda3(i11));
                        int size7 = arrayList23.size();
                        int i48 = 0;
                        while (i48 < size7) {
                            Object obj3 = arrayList23.get(i48);
                            i48++;
                            AddressBarList.QueryEntry queryEntry2 = (AddressBarList.QueryEntry) obj3;
                            if (arrayList22.size() < 20) {
                                arrayList22.add(queryEntry2.query);
                            }
                        }
                    } catch (Exception unused2) {
                        addressBarList = addressBarList3;
                    }
                } else {
                    addressBarList = addressBarList3;
                }
                arrayList21.size();
                arrayList22.size();
                addressBarList2 = addressBarList;
                if (!arrayList21.isEmpty()) {
                    arrayList20.add(UItem.asCustom(addressBarList2.space));
                }
                while (i7 < arrayList21.size()) {
                    final String str3 = (String) arrayList21.get(i7);
                    if (i7 == 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (i7 == arrayList21.size() - 1) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    View.OnClickListener onClickListener3 = new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (i15) {
                                case 0:
                                    ArticleViewer$$ExternalSyntheticLambda10 articleViewer$$ExternalSyntheticLambda10 = addressBarList2.onQueryInsertClick;
                                    if (articleViewer$$ExternalSyntheticLambda10 != null) {
                                        articleViewer$$ExternalSyntheticLambda10.run(str3);
                                    }
                                    break;
                                default:
                                    ArticleViewer$$ExternalSyntheticLambda10 articleViewer$$ExternalSyntheticLambda11 = addressBarList2.onQueryInsertClick;
                                    if (articleViewer$$ExternalSyntheticLambda11 != null) {
                                        articleViewer$$ExternalSyntheticLambda11.run(str3);
                                    }
                                    break;
                            }
                        }
                    };
                    int i49 = AddressBarList.Address2View.Factory.$r8$clinit;
                    UItem uItemOfFactory17 = UItem.ofFactory(AddressBarList.Address2View.Factory.class);
                    uItemOfFactory17.intValue = 1;
                    uItemOfFactory17.text = str3;
                    uItemOfFactory17.clickCallback = onClickListener3;
                    uItemOfFactory17.accent = z4;
                    uItemOfFactory17.red = z5;
                    uItemOfFactory17.object = Boolean.TRUE;
                    uItemOfFactory17.object2 = addressBarList2;
                    arrayList20.add(uItemOfFactory17);
                }
                if (!arrayList22.isEmpty()) {
                    String string15 = LocaleController.getString(R.string.WebSectionRecent);
                    String string16 = LocaleController.getString(R.string.WebRecentClear);
                    BotAdView$$ExternalSyntheticLambda1 botAdView$$ExternalSyntheticLambda2 = new BotAdView$$ExternalSyntheticLambda1(addressBarList2, 13);
                    UItem uItem13 = new UItem(31);
                    uItem13.text = string15;
                    uItem13.subtext = string16;
                    uItem13.clickCallback = botAdView$$ExternalSyntheticLambda2;
                    arrayList20.add(uItem13);
                    while (i9 < arrayList22.size()) {
                        final String str4 = (String) arrayList22.get(i9);
                        if (i9 == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        final int i410 = 1;
                        if (i9 == arrayList22.size() - 1) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        View.OnClickListener onClickListener4 = new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                switch (i410) {
                                    case 0:
                                        ArticleViewer$$ExternalSyntheticLambda10 articleViewer$$ExternalSyntheticLambda10 = addressBarList2.onQueryInsertClick;
                                        if (articleViewer$$ExternalSyntheticLambda10 != null) {
                                            articleViewer$$ExternalSyntheticLambda10.run(str4);
                                        }
                                        break;
                                    default:
                                        ArticleViewer$$ExternalSyntheticLambda10 articleViewer$$ExternalSyntheticLambda11 = addressBarList2.onQueryInsertClick;
                                        if (articleViewer$$ExternalSyntheticLambda11 != null) {
                                            articleViewer$$ExternalSyntheticLambda11.run(str4);
                                        }
                                        break;
                                }
                            }
                        };
                        int i411 = AddressBarList.Address2View.Factory.$r8$clinit;
                        UItem uItemOfFactory18 = UItem.ofFactory(AddressBarList.Address2View.Factory.class);
                        uItemOfFactory18.intValue = 0;
                        uItemOfFactory18.text = str4;
                        uItemOfFactory18.clickCallback = onClickListener4;
                        uItemOfFactory18.accent = z2;
                        uItemOfFactory18.red = z3;
                        uItemOfFactory18.object = Boolean.TRUE;
                        uItemOfFactory18.object2 = addressBarList2;
                        arrayList20.add(uItemOfFactory18);
                    }
                }
                bookmarksList = addressBarList2.bookmarksList;
                if (bookmarksList != null) {
                    arrayList2 = bookmarksList.links;
                    if (arrayList2.isEmpty()) {
                        String string17 = LocaleController.getString(R.string.WebSectionBookmarks);
                        UItem uItem14 = new UItem(31);
                        uItem14.text = string17;
                        arrayList20.add(uItem14);
                        while (i15 < arrayList2.size()) {
                            messageObject = (MessageObject) arrayList2.get(i15);
                            if (TextUtils.isEmpty(AddressBarList.getLink(messageObject))) {
                                i8 = 1;
                            } else {
                                int i412 = AddressBarList.BookmarkView.Factory.$r8$clinit;
                                UItem uItemOfFactory19 = UItem.ofFactory(AddressBarList.BookmarkView.Factory.class);
                                uItemOfFactory19.intValue = 3;
                                i8 = 1;
                                uItemOfFactory19.accent = true;
                                uItemOfFactory19.object2 = messageObject;
                                arrayList20.add(uItemOfFactory19);
                            }
                            i15 += i8;
                        }
                        if (bookmarksList.endReached) {
                            arrayList20.add(UItem.asFlicker(arrayList20.size(), 32));
                            arrayList20.add(UItem.asFlicker(arrayList20.size(), 32));
                            arrayList20.add(UItem.asFlicker(arrayList20.size(), 32));
                        }
                    }
                }
                break;
        }
    }
}
