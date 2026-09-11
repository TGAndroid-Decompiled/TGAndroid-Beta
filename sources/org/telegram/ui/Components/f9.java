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
public final class f9 extends org.telegram.ui.ActionBar.n2 {
    public static final int[][] f25962c0 = {new int[]{-11302949, -11562789, -10430789, -11480359}, new int[]{-11229725, -12014137, -10234219, -10819908}, new int[]{-12927610, -11158198, -3355566, -5191850}, new int[]{-8164117, -5281560, -2200166, -2525971}, new int[]{-1287263, -1350281, -1337532, -885148}, new int[]{-1419145, -1936819, -742839, -1014448}, new int[]{-1017772, -1212871, -998847, -1003446}};
    public static final int[][] f25963d0 = {new int[]{-7035984, -9667705}, new int[]{-1334949, -6199504}, new int[]{-1525432, -4686800}, new int[]{-11117215, -12893369}, new int[]{-15000805, -16777216}, new int[]{-10588271, -12496267}, new int[]{-5344541, -7842635}, new int[]{-5278276, -7777898}, new int[]{-4036162, -7650428}, new int[]{-2459992, -5351279}, new int[]{-1678221, -5814951}, new int[]{-9659148, -10720532}, new int[]{-12149549, -13731672}, new int[]{-12350279, -13802877}, new int[]{-10046854, -13404051}, new int[]{-8276302, -11822442}, new int[]{-10760507, -13200754}, new int[]{-10496401, -13525130}, new int[]{-1668548, -2862189}, new int[]{-9706766, -10062345}, new int[]{-3838476, -10456076}, new int[]{-1324753, -11225016}, new int[]{-10046854, -13404051}, new int[]{-3492512, -7569348}, new int[]{-5394320, -9732780}, new int[]{-7039865, -9408414}, new int[]{-5202023, -7373198}, new int[]{-3701922, -6397115}, new int[]{-4427695, -6859449}, new int[]{-7379371, -9944001}};
    public float E;
    public boolean F;
    public ValueAnimator G;
    public org.telegram.ui.ActionBar.k H;
    public b3 I;
    public c9 J;
    public gd K;
    public boolean L;
    public ValueAnimator M;
    public float N;
    public final Paint O;
    public int P;
    public boolean Q;
    public org.telegram.ui.ActionBar.v0 R;
    public t8 S;
    public final s40 T;
    public boolean U;
    public TextView V;
    public TextView W;
    public final u40 X;
    public b9 Y;
    public boolean Z;
    public y8 f25964a;
    public float f25965a0;
    public z8 f25966b;
    public ValueAnimator f25967b0;
    public int f25968c;
    public int d;
    public View f25969e;
    public boolean f25970f;
    public boolean h;
    public boolean f25971n;
    public cc1 f25972r;
    public CharSequence f25973s;
    public SpannableStringBuilder v;
    public boolean f25974w;
    public di.d f25975x;
    public FrameLayout f25976y;

    public f9(u40 u40Var, s40 s40Var) {
        super(null);
        this.O = new Paint();
        this.Q = true;
        this.Z = false;
        this.f25965a0 = 0.0f;
        this.X = u40Var;
        this.T = s40Var;
    }

    public static void U(f9 f9Var) {
        if (f9Var.getParentActivity() == null) {
            return;
        }
        if (f9Var.f25971n) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f9Var.getParentActivity());
            alertDialog$Builder.f20198a.T = LocaleController.getString(R.string.PhotoEditorDiscardAlert);
            alertDialog$Builder.f20198a.R = LocaleController.getString(R.string.DiscardChanges);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new s8(f9Var, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
            f9Var.showDialog(b2Var);
            b2Var.h();
            return;
        }
        f9Var.finishFragment();
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
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        kVar.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.actionBar.C(org.telegram.ui.ActionBar.j6.w0(null, i10, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20753i6, false), false);
        i2.g.x(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.PhotoEditor));
        this.actionBar.setActionBarMenuOnItemClick(new w8(this, 0));
        this.actionBar.getTitleTextView().setAlpha(0.0f);
        org.telegram.ui.ActionBar.k kVar2 = new org.telegram.ui.ActionBar.k(getParentActivity(), null);
        this.H = kVar2;
        kVar2.setCastShadows(false);
        this.H.setAddToContainer(false);
        this.H.setOccupyStatusBar(true);
        this.H.setClipChildren(false);
        int k10 = i0.a.k(-1, 60);
        this.H.C(-1, false);
        i2.g.x(false, this.H);
        this.H.setAllowOverlayTitle(false);
        this.H.B(k10, false);
        org.telegram.ui.ActionBar.z n10 = this.H.n();
        n10.setClipChildren(false);
        s40 s40Var = this.T;
        if (s40Var != null && s40Var.f30188c == 2) {
            string = LocaleController.getString(R.string.SuggestPhoto);
        } else {
            string = LocaleController.getString(R.string.SetPhoto);
        }
        org.telegram.ui.ActionBar.v0 e7 = n10.e(1, string);
        this.R = e7;
        e7.setBackground(org.telegram.ui.ActionBar.j6.f0(k10, 3, -1));
        this.H.setActionBarMenuOnItemClick(new w8(this, 1));
        this.f25972r = new cc1(this, getParentActivity(), 5);
        x8 x8Var = new x8(this, context);
        x8Var.setFitsSystemWindows(true);
        x8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20607a7, false));
        this.f25972r.setClipChildren(false);
        this.f25972r.setClipToPadding(false);
        this.f25972r.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        this.f25972r.setOrientation(1);
        cc1 cc1Var = this.f25972r;
        y8 y8Var = new y8(this, getParentActivity(), x8Var);
        this.f25964a = y8Var;
        cc1Var.addView(y8Var);
        TextView textView = new TextView(getParentActivity());
        this.W = textView;
        textView.setText(LocaleController.getString(R.string.ChooseBackground));
        TextView textView2 = this.W;
        int i11 = org.telegram.ui.ActionBar.j6.f21042y6;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.W.setTextSize(1, 14.0f);
        this.W.setGravity(17);
        this.f25972r.addView(this.W, w7.x5.t(-1, -2, 0, 21, 10, 21, 10));
        bi.e7 e7Var = new bi.e7(this, getParentActivity());
        c9 c9Var = new c9(this, getParentActivity());
        this.J = c9Var;
        e7Var.addView(c9Var);
        this.f25972r.addView(e7Var, w7.x5.t(-1, 48, 0, 12, 0, 12, 0));
        TextView textView3 = new TextView(getParentActivity());
        this.V = textView3;
        textView3.setText(LocaleController.getString(R.string.ChooseEmojiOrSticker));
        this.V.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.V.setTextSize(1, 14.0f);
        this.V.setGravity(17);
        this.f25972r.addView(this.V, w7.x5.t(-1, -2, 0, 21, 18, 21, 10));
        z8 z8Var = new z8(this, this, getParentActivity(), getThemedColor(i10));
        this.f25966b = z8Var;
        z8Var.R = true;
        z8Var.setAnimationsEnabled(this.fragmentBeginToShow);
        this.f25966b.setClipChildren(false);
        this.f25972r.addView(this.f25966b, w7.x5.t(-1, -1, 0, 12, 0, 12, 12));
        this.f25972r.setClipChildren(false);
        x8Var.addView(this.f25972r, w7.x5.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 64.0f));
        View view = new View(getParentActivity());
        this.f25969e = view;
        view.setVisibility(8);
        di.d dVar = new di.d(context, this.resourceProvider, true);
        this.f25975x = dVar;
        dVar.e();
        this.f25975x.d.o(false, false, false);
        int i12 = this.X.V;
        if (i12 == 1) {
            this.f25973s = LocaleController.getString(R.string.SetChannelPhoto);
        } else if (i12 == 3) {
            this.f25973s = LocaleController.getString(R.string.SetCommunityPhoto);
        } else if (i12 == 2) {
            this.f25973s = LocaleController.getString(R.string.SetGroupPhoto);
        } else if (s40Var != null && s40Var.f30188c == 2) {
            this.f25973s = LocaleController.getString(R.string.SuggestPhoto);
        } else {
            this.f25973s = LocaleController.getString(R.string.SetMyProfilePhotoAvatarConstructor);
        }
        this.f25973s = new SpannableStringBuilder(this.f25973s);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f25973s);
        spannableStringBuilder.append((CharSequence) " l");
        spannableStringBuilder.setSpan(new nq(R.drawable.msg_mini_lock2, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        this.v = spannableStringBuilder;
        this.f25974w = false;
        this.f25975x.g(this.f25973s, false, true);
        this.f25975x.setOnClickListener(new g0(this, 3));
        this.f25976y = new FrameLayout(context);
        x8Var.addView(this.f25975x, w7.x5.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        x8Var.addView(this.f25976y, w7.x5.d(-1, 80.0f, 80, 8.0f, 16.0f, 8.0f, 64.0f));
        x8Var.addView(this.actionBar);
        x8Var.addView(this.H);
        x8Var.addView(this.f25969e, w7.x5.c(-1.0f, -1));
        gd gdVar = new gd(x8Var);
        this.K = gdVar;
        gdVar.h = new r8(this, 0);
        this.fragmentView = x8Var;
        return x8Var;
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
        y8 y8Var = this.f25964a;
        b9 b9Var = y8Var.h;
        if ((b9Var == null || !b9Var.f24600b) && !y8Var.f25610n) {
            return false;
        }
        return true;
    }

    public final void f0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f9.f0():void");
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
            this.f25964a.f25613w = this.E;
            if (Build.VERSION.SDK_INT >= 23) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            }
        }
        this.G.addUpdateListener(new ah.l0(6, this, z11));
        this.G.addListener(new org.telegram.ui.ActionBar.g(this, z10, z11, 2));
        if (z12) {
            this.G.setInterpolator(pr.h);
            this.G.setDuration(350L);
            this.G.setStartDelay(150L);
        } else {
            this.G.setInterpolator(pr.f29466f);
            this.G.setDuration(250L);
        }
        this.G.start();
    }

    public final void h0(boolean z10, long j3, TLRPC.Document document) {
        y8 y8Var = this.f25964a;
        y8Var.f25605a = j3;
        bi.i5 i5Var = y8Var.f25607c;
        y8Var.f25606b = document;
        if (j3 == 0) {
            i5Var.setAnimatedEmojiDrawable(null);
            this.f25964a.f25607c.getImageReceiver().setImage(ImageLocation.getForDocument(document), "100_100", null, null, DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.j6.f20827m6, 0.2f), 0L, "tgs", document, 0);
        } else {
            i5Var.setAnimatedEmojiDrawable(new q5(14, this.currentAccount, j3));
            this.f25964a.f25607c.getImageReceiver().clearImage();
        }
        if (this.f25964a.getImageReceiver() != null && this.f25964a.getImageReceiver().getAnimation() != null) {
            this.f25964a.getImageReceiver().getAnimation().y(0L, true, false);
        }
        if (this.f25964a.getImageReceiver() != null && this.f25964a.getImageReceiver().getLottieAnimation() != null) {
            this.f25964a.getImageReceiver().getLottieAnimation().L(0, false, true);
        }
        this.f25971n = true;
        n0();
    }

    public final void i0(float f7, boolean z10) {
        boolean z11;
        this.E = f7;
        float f10 = ((this.d - this.f25968c) - AndroidUtilities.statusBarHeight) * f7;
        if (this.N == 0.0f) {
            this.f25972r.setTranslationY(f10);
            this.f25975x.setTranslationY(f10);
        }
        this.f25964a.setTranslationY(((-(this.d - this.f25968c)) / 2.0f) * f7);
        this.fragmentView.invalidate();
        if (z10) {
            y8 y8Var = this.f25964a;
            if (f7 > 0.5f) {
                z11 = true;
            } else {
                z11 = false;
            }
            y8Var.setExpanded(z11);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f9.isLightStatusBar():boolean");
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public final void j0(float f7) {
        if (this.f25965a0 != f7) {
            this.f25965a0 = f7;
            int d = i0.a.d(f7, -16777216, -1);
            int k10 = i0.a.k(d, 60);
            this.H.C(d, false);
            this.R.setBackground(org.telegram.ui.ActionBar.j6.f0(k10, 3, -1));
        }
    }

    public final void k0(long j3) {
        y8 y8Var = this.f25964a;
        if (y8Var == 0) {
            return;
        }
        ?? obj = new Object();
        int[] iArr = f25962c0[0];
        obj.f24601c = iArr[0];
        obj.d = iArr[1];
        obj.f24602e = iArr[2];
        obj.f24603f = iArr[3];
        y8Var.b(obj, false);
        n0();
        y8 y8Var2 = this.f25964a;
        y8Var2.f25605a = j3;
        y8Var2.f25607c.setAnimatedEmojiDrawable(new q5(14, this.currentAccount, j3));
        this.J.v1(obj);
        this.f25966b.setForUser(false);
    }

    public final void l0(TLRPC.VideoSize videoSize) {
        int i10;
        int i11;
        int i12;
        ?? obj = new Object();
        obj.f24601c = i0.a.k(videoSize.background_colors.get(0).intValue(), 255);
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
        obj.f24602e = i11;
        if (videoSize.background_colors.size() > 3) {
            i12 = i0.a.k(videoSize.background_colors.get(3).intValue(), 255);
        } else {
            i12 = 0;
        }
        obj.f24603f = i12;
        this.f25964a.b(obj, false);
        n0();
        TLRPC.Document document = null;
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            h0(false, ((TLRPC.TL_videoSizeEmojiMarkup) videoSize).emoji_id, null);
        } else {
            TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup = new TLRPC.TL_videoSizeStickerMarkup();
            TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(this.currentAccount).getStickerSet(tL_videoSizeStickerMarkup.stickerset, false);
            if (stickerSet != null) {
                for (int i13 = 0; i13 < stickerSet.documents.size(); i13++) {
                    if (stickerSet.documents.get(i13).f19875id == tL_videoSizeStickerMarkup.sticker_id) {
                        document = stickerSet.documents.get(i13);
                    }
                }
            }
            h0(false, 0L, document);
        }
        this.J.v1(obj);
        this.f25966b.setForUser(true);
    }

    public final void m0(h9 h9Var) {
        b9 backgroundGradient = h9Var.getBackgroundGradient();
        y8 y8Var = this.f25964a;
        if (y8Var == null) {
            return;
        }
        y8Var.b(backgroundGradient, false);
        n0();
        if (h9Var.getAnimatedEmoji() != null) {
            long i10 = h9Var.getAnimatedEmoji().i();
            y8 y8Var2 = this.f25964a;
            y8Var2.f25605a = i10;
            y8Var2.f25607c.setAnimatedEmojiDrawable(new q5(14, this.currentAccount, i10));
        }
        this.J.v1(backgroundGradient);
        this.f25966b.setForUser(false);
    }

    public final void n0() {
        CharSequence charSequence;
        boolean e02 = e0();
        if (this.f25974w != e02) {
            di.d dVar = this.f25975x;
            this.f25974w = e02;
            if (e02) {
                charSequence = this.v;
            } else {
                charSequence = this.f25973s;
            }
            dVar.g(charSequence, true, true);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.f25971n) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f20198a.T = LocaleController.getString(R.string.PhotoEditorDiscardAlert);
                alertDialog$Builder.f20198a.R = LocaleController.getString(R.string.DiscardChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new s8(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
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
