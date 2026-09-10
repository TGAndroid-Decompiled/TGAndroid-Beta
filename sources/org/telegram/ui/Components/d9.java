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
import org.telegram.ui.gc1;
public final class d9 extends org.telegram.ui.ActionBar.p2 {
    public static final int[][] f22323c0 = {new int[]{-11302949, -11562789, -10430789, -11480359}, new int[]{-11229725, -12014137, -10234219, -10819908}, new int[]{-12927610, -11158198, -3355566, -5191850}, new int[]{-8164117, -5281560, -2200166, -2525971}, new int[]{-1287263, -1350281, -1337532, -885148}, new int[]{-1419145, -1936819, -742839, -1014448}, new int[]{-1017772, -1212871, -998847, -1003446}};
    public static final int[][] f22324d0 = {new int[]{-7035984, -9667705}, new int[]{-1334949, -6199504}, new int[]{-1525432, -4686800}, new int[]{-11117215, -12893369}, new int[]{-15000805, -16777216}, new int[]{-10588271, -12496267}, new int[]{-5344541, -7842635}, new int[]{-5278276, -7777898}, new int[]{-4036162, -7650428}, new int[]{-2459992, -5351279}, new int[]{-1678221, -5814951}, new int[]{-9659148, -10720532}, new int[]{-12149549, -13731672}, new int[]{-12350279, -13802877}, new int[]{-10046854, -13404051}, new int[]{-8276302, -11822442}, new int[]{-10760507, -13200754}, new int[]{-10496401, -13525130}, new int[]{-1668548, -2862189}, new int[]{-9706766, -10062345}, new int[]{-3838476, -10456076}, new int[]{-1324753, -11225016}, new int[]{-10046854, -13404051}, new int[]{-3492512, -7569348}, new int[]{-5394320, -9732780}, new int[]{-7039865, -9408414}, new int[]{-5202023, -7373198}, new int[]{-3701922, -6397115}, new int[]{-4427695, -6859449}, new int[]{-7379371, -9944001}};
    public float E;
    public boolean F;
    public ValueAnimator G;
    public org.telegram.ui.ActionBar.l H;
    public org.telegram.ui.oe I;
    public a9 J;
    public ed K;
    public boolean L;
    public ValueAnimator M;
    public float N;
    public final Paint O;
    public int P;
    public boolean Q;
    public org.telegram.ui.ActionBar.w0 R;
    public r8 S;
    public final c50 T;
    public boolean U;
    public TextView V;
    public TextView W;
    public final e50 X;
    public z8 Y;
    public boolean Z;
    public w8 f22325a;
    public float f22326a0;
    public x8 f22327b;
    public ValueAnimator f22328b0;
    public int f22329c;
    public int d;
    public View e;
    public boolean f22330f;
    public boolean h;
    public boolean f22331n;
    public gc1 f22332r;
    public CharSequence f22333s;
    public SpannableStringBuilder v;
    public boolean f22334w;
    public bi.d f22335x;
    public FrameLayout f22336y;

    public d9(e50 e50Var, c50 c50Var) {
        super(null);
        this.O = new Paint();
        this.Q = true;
        this.Z = false;
        this.f22326a0 = 0.0f;
        this.X = e50Var;
        this.T = c50Var;
    }

    public static void U(d9 d9Var) {
        if (d9Var.getParentActivity() == null) {
            return;
        }
        if (d9Var.f22331n) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d9Var.getParentActivity());
            alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.PhotoEditorDiscardAlert);
            alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.DiscardChanges);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new q8(d9Var, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
            d9Var.showDialog(d2Var);
            d2Var.h();
            return;
        }
        d9Var.finishFragment();
    }

    @Override
    public final View createView(Context context) {
        String string;
        this.hasOwnBackground = true;
        this.actionBar.setBackgroundDrawable(null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(true);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        lVar.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.actionBar.C(org.telegram.ui.ActionBar.j6.w0(null, i10, false), false);
        this.actionBar.A(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18017i6, false), false);
        com.google.android.gms.internal.vision.e2.t(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.PhotoEditor));
        this.actionBar.setActionBarMenuOnItemClick(new u8(this, 0));
        this.actionBar.getTitleTextView().setAlpha(0.0f);
        org.telegram.ui.ActionBar.l lVar2 = new org.telegram.ui.ActionBar.l(getParentActivity(), null);
        this.H = lVar2;
        lVar2.setCastShadows(false);
        this.H.setAddToContainer(false);
        this.H.setOccupyStatusBar(true);
        this.H.setClipChildren(false);
        int k10 = i0.a.k(-1, 60);
        this.H.C(-1, false);
        com.google.android.gms.internal.vision.e2.t(false, this.H);
        this.H.setAllowOverlayTitle(false);
        this.H.A(k10, false);
        org.telegram.ui.ActionBar.z n10 = this.H.n();
        n10.setClipChildren(false);
        c50 c50Var = this.T;
        if (c50Var != null && c50Var.f21991c == 2) {
            string = LocaleController.getString(R.string.SuggestPhoto);
        } else {
            string = LocaleController.getString(R.string.SetPhoto);
        }
        org.telegram.ui.ActionBar.w0 e = n10.e(1, string);
        this.R = e;
        e.setBackground(org.telegram.ui.ActionBar.j6.f0(k10, 3, -1));
        this.H.setActionBarMenuOnItemClick(new u8(this, 1));
        this.f22332r = new gc1(this, getParentActivity(), 5);
        v8 v8Var = new v8(this, context);
        v8Var.setFitsSystemWindows(true);
        v8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17872a7, false));
        this.f22332r.setClipChildren(false);
        this.f22332r.setClipToPadding(false);
        this.f22332r.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        this.f22332r.setOrientation(1);
        gc1 gc1Var = this.f22332r;
        w8 w8Var = new w8(this, getParentActivity(), v8Var);
        this.f22325a = w8Var;
        gc1Var.addView(w8Var);
        TextView textView = new TextView(getParentActivity());
        this.W = textView;
        textView.setText(LocaleController.getString(R.string.ChooseBackground));
        TextView textView2 = this.W;
        int i11 = org.telegram.ui.ActionBar.j6.f18306y6;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.W.setTextSize(1, 14.0f);
        this.W.setGravity(17);
        this.f22332r.addView(this.W, w7.a6.t(-1, -2, 0, 21, 10, 21, 10));
        bi.w7 w7Var = new bi.w7(this, getParentActivity());
        a9 a9Var = new a9(this, getParentActivity());
        this.J = a9Var;
        w7Var.addView(a9Var);
        this.f22332r.addView(w7Var, w7.a6.t(-1, 48, 0, 12, 0, 12, 0));
        TextView textView3 = new TextView(getParentActivity());
        this.V = textView3;
        textView3.setText(LocaleController.getString(R.string.ChooseEmojiOrSticker));
        this.V.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.V.setTextSize(1, 14.0f);
        this.V.setGravity(17);
        this.f22332r.addView(this.V, w7.a6.t(-1, -2, 0, 21, 18, 21, 10));
        x8 x8Var = new x8(this, this, getParentActivity(), getThemedColor(i10));
        this.f22327b = x8Var;
        x8Var.R = true;
        x8Var.setAnimationsEnabled(this.fragmentBeginToShow);
        this.f22327b.setClipChildren(false);
        this.f22332r.addView(this.f22327b, w7.a6.t(-1, -1, 0, 12, 0, 12, 12));
        this.f22332r.setClipChildren(false);
        v8Var.addView(this.f22332r, w7.a6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 64.0f));
        View view = new View(getParentActivity());
        this.e = view;
        view.setVisibility(8);
        bi.d dVar = new bi.d(context, this.resourceProvider, true);
        this.f22335x = dVar;
        dVar.e();
        this.f22335x.d.o(false, false, false);
        int i12 = this.X.V;
        if (i12 == 1) {
            this.f22333s = LocaleController.getString(R.string.SetChannelPhoto);
        } else if (i12 == 3) {
            this.f22333s = LocaleController.getString(R.string.SetCommunityPhoto);
        } else if (i12 == 2) {
            this.f22333s = LocaleController.getString(R.string.SetGroupPhoto);
        } else if (c50Var != null && c50Var.f21991c == 2) {
            this.f22333s = LocaleController.getString(R.string.SuggestPhoto);
        } else {
            this.f22333s = LocaleController.getString(R.string.SetMyProfilePhotoAvatarConstructor);
        }
        this.f22333s = new SpannableStringBuilder(this.f22333s);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f22333s);
        spannableStringBuilder.append((CharSequence) " l");
        spannableStringBuilder.setSpan(new uq(R.drawable.msg_mini_lock2, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        this.v = spannableStringBuilder;
        this.f22334w = false;
        this.f22335x.g(this.f22333s, false, true);
        this.f22335x.setOnClickListener(new h0(this, 3));
        this.f22336y = new FrameLayout(context);
        v8Var.addView(this.f22335x, w7.a6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        v8Var.addView(this.f22336y, w7.a6.d(-1, 80.0f, 80, 8.0f, 16.0f, 8.0f, 64.0f));
        v8Var.addView(this.actionBar);
        v8Var.addView(this.H);
        v8Var.addView(this.e, w7.a6.c(-1.0f, -1));
        ed edVar = new ed(v8Var);
        this.K = edVar;
        edVar.h = new p8(this, 0);
        this.fragmentView = v8Var;
        return v8Var;
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
        w8 w8Var = this.f22325a;
        z8 z8Var = w8Var.h;
        if ((z8Var == null || !z8Var.f29614b) && !w8Var.f22048n) {
            return false;
        }
        return true;
    }

    public final void f0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d9.f0():void");
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
            this.f22325a.f22051w = this.E;
            if (Build.VERSION.SDK_INT >= 23) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            }
        }
        this.G.addUpdateListener(new bi.m7(4, this, z11));
        this.G.addListener(new org.telegram.ui.ActionBar.g(this, z10, z11, 2));
        if (z12) {
            this.G.setInterpolator(wr.h);
            this.G.setDuration(350L);
            this.G.setStartDelay(150L);
        } else {
            this.G.setInterpolator(wr.f28819f);
            this.G.setDuration(250L);
        }
        this.G.start();
    }

    public final void h0(boolean z10, long j3, TLRPC.Document document) {
        w8 w8Var = this.f22325a;
        w8Var.f22044a = j3;
        gg.i1 i1Var = w8Var.f22046c;
        w8Var.f22045b = document;
        if (j3 == 0) {
            i1Var.setAnimatedEmojiDrawable(null);
            this.f22325a.f22046c.getImageReceiver().setImage(ImageLocation.getForDocument(document), "100_100", null, null, DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.j6.f18091m6, 0.2f), 0L, "tgs", document, 0);
        } else {
            i1Var.setAnimatedEmojiDrawable(new p5(14, this.currentAccount, j3));
            this.f22325a.f22046c.getImageReceiver().clearImage();
        }
        if (this.f22325a.getImageReceiver() != null && this.f22325a.getImageReceiver().getAnimation() != null) {
            this.f22325a.getImageReceiver().getAnimation().y(0L, true, false);
        }
        if (this.f22325a.getImageReceiver() != null && this.f22325a.getImageReceiver().getLottieAnimation() != null) {
            this.f22325a.getImageReceiver().getLottieAnimation().N(0, false, true);
        }
        this.f22331n = true;
        n0();
    }

    public final void i0(float f7, boolean z10) {
        boolean z11;
        this.E = f7;
        float f10 = ((this.d - this.f22329c) - AndroidUtilities.statusBarHeight) * f7;
        if (this.N == 0.0f) {
            this.f22332r.setTranslationY(f10);
            this.f22335x.setTranslationY(f10);
        }
        this.f22325a.setTranslationY(((-(this.d - this.f22329c)) / 2.0f) * f7);
        this.fragmentView.invalidate();
        if (z10) {
            w8 w8Var = this.f22325a;
            if (f7 > 0.5f) {
                z11 = true;
            } else {
                z11 = false;
            }
            w8Var.setExpanded(z11);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d9.isLightStatusBar():boolean");
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public final void j0(float f7) {
        if (this.f22326a0 != f7) {
            this.f22326a0 = f7;
            int d = i0.a.d(f7, -16777216, -1);
            int k10 = i0.a.k(d, 60);
            this.H.C(d, false);
            this.R.setBackground(org.telegram.ui.ActionBar.j6.f0(k10, 3, -1));
        }
    }

    public final void k0(long j3) {
        w8 w8Var = this.f22325a;
        if (w8Var == 0) {
            return;
        }
        ?? obj = new Object();
        int[] iArr = f22323c0[0];
        obj.f29615c = iArr[0];
        obj.d = iArr[1];
        obj.e = iArr[2];
        obj.f29616f = iArr[3];
        w8Var.b(obj, false);
        n0();
        w8 w8Var2 = this.f22325a;
        w8Var2.f22044a = j3;
        w8Var2.f22046c.setAnimatedEmojiDrawable(new p5(14, this.currentAccount, j3));
        this.J.v1(obj);
        this.f22327b.setForUser(false);
    }

    public final void l0(TLRPC.VideoSize videoSize) {
        int i10;
        int i11;
        int i12;
        ?? obj = new Object();
        obj.f29615c = i0.a.k(videoSize.background_colors.get(0).intValue(), 255);
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
        obj.f29616f = i12;
        this.f22325a.b(obj, false);
        n0();
        TLRPC.Document document = null;
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            h0(false, ((TLRPC.TL_videoSizeEmojiMarkup) videoSize).emoji_id, null);
        } else {
            TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup = new TLRPC.TL_videoSizeStickerMarkup();
            TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(this.currentAccount).getStickerSet(tL_videoSizeStickerMarkup.stickerset, false);
            if (stickerSet != null) {
                for (int i13 = 0; i13 < stickerSet.documents.size(); i13++) {
                    if (stickerSet.documents.get(i13).f17201id == tL_videoSizeStickerMarkup.sticker_id) {
                        document = stickerSet.documents.get(i13);
                    }
                }
            }
            h0(false, 0L, document);
        }
        this.J.v1(obj);
        this.f22327b.setForUser(true);
    }

    public final void m0(f9 f9Var) {
        z8 backgroundGradient = f9Var.getBackgroundGradient();
        w8 w8Var = this.f22325a;
        if (w8Var == null) {
            return;
        }
        w8Var.b(backgroundGradient, false);
        n0();
        if (f9Var.getAnimatedEmoji() != null) {
            long i10 = f9Var.getAnimatedEmoji().i();
            w8 w8Var2 = this.f22325a;
            w8Var2.f22044a = i10;
            w8Var2.f22046c.setAnimatedEmojiDrawable(new p5(14, this.currentAccount, i10));
        }
        this.J.v1(backgroundGradient);
        this.f22327b.setForUser(false);
    }

    public final void n0() {
        CharSequence charSequence;
        boolean e02 = e0();
        if (this.f22334w != e02) {
            bi.d dVar = this.f22335x;
            this.f22334w = e02;
            if (e02) {
                charSequence = this.v;
            } else {
                charSequence = this.f22333s;
            }
            dVar.g(charSequence, true, true);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.f22331n) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.PhotoEditorDiscardAlert);
                alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.DiscardChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new q8(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                showDialog(d2Var);
                d2Var.h();
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
