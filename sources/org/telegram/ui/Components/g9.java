package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
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
public final class g9 extends org.telegram.ui.ActionBar.m2 {
    public static final int[][] f26685c0 = {new int[]{-11302949, -11562789, -10430789, -11480359}, new int[]{-11229725, -12014137, -10234219, -10819908}, new int[]{-12927610, -11158198, -3355566, -5191850}, new int[]{-8164117, -5281560, -2200166, -2525971}, new int[]{-1287263, -1350281, -1337532, -885148}, new int[]{-1419145, -1936819, -742839, -1014448}, new int[]{-1017772, -1212871, -998847, -1003446}};
    public static final int[][] f26686d0 = {new int[]{-7035984, -9667705}, new int[]{-1334949, -6199504}, new int[]{-1525432, -4686800}, new int[]{-11117215, -12893369}, new int[]{-15000805, -16777216}, new int[]{-10588271, -12496267}, new int[]{-5344541, -7842635}, new int[]{-5278276, -7777898}, new int[]{-4036162, -7650428}, new int[]{-2459992, -5351279}, new int[]{-1678221, -5814951}, new int[]{-9659148, -10720532}, new int[]{-12149549, -13731672}, new int[]{-12350279, -13802877}, new int[]{-10046854, -13404051}, new int[]{-8276302, -11822442}, new int[]{-10760507, -13200754}, new int[]{-10496401, -13525130}, new int[]{-1668548, -2862189}, new int[]{-9706766, -10062345}, new int[]{-3838476, -10456076}, new int[]{-1324753, -11225016}, new int[]{-10046854, -13404051}, new int[]{-3492512, -7569348}, new int[]{-5394320, -9732780}, new int[]{-7039865, -9408414}, new int[]{-5202023, -7373198}, new int[]{-3701922, -6397115}, new int[]{-4427695, -6859449}, new int[]{-7379371, -9944001}};
    public float E;
    public boolean F;
    public ValueAnimator G;
    public org.telegram.ui.ActionBar.k H;
    public y2 I;
    public d9 J;
    public id K;
    public boolean L;
    public ValueAnimator M;
    public float N;
    public final Paint O;
    public int P;
    public boolean Q;
    public org.telegram.ui.ActionBar.u0 R;
    public u8 S;
    public final l50 T;
    public boolean U;
    public TextView V;
    public TextView W;
    public final n50 X;
    public c9 Y;
    public boolean Z;
    public z8 f26687a;
    public float f26688a0;
    public a9 f26689b;
    public ValueAnimator f26690b0;
    public int f26691c;
    public int d;
    public View f26692e;
    public boolean f26693f;
    public boolean h;
    public boolean f26694n;
    public cc1 f26695r;
    public CharSequence f26696s;
    public SpannableStringBuilder v;
    public boolean f26697w;
    public ci.d f26698x;
    public FrameLayout f26699y;

    public g9(n50 n50Var, l50 l50Var) {
        super(null);
        this.O = new Paint();
        this.Q = true;
        this.Z = false;
        this.f26688a0 = 0.0f;
        this.X = n50Var;
        this.T = l50Var;
    }

    public static void U(g9 g9Var) {
        if (g9Var.getParentActivity() == null) {
            return;
        }
        if (g9Var.f26694n) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g9Var.getParentActivity());
            alertDialog$Builder.f20404a.T = LocaleController.getString(R.string.PhotoEditorDiscardAlert);
            alertDialog$Builder.f20404a.R = LocaleController.getString(R.string.DiscardChanges);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new s8(g9Var, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20404a;
            g9Var.showDialog(a2Var);
            a2Var.h();
            return;
        }
        g9Var.finishFragment();
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
        kVar.setTitleColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        this.actionBar.D(org.telegram.ui.ActionBar.h6.x0(null, i10, false), false);
        this.actionBar.C(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20913i6, false), false);
        hg.c.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.PhotoEditor));
        this.actionBar.setActionBarMenuOnItemClick(new x8(this, 0));
        this.actionBar.getTitleTextView().setAlpha(0.0f);
        org.telegram.ui.ActionBar.k kVar2 = new org.telegram.ui.ActionBar.k(getParentActivity(), null);
        this.H = kVar2;
        kVar2.setCastShadows(false);
        this.H.setAddToContainer(false);
        this.H.setOccupyStatusBar(true);
        this.H.setClipChildren(false);
        int k10 = i0.a.k(-1, 60);
        this.H.D(-1, false);
        hg.c.v(false, this.H);
        this.H.setAllowOverlayTitle(false);
        this.H.C(k10, false);
        org.telegram.ui.ActionBar.y o9 = this.H.o();
        o9.setClipChildren(false);
        l50 l50Var = this.T;
        if (l50Var != null && l50Var.f28204c == 2) {
            string = LocaleController.getString(R.string.SuggestPhoto);
        } else {
            string = LocaleController.getString(R.string.SetPhoto);
        }
        org.telegram.ui.ActionBar.u0 e7 = o9.e(1, string);
        this.R = e7;
        e7.setBackground(org.telegram.ui.ActionBar.h6.g0(k10, 3, -1));
        this.H.setActionBarMenuOnItemClick(new x8(this, 1));
        this.f26695r = new cc1(this, getParentActivity(), 5);
        y8 y8Var = new y8(this, context);
        y8Var.setFitsSystemWindows(true);
        y8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20766a7, false));
        this.f26695r.setClipChildren(false);
        this.f26695r.setClipToPadding(false);
        this.f26695r.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        this.f26695r.setOrientation(1);
        cc1 cc1Var = this.f26695r;
        z8 z8Var = new z8(this, getParentActivity(), y8Var);
        this.f26687a = z8Var;
        cc1Var.addView(z8Var);
        TextView textView = new TextView(getParentActivity());
        this.W = textView;
        textView.setText(LocaleController.getString(R.string.ChooseBackground));
        TextView textView2 = this.W;
        int i11 = org.telegram.ui.ActionBar.h6.f21207y6;
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        this.W.setTextSize(1, 14.0f);
        this.W.setGravity(17);
        this.f26695r.addView(this.W, w7.x5.t(-1, -2, 0, 21, 10, 21, 10));
        ai.x7 x7Var = new ai.x7(this, getParentActivity());
        d9 d9Var = new d9(this, getParentActivity());
        this.J = d9Var;
        x7Var.addView(d9Var);
        this.f26695r.addView(x7Var, w7.x5.t(-1, 48, 0, 12, 0, 12, 0));
        TextView textView3 = new TextView(getParentActivity());
        this.V = textView3;
        textView3.setText(LocaleController.getString(R.string.ChooseEmojiOrSticker));
        this.V.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        this.V.setTextSize(1, 14.0f);
        this.V.setGravity(17);
        this.f26695r.addView(this.V, w7.x5.t(-1, -2, 0, 21, 18, 21, 10));
        a9 a9Var = new a9(this, this, getParentActivity(), getThemedColor(i10));
        this.f26689b = a9Var;
        a9Var.R = true;
        a9Var.setAnimationsEnabled(this.fragmentBeginToShow);
        this.f26689b.setClipChildren(false);
        this.f26695r.addView(this.f26689b, w7.x5.t(-1, -1, 0, 12, 0, 12, 12));
        this.f26695r.setClipChildren(false);
        y8Var.addView(this.f26695r, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 64.0f, -1, 0));
        View view = new View(getParentActivity());
        this.f26692e = view;
        view.setVisibility(8);
        ci.d dVar = new ci.d(context, this.resourceProvider, true);
        this.f26698x = dVar;
        dVar.e();
        this.f26698x.d.r(false, false);
        int i12 = this.X.V;
        if (i12 == 1) {
            this.f26696s = LocaleController.getString(R.string.SetChannelPhoto);
        } else if (i12 == 3) {
            this.f26696s = LocaleController.getString(R.string.SetCommunityPhoto);
        } else if (i12 == 2) {
            this.f26696s = LocaleController.getString(R.string.SetGroupPhoto);
        } else if (l50Var != null && l50Var.f28204c == 2) {
            this.f26696s = LocaleController.getString(R.string.SuggestPhoto);
        } else {
            this.f26696s = LocaleController.getString(R.string.SetMyProfilePhotoAvatarConstructor);
        }
        this.f26696s = new SpannableStringBuilder(this.f26696s);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f26696s);
        spannableStringBuilder.append((CharSequence) " l");
        spannableStringBuilder.setSpan(new er(R.drawable.msg_mini_lock2, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        this.v = spannableStringBuilder;
        this.f26697w = false;
        this.f26698x.g(this.f26696s, false, true);
        this.f26698x.setOnClickListener(new f0(this, 2));
        this.f26699y = new FrameLayout(context);
        y8Var.addView(this.f26698x, w7.x5.a(48.0f, 16.0f, 16.0f, 16.0f, 16.0f, -1, 80));
        y8Var.addView(this.f26699y, w7.x5.a(80.0f, 8.0f, 16.0f, 8.0f, 64.0f, -1, 80));
        y8Var.addView(this.actionBar);
        y8Var.addView(this.H);
        y8Var.addView(this.f26692e, w7.x5.d(-1.0f, -1));
        id idVar = new id(y8Var);
        this.K = idVar;
        idVar.h = new r8(this, 0);
        this.fragmentView = y8Var;
        return y8Var;
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
        z8 z8Var = this.f26687a;
        c9 c9Var = z8Var.h;
        if ((c9Var == null || !c9Var.f25263b) && !z8Var.f26392n) {
            return false;
        }
        return true;
    }

    public final void f0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g9.f0():void");
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
            this.f26687a.f26395w = this.E;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        this.G.addUpdateListener(new ai.cb(5, this, z11));
        this.G.addListener(new org.telegram.ui.ActionBar.g(this, z10, z11, 2));
        if (z12) {
            this.G.setInterpolator(is.h);
            this.G.setDuration(350L);
            this.G.setStartDelay(150L);
        } else {
            this.G.setInterpolator(is.f27500f);
            this.G.setDuration(250L);
        }
        this.G.start();
    }

    public final void h0(boolean z10, long j3, TLRPC.Document document) {
        z8 z8Var = this.f26687a;
        z8Var.f26387a = j3;
        ai.z5 z5Var = z8Var.f26389c;
        z8Var.f26388b = document;
        if (j3 == 0) {
            z5Var.setAnimatedEmojiDrawable(null);
            this.f26687a.f26389c.getImageReceiver().setImage(ImageLocation.getForDocument(document), "100_100", null, null, DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.h6.f20987m6, 0.2f), 0L, "tgs", document, 0);
        } else {
            z5Var.setAnimatedEmojiDrawable(new s5(14, this.currentAccount, j3));
            this.f26687a.f26389c.getImageReceiver().clearImage();
        }
        if (this.f26687a.getImageReceiver() != null && this.f26687a.getImageReceiver().getAnimation() != null) {
            this.f26687a.getImageReceiver().getAnimation().y(0L, true, false);
        }
        if (this.f26687a.getImageReceiver() != null && this.f26687a.getImageReceiver().getLottieAnimation() != null) {
            this.f26687a.getImageReceiver().getLottieAnimation().N(0, false, true);
        }
        this.f26694n = true;
        n0();
    }

    public final void i0(float f7, boolean z10) {
        boolean z11;
        this.E = f7;
        float f10 = ((this.d - this.f26691c) - AndroidUtilities.statusBarHeight) * f7;
        if (this.N == 0.0f) {
            this.f26695r.setTranslationY(f10);
            this.f26698x.setTranslationY(f10);
        }
        this.f26687a.setTranslationY(((-(this.d - this.f26691c)) / 2.0f) * f7);
        this.fragmentView.invalidate();
        if (z10) {
            z8 z8Var = this.f26687a;
            if (f7 > 0.5f) {
                z11 = true;
            } else {
                z11 = false;
            }
            z8Var.setExpanded(z11);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g9.isLightStatusBar():boolean");
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public final void j0(float f7) {
        if (this.f26688a0 != f7) {
            this.f26688a0 = f7;
            int d = i0.a.d(f7, -16777216, -1);
            int k10 = i0.a.k(d, 60);
            this.H.D(d, false);
            this.R.setBackground(org.telegram.ui.ActionBar.h6.g0(k10, 3, -1));
        }
    }

    public final void k0(long j3) {
        z8 z8Var = this.f26687a;
        if (z8Var == 0) {
            return;
        }
        ?? obj = new Object();
        int[] iArr = f26685c0[0];
        obj.f25264c = iArr[0];
        obj.d = iArr[1];
        obj.f25265e = iArr[2];
        obj.f25266f = iArr[3];
        z8Var.b(obj, false);
        n0();
        z8 z8Var2 = this.f26687a;
        z8Var2.f26387a = j3;
        z8Var2.f26389c.setAnimatedEmojiDrawable(new s5(14, this.currentAccount, j3));
        this.J.x1(obj);
        this.f26689b.setForUser(false);
    }

    public final void l0(TLRPC.VideoSize videoSize) {
        int i10;
        int i11;
        int i12;
        ?? obj = new Object();
        obj.f25264c = i0.a.k(videoSize.background_colors.get(0).intValue(), 255);
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
        obj.f25265e = i11;
        if (videoSize.background_colors.size() > 3) {
            i12 = i0.a.k(videoSize.background_colors.get(3).intValue(), 255);
        } else {
            i12 = 0;
        }
        obj.f25266f = i12;
        this.f26687a.b(obj, false);
        n0();
        TLRPC.Document document = null;
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            h0(false, ((TLRPC.TL_videoSizeEmojiMarkup) videoSize).emoji_id, null);
        } else {
            TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup = new TLRPC.TL_videoSizeStickerMarkup();
            TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(this.currentAccount).getStickerSet(tL_videoSizeStickerMarkup.stickerset, false);
            if (stickerSet != null) {
                for (int i13 = 0; i13 < stickerSet.documents.size(); i13++) {
                    if (stickerSet.documents.get(i13).f20074id == tL_videoSizeStickerMarkup.sticker_id) {
                        document = stickerSet.documents.get(i13);
                    }
                }
            }
            h0(false, 0L, document);
        }
        this.J.x1(obj);
        this.f26689b.setForUser(true);
    }

    public final void m0(i9 i9Var) {
        c9 backgroundGradient = i9Var.getBackgroundGradient();
        z8 z8Var = this.f26687a;
        if (z8Var == null) {
            return;
        }
        z8Var.b(backgroundGradient, false);
        n0();
        if (i9Var.getAnimatedEmoji() != null) {
            long i10 = i9Var.getAnimatedEmoji().i();
            z8 z8Var2 = this.f26687a;
            z8Var2.f26387a = i10;
            z8Var2.f26389c.setAnimatedEmojiDrawable(new s5(14, this.currentAccount, i10));
        }
        this.J.x1(backgroundGradient);
        this.f26689b.setForUser(false);
    }

    public final void n0() {
        CharSequence charSequence;
        boolean e02 = e0();
        if (this.f26697w != e02) {
            ci.d dVar = this.f26698x;
            this.f26697w = e02;
            if (e02) {
                charSequence = this.v;
            } else {
                charSequence = this.f26696s;
            }
            dVar.g(charSequence, true, true);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.f26694n) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f20404a.T = LocaleController.getString(R.string.PhotoEditorDiscardAlert);
                alertDialog$Builder.f20404a.R = LocaleController.getString(R.string.DiscardChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new s8(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20404a;
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
