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
import org.telegram.ui.ub1;
public final class e9 extends org.telegram.ui.ActionBar.m2 {
    public static final int[][] f23877c0 = {new int[]{-11302949, -11562789, -10430789, -11480359}, new int[]{-11229725, -12014137, -10234219, -10819908}, new int[]{-12927610, -11158198, -3355566, -5191850}, new int[]{-8164117, -5281560, -2200166, -2525971}, new int[]{-1287263, -1350281, -1337532, -885148}, new int[]{-1419145, -1936819, -742839, -1014448}, new int[]{-1017772, -1212871, -998847, -1003446}};
    public static final int[][] f23878d0 = {new int[]{-7035984, -9667705}, new int[]{-1334949, -6199504}, new int[]{-1525432, -4686800}, new int[]{-11117215, -12893369}, new int[]{-15000805, -16777216}, new int[]{-10588271, -12496267}, new int[]{-5344541, -7842635}, new int[]{-5278276, -7777898}, new int[]{-4036162, -7650428}, new int[]{-2459992, -5351279}, new int[]{-1678221, -5814951}, new int[]{-9659148, -10720532}, new int[]{-12149549, -13731672}, new int[]{-12350279, -13802877}, new int[]{-10046854, -13404051}, new int[]{-8276302, -11822442}, new int[]{-10760507, -13200754}, new int[]{-10496401, -13525130}, new int[]{-1668548, -2862189}, new int[]{-9706766, -10062345}, new int[]{-3838476, -10456076}, new int[]{-1324753, -11225016}, new int[]{-10046854, -13404051}, new int[]{-3492512, -7569348}, new int[]{-5394320, -9732780}, new int[]{-7039865, -9408414}, new int[]{-5202023, -7373198}, new int[]{-3701922, -6397115}, new int[]{-4427695, -6859449}, new int[]{-7379371, -9944001}};
    public float E;
    public boolean F;
    public ValueAnimator G;
    public org.telegram.ui.ActionBar.k H;
    public w2 I;
    public b9 J;
    public fd K;
    public boolean L;
    public ValueAnimator M;
    public float N;
    public final Paint O;
    public int P;
    public boolean Q;
    public org.telegram.ui.ActionBar.u0 R;
    public s8 S;
    public final t40 T;
    public boolean U;
    public TextView V;
    public TextView W;
    public final v40 X;
    public a9 Y;
    public boolean Z;
    public x8 f23879a;
    public float f23880a0;
    public y8 f23881b;
    public ValueAnimator f23882b0;
    public int f23883c;
    public int d;
    public View e;
    public boolean f23884f;
    public boolean h;
    public boolean f23885n;
    public ub1 f23886r;
    public CharSequence f23887s;
    public SpannableStringBuilder v;
    public boolean f23888w;
    public ci.d f23889x;
    public FrameLayout f23890y;

    public e9(v40 v40Var, t40 t40Var) {
        super(null);
        this.O = new Paint();
        this.Q = true;
        this.Z = false;
        this.f23880a0 = 0.0f;
        this.X = v40Var;
        this.T = t40Var;
    }

    public static void U(e9 e9Var) {
        if (e9Var.getParentActivity() == null) {
            return;
        }
        if (e9Var.f23885n) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e9Var.getParentActivity());
            alertDialog$Builder.f18662a.T = LocaleController.getString(R.string.PhotoEditorDiscardAlert);
            alertDialog$Builder.f18662a.R = LocaleController.getString(R.string.DiscardChanges);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new q8(e9Var, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18662a;
            e9Var.showDialog(a2Var);
            a2Var.h();
            return;
        }
        e9Var.finishFragment();
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
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        kVar.setTitleColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        this.actionBar.B(org.telegram.ui.ActionBar.h6.w0(null, i10, false), false);
        this.actionBar.A(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19149i6, false), false);
        hg.c.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.PhotoEditor));
        this.actionBar.setActionBarMenuOnItemClick(new v8(this, 0));
        this.actionBar.getTitleTextView().setAlpha(0.0f);
        org.telegram.ui.ActionBar.k kVar2 = new org.telegram.ui.ActionBar.k(getParentActivity(), null);
        this.H = kVar2;
        kVar2.setCastShadows(false);
        this.H.setAddToContainer(false);
        this.H.setOccupyStatusBar(true);
        this.H.setClipChildren(false);
        int k10 = i0.a.k(-1, 60);
        this.H.B(-1, false);
        hg.c.v(false, this.H);
        this.H.setAllowOverlayTitle(false);
        this.H.A(k10, false);
        org.telegram.ui.ActionBar.y n10 = this.H.n();
        n10.setClipChildren(false);
        t40 t40Var = this.T;
        if (t40Var != null && t40Var.f28406c == 2) {
            string = LocaleController.getString(R.string.SuggestPhoto);
        } else {
            string = LocaleController.getString(R.string.SetPhoto);
        }
        org.telegram.ui.ActionBar.u0 e = n10.e(1, string);
        this.R = e;
        e.setBackground(org.telegram.ui.ActionBar.h6.f0(k10, 3, -1));
        this.H.setActionBarMenuOnItemClick(new v8(this, 1));
        this.f23886r = new ub1(this, getParentActivity(), 5);
        w8 w8Var = new w8(this, context);
        w8Var.setFitsSystemWindows(true);
        w8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19004a7, false));
        this.f23886r.setClipChildren(false);
        this.f23886r.setClipToPadding(false);
        this.f23886r.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        this.f23886r.setOrientation(1);
        ub1 ub1Var = this.f23886r;
        x8 x8Var = new x8(this, getParentActivity(), w8Var);
        this.f23879a = x8Var;
        ub1Var.addView(x8Var);
        TextView textView = new TextView(getParentActivity());
        this.W = textView;
        textView.setText(LocaleController.getString(R.string.ChooseBackground));
        TextView textView2 = this.W;
        int i11 = org.telegram.ui.ActionBar.h6.f19443y6;
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
        this.W.setTextSize(1, 14.0f);
        this.W.setGravity(17);
        this.f23886r.addView(this.W, w7.y5.t(-1, -2, 0, 21, 10, 21, 10));
        ai.w7 w7Var = new ai.w7(this, getParentActivity());
        b9 b9Var = new b9(this, getParentActivity());
        this.J = b9Var;
        w7Var.addView(b9Var);
        this.f23886r.addView(w7Var, w7.y5.t(-1, 48, 0, 12, 0, 12, 0));
        TextView textView3 = new TextView(getParentActivity());
        this.V = textView3;
        textView3.setText(LocaleController.getString(R.string.ChooseEmojiOrSticker));
        this.V.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
        this.V.setTextSize(1, 14.0f);
        this.V.setGravity(17);
        this.f23886r.addView(this.V, w7.y5.t(-1, -2, 0, 21, 18, 21, 10));
        y8 y8Var = new y8(this, this, getParentActivity(), getThemedColor(i10));
        this.f23881b = y8Var;
        y8Var.R = true;
        y8Var.setAnimationsEnabled(this.fragmentBeginToShow);
        this.f23881b.setClipChildren(false);
        this.f23886r.addView(this.f23881b, w7.y5.t(-1, -1, 0, 12, 0, 12, 12));
        this.f23886r.setClipChildren(false);
        w8Var.addView(this.f23886r, w7.y5.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 64.0f));
        View view = new View(getParentActivity());
        this.e = view;
        view.setVisibility(8);
        ci.d dVar = new ci.d(context, this.resourceProvider, true);
        this.f23889x = dVar;
        dVar.e();
        this.f23889x.d.o(false, false, false);
        int i12 = this.X.V;
        if (i12 == 1) {
            this.f23887s = LocaleController.getString(R.string.SetChannelPhoto);
        } else if (i12 == 3) {
            this.f23887s = LocaleController.getString(R.string.SetCommunityPhoto);
        } else if (i12 == 2) {
            this.f23887s = LocaleController.getString(R.string.SetGroupPhoto);
        } else if (t40Var != null && t40Var.f28406c == 2) {
            this.f23887s = LocaleController.getString(R.string.SuggestPhoto);
        } else {
            this.f23887s = LocaleController.getString(R.string.SetMyProfilePhotoAvatarConstructor);
        }
        this.f23887s = new SpannableStringBuilder(this.f23887s);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f23887s);
        spannableStringBuilder.append((CharSequence) " l");
        spannableStringBuilder.setSpan(new pq(R.drawable.msg_mini_lock2, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        this.v = spannableStringBuilder;
        this.f23888w = false;
        this.f23889x.g(this.f23887s, false, true);
        this.f23889x.setOnClickListener(new f0(this, 3));
        this.f23890y = new FrameLayout(context);
        w8Var.addView(this.f23889x, w7.y5.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        w8Var.addView(this.f23890y, w7.y5.d(-1, 80.0f, 80, 8.0f, 16.0f, 8.0f, 64.0f));
        w8Var.addView(this.actionBar);
        w8Var.addView(this.H);
        w8Var.addView(this.e, w7.y5.c(-1.0f, -1));
        fd fdVar = new fd(w8Var);
        this.K = fdVar;
        fdVar.h = new p8(this, 0);
        this.fragmentView = w8Var;
        return w8Var;
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
        x8 x8Var = this.f23879a;
        a9 a9Var = x8Var.h;
        if ((a9Var == null || !a9Var.f22633b) && !x8Var.f23539n) {
            return false;
        }
        return true;
    }

    public final void f0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e9.f0():void");
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
            this.f23879a.f23542w = this.E;
            if (Build.VERSION.SDK_INT >= 23) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            }
        }
        this.G.addUpdateListener(new ai.bb(5, this, z11));
        this.G.addListener(new org.telegram.ui.ActionBar.g(this, z10, z11, 2));
        if (z12) {
            this.G.setInterpolator(rr.h);
            this.G.setDuration(350L);
            this.G.setStartDelay(150L);
        } else {
            this.G.setInterpolator(rr.f28031f);
            this.G.setDuration(250L);
        }
        this.G.start();
    }

    public final void h0(boolean z10, long j3, TLRPC.Document document) {
        x8 x8Var = this.f23879a;
        x8Var.f23535a = j3;
        ai.y5 y5Var = x8Var.f23537c;
        x8Var.f23536b = document;
        if (j3 == 0) {
            y5Var.setAnimatedEmojiDrawable(null);
            this.f23879a.f23537c.getImageReceiver().setImage(ImageLocation.getForDocument(document), "100_100", null, null, DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.h6.f19224m6, 0.2f), 0L, "tgs", document, 0);
        } else {
            y5Var.setAnimatedEmojiDrawable(new q5(14, this.currentAccount, j3));
            this.f23879a.f23537c.getImageReceiver().clearImage();
        }
        if (this.f23879a.getImageReceiver() != null && this.f23879a.getImageReceiver().getAnimation() != null) {
            this.f23879a.getImageReceiver().getAnimation().y(0L, true, false);
        }
        if (this.f23879a.getImageReceiver() != null && this.f23879a.getImageReceiver().getLottieAnimation() != null) {
            this.f23879a.getImageReceiver().getLottieAnimation().N(0, false, true);
        }
        this.f23885n = true;
        n0();
    }

    public final void i0(float f7, boolean z10) {
        boolean z11;
        this.E = f7;
        float f10 = ((this.d - this.f23883c) - AndroidUtilities.statusBarHeight) * f7;
        if (this.N == 0.0f) {
            this.f23886r.setTranslationY(f10);
            this.f23889x.setTranslationY(f10);
        }
        this.f23879a.setTranslationY(((-(this.d - this.f23883c)) / 2.0f) * f7);
        this.fragmentView.invalidate();
        if (z10) {
            x8 x8Var = this.f23879a;
            if (f7 > 0.5f) {
                z11 = true;
            } else {
                z11 = false;
            }
            x8Var.setExpanded(z11);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e9.isLightStatusBar():boolean");
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public final void j0(float f7) {
        if (this.f23880a0 != f7) {
            this.f23880a0 = f7;
            int d = i0.a.d(f7, -16777216, -1);
            int k10 = i0.a.k(d, 60);
            this.H.B(d, false);
            this.R.setBackground(org.telegram.ui.ActionBar.h6.f0(k10, 3, -1));
        }
    }

    public final void k0(long j3) {
        x8 x8Var = this.f23879a;
        if (x8Var == 0) {
            return;
        }
        ?? obj = new Object();
        int[] iArr = f23877c0[0];
        obj.f22634c = iArr[0];
        obj.d = iArr[1];
        obj.e = iArr[2];
        obj.f22635f = iArr[3];
        x8Var.b(obj, false);
        n0();
        x8 x8Var2 = this.f23879a;
        x8Var2.f23535a = j3;
        x8Var2.f23537c.setAnimatedEmojiDrawable(new q5(14, this.currentAccount, j3));
        this.J.w1(obj);
        this.f23881b.setForUser(false);
    }

    public final void l0(TLRPC.VideoSize videoSize) {
        int i10;
        int i11;
        int i12;
        ?? obj = new Object();
        obj.f22634c = i0.a.k(videoSize.background_colors.get(0).intValue(), 255);
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
        obj.f22635f = i12;
        this.f23879a.b(obj, false);
        n0();
        TLRPC.Document document = null;
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            h0(false, ((TLRPC.TL_videoSizeEmojiMarkup) videoSize).emoji_id, null);
        } else {
            TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup = new TLRPC.TL_videoSizeStickerMarkup();
            TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(this.currentAccount).getStickerSet(tL_videoSizeStickerMarkup.stickerset, false);
            if (stickerSet != null) {
                for (int i13 = 0; i13 < stickerSet.documents.size(); i13++) {
                    if (stickerSet.documents.get(i13).f18342id == tL_videoSizeStickerMarkup.sticker_id) {
                        document = stickerSet.documents.get(i13);
                    }
                }
            }
            h0(false, 0L, document);
        }
        this.J.w1(obj);
        this.f23881b.setForUser(true);
    }

    public final void m0(g9 g9Var) {
        a9 backgroundGradient = g9Var.getBackgroundGradient();
        x8 x8Var = this.f23879a;
        if (x8Var == null) {
            return;
        }
        x8Var.b(backgroundGradient, false);
        n0();
        if (g9Var.getAnimatedEmoji() != null) {
            long i10 = g9Var.getAnimatedEmoji().i();
            x8 x8Var2 = this.f23879a;
            x8Var2.f23535a = i10;
            x8Var2.f23537c.setAnimatedEmojiDrawable(new q5(14, this.currentAccount, i10));
        }
        this.J.w1(backgroundGradient);
        this.f23881b.setForUser(false);
    }

    public final void n0() {
        CharSequence charSequence;
        boolean e02 = e0();
        if (this.f23888w != e02) {
            ci.d dVar = this.f23889x;
            this.f23888w = e02;
            if (e02) {
                charSequence = this.v;
            } else {
                charSequence = this.f23887s;
            }
            dVar.g(charSequence, true, true);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.f23885n) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f18662a.T = LocaleController.getString(R.string.PhotoEditorDiscardAlert);
                alertDialog$Builder.f18662a.R = LocaleController.getString(R.string.DiscardChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new q8(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18662a;
                showDialog(a2Var);
                a2Var.h();
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
