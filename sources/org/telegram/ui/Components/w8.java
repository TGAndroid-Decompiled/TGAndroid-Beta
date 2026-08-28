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
import org.telegram.ui.ta1;
public final class w8 extends org.telegram.ui.ActionBar.o2 {
    public static final int[][] Y = {new int[]{-11302949, -11562789, -10430789, -11480359}, new int[]{-11229725, -12014137, -10234219, -10819908}, new int[]{-12927610, -11158198, -3355566, -5191850}, new int[]{-8164117, -5281560, -2200166, -2525971}, new int[]{-1287263, -1350281, -1337532, -885148}, new int[]{-1419145, -1936819, -742839, -1014448}, new int[]{-1017772, -1212871, -998847, -1003446}};
    public static final int[][] Z = {new int[]{-7035984, -9667705}, new int[]{-1334949, -6199504}, new int[]{-1525432, -4686800}, new int[]{-11117215, -12893369}, new int[]{-15000805, -16777216}, new int[]{-10588271, -12496267}, new int[]{-5344541, -7842635}, new int[]{-5278276, -7777898}, new int[]{-4036162, -7650428}, new int[]{-2459992, -5351279}, new int[]{-1678221, -5814951}, new int[]{-9659148, -10720532}, new int[]{-12149549, -13731672}, new int[]{-12350279, -13802877}, new int[]{-10046854, -13404051}, new int[]{-8276302, -11822442}, new int[]{-10760507, -13200754}, new int[]{-10496401, -13525130}, new int[]{-1668548, -2862189}, new int[]{-9706766, -10062345}, new int[]{-3838476, -10456076}, new int[]{-1324753, -11225016}, new int[]{-10046854, -13404051}, new int[]{-3492512, -7569348}, new int[]{-5394320, -9732780}, new int[]{-7039865, -9408414}, new int[]{-5202023, -7373198}, new int[]{-3701922, -6397115}, new int[]{-4427695, -6859449}, new int[]{-7379371, -9944001}};
    public float A;
    public boolean B;
    public ValueAnimator C;
    public org.telegram.ui.ActionBar.k D;
    public g1 E;
    public t8 F;
    public wc G;
    public boolean H;
    public ValueAnimator I;
    public float J;
    public final Paint K;
    public int L;
    public boolean M;
    public org.telegram.ui.ActionBar.w0 N;
    public k8 O;
    public final c40 P;
    public boolean Q;
    public TextView R;
    public TextView S;
    public final e40 T;
    public s8 U;
    public boolean V;
    public float W;
    public ValueAnimator X;
    public p8 f34138a;
    public q8 f34139b;
    public int f34140c;
    public int d;
    public View f34141e;
    public boolean f34142f;
    public boolean h;
    public boolean f34143n;
    public ta1 f34144r;
    public CharSequence f34145s;
    public SpannableStringBuilder v;
    public boolean f34146w;
    public kh.d f34147x;
    public FrameLayout f34148y;

    public w8(e40 e40Var, c40 c40Var) {
        super(null);
        this.K = new Paint();
        this.M = true;
        this.V = false;
        this.W = 0.0f;
        this.T = e40Var;
        this.P = c40Var;
    }

    public static void T(w8 w8Var) {
        if (w8Var.getParentActivity() == null) {
            return;
        }
        if (w8Var.f34143n) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(w8Var.getParentActivity());
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.PhotoEditorDiscardAlert);
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.DiscardChanges);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new j8(w8Var, 1));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
            w8Var.showDialog(c2Var);
            c2Var.h();
            return;
        }
        w8Var.finishFragment();
    }

    public final void c0() {
        ValueAnimator valueAnimator = this.C;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.C.cancel();
            this.C = null;
        }
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
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        kVar.setTitleColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        this.actionBar.C(org.telegram.ui.ActionBar.f6.w0(null, i9, false), false);
        this.actionBar.A(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23092i6, false), false);
        org.telegram.ui.Cells.j2.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.PhotoEditor));
        this.actionBar.setActionBarMenuOnItemClick(new n8(this, 0));
        this.actionBar.getTitleTextView().setAlpha(0.0f);
        org.telegram.ui.ActionBar.k kVar2 = new org.telegram.ui.ActionBar.k(getParentActivity(), null);
        this.D = kVar2;
        kVar2.setCastShadows(false);
        this.D.setAddToContainer(false);
        this.D.setOccupyStatusBar(true);
        this.D.setClipChildren(false);
        int k10 = i0.a.k(-1, 60);
        this.D.C(-1, false);
        org.telegram.ui.Cells.j2.v(false, this.D);
        this.D.setAllowOverlayTitle(false);
        this.D.A(k10, false);
        org.telegram.ui.ActionBar.z n10 = this.D.n();
        n10.setClipChildren(false);
        c40 c40Var = this.P;
        if (c40Var != null && c40Var.f27362c == 2) {
            string = LocaleController.getString(R.string.SuggestPhoto);
        } else {
            string = LocaleController.getString(R.string.SetPhoto);
        }
        org.telegram.ui.ActionBar.w0 e10 = n10.e(1, string);
        this.N = e10;
        e10.setBackground(org.telegram.ui.ActionBar.f6.f0(k10, 3, -1));
        this.D.setActionBarMenuOnItemClick(new n8(this, 1));
        this.f34144r = new ta1(this, getParentActivity(), 6);
        o8 o8Var = new o8(this, context);
        o8Var.setFitsSystemWindows(true);
        o8Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false));
        this.f34144r.setClipChildren(false);
        this.f34144r.setClipToPadding(false);
        this.f34144r.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        this.f34144r.setOrientation(1);
        ta1 ta1Var = this.f34144r;
        p8 p8Var = new p8(this, getParentActivity(), o8Var);
        this.f34138a = p8Var;
        ta1Var.addView(p8Var);
        TextView textView = new TextView(getParentActivity());
        this.S = textView;
        textView.setText(LocaleController.getString(R.string.ChooseBackground));
        TextView textView2 = this.S;
        int i10 = org.telegram.ui.ActionBar.f6.f23369y6;
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        this.S.setTextSize(1, 14.0f);
        this.S.setGravity(17);
        this.f34144r.addView(this.S, g7.e6.t(-1, -2, 0, 21, 10, 21, 10));
        gh.h1 h1Var = new gh.h1(this, getParentActivity());
        t8 t8Var = new t8(this, getParentActivity());
        this.F = t8Var;
        h1Var.addView(t8Var);
        this.f34144r.addView(h1Var, g7.e6.t(-1, 48, 0, 12, 0, 12, 0));
        TextView textView3 = new TextView(getParentActivity());
        this.R = textView3;
        textView3.setText(LocaleController.getString(R.string.ChooseEmojiOrSticker));
        this.R.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        this.R.setTextSize(1, 14.0f);
        this.R.setGravity(17);
        this.f34144r.addView(this.R, g7.e6.t(-1, -2, 0, 21, 18, 21, 10));
        q8 q8Var = new q8(this, this, getParentActivity(), getThemedColor(i9));
        this.f34139b = q8Var;
        q8Var.N = true;
        q8Var.setAnimationsEnabled(this.fragmentBeginToShow);
        this.f34139b.setClipChildren(false);
        this.f34144r.addView(this.f34139b, g7.e6.t(-1, -1, 0, 12, 0, 12, 12));
        this.f34144r.setClipChildren(false);
        o8Var.addView(this.f34144r, g7.e6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 64.0f));
        View view = new View(getParentActivity());
        this.f34141e = view;
        view.setVisibility(8);
        kh.d dVar = new kh.d(context, this.resourceProvider, true);
        this.f34147x = dVar;
        dVar.e();
        this.f34147x.d.o(false, false, false);
        int i11 = this.T.R;
        if (i11 == 1) {
            this.f34145s = LocaleController.getString(R.string.SetChannelPhoto);
        } else if (i11 == 3) {
            this.f34145s = LocaleController.getString(R.string.SetCommunityPhoto);
        } else if (i11 == 2) {
            this.f34145s = LocaleController.getString(R.string.SetGroupPhoto);
        } else if (c40Var != null && c40Var.f27362c == 2) {
            this.f34145s = LocaleController.getString(R.string.SuggestPhoto);
        } else {
            this.f34145s = LocaleController.getString(R.string.SetMyProfilePhotoAvatarConstructor);
        }
        this.f34145s = new SpannableStringBuilder(this.f34145s);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f34145s);
        spannableStringBuilder.append((CharSequence) " l");
        spannableStringBuilder.setSpan(new eq(R.drawable.msg_mini_lock2, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        this.v = spannableStringBuilder;
        this.f34146w = false;
        this.f34147x.g(this.f34145s, false, true);
        this.f34147x.setOnClickListener(new f0(this, 3));
        this.f34148y = new FrameLayout(context);
        o8Var.addView(this.f34147x, g7.e6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        o8Var.addView(this.f34148y, g7.e6.d(-1, 80.0f, 80, 8.0f, 16.0f, 8.0f, 64.0f));
        o8Var.addView(this.actionBar);
        o8Var.addView(this.D);
        o8Var.addView(this.f34141e, g7.e6.c(-1.0f, -1));
        wc wcVar = new wc(o8Var);
        this.G = wcVar;
        wcVar.h = new i8(this, 0);
        this.fragmentView = o8Var;
        return o8Var;
    }

    public final boolean d0() {
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            return false;
        }
        p8 p8Var = this.f34138a;
        s8 s8Var = p8Var.h;
        if ((s8Var == null || !s8Var.f32392b) && !p8Var.f33316n) {
            return false;
        }
        return true;
    }

    public final void e0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.w8.e0():void");
    }

    public final void f0(boolean z10, boolean z11, boolean z12) {
        float f10;
        if (this.Q) {
            return;
        }
        c0();
        float f11 = this.A;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.C = ValueAnimator.ofFloat(f11, f10);
        if (z11) {
            this.f34138a.f33319w = this.A;
            if (Build.VERSION.SDK_INT >= 23) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            }
        }
        this.C.addUpdateListener(new hg.y(6, this, z11));
        this.C.addListener(new org.telegram.ui.ActionBar.g(this, z10, z11, 2));
        if (z12) {
            this.C.setInterpolator(gr.h);
            this.C.setDuration(350L);
            this.C.setStartDelay(150L);
        } else {
            this.C.setInterpolator(gr.f28844f);
            this.C.setDuration(250L);
        }
        this.C.start();
    }

    public final void g0(boolean z10, long j10, TLRPC.Document document) {
        p8 p8Var = this.f34138a;
        p8Var.f33311a = j10;
        ih.d4 d4Var = p8Var.f33313c;
        p8Var.f33312b = document;
        if (j10 == 0) {
            d4Var.setAnimatedEmojiDrawable(null);
            this.f34138a.f33313c.getImageReceiver().setImage(ImageLocation.getForDocument(document), "100_100", null, null, DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.f6.f23162m6, 0.2f), 0L, "tgs", document, 0);
        } else {
            d4Var.setAnimatedEmojiDrawable(new k5(14, this.currentAccount, j10));
            this.f34138a.f33313c.getImageReceiver().clearImage();
        }
        if (this.f34138a.getImageReceiver() != null && this.f34138a.getImageReceiver().getAnimation() != null) {
            this.f34138a.getImageReceiver().getAnimation().y(0L, true, false);
        }
        if (this.f34138a.getImageReceiver() != null && this.f34138a.getImageReceiver().getLottieAnimation() != null) {
            this.f34138a.getImageReceiver().getLottieAnimation().L(0, false, true);
        }
        this.f34143n = true;
        m0();
    }

    public final void h0(float f10, boolean z10) {
        boolean z11;
        this.A = f10;
        float f11 = ((this.d - this.f34140c) - AndroidUtilities.statusBarHeight) * f10;
        if (this.J == 0.0f) {
            this.f34144r.setTranslationY(f11);
            this.f34147x.setTranslationY(f11);
        }
        this.f34138a.setTranslationY(((-(this.d - this.f34140c)) / 2.0f) * f10);
        this.fragmentView.invalidate();
        if (z10) {
            p8 p8Var = this.f34138a;
            if (f10 > 0.5f) {
                z11 = true;
            } else {
                z11 = false;
            }
            p8Var.setExpanded(z11);
        }
    }

    public final void i0(float f10) {
        if (this.W != f10) {
            this.W = f10;
            int d = i0.a.d(f10, -16777216, -1);
            int k10 = i0.a.k(d, 60);
            this.D.C(d, false);
            this.N.setBackground(org.telegram.ui.ActionBar.f6.f0(k10, 3, -1));
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

    public final void j0(long j10) {
        p8 p8Var = this.f34138a;
        if (p8Var == 0) {
            return;
        }
        ?? obj = new Object();
        int[] iArr = Y[0];
        obj.f32393c = iArr[0];
        obj.d = iArr[1];
        obj.f32394e = iArr[2];
        obj.f32395f = iArr[3];
        p8Var.b(obj, false);
        m0();
        p8 p8Var2 = this.f34138a;
        p8Var2.f33311a = j10;
        p8Var2.f33313c.setAnimatedEmojiDrawable(new k5(14, this.currentAccount, j10));
        this.F.w1(obj);
        this.f34139b.setForUser(false);
    }

    public final void k0(TLRPC.VideoSize videoSize) {
        int i9;
        int i10;
        int i11;
        ?? obj = new Object();
        obj.f32393c = i0.a.k(videoSize.background_colors.get(0).intValue(), 255);
        if (videoSize.background_colors.size() > 1) {
            i9 = i0.a.k(videoSize.background_colors.get(1).intValue(), 255);
        } else {
            i9 = 0;
        }
        obj.d = i9;
        if (videoSize.background_colors.size() > 2) {
            i10 = i0.a.k(videoSize.background_colors.get(2).intValue(), 255);
        } else {
            i10 = 0;
        }
        obj.f32394e = i10;
        if (videoSize.background_colors.size() > 3) {
            i11 = i0.a.k(videoSize.background_colors.get(3).intValue(), 255);
        } else {
            i11 = 0;
        }
        obj.f32395f = i11;
        this.f34138a.b(obj, false);
        m0();
        TLRPC.Document document = null;
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            g0(false, ((TLRPC.TL_videoSizeEmojiMarkup) videoSize).emoji_id, null);
        } else {
            TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup = new TLRPC.TL_videoSizeStickerMarkup();
            TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(this.currentAccount).getStickerSet(tL_videoSizeStickerMarkup.stickerset, false);
            if (stickerSet != null) {
                for (int i12 = 0; i12 < stickerSet.documents.size(); i12++) {
                    if (stickerSet.documents.get(i12).f22386id == tL_videoSizeStickerMarkup.sticker_id) {
                        document = stickerSet.documents.get(i12);
                    }
                }
            }
            g0(false, 0L, document);
        }
        this.F.w1(obj);
        this.f34139b.setForUser(true);
    }

    public final void l0(y8 y8Var) {
        s8 backgroundGradient = y8Var.getBackgroundGradient();
        p8 p8Var = this.f34138a;
        if (p8Var == null) {
            return;
        }
        p8Var.b(backgroundGradient, false);
        m0();
        if (y8Var.getAnimatedEmoji() != null) {
            long i9 = y8Var.getAnimatedEmoji().i();
            p8 p8Var2 = this.f34138a;
            p8Var2.f33311a = i9;
            p8Var2.f33313c.setAnimatedEmojiDrawable(new k5(14, this.currentAccount, i9));
        }
        this.F.w1(backgroundGradient);
        this.f34139b.setForUser(false);
    }

    public final void m0() {
        CharSequence charSequence;
        boolean d02 = d0();
        if (this.f34146w != d02) {
            kh.d dVar = this.f34147x;
            this.f34146w = d02;
            if (d02) {
                charSequence = this.v;
            } else {
                charSequence = this.f34145s;
            }
            dVar.g(charSequence, true, true);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.f34143n) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.PhotoEditorDiscardAlert);
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.DiscardChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new j8(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
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
