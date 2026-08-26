package org.telegram.ui.Stories.recorder;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AndroidUtilities$$ExternalSyntheticApiModelOutline5;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Text;
import org.telegram.ui.ProfileActivity;

public final class ScannedLinkPreview extends View {
    public final AnimatedFloat animatedAlpha;
    public final Paint backgroundPaint;
    public final int[] blurLocation;
    public Object blurRenderNode;
    public StoryRecorder.AnonymousClass6 blurView;
    public final ButtonBounce bounce;
    public final RectF bounds;
    public StoryRecorder$$ExternalSyntheticLambda14 clickListener;
    public final RectF clipBounds;
    public final Path clipPath;
    public final int currentAccount;
    public Runnable currentCancel;
    public String currentLink;
    public boolean hasImage;
    public boolean hasResolved;
    public final ImageReceiver imageReceiver;
    public ResolvedLink resolved;
    public final StoryRecorder$$ExternalSyntheticLambda5 resolvedListener;
    public Text subtitle;
    public final int[] thisLocation;
    public Text title;
    public boolean touch;

    public abstract class ResolvedLink {
        public final String sourceLink;

        public final class AnonymousClass1 extends ResolvedLink {
            public final TLRPC.User val$user;

            public AnonymousClass1(String str, TLRPC.User user) {
                super(str);
                this.val$user = user;
            }

            @Override
            public final String getSubtitle() {
                return LocaleController.getString(R.string.ViewProfile);
            }

            @Override
            public final String getTitle() {
                return UserObject.getUserName(this.val$user);
            }

            @Override
            public final void open(BaseFragment baseFragment) {
                TLRPC.User user = this.val$user;
                if (user.id != UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
                    baseFragment.presentFragment(ProfileActivity.of(user.id));
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.id);
                bundle.putBoolean("my_profile", true);
                baseFragment.presentFragment(new ProfileActivity(bundle, null));
            }

            @Override
            public final void setImage(ImageReceiver imageReceiver) {
                AvatarDrawable avatarDrawable = new AvatarDrawable();
                TLRPC.User user = this.val$user;
                avatarDrawable.setInfo(user);
                imageReceiver.setForUserOrChat(user, avatarDrawable);
            }
        }

        public final class AnonymousClass2 extends ResolvedLink {
            public final TLRPC.Chat val$chat;

            public AnonymousClass2(String str, TLRPC.Chat chat) {
                super(str);
                this.val$chat = chat;
            }

            @Override
            public final String getSubtitle() {
                return LocaleController.getString(R.string.AccDescrOpenChat);
            }

            @Override
            public final String getTitle() {
                return this.val$chat.title;
            }

            @Override
            public final void open(BaseFragment baseFragment) {
                baseFragment.presentFragment(ChatActivity.of(-this.val$chat.id));
            }

            @Override
            public final void setImage(ImageReceiver imageReceiver) {
                AvatarDrawable avatarDrawable = new AvatarDrawable();
                TLRPC.Chat chat = this.val$chat;
                avatarDrawable.setInfo(chat);
                imageReceiver.setForUserOrChat(chat, avatarDrawable);
            }
        }

        public ResolvedLink(String str) {
            this.sourceLink = str;
        }

        public abstract String getSubtitle();

        public abstract String getTitle();

        public abstract void open(BaseFragment baseFragment);

        public abstract void setImage(ImageReceiver imageReceiver);
    }

    public ScannedLinkPreview(Activity activity, int i, StoryRecorder$$ExternalSyntheticLambda5 storyRecorder$$ExternalSyntheticLambda5) {
        super(activity);
        this.animatedAlpha = new AnimatedFloat(this, 0L, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.bounds = new RectF();
        this.clipBounds = new RectF();
        this.imageReceiver = new ImageReceiver(this);
        this.clipPath = new Path();
        this.backgroundPaint = new Paint(1);
        this.bounce = new ButtonBounce(this);
        this.thisLocation = new int[2];
        this.blurLocation = new int[2];
        this.currentAccount = i;
        this.resolvedListener = storyRecorder$$ExternalSyntheticLambda5;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Object obj;
        float f = this.animatedAlpha.set(this.hasResolved);
        Text text = this.title;
        if (text == null || this.subtitle == null || f <= 0.0f) {
            return;
        }
        text.ellipsize(getWidth() * 0.7f);
        this.subtitle.ellipsize(getWidth() * 0.7f);
        float fDp = AndroidUtilities.dp(5.0f);
        float fDp2 = AndroidUtilities.dp(10.0f);
        float fDp3 = AndroidUtilities.dp(32.0f);
        float fDp4 = AndroidUtilities.dp(2.0f);
        float fDp5 = AndroidUtilities.dp(11.0f);
        float fMax = Math.max(Math.min(AndroidUtilities.dp(200.0f), getWidth() * 0.8f), Math.max(this.title.getCurrentWidth(), this.subtitle.getCurrentWidth()) + (this.hasImage ? fDp5 + fDp3 + fDp5 : 0.0f) + fDp + AndroidUtilities.dp(15.0f) + fDp);
        float fMax2 = Math.max(this.hasImage ? fDp3 : 0.0f, this.subtitle.getHeight() + this.title.getHeight() + fDp4) + fDp2 + fDp2;
        float fLerp = AndroidUtilities.lerp(0.6f, 1.0f, f) * this.bounce.getScale(0.05f);
        float fDp6 = (1.0f - f) * AndroidUtilities.dp(15.0f);
        RectF rectF = this.bounds;
        rectF.set((getWidth() - fMax) / 2.0f, (getHeight() - fMax2) / 2.0f, (getWidth() + fMax) / 2.0f, (getHeight() + fMax2) / 2.0f);
        RectF rectF2 = this.clipBounds;
        rectF2.set(rectF);
        AndroidUtilities.scaleRect(rectF2, fLerp);
        rectF2.offset(0.0f, fDp6);
        int i = Build.VERSION.SDK_INT;
        Paint paint = this.backgroundPaint;
        if (i < 29 || (obj = this.blurRenderNode) == null || this.blurView == null) {
            paint.setColor(Theme.multAlpha(f, -587202560));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), paint);
        } else {
            RenderNode renderNodeM = AndroidUtilities$$ExternalSyntheticApiModelOutline5.m(obj);
            Path path = this.clipPath;
            path.rewind();
            path.addRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
            int[] iArr = this.thisLocation;
            getLocationOnScreen(iArr);
            StoryRecorder.AnonymousClass6 anonymousClass6 = this.blurView;
            int[] iArr2 = this.blurLocation;
            anonymousClass6.getLocationOnScreen(iArr2);
            canvas.saveLayerAlpha(rectF2, (int) (255.0f * f), 31);
            canvas.clipPath(path);
            canvas.translate(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
            float fMax3 = Math.max(this.blurView.getWidth() / renderNodeM.getWidth(), this.blurView.getHeight() / renderNodeM.getHeight());
            canvas.scale(fMax3, fMax3);
            canvas.drawRenderNode(renderNodeM);
            canvas.restore();
            paint.setColor(Theme.multAlpha(f, 1879048192));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), paint);
        }
        canvas.save();
        canvas.translate(0.0f, fDp6);
        canvas.scale(fLerp, fLerp, rectF.centerX(), rectF.centerY());
        if (this.hasImage) {
            ImageReceiver imageReceiver = this.imageReceiver;
            float f2 = fDp3 / 2.0f;
            imageReceiver.setRoundRadius((int) f2);
            imageReceiver.setImageCoords(rectF.left + fDp + fDp5, rectF.centerY() - f2, fDp3, fDp3);
            imageReceiver.setAlpha(f);
            imageReceiver.draw(canvas);
        }
        float fCenterY = rectF.centerY() - ((this.subtitle.getHeight() + (this.title.getHeight() + fDp4)) / 2.0f);
        Text text2 = this.title;
        text2.draw(canvas, rectF.left + (this.hasImage ? fDp5 + fDp3 + fDp5 : 0.0f) + fDp, (text2.getHeight() / 2.0f) + fCenterY, -1, f);
        this.subtitle.draw(canvas, rectF.left + (this.hasImage ? fDp3 + fDp5 + fDp5 : 0.0f) + fDp, (this.subtitle.getHeight() / 2.0f) + this.title.getHeight() + fCenterY + fDp4, Theme.blendOver(-16777216, -1610612737), f);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        StoryRecorder$$ExternalSyntheticLambda14 storyRecorder$$ExternalSyntheticLambda14;
        boolean z = this.hasResolved;
        ButtonBounce buttonBounce = this.bounce;
        if (!z || this.resolved == null) {
            this.touch = false;
            buttonBounce.setPressed(false);
            return false;
        }
        int action = motionEvent.getAction();
        RectF rectF = this.bounds;
        if (action == 0) {
            if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                this.touch = true;
                buttonBounce.setPressed(true);
            }
        } else if (motionEvent.getAction() == 2) {
            if (buttonBounce.isPressed() && !rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                buttonBounce.setPressed(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (buttonBounce.isPressed() && (storyRecorder$$ExternalSyntheticLambda14 = this.clickListener) != null && this.resolved != null) {
                storyRecorder$$ExternalSyntheticLambda14.run(new ScannedLinkPreview$$ExternalSyntheticLambda0(this, 1));
            }
            buttonBounce.setPressed(false);
            this.touch = false;
        } else if (motionEvent.getAction() == 3) {
            buttonBounce.setPressed(false);
            this.touch = false;
        }
        return this.touch || buttonBounce.isPressed();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.imageReceiver.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.imageReceiver.onDetachedFromWindow();
    }

    public void setLink(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        StoryRecorder$$ExternalSyntheticLambda5 storyRecorder$$ExternalSyntheticLambda5 = this.resolvedListener;
        Runnable runnableResolve = null;
        if (zIsEmpty) {
            Runnable runnable = this.currentCancel;
            if (runnable != null) {
                runnable.run();
                this.currentCancel = null;
            }
            if (this.hasResolved) {
                invalidate();
            }
            this.hasResolved = false;
            this.currentLink = null;
            if (storyRecorder$$ExternalSyntheticLambda5 != null) {
                storyRecorder$$ExternalSyntheticLambda5.run();
                return;
            }
            return;
        }
        ResolvedLink resolvedLink = this.resolved;
        if (!(resolvedLink == null && this.currentCancel == null) && (resolvedLink == null || TextUtils.equals(resolvedLink.sourceLink, str) || TextUtils.equals(this.currentLink, str))) {
            ResolvedLink resolvedLink2 = this.resolved;
            if (resolvedLink2 == null || this.hasResolved || !TextUtils.equals(resolvedLink2.sourceLink, str)) {
                return;
            }
            this.hasResolved = true;
            setup();
            invalidate();
            if (storyRecorder$$ExternalSyntheticLambda5 != null) {
                storyRecorder$$ExternalSyntheticLambda5.run();
                return;
            }
            return;
        }
        Runnable runnable2 = this.currentCancel;
        if (runnable2 != null) {
            runnable2.run();
            this.currentCancel = null;
        }
        this.resolved = null;
        this.currentLink = str;
        int i = this.currentAccount;
        ScannedLinkPreview$$ExternalSyntheticLambda0 scannedLinkPreview$$ExternalSyntheticLambda0 = new ScannedLinkPreview$$ExternalSyntheticLambda0(this, 0);
        try {
            MessagesController messagesController = MessagesController.getInstance(i);
            String str2 = messagesController.linkPrefix;
            Uri uri = Uri.parse(str);
            if (TextUtils.equals(uri.getHost(), str2)) {
                List<String> pathSegments = uri.getPathSegments();
                if (!pathSegments.isEmpty()) {
                    String str3 = pathSegments.get(0);
                    String queryParameter = uri.getQueryParameter("ref");
                    if (TextUtils.isEmpty(queryParameter)) {
                        TLObject userOrChat = messagesController.getUserOrChat(str3);
                        if (userOrChat instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) userOrChat;
                            scannedLinkPreview$$ExternalSyntheticLambda0.run(user == null ? null : new ResolvedLink.AnonymousClass1(str, user));
                        } else if (userOrChat instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) userOrChat;
                            scannedLinkPreview$$ExternalSyntheticLambda0.run(chat == null ? null : new ResolvedLink.AnonymousClass2(str, chat));
                        } else {
                            runnableResolve = messagesController.getUserNameResolver().resolve(str3, queryParameter, new ScannedLinkPreview$ResolvedLink$$ExternalSyntheticLambda0(scannedLinkPreview$$ExternalSyntheticLambda0, messagesController, str, 0));
                        }
                    } else {
                        runnableResolve = messagesController.getUserNameResolver().resolve(str3, queryParameter, new ScannedLinkPreview$ResolvedLink$$ExternalSyntheticLambda0(scannedLinkPreview$$ExternalSyntheticLambda0, messagesController, str, 0));
                    }
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
            scannedLinkPreview$$ExternalSyntheticLambda0.run(null);
        }
        this.currentCancel = runnableResolve;
    }

    public final void setup() {
        ResolvedLink resolvedLink = this.resolved;
        if (resolvedLink == null) {
            return;
        }
        this.title = new Text(resolvedLink.getTitle(), 16.0f, AndroidUtilities.bold());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.resolved.getSubtitle());
        if (spannableStringBuilder.toString().contains(">")) {
            spannableStringBuilder.clear();
            spannableStringBuilder.append(AndroidUtilities.replaceArrows(this.resolved.getSubtitle(), false));
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) ">");
            ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.settings_arrow);
            coloredImageSpan.setScale(1.25f, 1.25f);
            spannableStringBuilder.setSpan(coloredImageSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        this.subtitle = new Text(spannableStringBuilder, 14.0f);
        this.resolved.setImage(this.imageReceiver);
        this.hasImage = true;
    }
}
