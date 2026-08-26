package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.audio.AacUtil;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader$$ExternalSyntheticLambda1;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline0;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.GroupCreateUserCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda17;
import org.telegram.ui.ChatActivity$16$$ExternalSyntheticLambda4;
import org.telegram.ui.ChatLinkActivity$$ExternalSyntheticLambda4;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda89;
import org.telegram.ui.ProfileActivity$$ExternalSyntheticLambda51;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda79;

public final class FolderBottomSheet extends BottomSheetWithRecyclerListView {
    public int alreadyHeaderRow;
    public final ArrayList alreadyJoined;
    public final ArrayList alreadyPeers;
    public int alreadySectionRow;
    public int alreadyUsersEndRow;
    public int alreadyUsersStartRow;
    public FrameLayout bulletinContainer;
    public Button button;
    public View buttonShadow;
    public final boolean deleting;
    public CharSequence escapedTitle;
    public final int filterId;
    public HeaderCell headerCell;
    public int headerRow;
    public final TL_chatlists.chatlist_ChatlistInvite invite;
    public long lastClicked;
    public long lastClickedDialogId;
    public Utilities.Callback onDone;
    public final ArrayList peers;
    public int reqId;
    public int rowsCount;
    public int sectionRow;
    public final ArrayList selectedPeers;
    public int shiftDp;
    public final String slug;
    public boolean success;
    public final String title;
    public TitleCell titleCell;
    public final ArrayList titleEntities;
    public final boolean titleNoanimate;
    public final TL_chatlists.TL_chatlists_chatlistUpdates updates;
    public int usersEndRow;
    public int usersSectionRow;
    public int usersStartRow;

    public final class HeaderCell extends FrameLayout {
        public final AnimatedTextView actionTextView;
        public final AnimatedTextView textView;

        public HeaderCell(Context context) {
            super(context);
            AnimatedTextView animatedTextView = new AnimatedTextView(context, true, true, false);
            this.textView = animatedTextView;
            animatedTextView.setTextSize(AndroidUtilities.dp(15.0f));
            animatedTextView.setTypeface(AndroidUtilities.bold());
            int i = Theme.key_windowBackgroundWhiteBlueHeader;
            animatedTextView.setTextColor(Theme.getColor(null, i, false));
            animatedTextView.setGravity(LocaleController.isRTL ? 5 : 3);
            addView(animatedTextView, LayoutHelper.createFrame(-1, 20.0f, (LocaleController.isRTL ? 5 : 3) | 80, 21.0f, 15.0f, 21.0f, 2.0f));
            AnimatedTextView animatedTextView2 = new AnimatedTextView(context, true, true, true);
            this.actionTextView = animatedTextView2;
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = animatedTextView2.drawable;
            animatedTextDrawable.moveAmplitude = 0.45f;
            animatedTextDrawable.animateDuration = 250L;
            animatedTextDrawable.animateWave = 1.0f;
            animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
            animatedTextView2.setTextSize(AndroidUtilities.dp(15.0f));
            animatedTextView2.setTextColor(Theme.getColor(null, i, false));
            animatedTextView2.setGravity(LocaleController.isRTL ? 3 : 5);
            addView(animatedTextView2, LayoutHelper.createFrame(-2, 20.0f, (LocaleController.isRTL ? 3 : 5) | 80, 21.0f, 15.0f, 21.0f, 2.0f));
            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
            new ViewCompat.AnonymousClass1(2131296684, Boolean.class, 0, 28, 2).set(this, Boolean.TRUE);
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.TextView");
            accessibilityNodeInfo.setText(this.textView.getText());
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
        }

        public final void setAction(String str, Runnable runnable) {
            AnimatedTextView animatedTextView = this.actionTextView;
            animatedTextView.setText(str, !LocaleController.isRTL, true);
            animatedTextView.setOnClickListener(new ProfileActivity$$ExternalSyntheticLambda51(4, runnable));
        }

        public final void setText(String str, boolean z) {
            AnimatedTextView animatedTextView = this.textView;
            if (z) {
                animatedTextView.drawable.cancelAnimation();
            }
            animatedTextView.setText(str, z && !LocaleController.isRTL, true);
        }
    }

    public final class TitleCell extends FrameLayout {
        public final boolean already;
        public final FoldersPreview preview;
        public final AnimatedEmojiSpan.TextViewEmojis subtitleTextView;
        public final CharSequence title;

        public final class FoldersPreview extends View {
            public final AnimatedTextView.AnimatedTextDrawable countText;
            public final Text leftFolder;
            public final LinearGradient leftGradient;
            public final Matrix leftMatrix;
            public final Paint leftPaint;
            public final Text middleFolder;
            public final TextPaint paint;
            public final Path path;
            public final float[] radii;
            public final Text rightFolder;
            public final LinearGradient rightGradient;
            public final Matrix rightMatrix;
            public final Paint rightPaint;
            public final Paint selectedPaint;

            public FoldersPreview(Context context, String str, CharSequence charSequence, ArrayList arrayList, boolean z, String str2) {
                super(context);
                TextPaint textPaint = new TextPaint(1);
                this.paint = textPaint;
                TextPaint textPaint2 = new TextPaint(1);
                Paint paint = new Paint(1);
                this.selectedPaint = paint;
                this.path = new Path();
                float[] fArr = new float[8];
                this.radii = fArr;
                Paint paint2 = new Paint(1);
                this.leftPaint = paint2;
                Paint paint3 = new Paint(1);
                this.rightPaint = paint3;
                this.leftMatrix = new Matrix();
                this.rightMatrix = new Matrix();
                int i = Theme.key_profile_tabText;
                textPaint.setColor(Theme.multAlpha(0.8f, Theme.getColor(null, i, false)));
                textPaint.setTextSize(AndroidUtilities.dp(15.33f));
                textPaint.setTypeface(AndroidUtilities.bold());
                int i2 = Theme.key_windowBackgroundWhiteBlueText2;
                textPaint2.setColor(Theme.getColor(null, i2, false));
                textPaint2.setTextSize(AndroidUtilities.dp(17.0f));
                textPaint2.setTypeface(AndroidUtilities.bold());
                paint.setColor(Theme.getColor(null, Theme.key_featuredStickers_unread, false));
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, true, true, false);
                this.countText = animatedTextDrawable;
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                animatedTextDrawable.moveAmplitude = 0.3f;
                animatedTextDrawable.animateDuration = 250L;
                animatedTextDrawable.animateWave = 1.0f;
                animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
                animatedTextDrawable.setCallback(this);
                animatedTextDrawable.setTextSize(AndroidUtilities.dp(11.66f));
                int color = Theme.getColor(null, Theme.key_windowBackgroundWhite, false);
                TextPaint textPaint3 = animatedTextDrawable.textPaint;
                textPaint3.setColor(color);
                animatedTextDrawable.alpha = Color.alpha(color);
                textPaint3.setTypeface(AndroidUtilities.bold());
                animatedTextDrawable.gravity = 1;
                int iMultAlpha = Theme.multAlpha(0.8f, Theme.getColor(null, i, false));
                int color2 = Theme.getColor(null, i2, false);
                if (str != null) {
                    Text text = new Text(normalizeTitle(str), 15.33f, AndroidUtilities.bold());
                    text.supportAnimatedEmojis(this);
                    text.paint.setColor(iMultAlpha);
                    this.leftFolder = text;
                }
                CharSequence charSequenceNormalizeTitle = normalizeTitle(charSequence);
                Text text2 = new Text(charSequenceNormalizeTitle, 15.33f, AndroidUtilities.bold());
                text2.supportAnimatedEmojis(this);
                TextPaint textPaint4 = text2.paint;
                textPaint4.setColor(color2);
                this.middleFolder = text2;
                text2.setText(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(charSequenceNormalizeTitle, textPaint4.getFontMetricsInt(), false), arrayList, textPaint4.getFontMetricsInt()));
                int i3 = z ? 26 : 0;
                if (text2.animatedEmojisCacheType != i3) {
                    text2.animatedEmojisCacheType = i3;
                    if (text2.drawAnimatedEmojis) {
                        AnimatedEmojiSpan.release(text2.parentView, text2.animatedEmojis);
                        text2.animatedEmojis = AnimatedEmojiSpan.update(text2.animatedEmojisCacheType, text2.parentView, text2.animatedEmojis, text2.layout);
                    }
                }
                if (str2 != null) {
                    Text text3 = new Text(normalizeTitle(str2), 15.33f, AndroidUtilities.bold());
                    text3.supportAnimatedEmojis(this);
                    text3.paint.setColor(iMultAlpha);
                    this.rightFolder = text3;
                }
                float fDp = AndroidUtilities.dp(3.0f);
                fArr[3] = fDp;
                fArr[2] = fDp;
                fArr[1] = fDp;
                fArr[0] = fDp;
                float fDp2 = AndroidUtilities.dp(1.0f);
                fArr[7] = fDp2;
                fArr[6] = fDp2;
                fArr[5] = fDp2;
                fArr[4] = fDp2;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(80.0f), 0.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, tileMode);
                this.leftGradient = linearGradient;
                paint2.setShader(linearGradient);
                PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
                paint2.setXfermode(new PorterDuffXfermode(mode));
                LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(80.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, tileMode);
                this.rightGradient = linearGradient2;
                paint3.setShader(linearGradient2);
                paint3.setXfermode(new PorterDuffXfermode(mode));
            }

            public static CharSequence normalizeTitle(CharSequence charSequence) {
                return (charSequence == null || "ALL_CHATS".equals(charSequence.toString())) ? LocaleController.getString(R.string.FilterAllChats) : charSequence;
            }

            @Override
            public final void onDraw(Canvas canvas) {
                float f;
                float f2;
                float f3;
                float f4;
                float currentWidth;
                super.onDraw(canvas);
                canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                float measuredWidth = getMeasuredWidth() / 2.0f;
                float measuredHeight = getMeasuredHeight() / 2.0f;
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.countText;
                Text text = this.middleFolder;
                if (text != null) {
                    canvas.save();
                    float f5 = text.width;
                    CharSequence charSequence = animatedTextDrawable.currentText;
                    if (charSequence == null || charSequence.length() == 0) {
                        currentWidth = 0.0f;
                    } else {
                        currentWidth = animatedTextDrawable.getCurrentWidth() + AndroidUtilities.dp(15.32f);
                    }
                    float f6 = f5 + currentWidth;
                    float f7 = measuredWidth - (f6 / 2.0f);
                    canvas.translate(f7, measuredHeight - (text.layout.getHeight() / 2.0f));
                    text.draw(canvas);
                    canvas.restore();
                    f = f7;
                    f2 = f6;
                } else {
                    f = measuredWidth;
                    f2 = 0.0f;
                }
                CharSequence charSequence2 = animatedTextDrawable.currentText;
                Paint paint = this.selectedPaint;
                if (charSequence2 == null || charSequence2.length() == 0) {
                    f3 = 2.0f;
                } else {
                    Rect rect = AndroidUtilities.rectTmp2;
                    f3 = 2.0f;
                    rect.set((int) (text.width + f + AndroidUtilities.dp(4.66f)), (int) (measuredHeight - AndroidUtilities.dp(9.0f)), (int) (animatedTextDrawable.getCurrentWidth() + text.width + f + AndroidUtilities.dp(15.32f)), (int) (AndroidUtilities.dp(9.0f) + measuredHeight));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(rect);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), paint);
                    rect.offset(-AndroidUtilities.dp(0.33f), -AndroidUtilities.dp(0.66f));
                    animatedTextDrawable.setBounds(rect);
                    animatedTextDrawable.draw(canvas);
                }
                float fDp = AndroidUtilities.dp(30.0f);
                Text text2 = this.leftFolder;
                float f8 = (f - fDp) - text2.width;
                if (text2 != null) {
                    canvas.save();
                    canvas.translate(f8, (measuredHeight - (text2.layout.getHeight() / f3)) + AndroidUtilities.dp(1.0f));
                    text2.draw(canvas);
                    canvas.restore();
                }
                float f9 = f + f2;
                Text text3 = this.rightFolder;
                if (text3 != null) {
                    canvas.save();
                    f4 = 1.0f;
                    canvas.translate(f9 + fDp, (measuredHeight - (text3.layout.getHeight() / f3)) + AndroidUtilities.dp(1.0f));
                    text3.draw(canvas);
                    canvas.restore();
                    f9 += fDp + text3.width;
                } else {
                    f4 = 1.0f;
                }
                float f10 = f9;
                float height = (text.layout.getHeight() / f3) + measuredHeight + AndroidUtilities.dp(12.0f);
                canvas.drawRect(0.0f, height, getMeasuredWidth(), height + f4, this.paint);
                Path path = this.path;
                path.rewind();
                RectF rectF2 = AndroidUtilities.rectTmp;
                float f11 = f2 / f3;
                float f12 = f11 + measuredWidth;
                rectF2.set((measuredWidth - f11) - AndroidUtilities.dp(4.0f), height - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + f12, height);
                path.addRoundRect(rectF2, this.radii, Path.Direction.CW);
                canvas.drawPath(path, paint);
                canvas.save();
                float fMax = Math.max(AndroidUtilities.dp(8.0f), f8);
                Matrix matrix = this.leftMatrix;
                matrix.reset();
                matrix.postTranslate(Math.min(f, fMax + AndroidUtilities.dp(8.0f)), 0.0f);
                this.leftGradient.setLocalMatrix(matrix);
                float fMin = Math.min(getMeasuredWidth() - AndroidUtilities.dp(8.0f), f10);
                Matrix matrix2 = this.rightMatrix;
                matrix2.reset();
                matrix2.postTranslate(Math.max(f12, fMin - AndroidUtilities.dp(88.0f)), 0.0f);
                this.rightGradient.setLocalMatrix(matrix2);
                canvas.drawRect(0.0f, 0.0f, measuredWidth, getMeasuredHeight(), this.leftPaint);
                canvas.drawRect(measuredWidth, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.rightPaint);
                canvas.restore();
                canvas.restore();
            }

            @Override
            public final boolean verifyDrawable(Drawable drawable) {
                return drawable == this.countText || super.verifyDrawable(drawable);
            }
        }

        public TitleCell(Context context, boolean z, CharSequence charSequence, ArrayList arrayList, boolean z2) {
            super(context);
            this.already = z;
            FoldersPreview foldersPreview = new FoldersPreview(context, LocaleController.getString(R.string.FolderLinkPreviewLeft), charSequence == null ? "" : new SpannableStringBuilder(charSequence), arrayList, z2, LocaleController.getString(R.string.FolderLinkPreviewRight));
            this.preview = foldersPreview;
            addView(foldersPreview, LayoutHelper.createFrame(-1, 44.0f, 55, 0.0f, 17.33f, 0.0f, 0.0f));
            AnimatedEmojiSpan.TextViewEmojis textViewEmojis = new AnimatedEmojiSpan.TextViewEmojis(context);
            int i = Theme.key_windowBackgroundWhiteBlackText;
            textViewEmojis.setTextColor(Theme.getColor(null, i, false));
            textViewEmojis.setTextSize(1, 20.0f);
            textViewEmojis.setTypeface(AndroidUtilities.bold());
            textViewEmojis.setGravity(17);
            textViewEmojis.setLineSpacing(AndroidUtilities.dp(-1.0f), 1.0f);
            CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji((CharSequence) new SpannableStringBuilder(charSequence), textViewEmojis.getPaint().getFontMetricsInt(), false, 0.8f);
            this.title = charSequenceReplaceEmoji;
            this.title = MessageObject.replaceAnimatedEmoji(charSequenceReplaceEmoji, arrayList, textViewEmojis.getPaint().getFontMetricsInt(), false, 0.8f, 0);
            textViewEmojis.setText(FolderBottomSheet.this.getTitle());
            textViewEmojis.setCacheType(z2 ? 26 : 0);
            textViewEmojis.setEmojiColor(Theme.getColor(Theme.key_featuredStickers_addButton, ((BottomSheet) FolderBottomSheet.this).resourcesProvider));
            addView(textViewEmojis, LayoutHelper.createFrame(-1, -2.0f, 48, 32.0f, 78.3f, 32.0f, 0.0f));
            AnimatedEmojiSpan.TextViewEmojis textViewEmojis2 = new AnimatedEmojiSpan.TextViewEmojis(context);
            this.subtitleTextView = textViewEmojis2;
            textViewEmojis2.setTextColor(Theme.getColor(null, i, false));
            textViewEmojis2.setTextSize(1, 14.0f);
            textViewEmojis2.setLines(2);
            textViewEmojis2.setGravity(17);
            textViewEmojis2.setLineSpacing(0.0f, 1.15f);
            addView(textViewEmojis2, LayoutHelper.createFrame(-1, -2.0f, 48, 32.0f, 113.0f, 32.0f, 0.0f));
            setSelectedCount();
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(172.0f), 1073741824));
        }

        public final void setSelectedCount() {
            FolderBottomSheet folderBottomSheet = FolderBottomSheet.this;
            boolean z = folderBottomSheet.deleting;
            AnimatedEmojiSpan.TextViewEmojis textViewEmojis = this.subtitleTextView;
            CharSequence charSequence = this.title;
            if (z) {
                textViewEmojis.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleRemove, charSequence)));
                return;
            }
            boolean z2 = this.already;
            ArrayList arrayList = folderBottomSheet.peers;
            if (!z2) {
                if (arrayList == null || arrayList.isEmpty()) {
                    textViewEmojis.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleAlready, charSequence)));
                    return;
                } else {
                    textViewEmojis.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitle, charSequence)));
                    return;
                }
            }
            int size = arrayList != null ? arrayList.size() : 0;
            FoldersPreview foldersPreview = this.preview;
            foldersPreview.countText.setText(size > 0 ? DiffUtil.m(size, "+") : "", false, true);
            foldersPreview.invalidate();
            if (arrayList == null || arrayList.isEmpty()) {
                textViewEmojis.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FolderLinkSubtitleAlready, charSequence)));
            } else {
                textViewEmojis.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralSpannable("FolderLinkSubtitleChats", arrayList != null ? arrayList.size() : 0, charSequence)));
            }
        }
    }

    public FolderBottomSheet(BaseFragment baseFragment, int i, ArrayList arrayList) {
        MessagesController.DialogFilter dialogFilter;
        TLRPC.Chat chat;
        super(baseFragment, false);
        this.filterId = -1;
        this.title = "";
        this.titleEntities = new ArrayList();
        this.escapedTitle = "";
        this.alreadyJoined = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.selectedPeers = arrayList2;
        this.reqId = -1;
        this.shiftDp = -5;
        this.filterId = i;
        this.deleting = true;
        this.peers = new ArrayList();
        arrayList2.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        ArrayList<MessagesController.DialogFilter> arrayList3 = baseFragment.getMessagesController().dialogFilters;
        if (arrayList3 == null) {
            dialogFilter = null;
            break;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= arrayList3.size()) {
                dialogFilter = null;
                break;
            } else {
                if (arrayList3.get(i2).id == i) {
                    dialogFilter = arrayList3.get(i2);
                    break;
                }
                i2++;
            }
        }
        if (dialogFilter != null) {
            this.title = dialogFilter.name;
            this.titleEntities = dialogFilter.entities;
            this.titleNoanimate = dialogFilter.title_noanimate;
            for (int i3 = 0; i3 < this.selectedPeers.size(); i3++) {
                TLRPC.Peer peer = baseFragment.getMessagesController().getPeer(((Long) this.selectedPeers.get(i3)).longValue());
                if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                    this.peers.add(peer);
                }
            }
            for (int i4 = 0; i4 < dialogFilter.alwaysShow.size(); i4++) {
                Long l = dialogFilter.alwaysShow.get(i4);
                long jLongValue = l.longValue();
                if (!this.selectedPeers.contains(l)) {
                    TLRPC.Peer peer2 = baseFragment.getMessagesController().getPeer(jLongValue);
                    if (((peer2 instanceof TLRPC.TL_peerChat) || (peer2 instanceof TLRPC.TL_peerChannel)) && ((chat = baseFragment.getMessagesController().getChat(Long.valueOf(-jLongValue))) == null || !ChatObject.isNotInChat(chat))) {
                        this.peers.add(peer2);
                    }
                }
            }
        }
        init$5();
    }

    public static void showForDeletion(int i, BaseFragment baseFragment, Utilities.Callback callback) {
        MessagesController.DialogFilter dialogFilter;
        ArrayList<MessagesController.DialogFilter> arrayList = baseFragment.getMessagesController().dialogFilters;
        if (arrayList == null) {
            dialogFilter = null;
            break;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= arrayList.size()) {
                dialogFilter = null;
                break;
            } else {
                if (arrayList.get(i2).id == i) {
                    dialogFilter = arrayList.get(i2);
                    break;
                }
                i2++;
            }
        }
        ChatActivity$$ExternalSyntheticLambda17 chatActivity$$ExternalSyntheticLambda17 = new ChatActivity$$ExternalSyntheticLambda17(i, baseFragment, callback, 20);
        if (dialogFilter == null || !dialogFilter.isMyChatlist()) {
            chatActivity$$ExternalSyntheticLambda17.run();
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(baseFragment.getContext(), 0, null);
        String string = LocaleController.getString(R.string.FilterDelete);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        alertDialog.message = LocaleController.getString(R.string.FilterDeleteAlertLinks);
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new StarGiftSheet$$ExternalSyntheticLambda79(2, callback));
        builder.setPositiveButton(LocaleController.getString(R.string.Delete), new ColorPicker$$ExternalSyntheticLambda6(chatActivity$$ExternalSyntheticLambda17, 27));
        baseFragment.showDialog(alertDialog);
        TextView textView = (TextView) alertDialog.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
        }
    }

    public final void announceSelection(boolean z) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(LocaleController.formatPluralString("FilterInviteHeaderChats", this.selectedPeers.size(), new Object[0]));
        if (!z || this.headerCell == null) {
            str = "";
        } else {
            str = ", " + ((Object) this.headerCell.actionTextView.getText());
        }
        sb.append(str);
        AndroidUtilities.makeAccessibilityAnnouncement(sb.toString());
    }

    @Override
    public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        return new RecyclerListView.SelectionAdapter() {
            @Override
            public final int getItemCount() {
                return FolderBottomSheet.this.rowsCount;
            }

            @Override
            public final int getItemViewType(int i) {
                FolderBottomSheet folderBottomSheet = FolderBottomSheet.this;
                folderBottomSheet.getClass();
                if (i == 0) {
                    return 0;
                }
                if (i == folderBottomSheet.sectionRow || i == folderBottomSheet.usersSectionRow || i == folderBottomSheet.alreadySectionRow) {
                    return 1;
                }
                return (i == folderBottomSheet.headerRow || i == folderBottomSheet.alreadyHeaderRow) ? 3 : 2;
            }

            @Override
            public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                if (viewHolder.mItemViewType != 2) {
                    return false;
                }
                int adapterPosition = viewHolder.getAdapterPosition();
                FolderBottomSheet folderBottomSheet = FolderBottomSheet.this;
                return adapterPosition >= folderBottomSheet.usersStartRow && viewHolder.getAdapterPosition() <= folderBottomSheet.usersEndRow;
            }

            @Override
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                ArrayList arrayList;
                ArrayList arrayList2;
                TLRPC.Peer peer;
                long j;
                String userName;
                String string;
                String string2;
                TLRPC.Chat chat;
                int i2 = viewHolder.mItemViewType;
                TLRPC.User user = null;
                FolderBottomSheet folderBottomSheet = FolderBottomSheet.this;
                View view = viewHolder.itemView;
                if (i2 != 2) {
                    if (i2 == 3) {
                        HeaderCell headerCell = (HeaderCell) view;
                        if (i == folderBottomSheet.alreadyHeaderRow) {
                            headerCell.setText(LocaleController.getString(R.string.FolderLinkHeaderAlready), false);
                            headerCell.setAction("", null);
                            return;
                        } else {
                            folderBottomSheet.headerCell = headerCell;
                            folderBottomSheet.updateHeaderCell();
                            return;
                        }
                    }
                    if (i2 != 1) {
                        if (i2 == 0) {
                            folderBottomSheet.titleCell = (TitleCell) view;
                            folderBottomSheet.updateCount(false);
                            return;
                        }
                        return;
                    }
                    TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) view;
                    textInfoPrivacyCell.setForeground(Theme.getThemedDrawableByKey(folderBottomSheet.getContext(), R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
                    if (i == folderBottomSheet.alreadySectionRow || i == folderBottomSheet.sectionRow || (arrayList = folderBottomSheet.peers) == null || arrayList.isEmpty()) {
                        textInfoPrivacyCell.setFixedSize(12);
                        textInfoPrivacyCell.setText("");
                        return;
                    }
                    textInfoPrivacyCell.setFixedSize(0);
                    if (folderBottomSheet.deleting) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.FolderLinkHintRemove));
                        return;
                    } else {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.FolderLinkHint));
                        return;
                    }
                }
                GroupCreateUserCell groupCreateUserCell = (GroupCreateUserCell) view;
                int i3 = folderBottomSheet.usersStartRow;
                if (i < i3 || i > folderBottomSheet.usersEndRow) {
                    int i4 = folderBottomSheet.alreadyUsersStartRow;
                    if (i < i4 || i > folderBottomSheet.alreadyUsersEndRow || (arrayList2 = folderBottomSheet.alreadyPeers) == null) {
                        peer = null;
                    } else {
                        peer = (TLRPC.Peer) arrayList2.get(i - i4);
                    }
                } else {
                    ArrayList arrayList3 = folderBottomSheet.peers;
                    if (arrayList3 != null) {
                        peer = (TLRPC.Peer) arrayList3.get(i - i3);
                    } else {
                        peer = null;
                    }
                }
                if (peer != null) {
                    boolean z = peer instanceof TLRPC.TL_peerUser;
                    BaseFragment baseFragment = folderBottomSheet.baseFragment;
                    if (z) {
                        j = peer.user_id;
                        user = baseFragment.getMessagesController().getUser(Long.valueOf(peer.user_id));
                        userName = UserObject.getUserName(user);
                        string = (user == null || !user.bot) ? LocaleController.getString(R.string.FilterInviteUser) : LocaleController.getString(R.string.FilterInviteBot);
                    } else {
                        if (peer instanceof TLRPC.TL_peerChat) {
                            j = -peer.chat_id;
                            chat = baseFragment.getMessagesController().getChat(Long.valueOf(peer.chat_id));
                        } else if (peer instanceof TLRPC.TL_peerChannel) {
                            j = -peer.channel_id;
                            chat = baseFragment.getMessagesController().getChat(Long.valueOf(peer.channel_id));
                        } else {
                            j = 0;
                            userName = null;
                            string = null;
                        }
                        string = null;
                        user = chat;
                        userName = null;
                    }
                } else {
                    j = 0;
                    userName = null;
                    string = null;
                }
                if (user instanceof TLRPC.Chat) {
                    TLRPC.Chat chat2 = (TLRPC.Chat) user;
                    String str = chat2.title;
                    if (chat2.participants_count != 0) {
                        string2 = ChatObject.isChannelAndNotMegaGroup(chat2) ? LocaleController.formatPluralStringComma("Subscribers", chat2.participants_count) : LocaleController.formatPluralStringComma("Members", chat2.participants_count);
                    } else {
                        string2 = ChatObject.isChannelAndNotMegaGroup(chat2) ? LocaleController.getString(R.string.ChannelPublic) : LocaleController.getString(R.string.MegaPublic);
                    }
                    string = string2;
                    userName = str;
                }
                groupCreateUserCell.setTag(Long.valueOf(j));
                CheckBoxBase checkBoxBase = groupCreateUserCell.getCheckBox().getCheckBoxBase();
                float f = folderBottomSheet.alreadyJoined.contains(Long.valueOf(j)) ? 0.5f : 1.0f;
                if (checkBoxBase.alpha != f) {
                    checkBoxBase.alpha = f;
                    checkBoxBase.invalidate();
                }
                groupCreateUserCell.setChecked(folderBottomSheet.selectedPeers.contains(Long.valueOf(j)), false);
                groupCreateUserCell.setObject(user, userName, string);
            }

            @Override
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                View view;
                View headerCell;
                FolderBottomSheet folderBottomSheet = FolderBottomSheet.this;
                if (i == 0) {
                    TitleCell titleCell = folderBottomSheet.new TitleCell(folderBottomSheet.getContext(), (folderBottomSheet.invite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) || folderBottomSheet.updates != null, folderBottomSheet.escapedTitle, folderBottomSheet.titleEntities, folderBottomSheet.titleNoanimate);
                    folderBottomSheet.titleCell = titleCell;
                    view = titleCell;
                } else {
                    view = null;
                    if (i == 1) {
                        headerCell = new TextInfoPrivacyCell(folderBottomSheet.getContext(), 24, null);
                        headerCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
                    } else if (i == 2) {
                        GroupCreateUserCell groupCreateUserCell = new GroupCreateUserCell(1, 0, folderBottomSheet.getContext(), null, false, false);
                        groupCreateUserCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                        view = groupCreateUserCell;
                    } else if (i == 3) {
                        headerCell = new HeaderCell(folderBottomSheet.getContext());
                        headerCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                    }
                    view = headerCell;
                }
                return new RecyclerListView.Holder(view);
            }
        };
    }

    public final void deselectAll(HeaderCell headerCell, boolean z) {
        ArrayList arrayList = this.selectedPeers;
        arrayList.clear();
        arrayList.addAll(this.alreadyJoined);
        int i = 0;
        if (!z) {
            int i2 = 0;
            while (true) {
                ArrayList arrayList2 = this.peers;
                if (i2 >= arrayList2.size()) {
                    break;
                }
                long peerDialogId = DialogObject.getPeerDialogId((TLRPC.Peer) arrayList2.get(i2));
                if (!arrayList.contains(Long.valueOf(peerDialogId))) {
                    arrayList.add(Long.valueOf(peerDialogId));
                }
                i2++;
            }
        }
        updateCount(true);
        headerCell.setAction(LocaleController.getString(z ? R.string.SelectAll : R.string.DeselectAll), new PhotoViewer$$ExternalSyntheticLambda89(this, headerCell, z, 14));
        announceSelection(true);
        while (true) {
            RecyclerListView recyclerListView = this.recyclerListView;
            if (i >= recyclerListView.getChildCount()) {
                return;
            }
            View childAt = recyclerListView.getChildAt(i);
            if (childAt instanceof GroupCreateUserCell) {
                Object tag = childAt.getTag();
                if (tag instanceof Long) {
                    Long l = (Long) tag;
                    l.getClass();
                    ((GroupCreateUserCell) childAt).setChecked(arrayList.contains(l), true);
                }
            }
            i++;
        }
    }

    @Override
    public final void lambda$showGiftOfferSheet$15() {
        super.lambda$showGiftOfferSheet$15();
        if (this.reqId >= 0) {
            this.baseFragment.getConnectionsManager().cancelRequest(this.reqId, true);
        }
        Utilities.Callback callback = this.onDone;
        if (callback != null) {
            callback.run(Boolean.valueOf(this.success));
            this.onDone = null;
        }
    }

    @Override
    public final CharSequence getTitle() {
        if (this.deleting) {
            return LocaleController.getString(R.string.FolderLinkTitleRemove);
        }
        if (this.invite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
            return LocaleController.getString(R.string.FolderLinkTitleAdd);
        }
        ArrayList arrayList = this.peers;
        return (arrayList == null || arrayList.isEmpty()) ? LocaleController.getString(R.string.FolderLinkTitleAlready) : LocaleController.getString(R.string.FolderLinkTitleAddChats);
    }

    public final void init$5() {
        long j;
        boolean zIsNotInChat;
        boolean z;
        this.escapedTitle = AndroidUtilities.replaceCharSequence("*", this.title, "✱");
        ArrayList arrayList = this.peers;
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                TLRPC.Peer peer = (TLRPC.Peer) arrayList.get(i);
                if (peer != null) {
                    if (peer instanceof TLRPC.TL_peerUser) {
                        j = peer.user_id;
                    } else {
                        boolean z2 = peer instanceof TLRPC.TL_peerChat;
                        BaseFragment baseFragment = this.baseFragment;
                        if (z2) {
                            j = -peer.chat_id;
                            zIsNotInChat = ChatObject.isNotInChat(baseFragment.getMessagesController().getChat(Long.valueOf(-j)));
                        } else if (peer instanceof TLRPC.TL_peerChannel) {
                            j = -peer.channel_id;
                            zIsNotInChat = ChatObject.isNotInChat(baseFragment.getMessagesController().getChat(Long.valueOf(-j)));
                        } else {
                            j = 0;
                        }
                        z = !zIsNotInChat;
                        if (j == 0 && !this.deleting) {
                            if (z) {
                                this.alreadyJoined.add(Long.valueOf(j));
                            }
                            this.selectedPeers.add(Long.valueOf(j));
                        }
                    }
                    z = false;
                    if (j == 0) {
                    }
                }
            }
        }
        this.rowsCount = 1;
        if (arrayList == null || arrayList.isEmpty()) {
            this.sectionRow = -1;
            this.headerRow = -1;
            this.usersStartRow = -1;
            this.usersEndRow = -1;
        } else {
            int i2 = this.rowsCount;
            int i3 = i2 + 1;
            this.sectionRow = i2;
            int i4 = i2 + 2;
            this.rowsCount = i4;
            this.headerRow = i3;
            this.usersStartRow = i4;
            int size = arrayList.size() + i4;
            this.rowsCount = size;
            this.usersEndRow = size;
        }
        int i5 = this.rowsCount;
        this.rowsCount = i5 + 1;
        this.usersSectionRow = i5;
        ArrayList arrayList2 = this.alreadyPeers;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            this.alreadyHeaderRow = -1;
            this.alreadyUsersStartRow = -1;
            this.alreadyUsersEndRow = -1;
            this.alreadySectionRow = -1;
        } else {
            int i6 = this.rowsCount;
            int i7 = i6 + 1;
            this.rowsCount = i7;
            this.alreadyHeaderRow = i6;
            this.alreadyUsersStartRow = i7;
            int size2 = arrayList2.size() + i7;
            this.alreadyUsersEndRow = size2;
            this.rowsCount = size2 + 1;
            this.alreadySectionRow = size2;
        }
        Button button = new Button(getContext());
        this.button = button;
        button.setOnClickListener(new ChatActivity$16$$ExternalSyntheticLambda4(this, 19));
        this.containerView.addView(this.button, LayoutHelper.createFrame(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 10.0f));
        View view = new View(getContext());
        this.buttonShadow = view;
        view.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        this.containerView.addView(this.buttonShadow, LayoutHelper.createFrame(-1, 1.0f / AndroidUtilities.density, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        this.recyclerListView.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(this.button != null ? 68.0f : 0.0f));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.bulletinContainer = frameLayout;
        this.containerView.addView(frameLayout, LayoutHelper.createFrame(-1, 100.0f, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        fixNavigationBar(Theme.getColor(null, Theme.key_dialogBackground, false));
        updateCount(false);
        this.actionBar.setTitle(getTitle());
    }

    @Override
    public final void onViewCreated(SizeNotifierFrameLayout sizeNotifierFrameLayout) {
        RecyclerListView recyclerListView = this.recyclerListView;
        recyclerListView.setOverScrollMode(2);
        recyclerListView.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(this.button != null ? 68.0f : 0.0f));
        recyclerListView.setOnItemClickListener(new ChatLinkActivity$$ExternalSyntheticLambda4(this, 18));
    }

    public final void updateCount(boolean z) {
        int i;
        ArrayList arrayList = this.selectedPeers;
        int size = arrayList.size();
        Button button = this.button;
        if (button != null) {
            boolean z2 = this.deleting;
            TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = this.invite;
            if (z2) {
                String string = LocaleController.getString(size > 0 ? R.string.FolderLinkButtonRemoveChats : R.string.FolderLinkButtonRemove);
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = button.text;
                if (z) {
                    animatedTextDrawable.cancelAnimation();
                }
                animatedTextDrawable.setText(string, z, true);
                button.invalidate();
            } else {
                ArrayList arrayList2 = this.peers;
                if (arrayList2 == null || arrayList2.isEmpty()) {
                    Button button2 = this.button;
                    String string2 = LocaleController.getString(R.string.OK);
                    if (z) {
                        button2.text.cancelAnimation();
                    }
                    button2.text.setText(string2, z, true);
                    button2.invalidate();
                } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                    Spannable spannableReplaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(this.title, this.button.text.textPaint.getFontMetricsInt(), false), this.titleEntities, this.button.text.textPaint.getFontMetricsInt());
                    Button button3 = this.button;
                    CharSequence spannable = LocaleController.formatSpannable(R.string.FolderLinkButtonAdd, spannableReplaceAnimatedEmoji);
                    if (z) {
                        button3.text.cancelAnimation();
                    }
                    button3.text.setText(spannable, z, true);
                    button3.invalidate();
                    this.button.text.emojiCacheType = this.titleNoanimate ? 26 : 0;
                } else {
                    Button button4 = this.button;
                    String pluralString = size > 0 ? LocaleController.formatPluralString("FolderLinkButtonJoinPlural", size, new Object[0]) : LocaleController.getString(R.string.FolderLinkButtonNone);
                    if (z) {
                        button4.text.cancelAnimation();
                    }
                    button4.text.setText(pluralString, z, true);
                    button4.invalidate();
                }
            }
            Button button5 = this.button;
            if (z) {
                button5.countText.cancelAnimation();
            }
            if (z && size != (i = button5.lastCount) && size > 0 && i > 0) {
                ValueAnimator valueAnimator = button5.countAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    button5.countAnimator = null;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                button5.countAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new FolderBottomSheet$Button$$ExternalSyntheticLambda0(button5, 2));
                button5.countAnimator.addListener(new ItemOptions.AnonymousClass3(button5, 3));
                button5.countAnimator.setInterpolator(new OvershootInterpolator(2.0f));
                button5.countAnimator.setDuration(200L);
                button5.countAnimator.start();
            }
            button5.lastCount = size;
            button5.countAlpha = size == 0 ? 0.0f : 1.0f;
            button5.countText.setText("" + size, z, true);
            button5.invalidate();
            if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                this.button.setEnabled(!arrayList.isEmpty());
            }
        }
        TitleCell titleCell = this.titleCell;
        if (titleCell != null) {
            titleCell.setSelectedCount();
        }
    }

    public final void updateHeaderCell() {
        HeaderCell headerCell = this.headerCell;
        if (headerCell == null) {
            return;
        }
        boolean z = this.deleting;
        ArrayList arrayList = this.peers;
        if (z) {
            headerCell.setText(LocaleController.formatPluralString("FolderLinkHeaderChatsQuit", arrayList.size(), new Object[0]), false);
        } else {
            headerCell.setText(LocaleController.formatPluralString("FolderLinkHeaderChatsJoin", arrayList.size(), new Object[0]), false);
        }
        if (arrayList != null) {
            int size = arrayList.size();
            ArrayList arrayList2 = this.alreadyJoined;
            if (size - arrayList2.size() > 1) {
                boolean z2 = this.selectedPeers.size() >= arrayList.size() - arrayList2.size();
                this.headerCell.setAction(LocaleController.getString(z2 ? R.string.DeselectAll : R.string.SelectAll), new FileLoader$$ExternalSyntheticLambda1(16, this, z2));
                return;
            }
        }
        this.headerCell.setAction("", null);
    }

    public final class Button extends FrameLayout {
        public float countAlpha;
        public final AnimatedFloat countAlphaAnimated;
        public ValueAnimator countAnimator;
        public float countScale;
        public final AnimatedTextView.AnimatedTextDrawable countText;
        public boolean enabled;
        public ValueAnimator enabledAnimator;
        public float enabledT;
        public int lastCount;
        public boolean loading;
        public ValueAnimator loadingAnimator;
        public CircularProgressDrawable loadingDrawable;
        public float loadingT;
        public final Paint paint;
        public final View rippleView;
        public final AnimatedTextView.AnimatedTextDrawable text;

        public Button(Context context) {
            super(context);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.countAlphaAnimated = new AnimatedFloat(350L, cubicBezierInterpolator);
            this.loadingT = 0.0f;
            this.countScale = 1.0f;
            this.enabledT = 1.0f;
            this.enabled = true;
            View view = new View(context);
            this.rippleView = view;
            int i = Theme.key_featuredStickers_addButton;
            view.setBackground(Theme.AdaptiveRipple.createRect(new float[]{8.0f}, 0, Theme.AdaptiveRipple.calcRippleColor(Theme.getColor(null, i, false))));
            addView(view, LayoutHelper.createFrame(-1.0f, -1));
            setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(8.0f), Theme.getColor(null, i, false)));
            Paint paint = new Paint(1);
            this.paint = paint;
            int i2 = Theme.key_featuredStickers_buttonText;
            paint.setColor(Theme.getColor(null, i2, false));
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(true, true, false, false);
            this.text = animatedTextDrawable;
            animatedTextDrawable.moveAmplitude = 0.3f;
            animatedTextDrawable.animateDuration = 250L;
            animatedTextDrawable.animateWave = 1.0f;
            animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
            animatedTextDrawable.setCallback(this);
            animatedTextDrawable.setTextSize(AndroidUtilities.dp(14.0f));
            Typeface typefaceBold = AndroidUtilities.bold();
            TextPaint textPaint = animatedTextDrawable.textPaint;
            textPaint.setTypeface(typefaceBold);
            int color = Theme.getColor(null, i2, false);
            textPaint.setColor(color);
            animatedTextDrawable.alpha = Color.alpha(color);
            animatedTextDrawable.setText("", true, true);
            animatedTextDrawable.gravity = 1;
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = new AnimatedTextView.AnimatedTextDrawable(false, false, true, false);
            this.countText = animatedTextDrawable2;
            animatedTextDrawable2.moveAmplitude = 0.3f;
            animatedTextDrawable2.animateDuration = 250L;
            animatedTextDrawable2.animateWave = 1.0f;
            animatedTextDrawable2.animateInterpolator = cubicBezierInterpolator;
            animatedTextDrawable2.setCallback(this);
            animatedTextDrawable2.setTextSize(AndroidUtilities.dp(12.0f));
            Typeface typefaceBold2 = AndroidUtilities.bold();
            TextPaint textPaint2 = animatedTextDrawable2.textPaint;
            textPaint2.setTypeface(typefaceBold2);
            int color2 = Theme.getColor(null, i, false);
            textPaint2.setColor(color2);
            animatedTextDrawable2.alpha = Color.alpha(color2);
            animatedTextDrawable2.setText("", true, true);
            animatedTextDrawable2.gravity = 1;
            setWillNotDraw(false);
        }

        @Override
        public final boolean drawChild(Canvas canvas, View view, long j) {
            return false;
        }

        @Override
        public final void onDraw(Canvas canvas) {
            boolean z;
            this.rippleView.draw(canvas);
            float f = this.loadingT;
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.text;
            if (f > 0.0f) {
                if (this.loadingDrawable == null) {
                    this.loadingDrawable = new CircularProgressDrawable(animatedTextDrawable.textPaint.getColor());
                }
                int iDp = (int) ((1.0f - this.loadingT) * AndroidUtilities.dp(24.0f));
                this.loadingDrawable.setBounds(0, iDp, getWidth(), getHeight() + iDp);
                this.loadingDrawable.paint.setAlpha((int) (this.loadingT * 255.0f));
                this.loadingDrawable.draw(canvas);
                invalidate();
            }
            float f2 = this.loadingT;
            if (f2 < 1.0f) {
                if (f2 != 0.0f) {
                    canvas.save();
                    canvas.translate(0.0f, (int) (this.loadingT * AndroidUtilities.dp(-24.0f)));
                    canvas.scale(1.0f, 1.0f - (this.loadingT * 0.4f));
                    z = true;
                } else {
                    z = false;
                }
                float currentWidth = animatedTextDrawable.getCurrentWidth();
                float f3 = this.countAlphaAnimated.set(this.countAlpha, false);
                float fDp = AndroidUtilities.dp(15.66f);
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = this.countText;
                float currentWidth2 = ((animatedTextDrawable2.getCurrentWidth() + fDp) * f3) + currentWidth;
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set((int) (((getMeasuredWidth() - currentWidth2) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - animatedTextDrawable.currentHeight) / 2.0f) - AndroidUtilities.dp(1.0f)), (int) AacUtil.m(getMeasuredWidth() - currentWidth2, getWidth(), 2.0f, currentWidth), (int) (((getMeasuredHeight() + animatedTextDrawable.currentHeight) / 2.0f) - AndroidUtilities.dp(1.0f)));
                animatedTextDrawable.alpha = (int) (AndroidUtilities.lerp(0.5f, 1.0f, this.enabledT) * (1.0f - this.loadingT) * 255.0f);
                animatedTextDrawable.setBounds(rect);
                animatedTextDrawable.draw(canvas);
                rect.set((int) (ImageReceiver$$ExternalSyntheticOutline0.m(getMeasuredWidth(), currentWidth2, 2.0f, currentWidth) + AndroidUtilities.dp(5.0f)), (int) ((getMeasuredHeight() - AndroidUtilities.dp(18.0f)) / 2.0f), (int) (Math.max(AndroidUtilities.dp(9.0f), animatedTextDrawable2.getCurrentWidth()) + ImageReceiver$$ExternalSyntheticOutline0.m(getMeasuredWidth(), currentWidth2, 2.0f, currentWidth) + AndroidUtilities.dp(13.0f)), (int) ((AndroidUtilities.dp(18.0f) + getMeasuredHeight()) / 2.0f));
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(rect);
                if (this.countScale != 1.0f) {
                    canvas.save();
                    float f4 = this.countScale;
                    canvas.scale(f4, f4, rect.centerX(), rect.centerY());
                }
                Paint paint = this.paint;
                paint.setAlpha((int) ((1.0f - this.loadingT) * 255.0f * f3 * f3));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint);
                rect.offset(-AndroidUtilities.dp(0.3f), -AndroidUtilities.dp(0.4f));
                animatedTextDrawable2.alpha = (int) ImageReceiver$$ExternalSyntheticOutline2.m(1.0f, this.loadingT, 255.0f, f3);
                animatedTextDrawable2.setBounds(rect);
                animatedTextDrawable2.draw(canvas);
                if (this.countScale != 1.0f) {
                    canvas.restore();
                }
                if (z) {
                    canvas.restore();
                }
            }
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            String str;
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.Button");
            StringBuilder sb = new StringBuilder();
            sb.append((Object) this.text.currentText);
            if (this.lastCount > 0) {
                str = ", " + LocaleController.formatPluralString("Chats", this.lastCount, new Object[0]);
            } else {
                str = "";
            }
            sb.append(str);
            accessibilityNodeInfo.setContentDescription(sb.toString());
        }

        @Override
        public final void setEnabled(boolean z) {
            int i = 0;
            if (this.enabled != z) {
                ValueAnimator valueAnimator = this.enabledAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.enabledAnimator = null;
                }
                float f = this.enabledT;
                this.enabled = z;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, z ? 1.0f : 0.0f);
                this.enabledAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new FolderBottomSheet$Button$$ExternalSyntheticLambda0(this, 1));
                this.enabledAnimator.addListener(new AnonymousClass3(i));
                this.enabledAnimator.start();
            }
        }

        public final void setLoading(boolean z) {
            if (this.loading != z) {
                ValueAnimator valueAnimator = this.loadingAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.loadingAnimator = null;
                }
                float f = this.loadingT;
                this.loading = z;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, z ? 1.0f : 0.0f);
                this.loadingAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new FolderBottomSheet$Button$$ExternalSyntheticLambda0(this, 0));
                this.loadingAnimator.addListener(new ChatActivity.AnonymousClass77(23, this, z));
                this.loadingAnimator.setDuration(320L);
                this.loadingAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.loadingAnimator.start();
            }
        }

        @Override
        public final boolean verifyDrawable(Drawable drawable) {
            return this.text == drawable || this.countText == drawable || super.verifyDrawable(drawable);
        }

        public final class AnonymousClass3 extends AnimatorListenerAdapter {
            public final int $r8$classId;

            public AnonymousClass3(int i) {
                this.$r8$classId = i;
            }

            @Override
            public final void onAnimationEnd(Animator animator) {
                switch (this.$r8$classId) {
                    case 0:
                        break;
                    default:
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                        break;
                }
            }

            private final void onAnimationEnd$org$telegram$ui$Components$FolderBottomSheet$Button$3(Animator animator) {
            }
        }
    }

    public FolderBottomSheet(DialogsActivity dialogsActivity, int i, TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates) {
        super(dialogsActivity, false);
        this.filterId = -1;
        this.title = "";
        this.titleEntities = new ArrayList();
        this.escapedTitle = "";
        this.alreadyJoined = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.selectedPeers = arrayList;
        this.reqId = -1;
        this.shiftDp = -5;
        this.filterId = i;
        this.updates = tL_chatlists_chatlistUpdates;
        arrayList.clear();
        this.peers = tL_chatlists_chatlistUpdates.missing_peers;
        ArrayList<MessagesController.DialogFilter> arrayList2 = dialogsActivity.getMessagesController().dialogFilters;
        if (arrayList2 != null) {
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                if (arrayList2.get(i2).id == i) {
                    this.title = arrayList2.get(i2).name;
                    break;
                }
            }
        }
        init$5();
    }

    public FolderBottomSheet(BaseFragment baseFragment, String str, TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite) {
        super(baseFragment, false);
        this.filterId = -1;
        this.title = "";
        this.titleEntities = new ArrayList();
        this.escapedTitle = "";
        this.alreadyJoined = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.selectedPeers = arrayList;
        this.reqId = -1;
        this.shiftDp = -5;
        this.slug = str;
        this.invite = chatlist_chatlistinvite;
        arrayList.clear();
        if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
            TL_chatlists.TL_chatlists_chatlistInvite tL_chatlists_chatlistInvite = (TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite;
            TLRPC.TL_textWithEntities tL_textWithEntities = tL_chatlists_chatlistInvite.title;
            this.title = tL_textWithEntities.text;
            this.titleEntities = tL_textWithEntities.entities;
            this.titleNoanimate = tL_chatlists_chatlistInvite.title_noanimate;
            this.peers = tL_chatlists_chatlistInvite.peers;
        } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) {
            TL_chatlists.TL_chatlists_chatlistInviteAlready tL_chatlists_chatlistInviteAlready = (TL_chatlists.TL_chatlists_chatlistInviteAlready) chatlist_chatlistinvite;
            this.peers = tL_chatlists_chatlistInviteAlready.missing_peers;
            this.alreadyPeers = tL_chatlists_chatlistInviteAlready.already_peers;
            this.filterId = tL_chatlists_chatlistInviteAlready.filter_id;
            ArrayList<MessagesController.DialogFilter> arrayList2 = baseFragment.getMessagesController().dialogFilters;
            if (arrayList2 != null) {
                for (int i = 0; i < arrayList2.size(); i++) {
                    MessagesController.DialogFilter dialogFilter = arrayList2.get(i);
                    if (dialogFilter.id == this.filterId) {
                        this.title = dialogFilter.name;
                        this.titleEntities = dialogFilter.entities;
                        this.titleNoanimate = dialogFilter.title_noanimate;
                        break;
                    }
                }
            }
        }
        init$5();
    }
}
