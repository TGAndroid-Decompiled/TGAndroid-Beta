package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public class yv0 extends org.telegram.ui.ActionBar.v2 implements org.telegram.messenger.ls {
    public static final int f40720n2 = 0;
    public final View[] A1;
    public bi.e5 B1;
    public final org.telegram.ui.ActionBar.f2 C1;
    public ei.h D1;
    public final Activity E1;
    public int F1;
    public int G1;
    public boolean H1;
    public boolean I1;
    public TLRPC.TL_messages_stickerSet J1;
    public TLRPC.Document K1;
    public org.telegram.messenger.zy L1;
    public TLRPC.InputStickerSet M1;
    public ArrayList N1;
    public final ArrayList O1;
    public ArrayList P1;
    public HashMap Q1;
    public final String R1;
    public final vv0 S1;
    public wv0 T1;
    public org.telegram.ui.g50 U1;
    public int V1;
    public int W1;
    public boolean X1;
    public boolean Y1;
    public boolean Z1;
    public boolean f40721a2;
    public int f40722b2;
    public final a8.b8 f40723c2;
    public final nv0 d2;
    public ng f40724e2;
    public String f40725f2;
    public int f40726g2;
    public boolean f40727h2;
    public Pattern f40728i1;
    public String f40729i2;
    public bi.q1 f40730j1;
    public Runnable f40731j2;
    public uv0 f40732k1;
    public ArrayList f40733k2;
    public v4.y l1;
    public int f40734l2;
    public TLRPC.Document f40735m1;
    public int f40736m2;
    public w70 n1;
    public org.telegram.ui.ActionBar.r0 f40737o1;
    public org.telegram.ui.ActionBar.z0 f40738p1;
    public j6 f40739q1;
    public ug.p0 f40740r1;
    public FrameLayout f40741s1;
    public FrameLayout f40742t1;
    public TextView f40743u1;
    public View f40744v1;
    public l9 f40745w1;
    public TextView f40746x1;
    public k f40747y1;
    public final AnimatorSet[] f40748z1;

    public yv0(Context context, Object obj, TLObject tLObject, org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, false);
        this.f40748z1 = new AnimatorSet[2];
        this.A1 = new View[2];
        this.f40721a2 = true;
        this.f40723c2 = new a8.b8(6);
        this.d2 = new nv0(this);
        this.I0 = f6Var;
        N();
        this.E1 = (Activity) context;
        TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = new TLRPC.TL_messages_getAttachedStickers();
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.Photo photo = (TLRPC.Photo) tLObject;
            TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = new TLRPC.TL_inputStickeredMediaPhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputStickeredMediaPhoto.f27022id = tL_inputPhoto;
            tL_inputPhoto.f26971id = photo.f26976id;
            tL_inputPhoto.access_hash = photo.access_hash;
            byte[] bArr = photo.file_reference;
            tL_inputPhoto.file_reference = bArr;
            if (bArr == null) {
                tL_inputPhoto.file_reference = new byte[0];
            }
            tL_messages_getAttachedStickers.media = tL_inputStickeredMediaPhoto;
        } else if (tLObject instanceof TLRPC.Document) {
            TLRPC.Document document = (TLRPC.Document) tLObject;
            TLRPC.TL_inputStickeredMediaDocument tL_inputStickeredMediaDocument = new TLRPC.TL_inputStickeredMediaDocument();
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_inputStickeredMediaDocument.f27021id = tL_inputDocument;
            tL_inputDocument.f26964id = document.f26958id;
            tL_inputDocument.access_hash = document.access_hash;
            byte[] bArr2 = document.file_reference;
            tL_inputDocument.file_reference = bArr2;
            if (bArr2 == null) {
                tL_inputDocument.file_reference = new byte[0];
            }
            tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
        }
        org.telegram.ui.oo0 oo0Var = (org.telegram.ui.oo0) this;
        this.W1 = ConnectionsManager.getInstance(this.f28612a).sendRequest(tL_messages_getAttachedStickers, new bi.g2(oo0Var, obj, tL_messages_getAttachedStickers, new org.telegram.ui.ld(21, oo0Var, tL_messages_getAttachedStickers), 12));
        P0(context);
    }

    public static void I0(yv0 yv0Var) {
        if (yv0Var.f40730j1.getChildCount() <= 0) {
            yv0Var.W0(yv0Var.f40730j1.getPaddingTop());
            return;
        }
        int i7 = 0;
        View view = null;
        int i10 = -1;
        for (int i11 = 0; i11 < yv0Var.f40730j1.getChildCount(); i11++) {
            View childAt = yv0Var.f40730j1.getChildAt(i11);
            yv0Var.f40730j1.getClass();
            int R = RecyclerView.R(childAt);
            if (i10 == -1 || i10 > R) {
                view = childAt;
                i10 = R;
            }
        }
        if (view != null && view.getTop() >= 0) {
            int top = view.getTop();
            yv0Var.T0(0, false);
            i7 = top;
        } else {
            yv0Var.T0(0, true);
        }
        yv0Var.T0(1, true);
        if (yv0Var.V1 != i7) {
            yv0Var.W0(i7);
        }
    }

    public static void M0(org.telegram.ui.ActionBar.f2 f2Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, TLRPC.Document document) {
        org.telegram.ui.an anVar;
        boolean z9;
        TLRPC.StickerSet stickerSet;
        if (f2Var != null) {
            if (f2Var instanceof org.telegram.ui.an) {
                anVar = (org.telegram.ui.an) f2Var;
            } else {
                anVar = null;
            }
            if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.creator) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (document != null && document.mime_type.equals("image/webp")) {
                ArrayList arrayList = new ArrayList();
                org.telegram.messenger.w7.G(org.telegram.messenger.p10.f24459s0);
                File K = org.telegram.messenger.w7.K(document, null, true, true);
                if (K != null && K.exists()) {
                    org.telegram.messenger.g0.i3(new kg.o0(K, arrayList, f2Var, anVar, document, z9, tL_messages_stickerSet), 300L);
                    return;
                }
                return;
            }
            org.telegram.messenger.g0.i3(new fi.q1((Object) f2Var, (Object) tL_messages_stickerSet, (Object) document, (Object) anVar, z9, 10), 300L);
        }
    }

    @Override
    public final void D(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.F8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.E8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.xj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27994l5));
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final void J0() {
        if (this.J1 != null) {
            TLRPC.TL_messages_stickerSet x02 = org.telegram.messenger.qp.s1(this.f28612a).x0(this.J1);
            this.J1 = x02;
            if (x02 == null) {
                dismiss();
            }
        }
    }

    public final void K0(TextView textView, String str, boolean z9) {
        if (z9) {
            textView.setText(org.telegram.messenger.hd.M0(2131749234, null));
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28202w6, this.I0);
            this.f40727h2 = true;
            this.f40725f2 = str;
            return;
        }
        ng ngVar = this.f40724e2;
        if (ngVar != null) {
            org.telegram.messenger.g0.r(ngVar);
            this.f40724e2 = null;
            this.f40725f2 = null;
            if (this.f40726g2 != 0) {
                ConnectionsManager.getInstance(this.f28612a).cancelRequest(this.f40726g2, true);
            }
        }
        if (TextUtils.isEmpty(str)) {
            textView.setText(org.telegram.messenger.hd.M0(2131749236, null));
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28087q5, this.I0);
            return;
        }
        this.f40727h2 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                int length = str.length();
                for (int i7 = 0; i7 < length; i7++) {
                    char charAt = str.charAt(i7);
                    if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        textView.setText(org.telegram.messenger.hd.M0(2131749236, null));
                        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28069p7, this.I0);
                        return;
                    }
                }
            } else {
                textView.setText(org.telegram.messenger.hd.M0(2131749232, null));
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28069p7, this.I0);
                return;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 32) {
                textView.setText(org.telegram.messenger.hd.M0(2131749231, null));
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28069p7, this.I0);
                return;
            }
            textView.setText(org.telegram.messenger.hd.M0(2131749233, null));
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.F6, this.I0);
            this.f40725f2 = str;
            ng ngVar2 = new ng(this, str, textView, 28);
            this.f40724e2 = ngVar2;
            org.telegram.messenger.g0.i3(ngVar2, 300L);
            return;
        }
        textView.setText(org.telegram.messenger.hd.M0(2131749230, null));
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28069p7, this.I0);
    }

    public final void L0() {
        if (!this.I1) {
            return;
        }
        this.l1.h(null);
        this.I1 = false;
        this.f40723c2.q(true);
        org.telegram.messenger.g0.d0(this.f40730j1, new di.e(15));
        this.f40737o1.postDelayed(new iv0(this, 0), 200L);
        this.f40739q1.c(org.telegram.messenger.hd.M0(2131751222, null), true, true);
    }

    public final void N0() {
        if (this.I1) {
            return;
        }
        this.l1.h(this.f40730j1);
        this.I1 = true;
        a8.b8 b8Var = this.f40723c2;
        char c10 = 0;
        b8Var.q(false);
        float f10 = 0.0f;
        Float valueOf = Float.valueOf(0.0f);
        ArrayList arrayList = (ArrayList) b8Var.d;
        if (arrayList.isEmpty()) {
            for (int i7 = 0; i7 < 6; i7++) {
                arrayList.add(valueOf);
                ((ArrayList) b8Var.f338e).add(valueOf);
                ((ArrayList) b8Var.f339f).add(valueOf);
            }
        }
        int i10 = 0;
        for (int i11 = 6; i10 < i11; i11 = 6) {
            long nextFloat = Utilities.f21331b.nextFloat() * 300;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, -2.0f, 0.0f, 2.0f, 0.0f);
            ofFloat.addUpdateListener(new xv0(b8Var, i10, 3));
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(1);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setCurrentPlayTime(nextFloat);
            long j3 = 300;
            ofFloat.setDuration(j3);
            ofFloat.start();
            char c11 = c10;
            float L = org.telegram.messenger.g0.L(0.5f);
            float f11 = f10;
            float[] fArr = new float[5];
            fArr[c11] = f11;
            fArr[1] = L;
            fArr[2] = f11;
            fArr[3] = -L;
            fArr[4] = f11;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr);
            ofFloat2.addUpdateListener(new xv0(b8Var, i10, 4));
            ofFloat2.setRepeatCount(-1);
            ofFloat2.setRepeatMode(1);
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.setCurrentPlayTime(nextFloat);
            ofFloat2.setDuration((long) (300 * 1.2d));
            ofFloat2.start();
            float[] fArr2 = new float[4];
            fArr2[c11] = f11;
            fArr2[1] = L;
            fArr2[2] = f11 - L;
            fArr2[3] = f11;
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(fArr2);
            ofFloat3.addUpdateListener(new xv0(b8Var, i10, 5));
            ofFloat3.setRepeatCount(-1);
            ofFloat3.setRepeatMode(1);
            ofFloat3.setInterpolator(new LinearInterpolator());
            ofFloat3.setCurrentPlayTime(nextFloat);
            ofFloat3.setDuration(j3);
            ofFloat3.start();
            ((ArrayList) b8Var.f335a).add(ofFloat);
            ((ArrayList) b8Var.f336b).add(ofFloat2);
            ((ArrayList) b8Var.f337c).add(ofFloat3);
            i10++;
            f10 = f11;
            c10 = c11;
        }
        org.telegram.messenger.g0.d0(this.f40730j1, new di.e(16));
        this.f40737o1.postDelayed(new iv0(this, 1), 200L);
        this.f40739q1.c(org.telegram.messenger.hd.M0(2131751355, null), true, true);
    }

    public final void O0() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f40742t1, View.ALPHA, 0.0f));
        animatorSet.setDuration(200L);
        animatorSet.addListener(new e60(this, 24));
        animatorSet.start();
    }

    public final void P0(Context context) {
        int i7;
        qv0 qv0Var = new qv0(this, context);
        this.f28615b = qv0Var;
        qv0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.f28615b;
        int i10 = this.f28645t0;
        viewGroup.setPadding(i10, 0, i10, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.g0.L(48.0f);
        View view = new View(context);
        View[] viewArr = this.A1;
        viewArr[0] = view;
        int i11 = org.telegram.ui.ActionBar.k6.V5;
        org.telegram.ui.ActionBar.r6.i(i11, view, this.I0);
        viewArr[0].setAlpha(0.0f);
        viewArr[0].setVisibility(4);
        viewArr[0].setTag(1);
        this.f28615b.addView(viewArr[0], layoutParams);
        bi.q1 q1Var = new bi.q1(27, context, this);
        this.f40730j1 = q1Var;
        q1Var.setTag(14);
        bi.q1 q1Var2 = this.f40730j1;
        getContext();
        ei.h hVar = new ei.h(this);
        this.D1 = hVar;
        q1Var2.setLayoutManager(hVar);
        this.D1.O = new ai.l(this, 10);
        this.l1 = new v4.y(new rv0(this));
        bi.q1 q1Var3 = this.f40730j1;
        uv0 uv0Var = new uv0(this, context);
        this.f40732k1 = uv0Var;
        q1Var3.setAdapter(uv0Var);
        this.f40730j1.setVerticalScrollBarEnabled(false);
        this.f40730j1.i(new di.k(12));
        this.f40730j1.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        this.f40730j1.setClipToPadding(false);
        this.f40730j1.setEnabled(true);
        org.telegram.ui.ActionBar.r6.I(this.f40730j1, org.telegram.ui.ActionBar.k6.A5, this.I0);
        this.f40730j1.setOnTouchListener(new zj(this, 6));
        this.f40730j1.setOnScrollListener(new ui(this, 18));
        k kVar = new k(this, 16);
        this.f40747y1 = kVar;
        this.f40730j1.setOnItemClickListener(kVar);
        this.f28615b.addView(this.f40730j1, c8.ha.d(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 48.0f));
        bi.e5 e5Var = new bi.e5(27, context, this);
        this.B1 = e5Var;
        this.f28615b.addView(e5Var, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.f40730j1.setEmptyView(this.B1);
        this.B1.setOnTouchListener(new ei.b(24));
        w70 w70Var = new w70(context, null);
        this.n1 = w70Var;
        w70Var.setLines(1);
        this.n1.setSingleLine(true);
        org.telegram.ui.ActionBar.r6.V(this.n1, org.telegram.ui.ActionBar.k6.f27956j5, this.I0);
        this.n1.setTextSize(1, 20.0f);
        org.telegram.ui.ActionBar.r6.H(this.n1, org.telegram.ui.ActionBar.k6.f27976k5, this.I0);
        this.n1.setEllipsize(TextUtils.TruncateAt.END);
        this.n1.setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(6.0f));
        this.n1.setGravity(16);
        this.n1.setTypeface(org.telegram.messenger.g0.o());
        this.f28615b.addView(this.n1, c8.ha.d(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        org.telegram.ui.ActionBar.r0 r0Var = new org.telegram.ui.ActionBar.r0(context, null, 0, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.xj, this.I0), false, this.I0);
        this.f40737o1 = r0Var;
        r0Var.setLongClickEnabled(false);
        this.f40737o1.setSubMenuOpenSide(2);
        this.f40737o1.setIcon(2131231244);
        org.telegram.ui.ActionBar.r0 r0Var2 = this.f40737o1;
        int i12 = org.telegram.ui.ActionBar.k6.Bj;
        org.telegram.ui.ActionBar.r6.R(r0Var2, org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i12, this.I0), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i12), this.I0);
        this.f28615b.addView(this.f40737o1, c8.ha.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        this.f40737o1.e(1, 2131232363, org.telegram.messenger.hd.M0(2131744847, null));
        this.f40737o1.e(2, 2131232203, org.telegram.messenger.hd.M0(2131751762, null));
        this.f40737o1.setOnClickListener(new gv0(this, 1));
        this.f40737o1.setDelegate(new hv0(this));
        this.f40737o1.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
        org.telegram.ui.ActionBar.r0 r0Var3 = this.f40737o1;
        if (this.M1 != null) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        r0Var3.setVisibility(i7);
        this.B1.addView(new RadialProgressView(context, null), c8.ha.e(-2, -2, 17));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83);
        layoutParams2.bottomMargin = org.telegram.messenger.g0.L(48.0f);
        View view2 = new View(context);
        viewArr[1] = view2;
        org.telegram.ui.ActionBar.r6.i(i11, view2, this.I0);
        this.f28615b.addView(viewArr[1], layoutParams2);
        j6 j6Var = new j6(context, false, false, false);
        this.f40739q1 = j6Var;
        int i13 = org.telegram.ui.ActionBar.k6.f27921h5;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i13, this.I0);
        int i14 = org.telegram.ui.ActionBar.k6.f27940i6;
        org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.k6.i0(w02, org.telegram.ui.ActionBar.k6.w0(i14, this.I0));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i13);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i14);
        org.telegram.ui.ActionBar.f6 f6Var = this.I0;
        j6Var.setBackground(i02);
        org.telegram.ui.ActionBar.r6.k(j6Var, i02, N, N2, f6Var);
        j6 j6Var2 = this.f40739q1;
        int i15 = org.telegram.ui.ActionBar.k6.f28029n5;
        this.f40722b2 = i15;
        org.telegram.ui.ActionBar.r6.Z(j6Var2, i15, this.I0);
        this.f40739q1.setTextSize(org.telegram.messenger.g0.L(14.0f));
        this.f40739q1.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        this.f40739q1.setTypeface(org.telegram.messenger.g0.o());
        this.f40739q1.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f40741s1 = frameLayout;
        frameLayout.addView(this.f40739q1, c8.ha.c(48.0f, -1));
        this.f28615b.addView(this.f40741s1, c8.ha.e(-1, -2, 83));
        ug.p0 p0Var = new ug.p0(org.telegram.messenger.g0.L(24.0f), context, this.I0, false);
        this.f40740r1 = p0Var;
        p0Var.setIcon(2131624314);
        this.f40740r1.setVisibility(4);
        this.f28615b.addView(this.f40740r1, c8.ha.d(-1, 48.0f, 87, 8.0f, 0.0f, 8.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f40742t1 = frameLayout2;
        frameLayout2.setVisibility(8);
        this.f40742t1.setSoundEffectsEnabled(false);
        this.f28615b.addView(this.f40742t1, c8.ha.c(-1.0f, -1));
        this.f40742t1.setOnClickListener(new gv0(this, 2));
        l9 l9Var = new l9(context);
        this.f40745w1 = l9Var;
        l9Var.setAspectFit(true);
        this.f40745w1.setLayerNum(7);
        this.f40742t1.addView(this.f40745w1);
        TextView textView = new TextView(context);
        this.f40746x1 = textView;
        textView.setTextSize(1, 30.0f);
        this.f40746x1.setGravity(85);
        this.f40742t1.addView(this.f40746x1);
        TextView textView2 = new TextView(context);
        this.f40743u1 = textView2;
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(this.f40743u1, i15, this.I0);
        org.telegram.ui.ActionBar.r6.R(this.f40743u1, org.telegram.ui.ActionBar.k6.i0(org.telegram.ui.ActionBar.k6.w0(i13, this.I0), org.telegram.ui.ActionBar.k6.w0(i14, this.I0)), org.telegram.ui.ActionBar.r6.N(i13), org.telegram.ui.ActionBar.r6.N(i14), this.I0);
        this.f40743u1.setGravity(17);
        this.f40743u1.setPadding(org.telegram.messenger.g0.L(29.0f), 0, org.telegram.messenger.g0.L(29.0f), 0);
        this.f40743u1.setTypeface(org.telegram.messenger.g0.o());
        this.f40742t1.addView(this.f40743u1, c8.ha.e(-1, 48, 83));
        this.f40743u1.setOnClickListener(new gv0(this, 3));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83);
        layoutParams3.bottomMargin = org.telegram.messenger.g0.L(48.0f);
        View view3 = new View(context);
        this.f40744v1 = view3;
        org.telegram.ui.ActionBar.r6.i(i11, view3, this.I0);
        this.f40742t1.addView(this.f40744v1, layoutParams3);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25001i4);
        if (this.O1 != null) {
            org.telegram.messenger.qs.f(this.f28612a).c(this, org.telegram.messenger.qs.U1);
            org.telegram.messenger.qs.f(this.f28612a).c(this, org.telegram.messenger.qs.V1);
        }
        org.telegram.messenger.qs.f(this.f28612a).c(this, org.telegram.messenger.qs.f25087x0);
        Z0();
        a1();
        Y0();
        X0(false);
        this.f40732k1.f();
    }

    public final boolean Q0() {
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.J1;
        if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.emojis) {
            if (tL_messages_stickerSet == null && this.H1) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void R0() {
        String str;
        if (this.M1 != null) {
            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(this.f28612a);
            if (this.J1 == null && (str = this.M1.short_name) != null) {
                this.J1 = b02.p0(str);
            }
            if (this.J1 == null) {
                this.J1 = b02.o0(this.M1.f26972id);
            }
            if (this.J1 == null) {
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                tL_messages_getStickerSet.stickerset = this.M1;
                ConnectionsManager.getInstance(this.f28612a).sendRequest(tL_messages_getStickerSet, new org.telegram.ui.ld(20, this, b02));
            } else {
                if (this.f40732k1 != null) {
                    a1();
                    Z0();
                    this.f40732k1.f();
                }
                Y0();
                b02.q1(this.J1);
                J0();
            }
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.J1;
        if (tL_messages_stickerSet != null) {
            this.Y1 = !tL_messages_stickerSet.set.masks;
        }
        J0();
    }

    public final void S0(org.telegram.messenger.zy zyVar) {
        int indexOf = this.P1.indexOf(zyVar);
        if (indexOf >= 0) {
            this.P1.remove(indexOf);
            this.f40732k1.s(indexOf);
            if (this.P1.isEmpty()) {
                dismiss();
            } else {
                Z0();
            }
        }
    }

    public final void T0(int i7, boolean z9) {
        Integer num;
        float f10;
        if (this.N1 == null) {
            View[] viewArr = this.A1;
            if ((z9 && viewArr[i7].getTag() != null) || (!z9 && viewArr[i7].getTag() == null)) {
                View view = viewArr[i7];
                if (z9) {
                    num = null;
                } else {
                    num = 1;
                }
                view.setTag(num);
                if (z9) {
                    viewArr[i7].setVisibility(0);
                }
                AnimatorSet[] animatorSetArr = this.f40748z1;
                AnimatorSet animatorSet = animatorSetArr[i7];
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSetArr[i7] = animatorSet2;
                View view2 = viewArr[i7];
                Property property = View.ALPHA;
                if (z9) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                animatorSet2.playTogether(ObjectAnimator.ofFloat(view2, property, f10));
                animatorSetArr[i7].setDuration(150L);
                animatorSetArr[i7].addListener(new mv0(this, i7, z9));
                animatorSetArr[i7].start();
            }
        }
    }

    @Override
    public final ArrayList U() {
        ArrayList arrayList = new ArrayList();
        s6 s6Var = new s6(this, 6);
        ViewGroup viewGroup = this.f28615b;
        Drawable[] drawableArr = {this.f28642r0};
        int i7 = org.telegram.ui.ActionBar.k6.f27921h5;
        arrayList.add(new org.telegram.ui.ActionBar.t6(viewGroup, 0, (Class[]) null, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f28615b, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.wj));
        if (this.f40732k1.f38744r.N1 != null) {
            org.telegram.ui.Cells.u3.a(arrayList, s6Var);
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f40737o1, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Bj));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f40739q1, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        j6 j6Var = this.f40739q1;
        int i10 = org.telegram.ui.ActionBar.k6.f27940i6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(j6Var, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f40739q1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, this.f40722b2));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f40743u1, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f40743u1, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        return arrayList;
    }

    public final void U0(View.OnClickListener onClickListener, String str, int i7) {
        V0(onClickListener, str, i7, -1, -1);
    }

    public final void V0(View.OnClickListener onClickListener, String str, int i7, int i10, int i11) {
        if (i7 >= 0) {
            j6 j6Var = this.f40739q1;
            this.f40722b2 = i7;
            org.telegram.ui.ActionBar.r6.Z(j6Var, i7, this.I0);
        }
        this.f40739q1.c(str, false, true);
        this.f40739q1.setOnClickListener(onClickListener);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f40739q1.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.A1[1].getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.f40730j1.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.B1.getLayoutParams();
        if (onClickListener == null) {
            this.f40739q1.setAlpha(0.0f);
        } else if (i10 >= 0 && i11 >= 0) {
            j6 j6Var2 = this.f40739q1;
            int L = org.telegram.messenger.g0.L(24.0f);
            int w02 = org.telegram.ui.ActionBar.k6.w0(i10, this.I0);
            int w03 = org.telegram.ui.ActionBar.k6.w0(i11, this.I0);
            org.telegram.ui.ActionBar.r6.R(j6Var2, org.telegram.ui.ActionBar.k6.k0(L, L, L, L, w02, w03, w03), org.telegram.ui.ActionBar.r6.N(i10), org.telegram.ui.ActionBar.r6.N(i11), this.I0);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27921h5, this.f40741s1, this.I0);
            int L2 = org.telegram.messenger.g0.L(8.0f);
            marginLayoutParams.bottomMargin = L2;
            marginLayoutParams.rightMargin = L2;
            marginLayoutParams.topMargin = L2;
            marginLayoutParams.leftMargin = L2;
            int L3 = org.telegram.messenger.g0.L(64.0f);
            marginLayoutParams2.bottomMargin = L3;
            marginLayoutParams3.bottomMargin = L3;
            marginLayoutParams4.bottomMargin = L3;
            if (this.f40739q1.getAlpha() < 1.0f) {
                org.telegram.messenger.camera.q.l(this.f40739q1.animate().alpha(1.0f), xq.h, 240L);
            }
        } else {
            j6 j6Var3 = this.f40739q1;
            int i12 = org.telegram.ui.ActionBar.k6.f27921h5;
            int w04 = org.telegram.ui.ActionBar.k6.w0(i12, this.I0);
            int i13 = org.telegram.ui.ActionBar.k6.f28089q7;
            org.telegram.ui.ActionBar.r6.R(j6Var3, org.telegram.ui.ActionBar.k6.i0(w04, org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(i13, this.I0))), org.telegram.ui.ActionBar.r6.N(i12), org.telegram.ui.ActionBar.r6.L(0.1f, i13), this.I0);
            this.f40741s1.setBackgroundColor(0);
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.rightMargin = 0;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            int L4 = org.telegram.messenger.g0.L(48.0f);
            marginLayoutParams2.bottomMargin = L4;
            marginLayoutParams3.bottomMargin = L4;
            marginLayoutParams4.bottomMargin = L4;
            if (this.f40739q1.getAlpha() < 1.0f) {
                org.telegram.messenger.camera.q.l(this.f40739q1.animate().alpha(1.0f), xq.h, 240L);
            }
        }
        this.f28615b.requestLayout();
    }

    public final void W0(int i7) {
        this.V1 = i7;
        if (this.N1 == null) {
            float f10 = i7;
            this.n1.setTranslationY(f10);
            if (this.O1 == null) {
                this.f40737o1.setTranslationY(f10);
            }
            this.A1[0].setTranslationY(f10);
        }
        this.f28615b.invalidate();
    }

    public final void X0(boolean z9) {
        this.f40732k1.getClass();
        this.n1.setHighlightColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27994l5, this.I0));
        this.f40742t1.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27921h5, this.I0) & (-536870913));
        this.f40737o1.setIconColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.xj, this.I0));
        this.f40737o1.O(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, this.I0), false);
        this.f40737o1.O(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.F8, this.I0), true);
        this.f40737o1.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.I5, this.I0));
        this.f40737o1.H(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, this.I0));
        if (this.f40738p1 != null) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28089q7, this.I0);
            this.f40738p1.d(w02, w02);
            this.f40738p1.setSelectorColor(org.telegram.ui.ActionBar.k6.r1(0.1f, w02));
            if (this.f40738p1.getRightIcon() != null && w02 != this.f40734l2) {
                this.f40734l2 = w02;
                this.f40738p1.getRightIcon().setColorFilter(w02);
            }
        }
        if (z9) {
            if (org.telegram.ui.ActionBar.k6.h1() && this.f40733k2 == null) {
                ArrayList U = U();
                this.f40733k2 = U;
                int size = U.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((org.telegram.ui.ActionBar.t6) this.f40733k2.get(i7)).f28536g = null;
                }
            }
            int size2 = this.f40733k2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                org.telegram.ui.ActionBar.t6 t6Var = (org.telegram.ui.ActionBar.t6) this.f40733k2.get(i10);
                t6Var.e(org.telegram.ui.ActionBar.k6.w0(t6Var.f28534e, this.I0), false, false);
            }
        }
        if (!org.telegram.ui.ActionBar.k6.h1() && this.f40733k2 != null) {
            this.f40733k2 = null;
        }
    }

    public final void Y0() {
        if (this.f28615b != null && !org.telegram.messenger.p10.i(this.f28612a).q()) {
            org.telegram.messenger.ij.W3(this.J1);
        }
    }

    public final void Z0() {
        int size;
        int size2;
        ArrayList<TLRPC.Document> arrayList;
        boolean z9;
        TLRPC.StickerSet stickerSet;
        String G;
        int i7;
        int i10;
        String G2;
        ArrayList<TLRPC.Document> arrayList2;
        TLRPC.StickerSet stickerSet2;
        int size3;
        TLRPC.StickerSet stickerSet3;
        int size4;
        TLRPC.StickerSet stickerSet4;
        TLRPC.StickerSet stickerSet5;
        int i11;
        String M0;
        int i12;
        int i13;
        int i14;
        TLRPC.StickerSet stickerSet6;
        boolean z10;
        TLRPC.StickerSet stickerSet7;
        float f10;
        if (this.n1 == null) {
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.J1;
        int i15 = 1;
        if (tL_messages_stickerSet != null && (arrayList = tL_messages_stickerSet.documents) != null && !arrayList.isEmpty()) {
            CharSequence m10 = org.telegram.messenger.i6.m(this.J1.set.title, this.n1.getPaint().getFontMetricsInt(), false, null, 0);
            try {
                if (this.f40728i1 == null) {
                    this.f40728i1 = Pattern.compile("@[a-zA-Z\\d_]{1,32}");
                }
                Matcher matcher = this.f40728i1.matcher(m10);
                SpannableStringBuilder spannableStringBuilder = null;
                while (matcher.find()) {
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder(m10);
                    }
                    int start = matcher.start();
                    int end = matcher.end();
                    if (this.J1.set.title.charAt(start) != '@') {
                        start++;
                    }
                    spannableStringBuilder.setSpan(new i4(m10.subSequence(start + 1, end).toString(), 1, this), start, end, 0);
                }
                if (spannableStringBuilder != null) {
                    m10 = spannableStringBuilder;
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            this.n1.setText(m10);
            if (Q0()) {
                int measuredWidth = this.f40730j1.getMeasuredWidth();
                if (measuredWidth == 0) {
                    measuredWidth = org.telegram.messenger.g0.f22537q.x;
                }
                uv0 uv0Var = this.f40732k1;
                if (org.telegram.messenger.g0.Q1()) {
                    f10 = 60.0f;
                } else {
                    f10 = 45.0f;
                }
                uv0Var.d = Math.max(1, measuredWidth / org.telegram.messenger.g0.L(f10));
            } else {
                this.f40732k1.d = 5;
            }
            this.D1.y1(this.f40732k1.d);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.J1;
            int i16 = -1;
            if (tL_messages_stickerSet2 != null && (stickerSet7 = tL_messages_stickerSet2.set) != null && stickerSet7.emojis && !org.telegram.messenger.p10.i(this.f28612a).q() && this.U1 == null) {
                if (this.J1.documents != null) {
                    for (int i17 = 0; i17 < this.J1.documents.size(); i17++) {
                        if (!org.telegram.messenger.ij.n3(this.J1.documents.get(i17))) {
                            this.f40740r1.setVisibility(0);
                            this.f40739q1.setBackground(null);
                            U0(null, null, -1);
                            this.f40740r1.b(org.telegram.messenger.hd.M0(2131743866, null), new gv0(this, 0), false);
                            return;
                        }
                    }
                }
            } else {
                this.f40740r1.setVisibility(4);
            }
            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(this.f28612a);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = this.J1;
            if (tL_messages_stickerSet3 != null && (stickerSet6 = tL_messages_stickerSet3.set) != null && stickerSet6.emojis) {
                ArrayList s02 = b02.s0(5);
                for (int i18 = 0; s02 != null && i18 < s02.size(); i18++) {
                    if (s02.get(i18) != null && ((TLRPC.TL_messages_stickerSet) s02.get(i18)).set != null && ((TLRPC.TL_messages_stickerSet) s02.get(i18)).set.f26979id == this.J1.set.f26979id) {
                        z10 = true;
                        break;
                    }
                }
                z10 = false;
                z9 = !z10;
            } else if (tL_messages_stickerSet3 != null && (stickerSet = tL_messages_stickerSet3.set) != null && b02.B0(stickerSet.f26979id, true)) {
                z9 = false;
            } else {
                z9 = true;
            }
            org.telegram.ui.g50 g50Var = this.U1;
            if (g50Var != null) {
                gv0 gv0Var = new gv0(this, 5);
                boolean z11 = g50Var.f45837a;
                if (g50Var.f45839c.N) {
                    if (z11) {
                        i14 = 2131746309;
                    } else {
                        i14 = 2131745545;
                    }
                    M0 = org.telegram.messenger.hd.M0(i14, null);
                } else {
                    if (z11) {
                        i11 = 2131746308;
                    } else {
                        i11 = 2131745544;
                    }
                    M0 = org.telegram.messenger.hd.M0(i11, null);
                }
                String str = M0;
                boolean z12 = this.U1.f45837a;
                if (z12) {
                    i12 = org.telegram.ui.ActionBar.k6.f28089q7;
                } else {
                    i12 = org.telegram.ui.ActionBar.k6.Gi;
                }
                if (!z12) {
                    i13 = org.telegram.ui.ActionBar.k6.Ci;
                } else {
                    i13 = -1;
                }
                if (!z12) {
                    i16 = org.telegram.ui.ActionBar.k6.Ei;
                }
                V0(gv0Var, str, i12, i13, i16);
                return;
            }
            if (z9) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = this.J1;
                if (tL_messages_stickerSet4 != null && (stickerSet5 = tL_messages_stickerSet4.set) != null && stickerSet5.emojis) {
                    i15 = 5;
                } else if (tL_messages_stickerSet4 == null || (stickerSet4 = tL_messages_stickerSet4.set) == null || !stickerSet4.masks) {
                    i15 = 0;
                }
                if (!b02.W[i15]) {
                    b02.B(i15);
                    V0(null, "", -1, -1, -1);
                    return;
                }
            }
            if (z9) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = this.J1;
                if (tL_messages_stickerSet5 != null && (stickerSet3 = tL_messages_stickerSet5.set) != null && stickerSet3.masks) {
                    ArrayList<TLRPC.Document> arrayList3 = tL_messages_stickerSet5.documents;
                    if (arrayList3 == null) {
                        size4 = 0;
                    } else {
                        size4 = arrayList3.size();
                    }
                    G2 = org.telegram.messenger.hd.G(size4, "AddManyMasksCount", new Object[0]);
                } else if (tL_messages_stickerSet5 != null && (stickerSet2 = tL_messages_stickerSet5.set) != null && stickerSet2.emojis) {
                    ArrayList<TLRPC.Document> arrayList4 = tL_messages_stickerSet5.documents;
                    if (arrayList4 == null) {
                        size3 = 0;
                    } else {
                        size3 = arrayList4.size();
                    }
                    G2 = org.telegram.messenger.hd.G(size3, "AddManyEmojiCount", new Object[0]);
                } else {
                    if (tL_messages_stickerSet5 != null && (arrayList2 = tL_messages_stickerSet5.documents) != null) {
                        i10 = arrayList2.size();
                    } else {
                        i10 = 0;
                    }
                    G2 = org.telegram.messenger.hd.G(i10, "AddManyStickersCount", new Object[0]);
                }
                V0(new gv0(this, 9), G2, org.telegram.ui.ActionBar.k6.Gi, org.telegram.ui.ActionBar.k6.Ci, org.telegram.ui.ActionBar.k6.Ei);
            } else {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet6 = this.J1;
                TLRPC.StickerSet stickerSet8 = tL_messages_stickerSet6.set;
                boolean z13 = stickerSet8.creator;
                if (z13) {
                    if (this.I1) {
                        i7 = 2131751355;
                    } else {
                        i7 = 2131751222;
                    }
                    G = org.telegram.messenger.hd.M0(i7, null);
                } else if (stickerSet8.masks) {
                    G = org.telegram.messenger.hd.G(tL_messages_stickerSet6.documents.size(), "RemoveManyMasksCount", new Object[0]);
                } else if (stickerSet8.emojis) {
                    G = org.telegram.messenger.hd.G(tL_messages_stickerSet6.documents.size(), "RemoveManyEmojiCount", new Object[0]);
                } else {
                    G = org.telegram.messenger.hd.G(tL_messages_stickerSet6.documents.size(), "RemoveManyStickersCount", new Object[0]);
                }
                String str2 = G;
                if (z13) {
                    V0(new gv0(this, 10), str2, org.telegram.ui.ActionBar.k6.Gi, org.telegram.ui.ActionBar.k6.Ci, org.telegram.ui.ActionBar.k6.Ei);
                } else if (this.J1.set.official) {
                    U0(new gv0(this, 11), str2, org.telegram.ui.ActionBar.k6.f28089q7);
                } else {
                    U0(new gv0(this, 12), str2, org.telegram.ui.ActionBar.k6.f28089q7);
                }
            }
            this.f40732k1.f();
            return;
        }
        ArrayList arrayList5 = this.O1;
        if (arrayList5 != null) {
            w70 w70Var = this.n1;
            ArrayList arrayList6 = this.P1;
            if (arrayList6 != null) {
                size = arrayList6.size();
            } else {
                size = arrayList5.size();
            }
            w70Var.setText(org.telegram.messenger.hd.G(size, "Stickers", new Object[0]));
            HashMap hashMap = this.Q1;
            if (hashMap != null && !hashMap.isEmpty()) {
                U0(null, org.telegram.messenger.hd.M0(2131749228, null), org.telegram.ui.ActionBar.k6.f28087q5);
                this.f40739q1.setEnabled(false);
                return;
            }
            gv0 gv0Var2 = new gv0(this, 13);
            ArrayList arrayList7 = this.P1;
            if (arrayList7 != null) {
                size2 = arrayList7.size();
            } else {
                size2 = arrayList5.size();
            }
            U0(gv0Var2, org.telegram.messenger.hd.a0("ImportStickers", null, 2131749241, org.telegram.messenger.hd.G(size2, "Stickers", new Object[0])), org.telegram.ui.ActionBar.k6.f28029n5);
            this.f40739q1.setEnabled(true);
            return;
        }
        U0(new gv0(this, 14), org.telegram.messenger.hd.M0(2131752041, null), org.telegram.ui.ActionBar.k6.f28029n5);
    }

    public final void a1() {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        Point point = org.telegram.messenger.g0.f22537q;
        int min = (int) ((Math.min(point.x, point.y) / 2) / org.telegram.messenger.g0.f22536p);
        if (this.O1 != null) {
            this.f40743u1.setText(org.telegram.messenger.hd.M0(2131749227, null));
            org.telegram.ui.ActionBar.r6.V(this.f40743u1, org.telegram.ui.ActionBar.k6.f28089q7, this.I0);
            float f10 = min;
            this.f40745w1.setLayoutParams(c8.ha.d(min, f10, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.f40746x1.setLayoutParams(c8.ha.d(min, f10, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.f40743u1.setVisibility(0);
            this.f40744v1.setVisibility(0);
        } else if (this.S1 != null && ((tL_messages_stickerSet = this.J1) == null || !tL_messages_stickerSet.set.masks)) {
            this.f40743u1.setText(org.telegram.messenger.hd.M0(2131745590, null));
            float f11 = min;
            this.f40745w1.setLayoutParams(c8.ha.d(min, f11, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.f40746x1.setLayoutParams(c8.ha.d(min, f11, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.f40743u1.setVisibility(0);
            this.f40744v1.setVisibility(0);
        } else {
            this.f40743u1.setText(org.telegram.messenger.hd.M0(2131752041, null));
            this.f40745w1.setLayoutParams(c8.ha.e(min, min, 17));
            this.f40746x1.setLayoutParams(c8.ha.e(min, min, 17));
            this.f40743u1.setVisibility(8);
            this.f40744v1.setVisibility(8);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25001i4) {
            bi.q1 q1Var = this.f40730j1;
            if (q1Var != null) {
                int childCount = q1Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    this.f40730j1.getChildAt(i11).invalidate();
                }
            }
        } else if (i7 == org.telegram.messenger.qs.U1) {
            HashMap hashMap = this.Q1;
            if (hashMap != null) {
                String str = (String) objArr[0];
                org.telegram.messenger.zy zyVar = (org.telegram.messenger.zy) hashMap.get(str);
                if (zyVar != null) {
                    zyVar.a(this.f28612a, (TLRPC.InputFile) objArr[1], new ng(this, str, zyVar, 25));
                }
            }
        } else if (i7 == org.telegram.messenger.qs.V1) {
            HashMap hashMap2 = this.Q1;
            if (hashMap2 != null) {
                org.telegram.messenger.zy zyVar2 = (org.telegram.messenger.zy) hashMap2.remove((String) objArr[0]);
                if (zyVar2 != null) {
                    S0(zyVar2);
                }
                if (this.Q1.isEmpty()) {
                    Z0();
                }
            }
        } else if (i7 == org.telegram.messenger.qs.f25087x0) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
            if (this.M1 != null) {
                org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(this.f28612a);
                String str2 = this.M1.short_name;
                if (str2 != null) {
                    tL_messages_stickerSet = b02.p0(str2);
                }
                if (tL_messages_stickerSet == null) {
                    tL_messages_stickerSet = b02.o0(this.M1.f26972id);
                }
            }
            if (tL_messages_stickerSet != null && tL_messages_stickerSet != this.J1) {
                this.J1 = tL_messages_stickerSet;
                R0();
            }
            Z0();
        }
    }

    @Override
    public void dismiss() {
        super.dismiss();
        this.f40723c2.q(false);
        Runnable runnable = this.f40731j2;
        if (runnable != null) {
            runnable.run();
        }
        if (this.W1 != 0) {
            ConnectionsManager.getInstance(this.f28612a).cancelRequest(this.W1, true);
            this.W1 = 0;
        }
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25001i4);
        if (this.O1 != null) {
            ArrayList arrayList = this.P1;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    org.telegram.messenger.zy zyVar = (org.telegram.messenger.zy) this.P1.get(i7);
                    if (!zyVar.f26940c) {
                        org.telegram.messenger.w7.G(this.f28612a).b(zyVar.f26938a, false);
                    }
                    if (zyVar.f26941e) {
                        new File(zyVar.f26938a).delete();
                    }
                }
            }
            org.telegram.messenger.qs.f(this.f28612a).n(this, org.telegram.messenger.qs.U1);
            org.telegram.messenger.qs.f(this.f28612a).n(this, org.telegram.messenger.qs.V1);
        }
        org.telegram.messenger.qs.f(this.f28612a).n(this, org.telegram.messenger.qs.f25087x0);
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25009k1, 4);
    }

    @Override
    public final void n(Runnable runnable) {
        this.f40731j2 = runnable;
    }

    @Override
    public final void onBackPressed() {
        if (org.telegram.ui.ks.p().E) {
            org.telegram.ui.ks.p().n();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onStart() {
        super.onStart();
        cc.a((FrameLayout) this.f28615b, new ch.v(this, 9));
    }

    @Override
    public final void onStop() {
        super.onStop();
        cc.h((FrameLayout) this.f28615b);
    }

    @Override
    public final void s0() {
        super.s0();
        X0(false);
        try {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27921h5, this.I0);
            if (this.f28642r0 != null && w02 != this.f40736m2) {
                this.f40736m2 = w02;
                v0(w02);
            }
            ViewGroup viewGroup = this.f28615b;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void show() {
        super.show();
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25004j1, 4);
    }

    public yv0(Context context, String str, ArrayList arrayList, ArrayList arrayList2) {
        super(1, context, (org.telegram.ui.ActionBar.f6) null, false);
        this.f40748z1 = new AnimatorSet[2];
        this.A1 = new View[2];
        this.f40721a2 = true;
        this.f40723c2 = new a8.b8(6);
        this.d2 = new nv0(this);
        N();
        this.E1 = (Activity) context;
        this.O1 = arrayList;
        this.R1 = str;
        Utilities.f21333e.c(new ng(this, arrayList, arrayList2, 29));
        P0(context);
    }

    public yv0(Context context, org.telegram.ui.ActionBar.f2 f2Var, TLRPC.InputStickerSet inputStickerSet, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, vv0 vv0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, false);
        this.f40748z1 = new AnimatorSet[2];
        this.A1 = new View[2];
        this.f40721a2 = true;
        this.f40723c2 = new a8.b8(6);
        this.d2 = new nv0(this);
        N();
        this.S1 = vv0Var;
        this.M1 = inputStickerSet;
        this.J1 = tL_messages_stickerSet;
        this.C1 = f2Var;
        R0();
        P0(context);
    }
}
