package org.telegram.ui.Stories.recorder;

import android.content.Context;
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
import com.google.android.exoplayer2.util.Consumer;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticApiModelOutline2;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
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

public class ScannedLinkPreview extends View {
    private final AnimatedFloat animatedAlpha;
    private final Paint backgroundPaint;
    private final int[] blurLocation;
    private Object blurRenderNode;
    private View blurView;
    private final ButtonBounce bounce;
    private final RectF bounds;
    private Utilities.Callback clickListener;
    private final RectF clipBounds;
    private final Path clipPath;
    private final int currentAccount;
    private Runnable currentCancel;
    private String currentLink;
    private boolean hasImage;
    private boolean hasResolved;
    private final ImageReceiver imageReceiver;
    private ResolvedLink resolved;
    private final Runnable resolvedListener;
    private Text subtitle;
    private final int[] thisLocation;
    private Text title;
    private boolean touch;

    public ScannedLinkPreview(Context context, int i, Runnable runnable) {
        super(context);
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
        this.resolvedListener = runnable;
    }

    public void whenClicked(Utilities.Callback callback) {
        this.clickListener = callback;
    }

    public void setBlurRenderNode(View view, Object obj) {
        this.blurView = view;
        this.blurRenderNode = obj;
        invalidate();
    }

    public boolean isResolved() {
        return this.hasResolved;
    }

    public void setLink(String str) {
        if (TextUtils.isEmpty(str)) {
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
            Runnable runnable2 = this.resolvedListener;
            if (runnable2 != null) {
                runnable2.run();
                return;
            }
            return;
        }
        ResolvedLink resolvedLink = this.resolved;
        if ((resolvedLink == null && this.currentCancel == null) || (resolvedLink != null && !TextUtils.equals(resolvedLink.sourceLink, str) && !TextUtils.equals(this.currentLink, str))) {
            Runnable runnable3 = this.currentCancel;
            if (runnable3 != null) {
                runnable3.run();
                this.currentCancel = null;
            }
            this.resolved = null;
            this.currentLink = str;
            this.currentCancel = ResolvedLink.resolve(this.currentAccount, str, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    ScannedLinkPreview.$r8$lambda$wiYEV2WTsyApUEs3rpLBoo8cfSQ(this.f$0, (ScannedLinkPreview.ResolvedLink) obj);
                }
            });
            return;
        }
        ResolvedLink resolvedLink2 = this.resolved;
        if (resolvedLink2 == null || this.hasResolved || !TextUtils.equals(resolvedLink2.sourceLink, str)) {
            return;
        }
        this.hasResolved = true;
        setup();
        invalidate();
        Runnable runnable4 = this.resolvedListener;
        if (runnable4 != null) {
            runnable4.run();
        }
    }

    public static void $r8$lambda$wiYEV2WTsyApUEs3rpLBoo8cfSQ(ScannedLinkPreview scannedLinkPreview, ResolvedLink resolvedLink) {
        scannedLinkPreview.currentCancel = null;
        scannedLinkPreview.resolved = resolvedLink;
        scannedLinkPreview.hasResolved = resolvedLink != null;
        scannedLinkPreview.setup();
        scannedLinkPreview.invalidate();
        Runnable runnable = scannedLinkPreview.resolvedListener;
        if (runnable != null) {
            runnable.run();
        }
    }

    private void setup() {
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
        this.hasImage = this.resolved.setImage(this.imageReceiver);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        Object obj;
        float f = this.animatedAlpha.set(this.hasResolved);
        Text text = this.title;
        if (text == null || this.subtitle == null) {
            return;
        }
        if (f <= 0.0f) {
            return;
        }
        text.ellipsize(getWidth() * 0.7f);
        this.subtitle.ellipsize(getWidth() * 0.7f);
        float fDp = AndroidUtilities.dp(5.0f);
        float fDp2 = AndroidUtilities.dp(10.0f);
        float fDp3 = AndroidUtilities.dp(32.0f);
        float fDp4 = AndroidUtilities.dp(2.0f);
        float fDp5 = AndroidUtilities.dp(11.0f);
        float fMax = Math.max(Math.min(AndroidUtilities.dp(200.0f), getWidth() * 0.8f), (this.hasImage ? fDp5 + fDp3 + fDp5 : 0.0f) + fDp + Math.max(this.title.getCurrentWidth(), this.subtitle.getCurrentWidth()) + AndroidUtilities.dp(15.0f) + fDp);
        float fMax2 = Math.max(this.hasImage ? fDp3 : 0.0f, this.title.getHeight() + fDp4 + this.subtitle.getHeight()) + fDp2 + fDp2;
        float scale = this.bounce.getScale(0.05f) * AndroidUtilities.lerp(0.6f, 1.0f, f);
        float fDp6 = AndroidUtilities.dp(15.0f) * (1.0f - f);
        this.bounds.set((getWidth() - fMax) / 2.0f, (getHeight() - fMax2) / 2.0f, (getWidth() + fMax) / 2.0f, (getHeight() + fMax2) / 2.0f);
        this.clipBounds.set(this.bounds);
        AndroidUtilities.scaleRect(this.clipBounds, scale);
        this.clipBounds.offset(0.0f, fDp6);
        if (Build.VERSION.SDK_INT >= 29 && (obj = this.blurRenderNode) != null && this.blurView != null) {
            RenderNode renderNodeM = BotFullscreenButtons$$ExternalSyntheticApiModelOutline2.m(obj);
            this.clipPath.rewind();
            this.clipPath.addRoundRect(this.clipBounds, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
            getLocationOnScreen(this.thisLocation);
            this.blurView.getLocationOnScreen(this.blurLocation);
            canvas.saveLayerAlpha(this.clipBounds, (int) (255.0f * f), 31);
            canvas.clipPath(this.clipPath);
            int[] iArr = this.blurLocation;
            int i = iArr[0];
            int[] iArr2 = this.thisLocation;
            canvas.translate(i - iArr2[0], iArr[1] - iArr2[1]);
            float fMax3 = Math.max(this.blurView.getWidth() / renderNodeM.getWidth(), this.blurView.getHeight() / renderNodeM.getHeight());
            canvas.scale(fMax3, fMax3);
            canvas.drawRenderNode(renderNodeM);
            canvas.restore();
            this.backgroundPaint.setColor(Theme.multAlpha(1879048192, f));
            canvas.drawRoundRect(this.clipBounds, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.backgroundPaint);
        } else {
            this.backgroundPaint.setColor(Theme.multAlpha(-587202560, f));
            canvas.drawRoundRect(this.clipBounds, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.backgroundPaint);
        }
        canvas.save();
        canvas.translate(0.0f, fDp6);
        canvas.scale(scale, scale, this.bounds.centerX(), this.bounds.centerY());
        if (this.hasImage) {
            float f2 = fDp3 / 2.0f;
            this.imageReceiver.setRoundRadius((int) f2);
            ImageReceiver imageReceiver = this.imageReceiver;
            RectF rectF = this.bounds;
            imageReceiver.setImageCoords(rectF.left + fDp + fDp5, rectF.centerY() - f2, fDp3, fDp3);
            this.imageReceiver.setAlpha(f);
            this.imageReceiver.draw(canvas);
        }
        float fCenterY = this.bounds.centerY() - (((this.title.getHeight() + fDp4) + this.subtitle.getHeight()) / 2.0f);
        Text text2 = this.title;
        text2.draw(canvas, this.bounds.left + (this.hasImage ? fDp5 + fDp3 + fDp5 : 0.0f) + fDp, (text2.getHeight() / 2.0f) + fCenterY, -1, f);
        this.subtitle.draw(canvas, this.bounds.left + (this.hasImage ? fDp3 + fDp5 + fDp5 : 0.0f) + fDp, fCenterY + this.title.getHeight() + fDp4 + (this.subtitle.getHeight() / 2.0f), Theme.blendOver(-16777216, -1610612737), f);
        canvas.restore();
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.imageReceiver.onAttachedToWindow();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.imageReceiver.onDetachedFromWindow();
    }

    public boolean inTouch() {
        return this.bounce.isPressed() || this.touch;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Utilities.Callback callback;
        if (!this.hasResolved || this.resolved == null) {
            ButtonBounce buttonBounce = this.bounce;
            this.touch = false;
            buttonBounce.setPressed(false);
            return false;
        }
        if (motionEvent.getAction() == 0) {
            if (this.bounds.contains(motionEvent.getX(), motionEvent.getY())) {
                ButtonBounce buttonBounce2 = this.bounce;
                this.touch = true;
                buttonBounce2.setPressed(true);
            }
        } else if (motionEvent.getAction() == 2) {
            if (this.bounce.isPressed() && !this.bounds.contains(motionEvent.getX(), motionEvent.getY())) {
                this.bounce.setPressed(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.bounce.isPressed() && (callback = this.clickListener) != null && this.resolved != null) {
                callback.run(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        ScannedLinkPreview.$r8$lambda$nRxLRc5cdHGIpB86bm4Y8RKUdWA(this.f$0, (BaseFragment) obj);
                    }
                });
            }
            this.bounce.setPressed(false);
            this.touch = false;
        } else if (motionEvent.getAction() == 3) {
            this.bounce.setPressed(false);
            this.touch = false;
        }
        return this.touch || this.bounce.isPressed();
    }

    public static void $r8$lambda$nRxLRc5cdHGIpB86bm4Y8RKUdWA(ScannedLinkPreview scannedLinkPreview, BaseFragment baseFragment) {
        ResolvedLink resolvedLink = scannedLinkPreview.resolved;
        if (resolvedLink != null || baseFragment == null) {
            resolvedLink.open(baseFragment);
        }
    }

    public static class ResolvedLink {
        public final String sourceLink;

        public abstract String getSubtitle();

        public abstract String getTitle();

        public abstract void open(BaseFragment baseFragment);

        public abstract boolean setImage(ImageReceiver imageReceiver);

        public ResolvedLink(String str) {
            this.sourceLink = str;
        }

        public static Runnable resolve(int i, final String str, final Utilities.Callback callback) {
            if (callback == null) {
                return null;
            }
            try {
                final MessagesController messagesController = MessagesController.getInstance(i);
                String str2 = messagesController.linkPrefix;
                Uri uri = Uri.parse(str);
                if (!TextUtils.equals(uri.getHost(), str2)) {
                    return null;
                }
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments.isEmpty()) {
                    return null;
                }
                String str3 = pathSegments.get(0);
                String queryParameter = uri.getQueryParameter("ref");
                if (TextUtils.isEmpty(queryParameter)) {
                    TLObject userOrChat = messagesController.getUserOrChat(str3);
                    if (userOrChat instanceof TLRPC.User) {
                        callback.run(fromUser(str, (TLRPC.User) userOrChat));
                        return null;
                    }
                    if (userOrChat instanceof TLRPC.Chat) {
                        callback.run(fromChat(str, (TLRPC.Chat) userOrChat));
                        return null;
                    }
                }
                return messagesController.getUserNameResolver().resolve(str3, queryParameter, new Consumer() {
                    @Override
                    public final void accept(Object obj) {
                        ScannedLinkPreview.ResolvedLink.m4564$r8$lambda$ZU95PTWNIUggcw96yv0AFkIIfE(callback, messagesController, str, (Long) obj);
                    }
                });
            } catch (Exception e) {
                FileLog.e(e);
                callback.run(null);
                return null;
            }
        }

        public static void m4564$r8$lambda$ZU95PTWNIUggcw96yv0AFkIIfE(Utilities.Callback callback, MessagesController messagesController, String str, Long l) {
            if (l == null) {
                callback.run(null);
                return;
            }
            TLObject userOrChat = messagesController.getUserOrChat(l.longValue());
            if (userOrChat instanceof TLRPC.User) {
                callback.run(fromUser(str, (TLRPC.User) userOrChat));
            } else if (userOrChat instanceof TLRPC.Chat) {
                callback.run(fromChat(str, (TLRPC.Chat) userOrChat));
            }
        }

        public static ResolvedLink fromUser(String str, final TLRPC.User user) {
            if (user == null) {
                return null;
            }
            return new ResolvedLink(str) {
                @Override
                public String getTitle() {
                    return UserObject.getUserName(user);
                }

                @Override
                public String getSubtitle() {
                    return LocaleController.getString(R.string.ViewProfile);
                }

                @Override
                public boolean setImage(ImageReceiver imageReceiver) {
                    AvatarDrawable avatarDrawable = new AvatarDrawable();
                    avatarDrawable.setInfo(user);
                    imageReceiver.setForUserOrChat(user, avatarDrawable);
                    return true;
                }

                @Override
                public void open(BaseFragment baseFragment) {
                    if (user.id == UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", user.id);
                        bundle.putBoolean("my_profile", true);
                        baseFragment.presentFragment(new ProfileActivity(bundle, null));
                        return;
                    }
                    baseFragment.presentFragment(ProfileActivity.of(user.id));
                }
            };
        }

        public static ResolvedLink fromChat(String str, final TLRPC.Chat chat) {
            if (chat == null) {
                return null;
            }
            return new ResolvedLink(str) {
                @Override
                public String getTitle() {
                    return chat.title;
                }

                @Override
                public String getSubtitle() {
                    return LocaleController.getString(R.string.AccDescrOpenChat);
                }

                @Override
                public boolean setImage(ImageReceiver imageReceiver) {
                    AvatarDrawable avatarDrawable = new AvatarDrawable();
                    avatarDrawable.setInfo(chat);
                    imageReceiver.setForUserOrChat(chat, avatarDrawable);
                    return true;
                }

                @Override
                public void open(BaseFragment baseFragment) {
                    baseFragment.presentFragment(ChatActivity.of(-chat.id));
                }
            };
        }
    }
}
