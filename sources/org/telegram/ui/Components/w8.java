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
import org.telegram.ui.hb1;
public final class w8 extends org.telegram.ui.ActionBar.p2 {
    public static final int[][] Z = {new int[]{-11302949, -11562789, -10430789, -11480359}, new int[]{-11229725, -12014137, -10234219, -10819908}, new int[]{-12927610, -11158198, -3355566, -5191850}, new int[]{-8164117, -5281560, -2200166, -2525971}, new int[]{-1287263, -1350281, -1337532, -885148}, new int[]{-1419145, -1936819, -742839, -1014448}, new int[]{-1017772, -1212871, -998847, -1003446}};
    public static final int[][] f30264a0 = {new int[]{-7035984, -9667705}, new int[]{-1334949, -6199504}, new int[]{-1525432, -4686800}, new int[]{-11117215, -12893369}, new int[]{-15000805, -16777216}, new int[]{-10588271, -12496267}, new int[]{-5344541, -7842635}, new int[]{-5278276, -7777898}, new int[]{-4036162, -7650428}, new int[]{-2459992, -5351279}, new int[]{-1678221, -5814951}, new int[]{-9659148, -10720532}, new int[]{-12149549, -13731672}, new int[]{-12350279, -13802877}, new int[]{-10046854, -13404051}, new int[]{-8276302, -11822442}, new int[]{-10760507, -13200754}, new int[]{-10496401, -13525130}, new int[]{-1668548, -2862189}, new int[]{-9706766, -10062345}, new int[]{-3838476, -10456076}, new int[]{-1324753, -11225016}, new int[]{-10046854, -13404051}, new int[]{-3492512, -7569348}, new int[]{-5394320, -9732780}, new int[]{-7039865, -9408414}, new int[]{-5202023, -7373198}, new int[]{-3701922, -6397115}, new int[]{-4427695, -6859449}, new int[]{-7379371, -9944001}};
    public float B;
    public boolean C;
    public ValueAnimator D;
    public org.telegram.ui.ActionBar.k E;
    public o1 F;
    public t8 G;
    public xc H;
    public boolean I;
    public ValueAnimator J;
    public float K;
    public final Paint L;
    public int M;
    public boolean N;
    public org.telegram.ui.ActionBar.w0 O;
    public k8 P;
    public final u40 Q;
    public boolean R;
    public TextView S;
    public TextView T;
    public final w40 U;
    public s8 V;
    public boolean W;
    public float X;
    public ValueAnimator Y;
    public p8 f30265a;
    public q8 f30266b;
    public int f30267c;
    public int d;
    public View e;
    public boolean f30268f;
    public boolean h;
    public boolean f30269n;
    public hb1 f30270r;
    public CharSequence f30271s;
    public SpannableStringBuilder v;
    public boolean f30272w;
    public ph.d f30273x;
    public FrameLayout f30274y;

    public w8(w40 w40Var, u40 u40Var) {
        super(null);
        this.L = new Paint();
        this.N = true;
        this.W = false;
        this.X = 0.0f;
        this.U = w40Var;
        this.Q = u40Var;
    }

    public static void U(w8 w8Var) {
        if (w8Var.getParentActivity() == null) {
            return;
        }
        if (w8Var.f30269n) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(w8Var.getParentActivity());
            alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.PhotoEditorDiscardAlert);
            alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.DiscardChanges);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new j8(w8Var, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
            w8Var.showDialog(d2Var);
            d2Var.h();
            return;
        }
        w8Var.finishFragment();
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
        this.actionBar.B(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19996i6, false), false);
        org.telegram.ui.yh.z(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.PhotoEditor));
        this.actionBar.setActionBarMenuOnItemClick(new n8(this, 0));
        this.actionBar.getTitleTextView().setAlpha(0.0f);
        org.telegram.ui.ActionBar.k kVar2 = new org.telegram.ui.ActionBar.k(getParentActivity(), null);
        this.E = kVar2;
        kVar2.setCastShadows(false);
        this.E.setAddToContainer(false);
        this.E.setOccupyStatusBar(true);
        this.E.setClipChildren(false);
        int k10 = i0.a.k(-1, 60);
        this.E.C(-1, false);
        org.telegram.ui.yh.z(false, this.E);
        this.E.setAllowOverlayTitle(false);
        this.E.B(k10, false);
        org.telegram.ui.ActionBar.z n10 = this.E.n();
        n10.setClipChildren(false);
        u40 u40Var = this.Q;
        if (u40Var != null && u40Var.f29106c == 2) {
            string = LocaleController.getString(R.string.SuggestPhoto);
        } else {
            string = LocaleController.getString(R.string.SetPhoto);
        }
        org.telegram.ui.ActionBar.w0 e = n10.e(1, string);
        this.O = e;
        e.setBackground(org.telegram.ui.ActionBar.j6.f0(k10, 3, -1));
        this.E.setActionBarMenuOnItemClick(new n8(this, 1));
        this.f30270r = new hb1(this, getParentActivity(), 6);
        o8 o8Var = new o8(this, context);
        o8Var.setFitsSystemWindows(true);
        o8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19852a7, false));
        this.f30270r.setClipChildren(false);
        this.f30270r.setClipToPadding(false);
        this.f30270r.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        this.f30270r.setOrientation(1);
        hb1 hb1Var = this.f30270r;
        p8 p8Var = new p8(this, getParentActivity(), o8Var);
        this.f30265a = p8Var;
        hb1Var.addView(p8Var);
        TextView textView = new TextView(getParentActivity());
        this.T = textView;
        textView.setText(LocaleController.getString(R.string.ChooseBackground));
        TextView textView2 = this.T;
        int i11 = org.telegram.ui.ActionBar.j6.f20281y6;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.T.setTextSize(1, 14.0f);
        this.T.setGravity(17);
        this.f30270r.addView(this.T, k7.b6.t(-1, -2, 0, 21, 10, 21, 10));
        dg.v3 v3Var = new dg.v3(this, getParentActivity());
        t8 t8Var = new t8(this, getParentActivity());
        this.G = t8Var;
        v3Var.addView(t8Var);
        this.f30270r.addView(v3Var, k7.b6.t(-1, 48, 0, 12, 0, 12, 0));
        TextView textView3 = new TextView(getParentActivity());
        this.S = textView3;
        textView3.setText(LocaleController.getString(R.string.ChooseEmojiOrSticker));
        this.S.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.S.setTextSize(1, 14.0f);
        this.S.setGravity(17);
        this.f30270r.addView(this.S, k7.b6.t(-1, -2, 0, 21, 18, 21, 10));
        q8 q8Var = new q8(this, this, getParentActivity(), getThemedColor(i10));
        this.f30266b = q8Var;
        q8Var.O = true;
        q8Var.setAnimationsEnabled(this.fragmentBeginToShow);
        this.f30266b.setClipChildren(false);
        this.f30270r.addView(this.f30266b, k7.b6.t(-1, -1, 0, 12, 0, 12, 12));
        this.f30270r.setClipChildren(false);
        o8Var.addView(this.f30270r, k7.b6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 64.0f));
        View view = new View(getParentActivity());
        this.e = view;
        view.setVisibility(8);
        ph.d dVar = new ph.d(context, this.resourceProvider, true);
        this.f30273x = dVar;
        dVar.e();
        this.f30273x.d.o(false, false, false);
        int i12 = this.U.S;
        if (i12 == 1) {
            this.f30271s = LocaleController.getString(R.string.SetChannelPhoto);
        } else if (i12 == 3) {
            this.f30271s = LocaleController.getString(R.string.SetCommunityPhoto);
        } else if (i12 == 2) {
            this.f30271s = LocaleController.getString(R.string.SetGroupPhoto);
        } else if (u40Var != null && u40Var.f29106c == 2) {
            this.f30271s = LocaleController.getString(R.string.SuggestPhoto);
        } else {
            this.f30271s = LocaleController.getString(R.string.SetMyProfilePhotoAvatarConstructor);
        }
        this.f30271s = new SpannableStringBuilder(this.f30271s);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f30271s);
        spannableStringBuilder.append((CharSequence) " l");
        spannableStringBuilder.setSpan(new mq(R.drawable.msg_mini_lock2, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        this.v = spannableStringBuilder;
        this.f30272w = false;
        this.f30273x.g(this.f30271s, false, true);
        this.f30273x.setOnClickListener(new g0(this, 3));
        this.f30274y = new FrameLayout(context);
        o8Var.addView(this.f30273x, k7.b6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        o8Var.addView(this.f30274y, k7.b6.d(-1, 80.0f, 80, 8.0f, 16.0f, 8.0f, 64.0f));
        o8Var.addView(this.actionBar);
        o8Var.addView(this.E);
        o8Var.addView(this.e, k7.b6.c(-1.0f, -1));
        xc xcVar = new xc(o8Var);
        this.H = xcVar;
        xcVar.h = new i8(this, 0);
        this.fragmentView = o8Var;
        return o8Var;
    }

    public final void d0() {
        ValueAnimator valueAnimator = this.D;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.D.cancel();
            this.D = null;
        }
    }

    public final boolean e0() {
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            return false;
        }
        p8 p8Var = this.f30265a;
        s8 s8Var = p8Var.h;
        if ((s8Var == null || !s8Var.f28666b) && !p8Var.f29383n) {
            return false;
        }
        return true;
    }

    public final void f0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.w8.f0():void");
    }

    public final void g0(boolean z4, boolean z10, boolean z11) {
        float f10;
        if (this.R) {
            return;
        }
        d0();
        float f11 = this.B;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.D = ValueAnimator.ofFloat(f11, f10);
        if (z10) {
            this.f30265a.f29386w = this.B;
            if (Build.VERSION.SDK_INT >= 23) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            }
        }
        this.D.addUpdateListener(new dg.b1(6, this, z10));
        this.D.addListener(new org.telegram.ui.ActionBar.g(this, z4, z10, 2));
        if (z11) {
            this.D.setInterpolator(nr.h);
            this.D.setDuration(350L);
            this.D.setStartDelay(150L);
        } else {
            this.D.setInterpolator(nr.f27346f);
            this.D.setDuration(250L);
        }
        this.D.start();
    }

    public final void h0(boolean z4, long j10, TLRPC.Document document) {
        p8 p8Var = this.f30265a;
        p8Var.f29379a = j10;
        nh.y3 y3Var = p8Var.f29381c;
        p8Var.f29380b = document;
        if (j10 == 0) {
            y3Var.setAnimatedEmojiDrawable(null);
            this.f30265a.f29381c.getImageReceiver().setImage(ImageLocation.getForDocument(document), "100_100", null, null, DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.j6.f20067m6, 0.2f), 0L, "tgs", document, 0);
        } else {
            y3Var.setAnimatedEmojiDrawable(new l5(14, this.currentAccount, j10));
            this.f30265a.f29381c.getImageReceiver().clearImage();
        }
        if (this.f30265a.getImageReceiver() != null && this.f30265a.getImageReceiver().getAnimation() != null) {
            this.f30265a.getImageReceiver().getAnimation().y(0L, true, false);
        }
        if (this.f30265a.getImageReceiver() != null && this.f30265a.getImageReceiver().getLottieAnimation() != null) {
            this.f30265a.getImageReceiver().getLottieAnimation().L(0, false, true);
        }
        this.f30269n = true;
        n0();
    }

    public final void i0(float f10, boolean z4) {
        boolean z10;
        this.B = f10;
        float f11 = ((this.d - this.f30267c) - AndroidUtilities.statusBarHeight) * f10;
        if (this.K == 0.0f) {
            this.f30270r.setTranslationY(f11);
            this.f30273x.setTranslationY(f11);
        }
        this.f30265a.setTranslationY(((-(this.d - this.f30267c)) / 2.0f) * f10);
        this.fragmentView.invalidate();
        if (z4) {
            p8 p8Var = this.f30265a;
            if (f10 > 0.5f) {
                z10 = true;
            } else {
                z10 = false;
            }
            p8Var.setExpanded(z10);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.w8.isLightStatusBar():boolean");
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public final void j0(float f10) {
        if (this.X != f10) {
            this.X = f10;
            int d = i0.a.d(f10, -16777216, -1);
            int k10 = i0.a.k(d, 60);
            this.E.C(d, false);
            this.O.setBackground(org.telegram.ui.ActionBar.j6.f0(k10, 3, -1));
        }
    }

    public final void k0(long j10) {
        p8 p8Var = this.f30265a;
        if (p8Var == 0) {
            return;
        }
        ?? obj = new Object();
        int[] iArr = Z[0];
        obj.f28667c = iArr[0];
        obj.d = iArr[1];
        obj.e = iArr[2];
        obj.f28668f = iArr[3];
        p8Var.b(obj, false);
        n0();
        p8 p8Var2 = this.f30265a;
        p8Var2.f29379a = j10;
        p8Var2.f29381c.setAnimatedEmojiDrawable(new l5(14, this.currentAccount, j10));
        this.G.w1(obj);
        this.f30266b.setForUser(false);
    }

    public final void l0(TLRPC.VideoSize videoSize) {
        int i10;
        int i11;
        int i12;
        ?? obj = new Object();
        obj.f28667c = i0.a.k(videoSize.background_colors.get(0).intValue(), 255);
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
        obj.f28668f = i12;
        this.f30265a.b(obj, false);
        n0();
        TLRPC.Document document = null;
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            h0(false, ((TLRPC.TL_videoSizeEmojiMarkup) videoSize).emoji_id, null);
        } else {
            TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup = new TLRPC.TL_videoSizeStickerMarkup();
            TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(this.currentAccount).getStickerSet(tL_videoSizeStickerMarkup.stickerset, false);
            if (stickerSet != null) {
                for (int i13 = 0; i13 < stickerSet.documents.size(); i13++) {
                    if (stickerSet.documents.get(i13).f19190id == tL_videoSizeStickerMarkup.sticker_id) {
                        document = stickerSet.documents.get(i13);
                    }
                }
            }
            h0(false, 0L, document);
        }
        this.G.w1(obj);
        this.f30266b.setForUser(true);
    }

    public final void m0(y8 y8Var) {
        s8 backgroundGradient = y8Var.getBackgroundGradient();
        p8 p8Var = this.f30265a;
        if (p8Var == null) {
            return;
        }
        p8Var.b(backgroundGradient, false);
        n0();
        if (y8Var.getAnimatedEmoji() != null) {
            long i10 = y8Var.getAnimatedEmoji().i();
            p8 p8Var2 = this.f30265a;
            p8Var2.f29379a = i10;
            p8Var2.f29381c.setAnimatedEmojiDrawable(new l5(14, this.currentAccount, i10));
        }
        this.G.w1(backgroundGradient);
        this.f30266b.setForUser(false);
    }

    public final void n0() {
        CharSequence charSequence;
        boolean e02 = e0();
        if (this.f30272w != e02) {
            ph.d dVar = this.f30273x;
            this.f30272w = e02;
            if (e02) {
                charSequence = this.v;
            } else {
                charSequence = this.f30271s;
            }
            dVar.g(charSequence, true, true);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        if (this.f30269n) {
            if (z4) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.PhotoEditorDiscardAlert);
                alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.DiscardChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new j8(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
                showDialog(d2Var);
                d2Var.h();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z4);
    }

    @Override
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), getClassGuid());
    }
}
