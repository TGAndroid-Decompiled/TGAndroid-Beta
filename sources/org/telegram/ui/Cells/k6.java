package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.ps;
import org.telegram.ui.Components.uv0;

public class k6 extends FrameLayout {
    public static final lb0 C;
    public static final lb0 D;
    public static final lb0 E;
    public static final lb0 F;
    public float A;
    public ValueAnimator B;

    public boolean f24585a;

    public final int f24586b;

    public final j6 f24587c;
    public final eg.c d;

    public final org.telegram.ui.ActionBar.h5 f24588e;

    public final org.telegram.ui.Components.n9 f24589f;
    public final org.telegram.ui.Components.n9 h;

    public int f24590n;

    public final org.telegram.ui.Components.y8 f24591r;

    public final uv0 f24592s;
    public final org.telegram.ui.ActionBar.c6 v;

    public final int f24593w;

    public long f24594x;

    public final i6 f24595y;

    static {
        int i10 = R.drawable.msg_mini_checks;
        int i11 = org.telegram.ui.ActionBar.g6.f23423y6;
        C = new lb0(i10, i11);
        lb0 lb0Var = new lb0(R.drawable.msg_reactions, i11);
        lb0Var.f30337g = 16;
        lb0Var.h = 16;
        lb0Var.f30338i = 5.66f;
        D = lb0Var;
        int i12 = R.drawable.mini_repost_story;
        int i13 = org.telegram.ui.ActionBar.g6.hk;
        E = new lb0(i12, i13);
        F = new lb0(R.drawable.mini_forward_story, i13);
    }

    public k6(int i10, int i11, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11) {
        super(context);
        this.f24591r = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        this.A = 1.0f;
        this.f24593w = i10;
        this.f24586b = i11;
        this.v = c6Var;
        this.f24595y = new i6(this, c6Var);
        setLayoutParams(new f2.y0(-1, AndroidUtilities.dp(50.0f)));
        int i12 = i10 == 1 ? 48 : 34;
        j6 j6Var = new j6(this, context, i10);
        this.f24587c = j6Var;
        float f10 = i12;
        j6Var.setRoundRadius(AndroidUtilities.dp(f10));
        addView(j6Var, h7.z5.i(f10, f10, 8388627, 10.0f, 0.0f, 0.0f, 0.0f));
        if (i10 == 1) {
            setClipChildren(false);
        }
        eg.c cVar = new eg.c(context, 3);
        this.d = cVar;
        NotificationCenter.listenEmojiLoading(cVar);
        cVar.setTextSize(16);
        cVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, c6Var));
        cVar.setEllipsizeByGradient(true);
        cVar.setImportantForAccessibility(2);
        cVar.setRightPadding(AndroidUtilities.dp(30.0f));
        cVar.setTranslationX(LocaleController.isRTL ? AndroidUtilities.dp(30.0f) : 0.0f);
        cVar.setRightDrawableOutside(true);
        float f11 = i10 == 1 ? 7.66f : 5.33f;
        float f12 = i10 == 1 ? 73.0f : 55.0f;
        addView(cVar, h7.z5.i(-1.0f, -2.0f, 55, f12, f11, 12.0f, 0.0f));
        uv0 uv0Var = new uv0(this);
        this.f24592s = uv0Var;
        cVar.setDrawablePadding(AndroidUtilities.dp(3.0f));
        cVar.i(uv0Var.f33217a);
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f24588e = h5Var;
        h5Var.setTextSize(13);
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23423y6, c6Var));
        h5Var.setEllipsizeByGradient(true);
        h5Var.setImportantForAccessibility(2);
        h5Var.setTranslationX(LocaleController.isRTL ? AndroidUtilities.dp(30.0f) : 0.0f);
        addView(h5Var, h7.z5.i(-1.0f, -2.0f, 55, f12, i10 == 1 ? 24.0f : 19.0f, 20.0f, 0.0f));
        if (z11) {
            org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
            this.f24589f = n9Var;
            addView(n9Var, h7.z5.i(24.0f, 24.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
            org.telegram.ui.Components.n9 n9Var2 = new org.telegram.ui.Components.n9(context);
            this.h = n9Var2;
            addView(n9Var2, h7.z5.i(22.0f, 35.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
        }
        if (z10) {
            View view = new View(context);
            view.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
            addView(view, h7.z5.c(-1.0f, -1));
        }
    }

    public final void a(float f10, boolean z10) {
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.B = null;
        }
        if (!z10) {
            this.A = f10;
            invalidate();
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.A, f10);
        this.B = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new r(this, 4));
        this.B.addListener(new org.telegram.ui.ActionBar.z0(this, f10, 2));
        this.B.setInterpolator(er.h);
        this.B.setDuration(420L);
        this.B.start();
    }

    public final void c(TLRPC.User user, TLRPC.Chat chat, TLRPC.Reaction reaction, boolean z10, long j10, TL_stories.StoryItem storyItem, boolean z11, boolean z12, boolean z13) {
        TLRPC.ChatPhoto chatPhoto;
        BitmapDrawable bitmapDrawable;
        Drawable drawable;
        String string;
        boolean z14;
        boolean z15;
        long j11;
        float fDp;
        org.telegram.ui.ActionBar.h5 h5Var;
        float f10;
        float fDp2;
        float f11;
        lb0 lb0Var;
        SpannableStringBuilder spannableStringBuilder;
        float f12;
        TL_stories.StoryFwdHeader storyFwdHeader;
        float fDp3;
        TLRPC.Document document;
        org.telegram.ui.Components.n9 n9Var;
        TLRPC.Photo photo;
        TLRPC.UserProfilePhoto userProfilePhoto;
        TLObject tLObject = user == null ? chat : user;
        if (tLObject == null) {
            return;
        }
        int i10 = this.f24593w == 1 ? org.telegram.ui.ActionBar.g6.G6 : org.telegram.ui.ActionBar.g6.f23444z9;
        org.telegram.ui.ActionBar.c6 c6Var = this.v;
        this.f24592s.a(user, chat, org.telegram.ui.ActionBar.g6.v0(i10, c6Var), false);
        org.telegram.ui.Components.y8 y8Var = this.f24591r;
        int i11 = this.f24586b;
        y8Var.j(i11, tLObject);
        eg.c cVar = this.d;
        if (user != null) {
            this.f24594x = user.f22527id;
            cVar.k(UserObject.getUserName(user));
        } else {
            this.f24594x = -chat.f22380id;
            cVar.k(chat.title);
        }
        if (user == null ? !((chatPhoto = chat.photo) == null || (bitmapDrawable = chatPhoto.strippedBitmap) == null) : !((userProfilePhoto = user.photo) == null || (bitmapDrawable = userProfilePhoto.strippedBitmap) == null)) {
            drawable = y8Var;
            drawable = y8Var;
            drawable = y8Var;
            drawable = y8Var;
            drawable = bitmapDrawable;
        }
        drawable = y8Var;
        drawable = y8Var;
        drawable = y8Var;
        drawable = y8Var;
        drawable = y8Var;
        drawable = y8Var;
        this.f24587c.h(ImageLocation.getForUserOrChat(i11, tLObject, 1), "50_50", drawable, tLObject);
        org.telegram.ui.Components.n9 n9Var2 = this.f24589f;
        if (z10) {
            if (n9Var2 != null) {
                n9Var2.setAnimatedEmojiDrawable(null);
            }
            Drawable drawableMutate = getContext().getDrawable(R.drawable.media_like_active).mutate();
            n9Var2.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
            n9Var2.setImageDrawable(drawableMutate);
            string = LocaleController.formatString("AccDescrLike", R.string.AccDescrLike, new Object[0]);
            z14 = true;
        } else if (reaction != null) {
            ig.q0 q0VarD = ig.q0.d(reaction);
            if (q0VarD.f11412f != null) {
                if (n9Var2 != null) {
                    n9Var2.setAnimatedEmojiDrawable(null);
                }
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i11).getReactionsMap().get(q0VarD.f11412f);
                if (n9Var2 != null) {
                    if (tL_availableReaction != null) {
                        n9Var2.i(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", "webp", DocumentObject.getSvgThumb(tL_availableReaction.static_icon.thumbs, org.telegram.ui.ActionBar.g6.f22999a7, 1.0f), tL_availableReaction);
                        z15 = true;
                    } else {
                        n9Var2.setImageDrawable(null);
                        z15 = false;
                    }
                    n9Var2.setColorFilter(null);
                } else {
                    z15 = false;
                }
            } else {
                org.telegram.ui.Components.k5 k5Var = new org.telegram.ui.Components.k5(0, i11, q0VarD.f11413g);
                k5Var.setColorFilter(org.telegram.ui.ActionBar.g6.n0(c6Var));
                if (n9Var2 != null) {
                    n9Var2.setAnimatedEmojiDrawable(k5Var);
                }
                z15 = true;
            }
            int i12 = R.string.AccDescrReactedWith;
            CharSequence text = cVar.getText();
            Object obj = q0VarD.f11412f;
            if (obj == null) {
                obj = reaction;
            }
            string = LocaleController.formatString("AccDescrReactedWith", i12, text, obj);
            z14 = z15;
        } else {
            if (n9Var2 != null) {
                n9Var2.setAnimatedEmojiDrawable(null);
                n9Var2.setImageDrawable(null);
            }
            string = LocaleController.formatString("AccDescrPersonHasSeen", R.string.AccDescrPersonHasSeen, cVar.getText());
            z14 = false;
        }
        org.telegram.ui.Components.n9 n9Var3 = this.h;
        if (storyItem != null) {
            this.f24590n = storyItem.f22617id;
            if (n9Var3 != null) {
                TLRPC.MessageMedia messageMedia = storyItem.media;
                if (messageMedia == null || (photo = messageMedia.photo) == null) {
                    if (messageMedia != null && (document = messageMedia.document) != null) {
                        n9Var = n9Var3;
                        n9Var.j(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 35, false, null, true), storyItem.media.document), "22_35", null, null, -1, storyItem);
                    }
                    n9Var3.setRoundRadius(AndroidUtilities.dp(3.33f));
                } else {
                    n9Var = n9Var3;
                    n9Var.j(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 35, false, null, true), storyItem.media.photo), "22_35", null, null, -1, storyItem);
                }
                n9Var3 = n9Var;
                n9Var3.setRoundRadius(AndroidUtilities.dp(3.33f));
            }
            if (j10 <= 0) {
                j11 = storyItem.date;
            }
            if (j11 != 0) {
                StringBuilder sbF = s3.c.f(string, " ");
                sbF.append(LocaleController.formatSeenDate(j11));
                string = sbF.toString();
            }
            setContentDescription(string);
            fDp = 0.0f;
            h5Var = this.f24588e;
            if (j11 != 0) {
                h5Var.setVisibility(0);
                if (storyItem != null) {
                    if (z11) {
                        lb0Var = F;
                    } else {
                        lb0Var = E;
                    }
                } else if (z12) {
                    lb0Var = C;
                } else {
                    lb0Var = D;
                }
                spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append(lb0Var.a(getContext(), c6Var));
                spannableStringBuilder.append((CharSequence) LocaleController.formatSeenDate(j11));
                if (!z11 || storyItem == null) {
                    f12 = 9.0f;
                } else {
                    f12 = 9.0f;
                    if (!TextUtils.isEmpty(storyItem.caption)) {
                        spannableStringBuilder.append((CharSequence) "\u2004");
                        spannableStringBuilder.append((CharSequence) ".");
                        ps psVar = new ps();
                        psVar.f31658c = 2.33333f;
                        psVar.f31657b = AndroidUtilities.dp(5.0f);
                        spannableStringBuilder.setSpan(psVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.append((CharSequence) "\u2004");
                        int length = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.StoryRepostCommented));
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.95f), length, spannableStringBuilder.length(), 33);
                    }
                    h5Var.l(spannableStringBuilder, false);
                    if (z12) {
                        fDp3 = 0.0f;
                    } else {
                        fDp3 = AndroidUtilities.dp(-1.0f);
                    }
                    h5Var.setTranslationY(fDp3);
                    cVar.setTranslationY(0.0f);
                    if (z13) {
                        cVar.setTranslationY(AndroidUtilities.dp(f12));
                        cVar.animate().translationY(0.0f);
                        h5Var.setAlpha(0.0f);
                        h5Var.animate().alpha(1.0f);
                    }
                }
                if (!z11 && storyItem != null && (storyFwdHeader = storyItem.fwd_from) != null && storyFwdHeader.modified) {
                    spannableStringBuilder.append((CharSequence) "\u2004");
                    spannableStringBuilder.append((CharSequence) ".");
                    ps psVar2 = new ps();
                    psVar2.f31658c = 2.33333f;
                    psVar2.f31657b = AndroidUtilities.dp(5.0f);
                    spannableStringBuilder.setSpan(psVar2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.append((CharSequence) "\u2004");
                    int length2 = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) "edited");
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(0.95f), length2, spannableStringBuilder.length(), 33);
                }
                h5Var.l(spannableStringBuilder, false);
                if (z12) {
                    fDp3 = AndroidUtilities.dp(-1.0f);
                } else {
                    fDp3 = 0.0f;
                }
                h5Var.setTranslationY(fDp3);
                cVar.setTranslationY(0.0f);
                if (z13) {
                    cVar.setTranslationY(AndroidUtilities.dp(f12));
                    cVar.animate().translationY(0.0f);
                    h5Var.setAlpha(0.0f);
                    h5Var.animate().alpha(1.0f);
                }
            } else {
                h5Var.setVisibility(8);
                cVar.setTranslationY(AndroidUtilities.dp(9.0f));
            }
            if (z14) {
                f10 = 30.0f;
            } else {
                f10 = 0.0f;
            }
            cVar.setRightPadding(AndroidUtilities.dp(f10));
            if (z14 || !LocaleController.isRTL) {
                fDp2 = 0.0f;
            } else {
                fDp2 = AndroidUtilities.dp(30.0f);
            }
            cVar.setTranslationX(fDp2);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) h5Var.getLayoutParams();
            if (z14 || LocaleController.isRTL) {
                f11 = 12.0f;
            } else {
                f11 = 36.0f;
            }
            marginLayoutParams.rightMargin = AndroidUtilities.dp(f11);
            if (z14 && LocaleController.isRTL) {
                fDp = AndroidUtilities.dp(30.0f);
            }
            h5Var.setTranslationX(fDp);
        }
        this.f24590n = -1;
        if (n9Var3 != null) {
            n9Var3.setImageDrawable(null);
        }
        j11 = j10;
        if (j11 != 0) {
            StringBuilder sbF2 = s3.c.f(string, " ");
            sbF2.append(LocaleController.formatSeenDate(j11));
            string = sbF2.toString();
        }
        setContentDescription(string);
        fDp = 0.0f;
        h5Var = this.f24588e;
        if (j11 != 0) {
            h5Var.setVisibility(0);
            if (storyItem != null) {
                if (z11) {
                    lb0Var = F;
                } else {
                    lb0Var = E;
                }
            } else if (z12) {
                lb0Var = C;
            } else {
                lb0Var = D;
            }
            spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(lb0Var.a(getContext(), c6Var));
            spannableStringBuilder.append((CharSequence) LocaleController.formatSeenDate(j11));
            if (z11) {
                f12 = 9.0f;
                if (!z11) {
                    spannableStringBuilder.append((CharSequence) "\u2004");
                    spannableStringBuilder.append((CharSequence) ".");
                    ps psVar3 = new ps();
                    psVar3.f31658c = 2.33333f;
                    psVar3.f31657b = AndroidUtilities.dp(5.0f);
                    spannableStringBuilder.setSpan(psVar3, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.append((CharSequence) "\u2004");
                    int length3 = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) "edited");
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(0.95f), length3, spannableStringBuilder.length(), 33);
                }
            } else {
                f12 = 9.0f;
                if (!z11) {
                    spannableStringBuilder.append((CharSequence) "\u2004");
                    spannableStringBuilder.append((CharSequence) ".");
                    ps psVar4 = new ps();
                    psVar4.f31658c = 2.33333f;
                    psVar4.f31657b = AndroidUtilities.dp(5.0f);
                    spannableStringBuilder.setSpan(psVar4, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.append((CharSequence) "\u2004");
                    int length4 = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) "edited");
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(0.95f), length4, spannableStringBuilder.length(), 33);
                }
            }
            h5Var.l(spannableStringBuilder, false);
            if (z12) {
                fDp3 = AndroidUtilities.dp(-1.0f);
            } else {
                fDp3 = 0.0f;
            }
            h5Var.setTranslationY(fDp3);
            cVar.setTranslationY(0.0f);
            if (z13) {
                cVar.setTranslationY(AndroidUtilities.dp(f12));
                cVar.animate().translationY(0.0f);
                h5Var.setAlpha(0.0f);
                h5Var.animate().alpha(1.0f);
            }
        } else {
            h5Var.setVisibility(8);
            cVar.setTranslationY(AndroidUtilities.dp(9.0f));
        }
        if (z14) {
            f10 = 30.0f;
        } else {
            f10 = 0.0f;
        }
        cVar.setRightPadding(AndroidUtilities.dp(f10));
        if (z14) {
            fDp2 = 0.0f;
        } else {
            fDp2 = 0.0f;
        }
        cVar.setTranslationX(fDp2);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) h5Var.getLayoutParams();
        if (z14) {
            f11 = 12.0f;
        } else {
            f11 = 12.0f;
        }
        marginLayoutParams2.rightMargin = AndroidUtilities.dp(f11);
        if (z14) {
            fDp = AndroidUtilities.dp(30.0f);
        }
        h5Var.setTranslationX(fDp);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        if (this.A < 1.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (this.A * 255.0f), 31);
            z10 = true;
        } else {
            z10 = false;
        }
        super.dispatchDraw(canvas);
        if (this.f24585a) {
            float fDp = AndroidUtilities.dp(this.f24593w == 1 ? 73.0f : 55.0f);
            boolean z11 = LocaleController.isRTL;
            org.telegram.ui.ActionBar.c6 c6Var = this.v;
            if (z11) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - fDp, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.T0("paintDivider", c6Var));
            } else {
                canvas.drawLine(fDp, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.T0("paintDivider", c6Var));
            }
        }
        if (z10) {
            canvas.restore();
        }
    }

    public float getAlphaInternal() {
        return this.A;
    }

    public org.telegram.ui.ActionBar.c6 getResourcesProvider() {
        return this.v;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24592s.f33217a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24592s.f33217a.b();
        this.f24595y.g();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f24593w == 0 ? 50 : 58), 1073741824));
    }

    public void setUserReaction(TLRPC.MessagePeerReaction messagePeerReaction) {
        TLRPC.User user;
        if (messagePeerReaction == null) {
            return;
        }
        long peerId = MessageObject.getPeerId(messagePeerReaction.peer_id);
        int i10 = this.f24586b;
        TLRPC.Chat chat = null;
        if (peerId > 0) {
            user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerId));
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerId));
            user = null;
            chat = chat2;
        }
        c(user, chat, messagePeerReaction.reaction, false, messagePeerReaction.date, null, false, messagePeerReaction.dateIsSeen, false);
    }

    public void b(long j10) {
    }
}
