package org.telegram.ui.Stars;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.exoplayer2.audio.AacUtil;
import java.util.ArrayList;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController$$ExternalSyntheticOutline0;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Gifts.GiftMessageDrawable;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda6;
import org.telegram.ui.LaunchActivity;

public final class StarGiftUniqueActionLayout {
    public TLRPC.TL_messageActionStarGiftUnique action;
    public final FactorAnimator animatorVisualWidth;
    public boolean attached;
    public TL_stars.starGiftAttributeBackdrop backdrop;
    public final ButtonBounce bounce;
    public boolean burned;
    public final Paint buttonBackgroundPaint;
    public final ButtonBounce buttonBounce;
    public float buttonHeight;
    public final StarsReactionsSheet.Particles buttonParticles;
    public final Path buttonPath;
    public final RectF buttonRect;
    public Text buttonText;
    public float buttonY;
    public final int currentAccount;
    public MessageObject currentMessageObject;
    public final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable emoji;
    public RadialGradient gradient;
    public int gradientRadius;
    public boolean hasGiftMessage;
    public int height;
    public final ImageReceiver imageReceiver;
    public final GiftMessageDrawable messageDrawable;
    public float messageY;
    public TL_stars.starGiftAttributeModel model;
    public float nameWidth;
    public StarGiftSheet$$ExternalSyntheticLambda182 onButtonClick;
    public TL_stars.starGiftAttributePattern pattern;
    public boolean repost;
    public final Theme.ResourcesProvider resourcesProvider;
    public final GiftSheet.RibbonDrawable ribbon;
    public Text subtitle;
    public float subtitleY;
    public Text title;
    public float titleY;
    public float valueWidth;
    public final View view;
    public int width;
    public boolean widthExpanded;
    public final Paint backgroundPaint = new Paint(1);
    public final Matrix matrix = new Matrix();
    public final RectF backgroundRect = new RectF();
    public final Path backgroundPath = new Path();
    public final ArrayList table = new ArrayList();

    public final class Row {
        public final Text name;
        public final Text value;
        public final float y;

        public Row(float f, String str, CharSequence charSequence) {
            Text text = new Text(str, 12.0f);
            this.name = text;
            Text text2 = new Text(charSequence, 12.0f, AndroidUtilities.bold());
            this.value = text2;
            this.y = (Math.max(text.getHeight(), text2.getHeight()) / 2.0f) + f;
        }
    }

    public StarGiftUniqueActionLayout(int i, View view, Theme.ResourcesProvider resourcesProvider) {
        GiftMessageDrawable giftMessageDrawable = new GiftMessageDrawable();
        this.messageDrawable = giftMessageDrawable;
        this.buttonRect = new RectF();
        this.buttonPath = new Path();
        this.buttonBackgroundPaint = new Paint();
        this.buttonParticles = new StarsReactionsSheet.Particles(1, 25);
        this.animatorVisualWidth = new FactorAnimator(0, new GiftSheet$$ExternalSyntheticLambda6(this, 19), CubicBezierInterpolator.EASE_OUT_QUINT, 320L);
        this.currentAccount = i;
        this.view = view;
        this.resourcesProvider = resourcesProvider;
        this.ribbon = new GiftSheet.RibbonDrawable(view);
        this.buttonBounce = new ButtonBounce(view);
        this.bounce = new ButtonBounce(view);
        this.imageReceiver = new ImageReceiver(view);
        this.emoji = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(view, AndroidUtilities.dp(28.0f));
        giftMessageDrawable.parentView = view;
        giftMessageDrawable.avatarReceiver.setParentView(view);
    }

    public final void draw(Canvas canvas) {
        FactorAnimator factorAnimator = this.animatorVisualWidth;
        float f = factorAnimator.factor;
        float f2 = f / 2.0f;
        RectF rectF = this.backgroundRect;
        rectF.set(0.0f, 0.0f, f, this.height);
        int iHeight = ((int) (rectF.height() + rectF.width())) / 2;
        if (this.backdrop != null && (this.gradient == null || this.gradientRadius != iHeight)) {
            this.gradientRadius = iHeight;
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.backdrop;
            this.gradient = new RadialGradient(0.0f, 0.0f, iHeight, new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
        RadialGradient radialGradient = this.gradient;
        Paint paint = this.backgroundPaint;
        if (radialGradient != null) {
            Matrix matrix = this.matrix;
            matrix.reset();
            matrix.postTranslate(f2, f2);
            this.gradient.setLocalMatrix(matrix);
            paint.setShader(this.gradient);
        }
        Path path = this.backgroundPath;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), Path.Direction.CW);
        canvas.save();
        float scale = this.bounce.getScale(0.0125f);
        canvas.scale(scale, scale, rectF.centerX(), rectF.centerY());
        canvas.save();
        canvas.clipPath(path);
        canvas.drawPaint(paint);
        canvas.save();
        canvas.translate(f2, AndroidUtilities.dp(65.0f));
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = this.backdrop;
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emoji;
        if (stargiftattributebackdrop2 != null) {
            swapAnimatedEmojiDrawable.setColor(Integer.valueOf(stargiftattributebackdrop2.pattern_color | (-16777216)));
        }
        StarGiftPatterns.drawPattern(canvas, 1, swapAnimatedEmojiDrawable, rectF.width(), rectF.height(), 1.0f, 1.1f);
        canvas.restore();
        ImageReceiver imageReceiver = this.imageReceiver;
        imageReceiver.setImageCoords(f2 - (AndroidUtilities.dp(110.0f) / 2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(110.0f), AndroidUtilities.dp(110.0f));
        imageReceiver.draw(canvas);
        int iMultAlpha = Theme.multAlpha(0.6f, -1);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = this.backdrop;
        if (stargiftattributebackdrop3 != null) {
            iMultAlpha = stargiftattributebackdrop3.text_color | (-16777216);
        }
        int i = iMultAlpha;
        this.title.ellipsize(factorAnimator.factor - AndroidUtilities.dp(12.0f));
        Text text = this.title;
        text.draw(canvas, f2 - (text.getCurrentWidth() / 2.0f), this.titleY, -1, 1.0f);
        this.subtitle.ellipsize(factorAnimator.factor - AndroidUtilities.dp(12.0f));
        Text text2 = this.subtitle;
        Canvas canvas2 = canvas;
        int i2 = i;
        text2.draw(canvas2, f2 - (text2.getCurrentWidth() / 2.0f), this.subtitleY, i2, 1.0f);
        if (this.hasGiftMessage) {
            GiftMessageDrawable giftMessageDrawable = this.messageDrawable;
            int i3 = giftMessageDrawable.measuredWidth;
            int i4 = giftMessageDrawable.measuredHeight;
            int i5 = (int) (f2 - (i3 / 2.0f));
            int i6 = (int) this.messageY;
            giftMessageDrawable.setBounds(i5, i6, i3 + i5, i4 + i6);
            giftMessageDrawable.draw(canvas2);
        } else {
            float fDp = this.nameWidth + AndroidUtilities.dp(9.0f) + this.valueWidth;
            ArrayList arrayList = this.table;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                int i8 = i7 + 1;
                Row row = (Row) arrayList.get(i7);
                Text text3 = row.name;
                float f3 = f2 - (fDp / 2.0f);
                text3.draw(canvas2, (f3 + this.nameWidth) - text3.getCurrentWidth(), row.y, i2, 1.0f);
                canvas2 = canvas;
                row.value.draw(canvas2, f3 + this.nameWidth + AndroidUtilities.dp(9.0f), row.y, -1, 1.0f);
                i2 = i2;
                i7 = i8;
            }
        }
        int i9 = i2;
        if (!this.repost) {
            RectF rectF2 = this.buttonRect;
            rectF2.set(f2 - ((this.buttonText.getCurrentWidth() + AndroidUtilities.dp(30.0f)) / 2.0f), this.buttonY, AacUtil.m(this.buttonText.getCurrentWidth(), AndroidUtilities.dp(30.0f), 2.0f, f2), this.buttonY + this.buttonHeight);
            Path path2 = this.buttonPath;
            path2.rewind();
            float f4 = this.buttonHeight / 2.0f;
            path2.addRoundRect(rectF2, f4, f4, Path.Direction.CW);
            Paint paint2 = this.buttonBackgroundPaint;
            paint2.setColor(Theme.multAlpha(0.13f, -16777216));
            float scale2 = this.buttonBounce.getScale(0.075f);
            canvas2.scale(scale2, scale2, rectF2.centerX(), rectF2.centerY());
            canvas2.drawPath(path2, paint2);
            canvas2.restore();
            int iDp = ((int) rectF.right) - AndroidUtilities.dp(46.67f);
            int iDp2 = ((int) rectF.top) - AndroidUtilities.dp(1.33f);
            int iDp3 = AndroidUtilities.dp(1.33f) + ((int) rectF.right);
            int iDp4 = AndroidUtilities.dp(46.67f) + ((int) rectF.top);
            GiftSheet.RibbonDrawable ribbonDrawable = this.ribbon;
            ribbonDrawable.setBounds(iDp, iDp2, iDp3, iDp4);
            ribbonDrawable.textColor = i9;
            ribbonDrawable.draw(canvas2);
        }
        canvas2.restore();
    }

    public final void drawOutbounds(Canvas canvas) {
        if (this.repost) {
            return;
        }
        canvas.save();
        float scale = this.bounce.getScale(0.0125f);
        RectF rectF = this.backgroundRect;
        canvas.scale(scale, scale, rectF.centerX(), rectF.centerY());
        float scale2 = this.buttonBounce.getScale(0.075f);
        RectF rectF2 = this.buttonRect;
        canvas.scale(scale2, scale2, rectF2.centerX(), rectF2.centerY());
        canvas.clipPath(this.buttonPath);
        StarsReactionsSheet.Particles particles = this.buttonParticles;
        particles.bounds.set(rectF2);
        particles.removeParticlesOutside();
        particles.process();
        particles.draw(canvas, Theme.multAlpha(0.7f, -1), 1.0f);
        this.buttonText.draw(canvas, rectF2.left + AndroidUtilities.dp(15.0f), rectF2.centerY(), -1, 1.0f);
        canvas.restore();
        View view = this.view;
        if (view instanceof ChatActionCell) {
            ((ChatActionCell) view).invalidateOutbounds();
        } else {
            view.invalidate();
        }
    }

    public final float getWidth() {
        return this.animatorVisualWidth.factor;
    }

    public final boolean has() {
        return this.action != null;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent, float f, float f2) {
        boolean zContains = this.buttonRect.contains(motionEvent.getX() - f, motionEvent.getY() - f2);
        boolean zContains2 = this.backgroundRect.contains(motionEvent.getX() - f, motionEvent.getY() - f2);
        int action = motionEvent.getAction();
        ButtonBounce buttonBounce = this.bounce;
        ButtonBounce buttonBounce2 = this.buttonBounce;
        if (action == 0) {
            buttonBounce.setPressed(zContains2 && !zContains);
            buttonBounce2.setPressed(zContains);
        } else if (motionEvent.getAction() == 2) {
            if (buttonBounce2.isPressed() && !zContains) {
                buttonBounce2.setPressed(false);
            } else if (buttonBounce.isPressed() && !zContains2) {
                buttonBounce.setPressed(false);
            }
        } else {
            if (motionEvent.getAction() == 1 && (buttonBounce2.isPressed() || buttonBounce.isPressed())) {
                if (this.onButtonClick != null) {
                    if (buttonBounce2.isPressed()) {
                        this.onButtonClick.run();
                    }
                } else if (this.burned) {
                    BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                    if (safeLastFragment != null) {
                        FactCheckController$$ExternalSyntheticOutline0.m(R.string.UniqueGiftNotFoundBurned, BulletinFactory.of(safeLastFragment), R.raw.fire_on);
                    }
                } else {
                    StarGiftSheet starGiftSheet = new StarGiftSheet(this.currentAccount, this.view.getContext(), this.resourcesProvider, this.currentMessageObject.getDialogId(), null);
                    starGiftSheet.set(this.currentMessageObject, (StarsController.IGiftsList) null);
                    starGiftSheet.show();
                }
                buttonBounce2.setPressed(false);
                buttonBounce.setPressed(false);
                return true;
            }
            if (motionEvent.getAction() == 3 && (buttonBounce2.isPressed() || buttonBounce.isPressed())) {
                buttonBounce2.setPressed(false);
                buttonBounce.setPressed(false);
                return true;
            }
        }
        return buttonBounce2.isPressed() || buttonBounce.isPressed();
    }

    public final void setInternal(MessageObject messageObject, TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        float f;
        float f2;
        int iDp;
        float f3 = this.width;
        boolean zIsOutOwner = messageObject.isOutOwner();
        boolean z = !tL_messageActionStarGiftUnique.upgrade;
        int i = this.currentAccount;
        long clientUserId = z == zIsOutOwner ? UserConfig.getInstance(i).getClientUserId() : messageObject.getDialogId();
        TLRPC.Peer peer = tL_messageActionStarGiftUnique.from_id;
        if (peer != null) {
            clientUserId = DialogObject.getPeerDialogId(peer);
        }
        String shortName = DialogObject.getShortName(clientUserId);
        float fDp = AndroidUtilities.dp(10.0f) + 0.0f + AndroidUtilities.dp(110.0f) + AndroidUtilities.dp(9.33f);
        if (this.repost) {
            this.title = new Text(tL_starGiftUnique.title, 14.0f, AndroidUtilities.bold());
        } else if (tL_messageActionStarGiftUnique.peer != null || UserObject.isService(messageObject.getDialogId())) {
            this.title = new Text(LocaleController.getString(R.string.Gift2UniqueTitle2), 14.0f, AndroidUtilities.bold());
        } else if (messageObject.getDialogId() != UserConfig.getInstance(i).getClientUserId()) {
            this.title = new Text(LocaleController.formatString(R.string.Gift2UniqueTitle, shortName), 14.0f, AndroidUtilities.bold());
        } else if (tL_starGiftUnique.crafted) {
            this.title = new Text(LocaleController.getString(R.string.Gift2ActionCraftedTitle), 14.0f, AndroidUtilities.bold());
        } else if (tL_messageActionStarGiftUnique.resale_amount != null) {
            this.title = new Text(LocaleController.getString(R.string.Gift2ActionPurchasedTitle), 14.0f, AndroidUtilities.bold());
        } else {
            this.title = new Text(LocaleController.getString(R.string.Gift2ActionUpgradedTitle), 14.0f, AndroidUtilities.bold());
        }
        this.titleY = (this.title.getHeight() / 2.0f) + fDp;
        float height = this.title.getHeight() + fDp + AndroidUtilities.dp(3.0f);
        if (this.repost) {
            f = 10.0f;
            this.subtitle = new Text(LocaleController.formatPluralStringComma("Gift2CollectionNumber", tL_starGiftUnique.num), 12.0f, AndroidUtilities.bold());
            f2 = 2.0f;
        } else {
            f = 10.0f;
            StringBuilder sb = new StringBuilder();
            sb.append(tL_starGiftUnique.title);
            sb.append(" #");
            f2 = 2.0f;
            this.subtitle = new Text(BillingController$$ExternalSyntheticOutline0.m(tL_starGiftUnique.num, ',', sb), 12.0f);
        }
        this.subtitleY = (this.subtitle.getHeight() / f2) + height;
        float height2 = this.subtitle.getHeight() + height + AndroidUtilities.dp(this.repost ? 14.0f : 11.0f);
        ArrayList arrayList = this.table;
        arrayList.clear();
        this.nameWidth = 0.0f;
        this.valueWidth = 0.0f;
        TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGiftUnique.message;
        TLObject userOrChat = null;
        GiftMessageDrawable giftMessageDrawable = this.messageDrawable;
        if (tL_textWithEntities != null) {
            TextPaint textPaint = giftMessageDrawable.textPaint;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities.text);
            MessageObject.addEntitiesToText(spannableStringBuilder, tL_textWithEntities.entities, false, false, false, false);
            Spannable spannableReplaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false), tL_textWithEntities.entities, textPaint.getFontMetricsInt());
            if (!tL_messageActionStarGiftUnique.name_hidden) {
                userOrChat = tL_messageActionStarGiftUnique.from_id != null ? MessagesController.getInstance(i).getUserOrChat(DialogObject.getPeerDialogId(tL_messageActionStarGiftUnique.from_id)) : MessagesController.getInstance(i).getUserOrChat(messageObject.getFromChatId());
            }
            this.hasGiftMessage = true;
            giftMessageDrawable.setUser(userOrChat);
            giftMessageDrawable.message = spannableReplaceAnimatedEmoji;
            giftMessageDrawable.lastMeasuredWidth = -1;
            giftMessageDrawable.measure(((int) f3) - AndroidUtilities.dp(24.0f));
            if (!this.widthExpanded) {
                StaticLayout staticLayout = giftMessageDrawable.textLayout;
                if ((staticLayout != null ? staticLayout.getLineCount() : 0) > 3) {
                    this.widthExpanded = true;
                    StaticLayout staticLayout2 = giftMessageDrawable.textLayout;
                    this.width = (int) ((Math.min(0.4f, ((staticLayout2 != null ? staticLayout2.getLineCount() : 0) - 3) * 0.1f) + 1.0f) * this.width);
                    setInternal(messageObject, tL_messageActionStarGiftUnique, tL_starGiftUnique);
                    return;
                }
            }
            float fDp2 = height2 + AndroidUtilities.dp(4.0f);
            this.messageY = fDp2;
            height2 = fDp2 + giftMessageDrawable.measuredHeight + AndroidUtilities.dp(3.0f);
        } else {
            this.hasGiftMessage = false;
            giftMessageDrawable.setUser(null);
            giftMessageDrawable.message = null;
            giftMessageDrawable.lastMeasuredWidth = -1;
            if (this.model != null) {
                if (!arrayList.isEmpty()) {
                    height2 += AndroidUtilities.dp(6.0f);
                }
                Row row = new Row(height2, LocaleController.getString(R.string.Gift2AttributeModel), this.model.name);
                arrayList.add(row);
                float f4 = f3 * 0.5f;
                Text text = row.name;
                text.ellipsize(f4);
                this.nameWidth = Math.max(this.nameWidth, text.getCurrentWidth());
                Text text2 = row.value;
                text2.ellipsize(f4);
                this.valueWidth = Math.max(this.valueWidth, text2.getCurrentWidth());
                height2 += Math.max(text.getHeight(), text2.getHeight());
            }
            if (this.backdrop != null) {
                if (!arrayList.isEmpty()) {
                    height2 += AndroidUtilities.dp(6.0f);
                }
                Row row2 = new Row(height2, LocaleController.getString(R.string.Gift2AttributeBackdrop), this.backdrop.name);
                arrayList.add(row2);
                float f5 = f3 * 0.5f;
                Text text3 = row2.name;
                text3.ellipsize(f5);
                this.nameWidth = Math.max(this.nameWidth, text3.getCurrentWidth());
                Text text4 = row2.value;
                text4.ellipsize(f5);
                this.valueWidth = Math.max(this.valueWidth, text4.getCurrentWidth());
                height2 = Math.max(text3.getHeight(), text4.getHeight()) + height2;
            }
            if (this.pattern != null) {
                if (!arrayList.isEmpty()) {
                    height2 += AndroidUtilities.dp(6.0f);
                }
                Row row3 = new Row(height2, LocaleController.getString(R.string.Gift2AttributeSymbol), this.pattern.name);
                arrayList.add(row3);
                float f6 = f3 * 0.5f;
                Text text5 = row3.name;
                text5.ellipsize(f6);
                this.nameWidth = Math.max(this.nameWidth, text5.getCurrentWidth());
                Text text6 = row3.value;
                text6.ellipsize(f6);
                this.valueWidth = Math.max(this.valueWidth, text6.getCurrentWidth());
                height2 += Math.max(text5.getHeight(), text6.getHeight());
            }
        }
        float fDp3 = height2 + AndroidUtilities.dp(11.66f);
        if (this.repost) {
            iDp = AndroidUtilities.dp(f);
        } else {
            this.buttonY = fDp3;
            this.buttonText = new Text(LocaleController.getString(R.string.Gift2UniqueView), 14.0f, AndroidUtilities.bold());
            float fDp4 = AndroidUtilities.dp(30.0f);
            this.buttonHeight = fDp4;
            fDp3 += fDp4;
            iDp = AndroidUtilities.dp(11.0f);
        }
        this.height = (int) (fDp3 + iDp);
    }

    public final void setInternal2(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, TLRPC.TL_textWithEntities tL_textWithEntities, String str) {
        Spannable spannableReplaceAnimatedEmoji;
        float f = this.width;
        float fDp = AndroidUtilities.dp(10.0f) + 0.0f + AndroidUtilities.dp(110.0f) + AndroidUtilities.dp(9.33f);
        Text text = new Text(LocaleController.formatString(R.string.Gift2UniqueTitle, DialogObject.getShortName(j)), 14.0f, AndroidUtilities.bold());
        this.title = text;
        this.titleY = (text.getHeight() / 2.0f) + fDp;
        float height = this.title.getHeight() + fDp + AndroidUtilities.dp(3.0f);
        StringBuilder sb = new StringBuilder();
        sb.append(tL_starGiftUnique.title);
        sb.append(" #");
        Text text2 = new Text(BillingController$$ExternalSyntheticOutline0.m(tL_starGiftUnique.num, ',', sb), 12.0f);
        this.subtitle = text2;
        this.subtitleY = (text2.getHeight() / 2.0f) + height;
        float height2 = this.subtitle.getHeight() + height + AndroidUtilities.dp(11.0f);
        this.table.clear();
        this.nameWidth = 0.0f;
        this.valueWidth = 0.0f;
        GiftMessageDrawable giftMessageDrawable = this.messageDrawable;
        TextPaint textPaint = giftMessageDrawable.textPaint;
        if (tL_textWithEntities == null || TextUtils.isEmpty(tL_textWithEntities.text)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.GiftMessageHint));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(-1593835521), 0, spannableStringBuilder.length(), 33);
            spannableReplaceAnimatedEmoji = spannableStringBuilder;
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_textWithEntities.text);
            MessageObject.addEntitiesToText(spannableStringBuilder2, tL_textWithEntities.entities, false, false, false, false);
            spannableReplaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder2, textPaint.getFontMetricsInt(), false), tL_textWithEntities.entities, textPaint.getFontMetricsInt());
        }
        TLObject userOrChat = j != 0 ? MessagesController.getInstance(this.currentAccount).getUserOrChat(j) : null;
        this.hasGiftMessage = true;
        giftMessageDrawable.setUser(userOrChat);
        giftMessageDrawable.message = spannableReplaceAnimatedEmoji;
        giftMessageDrawable.lastMeasuredWidth = -1;
        giftMessageDrawable.measure(((int) f) - AndroidUtilities.dp(24.0f));
        if (!this.widthExpanded) {
            StaticLayout staticLayout = giftMessageDrawable.textLayout;
            if ((staticLayout != null ? staticLayout.getLineCount() : 0) > 3) {
                this.widthExpanded = true;
                StaticLayout staticLayout2 = giftMessageDrawable.textLayout;
                this.width = (int) ((Math.min(0.4f, ((staticLayout2 != null ? staticLayout2.getLineCount() : 0) - 3) * 0.1f) + 1.0f) * this.width);
                setInternal2(tL_starGiftUnique, j, tL_textWithEntities, str);
                return;
            }
        }
        float fDp2 = height2 + AndroidUtilities.dp(4.0f);
        this.messageY = fDp2;
        float fDp3 = fDp2 + giftMessageDrawable.measuredHeight + AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(11.66f);
        this.buttonY = fDp3;
        this.buttonText = new Text(str, 14.0f, AndroidUtilities.bold());
        float fDp4 = AndroidUtilities.dp(30.0f);
        this.buttonHeight = fDp4;
        this.height = (int) (fDp3 + fDp4 + AndroidUtilities.dp(11.0f));
    }
}
