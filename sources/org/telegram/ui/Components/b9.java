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
import org.telegram.ui.ua1;
public final class b9 extends org.telegram.ui.ActionBar.o2 {
    public static final int[][] Y = {new int[]{-11302949, -11562789, -10430789, -11480359}, new int[]{-11229725, -12014137, -10234219, -10819908}, new int[]{-12927610, -11158198, -3355566, -5191850}, new int[]{-8164117, -5281560, -2200166, -2525971}, new int[]{-1287263, -1350281, -1337532, -885148}, new int[]{-1419145, -1936819, -742839, -1014448}, new int[]{-1017772, -1212871, -998847, -1003446}};
    public static final int[][] Z = {new int[]{-7035984, -9667705}, new int[]{-1334949, -6199504}, new int[]{-1525432, -4686800}, new int[]{-11117215, -12893369}, new int[]{-15000805, -16777216}, new int[]{-10588271, -12496267}, new int[]{-5344541, -7842635}, new int[]{-5278276, -7777898}, new int[]{-4036162, -7650428}, new int[]{-2459992, -5351279}, new int[]{-1678221, -5814951}, new int[]{-9659148, -10720532}, new int[]{-12149549, -13731672}, new int[]{-12350279, -13802877}, new int[]{-10046854, -13404051}, new int[]{-8276302, -11822442}, new int[]{-10760507, -13200754}, new int[]{-10496401, -13525130}, new int[]{-1668548, -2862189}, new int[]{-9706766, -10062345}, new int[]{-3838476, -10456076}, new int[]{-1324753, -11225016}, new int[]{-10046854, -13404051}, new int[]{-3492512, -7569348}, new int[]{-5394320, -9732780}, new int[]{-7039865, -9408414}, new int[]{-5202023, -7373198}, new int[]{-3701922, -6397115}, new int[]{-4427695, -6859449}, new int[]{-7379371, -9944001}};
    public float A;
    public boolean B;
    public ValueAnimator C;
    public org.telegram.ui.ActionBar.l D;
    public j1 E;
    public y8 F;
    public ad G;
    public boolean H;
    public ValueAnimator I;
    public float J;
    public final Paint K;
    public int L;
    public boolean M;
    public org.telegram.ui.ActionBar.w0 N;
    public p8 O;
    public final q40 P;
    public boolean Q;
    public TextView R;
    public TextView S;
    public final s40 T;
    public x8 U;
    public boolean V;
    public float W;
    public ValueAnimator X;
    public u8 f27003a;
    public v8 f27004b;
    public int f27005c;
    public int d;
    public View f27006e;
    public boolean f27007f;
    public boolean h;
    public boolean f27008n;
    public ua1 f27009r;
    public CharSequence f27010s;
    public SpannableStringBuilder v;
    public boolean f27011w;
    public nh.d f27012x;
    public FrameLayout f27013y;

    public b9(s40 s40Var, q40 q40Var) {
        super(null);
        this.K = new Paint();
        this.M = true;
        this.V = false;
        this.W = 0.0f;
        this.T = s40Var;
        this.P = q40Var;
    }

    public static void U(b9 b9Var) {
        if (b9Var.getParentActivity() == null) {
            return;
        }
        if (b9Var.f27008n) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b9Var.getParentActivity());
            alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.PhotoEditorDiscardAlert);
            alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.DiscardChanges);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new o8(b9Var, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
            b9Var.showDialog(c2Var);
            c2Var.h();
            return;
        }
        b9Var.finishFragment();
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
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        lVar.setTitleColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        this.actionBar.C(org.telegram.ui.ActionBar.g6.w0(null, i10, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23152i6, false), false);
        org.telegram.ui.th.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.PhotoEditor));
        this.actionBar.setActionBarMenuOnItemClick(new s8(this, 0));
        this.actionBar.getTitleTextView().setAlpha(0.0f);
        org.telegram.ui.ActionBar.l lVar2 = new org.telegram.ui.ActionBar.l(getParentActivity(), null);
        this.D = lVar2;
        lVar2.setCastShadows(false);
        this.D.setAddToContainer(false);
        this.D.setOccupyStatusBar(true);
        this.D.setClipChildren(false);
        int k9 = i0.a.k(-1, 60);
        this.D.C(-1, false);
        org.telegram.ui.th.y(false, this.D);
        this.D.setAllowOverlayTitle(false);
        this.D.B(k9, false);
        org.telegram.ui.ActionBar.a0 n10 = this.D.n();
        n10.setClipChildren(false);
        q40 q40Var = this.P;
        if (q40Var != null && q40Var.f31854c == 2) {
            string = LocaleController.getString(R.string.SuggestPhoto);
        } else {
            string = LocaleController.getString(R.string.SetPhoto);
        }
        org.telegram.ui.ActionBar.w0 e10 = n10.e(1, string);
        this.N = e10;
        e10.setBackground(org.telegram.ui.ActionBar.g6.f0(k9, 3, -1));
        this.D.setActionBarMenuOnItemClick(new s8(this, 1));
        this.f27009r = new ua1(this, getParentActivity(), 7);
        t8 t8Var = new t8(this, context);
        t8Var.setFitsSystemWindows(true);
        t8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false));
        this.f27009r.setClipChildren(false);
        this.f27009r.setClipToPadding(false);
        this.f27009r.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        this.f27009r.setOrientation(1);
        ua1 ua1Var = this.f27009r;
        u8 u8Var = new u8(this, getParentActivity(), t8Var);
        this.f27003a = u8Var;
        ua1Var.addView(u8Var);
        TextView textView = new TextView(getParentActivity());
        this.S = textView;
        textView.setText(LocaleController.getString(R.string.ChooseBackground));
        TextView textView2 = this.S;
        int i11 = org.telegram.ui.ActionBar.g6.f23433y6;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        this.S.setTextSize(1, 14.0f);
        this.S.setGravity(17);
        this.f27009r.addView(this.S, i7.f6.t(-1, -2, 0, 21, 10, 21, 10));
        bg.z3 z3Var = new bg.z3(this, getParentActivity());
        y8 y8Var = new y8(this, getParentActivity());
        this.F = y8Var;
        z3Var.addView(y8Var);
        this.f27009r.addView(z3Var, i7.f6.t(-1, 48, 0, 12, 0, 12, 0));
        TextView textView3 = new TextView(getParentActivity());
        this.R = textView3;
        textView3.setText(LocaleController.getString(R.string.ChooseEmojiOrSticker));
        this.R.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        this.R.setTextSize(1, 14.0f);
        this.R.setGravity(17);
        this.f27009r.addView(this.R, i7.f6.t(-1, -2, 0, 21, 18, 21, 10));
        v8 v8Var = new v8(this, this, getParentActivity(), getThemedColor(i10));
        this.f27004b = v8Var;
        v8Var.N = true;
        v8Var.setAnimationsEnabled(this.fragmentBeginToShow);
        this.f27004b.setClipChildren(false);
        this.f27009r.addView(this.f27004b, i7.f6.t(-1, -1, 0, 12, 0, 12, 12));
        this.f27009r.setClipChildren(false);
        t8Var.addView(this.f27009r, i7.f6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 64.0f));
        View view = new View(getParentActivity());
        this.f27006e = view;
        view.setVisibility(8);
        nh.d dVar = new nh.d(context, this.resourceProvider, true);
        this.f27012x = dVar;
        dVar.e();
        this.f27012x.d.o(false, false, false);
        int i12 = this.T.R;
        if (i12 == 1) {
            this.f27010s = LocaleController.getString(R.string.SetChannelPhoto);
        } else if (i12 == 3) {
            this.f27010s = LocaleController.getString(R.string.SetCommunityPhoto);
        } else if (i12 == 2) {
            this.f27010s = LocaleController.getString(R.string.SetGroupPhoto);
        } else if (q40Var != null && q40Var.f31854c == 2) {
            this.f27010s = LocaleController.getString(R.string.SuggestPhoto);
        } else {
            this.f27010s = LocaleController.getString(R.string.SetMyProfilePhotoAvatarConstructor);
        }
        this.f27010s = new SpannableStringBuilder(this.f27010s);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f27010s);
        spannableStringBuilder.append((CharSequence) " l");
        spannableStringBuilder.setSpan(new iq(R.drawable.msg_mini_lock2, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        this.v = spannableStringBuilder;
        this.f27011w = false;
        this.f27012x.g(this.f27010s, false, true);
        this.f27012x.setOnClickListener(new h0(this, 3));
        this.f27013y = new FrameLayout(context);
        t8Var.addView(this.f27012x, i7.f6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        t8Var.addView(this.f27013y, i7.f6.d(-1, 80.0f, 80, 8.0f, 16.0f, 8.0f, 64.0f));
        t8Var.addView(this.actionBar);
        t8Var.addView(this.D);
        t8Var.addView(this.f27006e, i7.f6.c(-1.0f, -1));
        ad adVar = new ad(t8Var);
        this.G = adVar;
        adVar.h = new n8(this, 0);
        this.fragmentView = t8Var;
        return t8Var;
    }

    public final void d0() {
        ValueAnimator valueAnimator = this.C;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.C.cancel();
            this.C = null;
        }
    }

    public final boolean e0() {
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            return false;
        }
        u8 u8Var = this.f27003a;
        x8 x8Var = u8Var.h;
        if ((x8Var == null || !x8Var.f34649b) && !u8Var.f26712n) {
            return false;
        }
        return true;
    }

    public final void f0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b9.f0():void");
    }

    public final void g0(boolean z10, boolean z11, boolean z12) {
        float f9;
        if (this.Q) {
            return;
        }
        d0();
        float f10 = this.A;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        this.C = ValueAnimator.ofFloat(f10, f9);
        if (z11) {
            this.f27003a.f26715w = this.A;
            if (Build.VERSION.SDK_INT >= 23) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            }
        }
        this.C.addUpdateListener(new bg.c1(7, this, z11));
        this.C.addListener(new org.telegram.ui.ActionBar.h(this, z10, z11, 2));
        if (z12) {
            this.C.setInterpolator(jr.h);
            this.C.setDuration(350L);
            this.C.setStartDelay(150L);
        } else {
            this.C.setInterpolator(jr.f29800f);
            this.C.setDuration(250L);
        }
        this.C.start();
    }

    public final void h0(boolean z10, long j10, TLRPC.Document document) {
        u8 u8Var = this.f27003a;
        u8Var.f26707a = j10;
        lh.y3 y3Var = u8Var.f26709c;
        u8Var.f26708b = document;
        if (j10 == 0) {
            y3Var.setAnimatedEmojiDrawable(null);
            this.f27003a.f26709c.getImageReceiver().setImage(ImageLocation.getForDocument(document), "100_100", null, null, DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.g6.f23223m6, 0.2f), 0L, "tgs", document, 0);
        } else {
            y3Var.setAnimatedEmojiDrawable(new p5(14, this.currentAccount, j10));
            this.f27003a.f26709c.getImageReceiver().clearImage();
        }
        if (this.f27003a.getImageReceiver() != null && this.f27003a.getImageReceiver().getAnimation() != null) {
            this.f27003a.getImageReceiver().getAnimation().y(0L, true, false);
        }
        if (this.f27003a.getImageReceiver() != null && this.f27003a.getImageReceiver().getLottieAnimation() != null) {
            this.f27003a.getImageReceiver().getLottieAnimation().L(0, false, true);
        }
        this.f27008n = true;
        n0();
    }

    public final void i0(float f9, boolean z10) {
        boolean z11;
        this.A = f9;
        float f10 = ((this.d - this.f27005c) - AndroidUtilities.statusBarHeight) * f9;
        if (this.J == 0.0f) {
            this.f27009r.setTranslationY(f10);
            this.f27012x.setTranslationY(f10);
        }
        this.f27003a.setTranslationY(((-(this.d - this.f27005c)) / 2.0f) * f9);
        this.fragmentView.invalidate();
        if (z10) {
            u8 u8Var = this.f27003a;
            if (f9 > 0.5f) {
                z11 = true;
            } else {
                z11 = false;
            }
            u8Var.setExpanded(z11);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b9.isLightStatusBar():boolean");
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public final void j0(float f9) {
        if (this.W != f9) {
            this.W = f9;
            int d = i0.a.d(f9, -16777216, -1);
            int k9 = i0.a.k(d, 60);
            this.D.C(d, false);
            this.N.setBackground(org.telegram.ui.ActionBar.g6.f0(k9, 3, -1));
        }
    }

    public final void k0(long j10) {
        u8 u8Var = this.f27003a;
        if (u8Var == 0) {
            return;
        }
        ?? obj = new Object();
        int[] iArr = Y[0];
        obj.f34650c = iArr[0];
        obj.d = iArr[1];
        obj.f34651e = iArr[2];
        obj.f34652f = iArr[3];
        u8Var.b(obj, false);
        n0();
        u8 u8Var2 = this.f27003a;
        u8Var2.f26707a = j10;
        u8Var2.f26709c.setAnimatedEmojiDrawable(new p5(14, this.currentAccount, j10));
        this.F.w1(obj);
        this.f27004b.setForUser(false);
    }

    public final void l0(TLRPC.VideoSize videoSize) {
        int i10;
        int i11;
        int i12;
        ?? obj = new Object();
        obj.f34650c = i0.a.k(videoSize.background_colors.get(0).intValue(), 255);
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
        obj.f34651e = i11;
        if (videoSize.background_colors.size() > 3) {
            i12 = i0.a.k(videoSize.background_colors.get(3).intValue(), 255);
        } else {
            i12 = 0;
        }
        obj.f34652f = i12;
        this.f27003a.b(obj, false);
        n0();
        TLRPC.Document document = null;
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            h0(false, ((TLRPC.TL_videoSizeEmojiMarkup) videoSize).emoji_id, null);
        } else {
            TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup = new TLRPC.TL_videoSizeStickerMarkup();
            TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(this.currentAccount).getStickerSet(tL_videoSizeStickerMarkup.stickerset, false);
            if (stickerSet != null) {
                for (int i13 = 0; i13 < stickerSet.documents.size(); i13++) {
                    if (stickerSet.documents.get(i13).f22398id == tL_videoSizeStickerMarkup.sticker_id) {
                        document = stickerSet.documents.get(i13);
                    }
                }
            }
            h0(false, 0L, document);
        }
        this.F.w1(obj);
        this.f27004b.setForUser(true);
    }

    public final void m0(d9 d9Var) {
        x8 backgroundGradient = d9Var.getBackgroundGradient();
        u8 u8Var = this.f27003a;
        if (u8Var == null) {
            return;
        }
        u8Var.b(backgroundGradient, false);
        n0();
        if (d9Var.getAnimatedEmoji() != null) {
            long i10 = d9Var.getAnimatedEmoji().i();
            u8 u8Var2 = this.f27003a;
            u8Var2.f26707a = i10;
            u8Var2.f26709c.setAnimatedEmojiDrawable(new p5(14, this.currentAccount, i10));
        }
        this.F.w1(backgroundGradient);
        this.f27004b.setForUser(false);
    }

    public final void n0() {
        CharSequence charSequence;
        boolean e02 = e0();
        if (this.f27011w != e02) {
            nh.d dVar = this.f27012x;
            this.f27011w = e02;
            if (e02) {
                charSequence = this.v;
            } else {
                charSequence = this.f27010s;
            }
            dVar.g(charSequence, true, true);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.f27008n) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.PhotoEditorDiscardAlert);
                alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.DiscardChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new o8(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                showDialog(c2Var);
                c2Var.h();
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
