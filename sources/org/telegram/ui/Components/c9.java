package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.cc1;
public final class c9 extends org.telegram.ui.ActionBar.n2 {
    public static final int[][] f22977c0 = {new int[]{-11302949, -11562789, -10430789, -11480359}, new int[]{-11229725, -12014137, -10234219, -10819908}, new int[]{-12927610, -11158198, -3355566, -5191850}, new int[]{-8164117, -5281560, -2200166, -2525971}, new int[]{-1287263, -1350281, -1337532, -885148}, new int[]{-1419145, -1936819, -742839, -1014448}, new int[]{-1017772, -1212871, -998847, -1003446}};
    public static final int[][] f22978d0 = {new int[]{-7035984, -9667705}, new int[]{-1334949, -6199504}, new int[]{-1525432, -4686800}, new int[]{-11117215, -12893369}, new int[]{-15000805, -16777216}, new int[]{-10588271, -12496267}, new int[]{-5344541, -7842635}, new int[]{-5278276, -7777898}, new int[]{-4036162, -7650428}, new int[]{-2459992, -5351279}, new int[]{-1678221, -5814951}, new int[]{-9659148, -10720532}, new int[]{-12149549, -13731672}, new int[]{-12350279, -13802877}, new int[]{-10046854, -13404051}, new int[]{-8276302, -11822442}, new int[]{-10760507, -13200754}, new int[]{-10496401, -13525130}, new int[]{-1668548, -2862189}, new int[]{-9706766, -10062345}, new int[]{-3838476, -10456076}, new int[]{-1324753, -11225016}, new int[]{-10046854, -13404051}, new int[]{-3492512, -7569348}, new int[]{-5394320, -9732780}, new int[]{-7039865, -9408414}, new int[]{-5202023, -7373198}, new int[]{-3701922, -6397115}, new int[]{-4427695, -6859449}, new int[]{-7379371, -9944001}};
    public float E;
    public boolean F;
    public ValueAnimator G;
    public org.telegram.ui.ActionBar.k H;
    public mf I;
    public z8 J;
    public dd K;
    public boolean L;
    public ValueAnimator M;
    public float N;
    public final Paint O;
    public int P;
    public boolean Q;
    public org.telegram.ui.ActionBar.v0 R;
    public q8 S;
    public final s40 T;
    public boolean U;
    public TextView V;
    public TextView W;
    public final u40 X;
    public y8 Y;
    public boolean Z;
    public v8 f22979a;
    public float f22980a0;
    public w8 f22981b;
    public ValueAnimator f22982b0;
    public int f22983c;
    public int d;
    public View e;
    public boolean f22984f;
    public boolean h;
    public boolean f22985n;
    public cc1 f22986r;
    public CharSequence f22987s;
    public SpannableStringBuilder v;
    public boolean f22988w;
    public ci.d f22989x;
    public FrameLayout f22990y;

    public c9(u40 u40Var, s40 s40Var) {
        super(null);
        this.O = new Paint();
        this.Q = true;
        this.Z = false;
        this.f22980a0 = 0.0f;
        this.X = u40Var;
        this.T = s40Var;
    }

    public static void U(c9 c9Var) {
        if (c9Var.getParentActivity() == null) {
            return;
        }
        if (c9Var.f22985n) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(c9Var.getParentActivity());
            alertDialog$Builder.f18435a.T = LocaleController.getString(R.string.PhotoEditorDiscardAlert);
            alertDialog$Builder.f18435a.R = LocaleController.getString(R.string.DiscardChanges);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new o8(c9Var, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18435a;
            c9Var.showDialog(b2Var);
            b2Var.h();
            return;
        }
        c9Var.finishFragment();
    }

    @Override
    public final View createView(Context context) {
        String string;
        this.hasOwnBackground = true;
        this.actionBar.setBackgroundDrawable(null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(true);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        kVar.setTitleColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        this.actionBar.B(org.telegram.ui.ActionBar.i6.w0(null, i10, false), false);
        this.actionBar.A(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18923i6, false), false);
        hg.c.x(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.PhotoEditor));
        this.actionBar.setActionBarMenuOnItemClick(new t8(this, 0));
        this.actionBar.getTitleTextView().setAlpha(0.0f);
        org.telegram.ui.ActionBar.k kVar2 = new org.telegram.ui.ActionBar.k(getParentActivity(), null);
        this.H = kVar2;
        kVar2.setCastShadows(false);
        this.H.setAddToContainer(false);
        this.H.setOccupyStatusBar(true);
        this.H.setClipChildren(false);
        int k10 = i0.a.k(-1, 60);
        this.H.B(-1, false);
        hg.c.x(false, this.H);
        this.H.setAllowOverlayTitle(false);
        this.H.A(k10, false);
        org.telegram.ui.ActionBar.z n10 = this.H.n();
        n10.setClipChildren(false);
        s40 s40Var = this.T;
        if (s40Var != null && s40Var.f27765c == 2) {
            string = LocaleController.getString(R.string.SuggestPhoto);
        } else {
            string = LocaleController.getString(R.string.SetPhoto);
        }
        org.telegram.ui.ActionBar.v0 e = n10.e(1, string);
        this.R = e;
        e.setBackground(org.telegram.ui.ActionBar.i6.f0(k10, 3, -1));
        this.H.setActionBarMenuOnItemClick(new t8(this, 1));
        this.f22986r = new cc1(this, getParentActivity(), 5);
        u8 u8Var = new u8(this, context);
        u8Var.setFitsSystemWindows(true);
        u8Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18778a7, false));
        this.f22986r.setClipChildren(false);
        this.f22986r.setClipToPadding(false);
        this.f22986r.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        this.f22986r.setOrientation(1);
        cc1 cc1Var = this.f22986r;
        v8 v8Var = new v8(this, getParentActivity(), u8Var);
        this.f22979a = v8Var;
        cc1Var.addView(v8Var);
        TextView textView = new TextView(getParentActivity());
        this.W = textView;
        textView.setText(LocaleController.getString(R.string.ChooseBackground));
        TextView textView2 = this.W;
        int i11 = org.telegram.ui.ActionBar.i6.f19215y6;
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        this.W.setTextSize(1, 14.0f);
        this.W.setGravity(17);
        this.f22986r.addView(this.W, w7.x5.t(-1, -2, 0, 21, 10, 21, 10));
        ai.v7 v7Var = new ai.v7(this, getParentActivity());
        z8 z8Var = new z8(this, getParentActivity());
        this.J = z8Var;
        v7Var.addView(z8Var);
        this.f22986r.addView(v7Var, w7.x5.t(-1, 48, 0, 12, 0, 12, 0));
        TextView textView3 = new TextView(getParentActivity());
        this.V = textView3;
        textView3.setText(LocaleController.getString(R.string.ChooseEmojiOrSticker));
        this.V.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        this.V.setTextSize(1, 14.0f);
        this.V.setGravity(17);
        this.f22986r.addView(this.V, w7.x5.t(-1, -2, 0, 21, 18, 21, 10));
        w8 w8Var = new w8(this, this, getParentActivity(), getThemedColor(i10));
        this.f22981b = w8Var;
        w8Var.R = true;
        w8Var.setAnimationsEnabled(this.fragmentBeginToShow);
        this.f22981b.setClipChildren(false);
        this.f22986r.addView(this.f22981b, w7.x5.t(-1, -1, 0, 12, 0, 12, 12));
        this.f22986r.setClipChildren(false);
        u8Var.addView(this.f22986r, w7.x5.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 64.0f));
        View view = new View(getParentActivity());
        this.e = view;
        view.setVisibility(8);
        ci.d dVar = new ci.d(context, this.resourceProvider, true);
        this.f22989x = dVar;
        dVar.e();
        this.f22989x.d.o(false, false, false);
        int i12 = this.X.V;
        if (i12 == 1) {
            this.f22987s = LocaleController.getString(R.string.SetChannelPhoto);
        } else if (i12 == 3) {
            this.f22987s = LocaleController.getString(R.string.SetCommunityPhoto);
        } else if (i12 == 2) {
            this.f22987s = LocaleController.getString(R.string.SetGroupPhoto);
        } else if (s40Var != null && s40Var.f27765c == 2) {
            this.f22987s = LocaleController.getString(R.string.SuggestPhoto);
        } else {
            this.f22987s = LocaleController.getString(R.string.SetMyProfilePhotoAvatarConstructor);
        }
        this.f22987s = new SpannableStringBuilder(this.f22987s);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f22987s);
        spannableStringBuilder.append((CharSequence) " l");
        spannableStringBuilder.setSpan(new oq(R.drawable.msg_mini_lock2, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        this.v = spannableStringBuilder;
        this.f22988w = false;
        this.f22989x.g(this.f22987s, false, true);
        this.f22989x.setOnClickListener(new f0(this, 3));
        this.f22990y = new FrameLayout(context);
        u8Var.addView(this.f22989x, w7.x5.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        u8Var.addView(this.f22990y, w7.x5.d(-1, 80.0f, 80, 8.0f, 16.0f, 8.0f, 64.0f));
        u8Var.addView(this.actionBar);
        u8Var.addView(this.H);
        u8Var.addView(this.e, w7.x5.c(-1.0f, -1));
        dd ddVar = new dd(u8Var);
        this.K = ddVar;
        ddVar.h = new n8(this, 0);
        this.fragmentView = u8Var;
        return u8Var;
    }

    public final void d0() {
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.G.cancel();
            this.G = null;
        }
    }

    public final boolean e0() {
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            return false;
        }
        v8 v8Var = this.f22979a;
        y8 y8Var = v8Var.h;
        if ((y8Var == null || !y8Var.f30171b) && !v8Var.f22711n) {
            return false;
        }
        return true;
    }

    public final void f0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c9.f0():void");
    }

    public final void g0(boolean z10, boolean z11, boolean z12) {
        float f7;
        if (this.U) {
            return;
        }
        d0();
        float f10 = this.E;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.G = ValueAnimator.ofFloat(f10, f7);
        if (z11) {
            this.f22979a.f22714w = this.E;
            if (Build.VERSION.SDK_INT >= 23) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            }
        }
        this.G.addUpdateListener(new ai.bb(5, this, z11));
        this.G.addListener(new org.telegram.ui.ActionBar.g(this, z10, z11, 2));
        if (z12) {
            this.G.setInterpolator(qr.h);
            this.G.setDuration(350L);
            this.G.setStartDelay(150L);
        } else {
            this.G.setInterpolator(qr.f27420f);
            this.G.setDuration(250L);
        }
        this.G.start();
    }

    public final void h0(boolean z10, long j3, TLRPC.Document document) {
        v8 v8Var = this.f22979a;
        v8Var.f22707a = j3;
        ai.z5 z5Var = v8Var.f22709c;
        v8Var.f22708b = document;
        if (j3 == 0) {
            z5Var.setAnimatedEmojiDrawable(null);
            this.f22979a.f22709c.getImageReceiver().setImage(ImageLocation.getForDocument(document), "100_100", null, null, DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.i6.f18998m6, 0.2f), 0L, "tgs", document, 0);
        } else {
            z5Var.setAnimatedEmojiDrawable(new o5(14, this.currentAccount, j3));
            this.f22979a.f22709c.getImageReceiver().clearImage();
        }
        if (this.f22979a.getImageReceiver() != null && this.f22979a.getImageReceiver().getAnimation() != null) {
            this.f22979a.getImageReceiver().getAnimation().y(0L, true, false);
        }
        if (this.f22979a.getImageReceiver() != null && this.f22979a.getImageReceiver().getLottieAnimation() != null) {
            this.f22979a.getImageReceiver().getLottieAnimation().N(0, false, true);
        }
        this.f22985n = true;
        n0();
    }

    public final void i0(float f7, boolean z10) {
        boolean z11;
        this.E = f7;
        float f10 = ((this.d - this.f22983c) - AndroidUtilities.statusBarHeight) * f7;
        if (this.N == 0.0f) {
            this.f22986r.setTranslationY(f10);
            this.f22989x.setTranslationY(f10);
        }
        this.f22979a.setTranslationY(((-(this.d - this.f22983c)) / 2.0f) * f7);
        this.fragmentView.invalidate();
        if (z10) {
            v8 v8Var = this.f22979a;
            if (f7 > 0.5f) {
                z11 = true;
            } else {
                z11 = false;
            }
            v8Var.setExpanded(z11);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c9.isLightStatusBar():boolean");
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public final void j0(float f7) {
        if (this.f22980a0 != f7) {
            this.f22980a0 = f7;
            int d = i0.a.d(f7, -16777216, -1);
            int k10 = i0.a.k(d, 60);
            this.H.B(d, false);
            this.R.setBackground(org.telegram.ui.ActionBar.i6.f0(k10, 3, -1));
        }
    }

    public final void k0(long j3) {
        v8 v8Var = this.f22979a;
        if (v8Var == 0) {
            return;
        }
        ?? obj = new Object();
        int[] iArr = f22977c0[0];
        obj.f30172c = iArr[0];
        obj.d = iArr[1];
        obj.e = iArr[2];
        obj.f30173f = iArr[3];
        v8Var.b(obj, false);
        n0();
        v8 v8Var2 = this.f22979a;
        v8Var2.f22707a = j3;
        v8Var2.f22709c.setAnimatedEmojiDrawable(new o5(14, this.currentAccount, j3));
        this.J.w1(obj);
        this.f22981b.setForUser(false);
    }

    public final void l0(TLRPC.VideoSize videoSize) {
        int i10;
        int i11;
        int i12;
        ?? obj = new Object();
        obj.f30172c = i0.a.k(videoSize.background_colors.get(0).intValue(), 255);
        if (videoSize.background_colors.size() > 1) {
            i10 = i0.a.k(videoSize.background_colors.get(1).intValue(), 255);
        } else {
            i10 = 0;
        }
        obj.d = i10;
        if (videoSize.background_colors.size() > 2) {
            i11 = i0.a.k(videoSize.background_colors.get(2).intValue(), 255);
        } else {
            i11 = 0;
        }
        obj.e = i11;
        if (videoSize.background_colors.size() > 3) {
            i12 = i0.a.k(videoSize.background_colors.get(3).intValue(), 255);
        } else {
            i12 = 0;
        }
        obj.f30173f = i12;
        this.f22979a.b(obj, false);
        n0();
        TLRPC.Document document = null;
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            h0(false, ((TLRPC.TL_videoSizeEmojiMarkup) videoSize).emoji_id, null);
        } else {
            TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup = new TLRPC.TL_videoSizeStickerMarkup();
            TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(this.currentAccount).getStickerSet(tL_videoSizeStickerMarkup.stickerset, false);
            if (stickerSet != null) {
                for (int i13 = 0; i13 < stickerSet.documents.size(); i13++) {
                    if (stickerSet.documents.get(i13).f18115id == tL_videoSizeStickerMarkup.sticker_id) {
                        document = stickerSet.documents.get(i13);
                    }
                }
            }
            h0(false, 0L, document);
        }
        this.J.w1(obj);
        this.f22981b.setForUser(true);
    }

    public final void m0(e9 e9Var) {
        y8 backgroundGradient = e9Var.getBackgroundGradient();
        v8 v8Var = this.f22979a;
        if (v8Var == null) {
            return;
        }
        v8Var.b(backgroundGradient, false);
        n0();
        if (e9Var.getAnimatedEmoji() != null) {
            long i10 = e9Var.getAnimatedEmoji().i();
            v8 v8Var2 = this.f22979a;
            v8Var2.f22707a = i10;
            v8Var2.f22709c.setAnimatedEmojiDrawable(new o5(14, this.currentAccount, i10));
        }
        this.J.w1(backgroundGradient);
        this.f22981b.setForUser(false);
    }

    public final void n0() {
        CharSequence charSequence;
        boolean e02 = e0();
        if (this.f22988w != e02) {
            ci.d dVar = this.f22989x;
            this.f22988w = e02;
            if (e02) {
                charSequence = this.v;
            } else {
                charSequence = this.f22987s;
            }
            dVar.g(charSequence, true, true);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.f22985n) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f18435a.T = LocaleController.getString(R.string.PhotoEditorDiscardAlert);
                alertDialog$Builder.f18435a.R = LocaleController.getString(R.string.DiscardChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new o8(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18435a;
                showDialog(b2Var);
                b2Var.h();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), getClassGuid());
    }
}
