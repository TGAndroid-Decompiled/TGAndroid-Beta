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
import org.telegram.ui.ic1;
public final class h9 extends org.telegram.ui.ActionBar.m2 {
    public static final int[][] f25207c0 = {new int[]{-11302949, -11562789, -10430789, -11480359}, new int[]{-11229725, -12014137, -10234219, -10819908}, new int[]{-12927610, -11158198, -3355566, -5191850}, new int[]{-8164117, -5281560, -2200166, -2525971}, new int[]{-1287263, -1350281, -1337532, -885148}, new int[]{-1419145, -1936819, -742839, -1014448}, new int[]{-1017772, -1212871, -998847, -1003446}};
    public static final int[][] f25208d0 = {new int[]{-7035984, -9667705}, new int[]{-1334949, -6199504}, new int[]{-1525432, -4686800}, new int[]{-11117215, -12893369}, new int[]{-15000805, -16777216}, new int[]{-10588271, -12496267}, new int[]{-5344541, -7842635}, new int[]{-5278276, -7777898}, new int[]{-4036162, -7650428}, new int[]{-2459992, -5351279}, new int[]{-1678221, -5814951}, new int[]{-9659148, -10720532}, new int[]{-12149549, -13731672}, new int[]{-12350279, -13802877}, new int[]{-10046854, -13404051}, new int[]{-8276302, -11822442}, new int[]{-10760507, -13200754}, new int[]{-10496401, -13525130}, new int[]{-1668548, -2862189}, new int[]{-9706766, -10062345}, new int[]{-3838476, -10456076}, new int[]{-1324753, -11225016}, new int[]{-10046854, -13404051}, new int[]{-3492512, -7569348}, new int[]{-5394320, -9732780}, new int[]{-7039865, -9408414}, new int[]{-5202023, -7373198}, new int[]{-3701922, -6397115}, new int[]{-4427695, -6859449}, new int[]{-7379371, -9944001}};
    public float E;
    public boolean F;
    public ValueAnimator G;
    public org.telegram.ui.ActionBar.k H;
    public u2 I;
    public e9 J;
    public hd K;
    public boolean L;
    public ValueAnimator M;
    public float N;
    public final Paint O;
    public int P;
    public boolean Q;
    public org.telegram.ui.ActionBar.u0 R;
    public v8 S;
    public final g50 T;
    public boolean U;
    public TextView V;
    public TextView W;
    public final i50 X;
    public d9 Y;
    public boolean Z;
    public a9 f25209a;
    public float f25210a0;
    public b9 f25211b;
    public ValueAnimator f25212b0;
    public int f25213c;
    public int d;
    public View e;
    public boolean f25214f;
    public boolean h;
    public boolean f25215n;
    public ic1 f25216r;
    public CharSequence f25217s;
    public SpannableStringBuilder v;
    public boolean f25218w;
    public di.d f25219x;
    public FrameLayout f25220y;

    public h9(i50 i50Var, g50 g50Var) {
        super(null);
        this.O = new Paint();
        this.Q = true;
        this.Z = false;
        this.f25210a0 = 0.0f;
        this.X = i50Var;
        this.T = g50Var;
    }

    public static void U(h9 h9Var) {
        if (h9Var.getParentActivity() == null) {
            return;
        }
        if (h9Var.f25215n) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h9Var.getParentActivity());
            alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.PhotoEditorDiscardAlert);
            alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.DiscardChanges);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new u8(h9Var, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
            h9Var.showDialog(a2Var);
            a2Var.h();
            return;
        }
        h9Var.finishFragment();
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
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        kVar.setTitleColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
        this.actionBar.D(org.telegram.ui.ActionBar.g6.x0(null, i10, false), false);
        this.actionBar.C(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19690i6, false), false);
        i2.d.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.PhotoEditor));
        this.actionBar.setActionBarMenuOnItemClick(new y8(this, 0));
        this.actionBar.getTitleTextView().setAlpha(0.0f);
        org.telegram.ui.ActionBar.k kVar2 = new org.telegram.ui.ActionBar.k(getParentActivity(), null);
        this.H = kVar2;
        kVar2.setCastShadows(false);
        this.H.setAddToContainer(false);
        this.H.setOccupyStatusBar(true);
        this.H.setClipChildren(false);
        int k10 = i0.a.k(-1, 60);
        this.H.D(-1, false);
        i2.d.y(false, this.H);
        this.H.setAllowOverlayTitle(false);
        this.H.C(k10, false);
        org.telegram.ui.ActionBar.y n10 = this.H.n();
        n10.setClipChildren(false);
        g50 g50Var = this.T;
        if (g50Var != null && g50Var.f24882c == 2) {
            string = LocaleController.getString(R.string.SuggestPhoto);
        } else {
            string = LocaleController.getString(R.string.SetPhoto);
        }
        org.telegram.ui.ActionBar.u0 e = n10.e(1, string);
        this.R = e;
        e.setBackground(org.telegram.ui.ActionBar.g6.g0(k10, 3, -1));
        this.H.setActionBarMenuOnItemClick(new y8(this, 1));
        this.f25216r = new ic1(this, getParentActivity(), 5);
        z8 z8Var = new z8(this, context);
        z8Var.setFitsSystemWindows(true);
        z8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19543a7, false));
        this.f25216r.setClipChildren(false);
        this.f25216r.setClipToPadding(false);
        this.f25216r.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        this.f25216r.setOrientation(1);
        ic1 ic1Var = this.f25216r;
        a9 a9Var = new a9(this, getParentActivity(), z8Var);
        this.f25209a = a9Var;
        ic1Var.addView(a9Var);
        TextView textView = new TextView(getParentActivity());
        this.W = textView;
        textView.setText(LocaleController.getString(R.string.ChooseBackground));
        TextView textView2 = this.W;
        int i11 = org.telegram.ui.ActionBar.g6.f19988y6;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
        this.W.setTextSize(1, 14.0f);
        this.W.setGravity(17);
        this.f25216r.addView(this.W, w7.z5.t(-1, -2, 0, 21, 10, 21, 10));
        bi.i7 i7Var = new bi.i7(this, getParentActivity());
        e9 e9Var = new e9(this, getParentActivity());
        this.J = e9Var;
        i7Var.addView(e9Var);
        this.f25216r.addView(i7Var, w7.z5.t(-1, 48, 0, 12, 0, 12, 0));
        TextView textView3 = new TextView(getParentActivity());
        this.V = textView3;
        textView3.setText(LocaleController.getString(R.string.ChooseEmojiOrSticker));
        this.V.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
        this.V.setTextSize(1, 14.0f);
        this.V.setGravity(17);
        this.f25216r.addView(this.V, w7.z5.t(-1, -2, 0, 21, 18, 21, 10));
        b9 b9Var = new b9(this, this, getParentActivity(), getThemedColor(i10));
        this.f25211b = b9Var;
        b9Var.R = true;
        b9Var.setAnimationsEnabled(this.fragmentBeginToShow);
        this.f25211b.setClipChildren(false);
        this.f25216r.addView(this.f25211b, w7.z5.t(-1, -1, 0, 12, 0, 12, 12));
        this.f25216r.setClipChildren(false);
        z8Var.addView(this.f25216r, w7.z5.a(-1.0f, 0.0f, 0.0f, 0.0f, 64.0f, -1, 0));
        View view = new View(getParentActivity());
        this.e = view;
        view.setVisibility(8);
        di.d dVar = new di.d(context, this.resourceProvider, true);
        this.f25219x = dVar;
        dVar.e();
        this.f25219x.d.r(false, false);
        int i12 = this.X.V;
        if (i12 == 1) {
            this.f25217s = LocaleController.getString(R.string.SetChannelPhoto);
        } else if (i12 == 3) {
            this.f25217s = LocaleController.getString(R.string.SetCommunityPhoto);
        } else if (i12 == 2) {
            this.f25217s = LocaleController.getString(R.string.SetGroupPhoto);
        } else if (g50Var != null && g50Var.f24882c == 2) {
            this.f25217s = LocaleController.getString(R.string.SuggestPhoto);
        } else {
            this.f25217s = LocaleController.getString(R.string.SetMyProfilePhotoAvatarConstructor);
        }
        this.f25217s = new SpannableStringBuilder(this.f25217s);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f25217s);
        spannableStringBuilder.append((CharSequence) " l");
        spannableStringBuilder.setSpan(new br(R.drawable.msg_mini_lock2, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        this.v = spannableStringBuilder;
        this.f25218w = false;
        this.f25219x.g(this.f25217s, false, true);
        this.f25219x.setOnClickListener(new f0(this, 2));
        this.f25220y = new FrameLayout(context);
        z8Var.addView(this.f25219x, w7.z5.a(48.0f, 16.0f, 16.0f, 16.0f, 16.0f, -1, 80));
        z8Var.addView(this.f25220y, w7.z5.a(80.0f, 8.0f, 16.0f, 8.0f, 64.0f, -1, 80));
        z8Var.addView(this.actionBar);
        z8Var.addView(this.H);
        z8Var.addView(this.e, w7.z5.d(-1.0f, -1));
        hd hdVar = new hd(z8Var);
        this.K = hdVar;
        hdVar.h = new t8(this, 0);
        this.fragmentView = z8Var;
        return z8Var;
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
        a9 a9Var = this.f25209a;
        d9 d9Var = a9Var.h;
        if ((d9Var == null || !d9Var.f24013b) && !a9Var.f24924n) {
            return false;
        }
        return true;
    }

    public final void f0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h9.f0():void");
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
            this.f25209a.f24927w = this.E;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        this.G.addUpdateListener(new ah.k0(6, this, z11));
        this.G.addListener(new org.telegram.ui.ActionBar.g(this, z10, z11, 2));
        if (z12) {
            this.G.setInterpolator(es.h);
            this.G.setDuration(350L);
            this.G.setStartDelay(150L);
        } else {
            this.G.setInterpolator(es.f24465f);
            this.G.setDuration(250L);
        }
        this.G.start();
    }

    public final void h0(boolean z10, long j10, TLRPC.Document document) {
        a9 a9Var = this.f25209a;
        a9Var.f24920a = j10;
        bi.k5 k5Var = a9Var.f24922c;
        a9Var.f24921b = document;
        if (j10 == 0) {
            k5Var.setAnimatedEmojiDrawable(null);
            this.f25209a.f24922c.getImageReceiver().setImage(ImageLocation.getForDocument(document), "100_100", null, null, DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.g6.f19764m6, 0.2f), 0L, "tgs", document, 0);
        } else {
            k5Var.setAnimatedEmojiDrawable(new s5(14, this.currentAccount, j10));
            this.f25209a.f24922c.getImageReceiver().clearImage();
        }
        if (this.f25209a.getImageReceiver() != null && this.f25209a.getImageReceiver().getAnimation() != null) {
            this.f25209a.getImageReceiver().getAnimation().y(0L, true, false);
        }
        if (this.f25209a.getImageReceiver() != null && this.f25209a.getImageReceiver().getLottieAnimation() != null) {
            this.f25209a.getImageReceiver().getLottieAnimation().N(0, false, true);
        }
        this.f25215n = true;
        n0();
    }

    public final void i0(float f7, boolean z10) {
        boolean z11;
        this.E = f7;
        float f10 = ((this.d - this.f25213c) - AndroidUtilities.statusBarHeight) * f7;
        if (this.N == 0.0f) {
            this.f25216r.setTranslationY(f10);
            this.f25219x.setTranslationY(f10);
        }
        this.f25209a.setTranslationY(((-(this.d - this.f25213c)) / 2.0f) * f7);
        this.fragmentView.invalidate();
        if (z10) {
            a9 a9Var = this.f25209a;
            if (f7 > 0.5f) {
                z11 = true;
            } else {
                z11 = false;
            }
            a9Var.setExpanded(z11);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h9.isLightStatusBar():boolean");
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public final void j0(float f7) {
        if (this.f25210a0 != f7) {
            this.f25210a0 = f7;
            int d = i0.a.d(f7, -16777216, -1);
            int k10 = i0.a.k(d, 60);
            this.H.D(d, false);
            this.R.setBackground(org.telegram.ui.ActionBar.g6.g0(k10, 3, -1));
        }
    }

    public final void k0(long j10) {
        a9 a9Var = this.f25209a;
        if (a9Var == 0) {
            return;
        }
        ?? obj = new Object();
        int[] iArr = f25207c0[0];
        obj.f24014c = iArr[0];
        obj.d = iArr[1];
        obj.e = iArr[2];
        obj.f24015f = iArr[3];
        a9Var.b(obj, false);
        n0();
        a9 a9Var2 = this.f25209a;
        a9Var2.f24920a = j10;
        a9Var2.f24922c.setAnimatedEmojiDrawable(new s5(14, this.currentAccount, j10));
        this.J.x1(obj);
        this.f25211b.setForUser(false);
    }

    public final void l0(TLRPC.VideoSize videoSize) {
        int i10;
        int i11;
        int i12;
        ?? obj = new Object();
        obj.f24014c = i0.a.k(videoSize.background_colors.get(0).intValue(), 255);
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
        obj.f24015f = i12;
        this.f25209a.b(obj, false);
        n0();
        TLRPC.Document document = null;
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            h0(false, ((TLRPC.TL_videoSizeEmojiMarkup) videoSize).emoji_id, null);
        } else {
            TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup = new TLRPC.TL_videoSizeStickerMarkup();
            TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(this.currentAccount).getStickerSet(tL_videoSizeStickerMarkup.stickerset, false);
            if (stickerSet != null) {
                for (int i13 = 0; i13 < stickerSet.documents.size(); i13++) {
                    if (stickerSet.documents.get(i13).f18922id == tL_videoSizeStickerMarkup.sticker_id) {
                        document = stickerSet.documents.get(i13);
                    }
                }
            }
            h0(false, 0L, document);
        }
        this.J.x1(obj);
        this.f25211b.setForUser(true);
    }

    public final void m0(j9 j9Var) {
        d9 backgroundGradient = j9Var.getBackgroundGradient();
        a9 a9Var = this.f25209a;
        if (a9Var == null) {
            return;
        }
        a9Var.b(backgroundGradient, false);
        n0();
        if (j9Var.getAnimatedEmoji() != null) {
            long i10 = j9Var.getAnimatedEmoji().i();
            a9 a9Var2 = this.f25209a;
            a9Var2.f24920a = i10;
            a9Var2.f24922c.setAnimatedEmojiDrawable(new s5(14, this.currentAccount, i10));
        }
        this.J.x1(backgroundGradient);
        this.f25211b.setForUser(false);
    }

    public final void n0() {
        CharSequence charSequence;
        boolean e02 = e0();
        if (this.f25218w != e02) {
            di.d dVar = this.f25219x;
            this.f25218w = e02;
            if (e02) {
                charSequence = this.v;
            } else {
                charSequence = this.f25217s;
            }
            dVar.g(charSequence, true, true);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.f25215n) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.PhotoEditorDiscardAlert);
                alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.DiscardChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new u8(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
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
