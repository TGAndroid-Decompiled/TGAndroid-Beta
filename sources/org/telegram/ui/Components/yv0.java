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
public class yv0 extends org.telegram.ui.ActionBar.w2 implements org.telegram.messenger.ls {
    public static final int f40735q2 = 0;
    public TextView A1;
    public j B1;
    public final AnimatorSet[] C1;
    public final View[] D1;
    public bi.e5 E1;
    public final org.telegram.ui.ActionBar.f2 F1;
    public ei.h G1;
    public final Activity H1;
    public int I1;
    public int J1;
    public boolean K1;
    public boolean L1;
    public TLRPC.TL_messages_stickerSet M1;
    public TLRPC.Document N1;
    public org.telegram.messenger.zy O1;
    public TLRPC.InputStickerSet P1;
    public ArrayList Q1;
    public final ArrayList R1;
    public ArrayList S1;
    public HashMap T1;
    public final String U1;
    public final vv0 V1;
    public wv0 W1;
    public org.telegram.ui.j50 X1;
    public int Y1;
    public int Z1;
    public boolean f40736a2;
    public boolean f40737b2;
    public boolean f40738c2;
    public boolean d2;
    public int f40739e2;
    public final a8.b8 f40740f2;
    public final nv0 f40741g2;
    public mg f40742h2;
    public String f40743i2;
    public int f40744j2;
    public boolean f40745k2;
    public Pattern l1;
    public String f40746l2;
    public bi.q1 f40747m1;
    public Runnable f40748m2;
    public uv0 n1;
    public ArrayList f40749n2;
    public v4.y f40750o1;
    public int f40751o2;
    public TLRPC.Document f40752p1;
    public int f40753p2;
    public w70 f40754q1;
    public org.telegram.ui.ActionBar.r0 f40755r1;
    public org.telegram.ui.ActionBar.z0 f40756s1;
    public i6 f40757t1;
    public ug.p0 f40758u1;
    public FrameLayout f40759v1;
    public FrameLayout f40760w1;
    public TextView f40761x1;
    public View f40762y1;
    public k9 f40763z1;

    public yv0(Context context, Object obj, TLObject tLObject, org.telegram.ui.ActionBar.h6 h6Var) {
        super(1, context, h6Var, false);
        this.C1 = new AnimatorSet[2];
        this.D1 = new View[2];
        this.d2 = true;
        this.f40740f2 = new a8.b8(6);
        this.f40741g2 = new nv0(this);
        this.I0 = h6Var;
        N();
        this.H1 = (Activity) context;
        TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = new TLRPC.TL_messages_getAttachedStickers();
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.Photo photo = (TLRPC.Photo) tLObject;
            TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = new TLRPC.TL_inputStickeredMediaPhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputStickeredMediaPhoto.f27030id = tL_inputPhoto;
            tL_inputPhoto.f26979id = photo.f26984id;
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
            tL_inputStickeredMediaDocument.f27029id = tL_inputDocument;
            tL_inputDocument.f26972id = document.f26966id;
            tL_inputDocument.access_hash = document.access_hash;
            byte[] bArr2 = document.file_reference;
            tL_inputDocument.file_reference = bArr2;
            if (bArr2 == null) {
                tL_inputDocument.file_reference = new byte[0];
            }
            tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
        }
        org.telegram.ui.so0 so0Var = (org.telegram.ui.so0) this;
        this.Z1 = ConnectionsManager.getInstance(this.f28669a).sendRequest(tL_messages_getAttachedStickers, new bi.g2(so0Var, obj, tL_messages_getAttachedStickers, new org.telegram.ui.ld(21, so0Var, tL_messages_getAttachedStickers), 12));
        P0(context);
    }

    public static void I0(yv0 yv0Var) {
        if (yv0Var.f40747m1.getChildCount() <= 0) {
            yv0Var.W0(yv0Var.f40747m1.getPaddingTop());
            return;
        }
        int i7 = 0;
        View view = null;
        int i10 = -1;
        for (int i11 = 0; i11 < yv0Var.f40747m1.getChildCount(); i11++) {
            View childAt = yv0Var.f40747m1.getChildAt(i11);
            yv0Var.f40747m1.getClass();
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
        if (yv0Var.Y1 != i7) {
            yv0Var.W0(i7);
        }
    }

    public static void M0(org.telegram.ui.ActionBar.f2 f2Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, TLRPC.Document document) {
        org.telegram.ui.cn cnVar;
        boolean z9;
        TLRPC.StickerSet stickerSet;
        if (f2Var != null) {
            if (f2Var instanceof org.telegram.ui.cn) {
                cnVar = (org.telegram.ui.cn) f2Var;
            } else {
                cnVar = null;
            }
            if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.creator) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (document != null && document.mime_type.equals("image/webp")) {
                ArrayList arrayList = new ArrayList();
                org.telegram.messenger.w7.G(org.telegram.messenger.p10.f24474s0);
                File J = org.telegram.messenger.w7.J(document, null, true, true);
                if (J != null && J.exists()) {
                    org.telegram.messenger.g0.i3(new kg.o0(J, arrayList, f2Var, cnVar, document, z9, tL_messages_stickerSet), 300L);
                    return;
                }
                return;
            }
            org.telegram.messenger.g0.i3(new fi.q1((Object) f2Var, (Object) tL_messages_stickerSet, (Object) document, (Object) cnVar, z9, 10), 300L);
        }
    }

    @Override
    public final void D(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.I5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.F8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.E8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.xj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28036l5));
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final void J0() {
        if (this.M1 != null) {
            TLRPC.TL_messages_stickerSet x02 = org.telegram.messenger.qp.s1(this.f28669a).x0(this.M1);
            this.M1 = x02;
            if (x02 == null) {
                dismiss();
            }
        }
    }

    public final void K0(TextView textView, String str, boolean z9) {
        if (z9) {
            textView.setText(org.telegram.messenger.id.M0(2131749235, null));
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28244w6, this.I0);
            this.f40745k2 = true;
            this.f40743i2 = str;
            return;
        }
        mg mgVar = this.f40742h2;
        if (mgVar != null) {
            org.telegram.messenger.g0.r(mgVar);
            this.f40742h2 = null;
            this.f40743i2 = null;
            if (this.f40744j2 != 0) {
                ConnectionsManager.getInstance(this.f28669a).cancelRequest(this.f40744j2, true);
            }
        }
        if (TextUtils.isEmpty(str)) {
            textView.setText(org.telegram.messenger.id.M0(2131749237, null));
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28129q5, this.I0);
            return;
        }
        this.f40745k2 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                int length = str.length();
                for (int i7 = 0; i7 < length; i7++) {
                    char charAt = str.charAt(i7);
                    if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        textView.setText(org.telegram.messenger.id.M0(2131749237, null));
                        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28111p7, this.I0);
                        return;
                    }
                }
            } else {
                textView.setText(org.telegram.messenger.id.M0(2131749233, null));
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28111p7, this.I0);
                return;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 32) {
                textView.setText(org.telegram.messenger.id.M0(2131749232, null));
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28111p7, this.I0);
                return;
            }
            textView.setText(org.telegram.messenger.id.M0(2131749234, null));
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.F6, this.I0);
            this.f40743i2 = str;
            mg mgVar2 = new mg(this, str, textView, 28);
            this.f40742h2 = mgVar2;
            org.telegram.messenger.g0.i3(mgVar2, 300L);
            return;
        }
        textView.setText(org.telegram.messenger.id.M0(2131749231, null));
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28111p7, this.I0);
    }

    public final void L0() {
        if (!this.L1) {
            return;
        }
        this.f40750o1.h(null);
        this.L1 = false;
        this.f40740f2.q(true);
        org.telegram.messenger.g0.d0(this.f40747m1, new di.e(15));
        this.f40755r1.postDelayed(new jv0(this, 0), 200L);
        this.f40757t1.c(org.telegram.messenger.id.M0(2131751221, null), true, true);
    }

    public final void N0() {
        if (this.L1) {
            return;
        }
        this.f40750o1.h(this.f40747m1);
        this.L1 = true;
        a8.b8 b8Var = this.f40740f2;
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
            long nextFloat = Utilities.f21339b.nextFloat() * 300;
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
        org.telegram.messenger.g0.d0(this.f40747m1, new di.e(16));
        this.f40755r1.postDelayed(new jv0(this, 1), 200L);
        this.f40757t1.c(org.telegram.messenger.id.M0(2131751354, null), true, true);
    }

    public final void O0() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f40760w1, View.ALPHA, 0.0f));
        animatorSet.setDuration(200L);
        animatorSet.addListener(new e60(this, 24));
        animatorSet.start();
    }

    public final void P0(Context context) {
        int i7;
        qv0 qv0Var = new qv0(this, context);
        this.f28672b = qv0Var;
        qv0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.f28672b;
        int i10 = this.f28705t0;
        viewGroup.setPadding(i10, 0, i10, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.g0.L(48.0f);
        View view = new View(context);
        View[] viewArr = this.D1;
        viewArr[0] = view;
        int i11 = org.telegram.ui.ActionBar.m6.V5;
        org.telegram.ui.ActionBar.t6.h(i11, view, this.I0);
        viewArr[0].setAlpha(0.0f);
        viewArr[0].setVisibility(4);
        viewArr[0].setTag(1);
        this.f28672b.addView(viewArr[0], layoutParams);
        bi.q1 q1Var = new bi.q1(27, context, this);
        this.f40747m1 = q1Var;
        q1Var.setTag(14);
        bi.q1 q1Var2 = this.f40747m1;
        getContext();
        ei.h hVar = new ei.h(this);
        this.G1 = hVar;
        q1Var2.setLayoutManager(hVar);
        this.G1.O = new ai.l(this, 10);
        this.f40750o1 = new v4.y(new rv0(this));
        bi.q1 q1Var3 = this.f40747m1;
        uv0 uv0Var = new uv0(this, context);
        this.n1 = uv0Var;
        q1Var3.setAdapter(uv0Var);
        this.f40747m1.setVerticalScrollBarEnabled(false);
        this.f40747m1.i(new di.k(12));
        this.f40747m1.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        this.f40747m1.setClipToPadding(false);
        this.f40747m1.setEnabled(true);
        org.telegram.ui.ActionBar.t6.H(this.f40747m1, org.telegram.ui.ActionBar.m6.A5, this.I0);
        this.f40747m1.setOnTouchListener(new yj(this, 6));
        this.f40747m1.setOnScrollListener(new ti(this, 18));
        j jVar = new j(this, 16);
        this.B1 = jVar;
        this.f40747m1.setOnItemClickListener(jVar);
        this.f28672b.addView(this.f40747m1, c8.ha.d(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 48.0f));
        bi.e5 e5Var = new bi.e5(27, context, this);
        this.E1 = e5Var;
        this.f28672b.addView(e5Var, c8.ha.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.f40747m1.setEmptyView(this.E1);
        this.E1.setOnTouchListener(new ei.b(24));
        w70 w70Var = new w70(context, null);
        this.f40754q1 = w70Var;
        w70Var.setLines(1);
        this.f40754q1.setSingleLine(true);
        org.telegram.ui.ActionBar.t6.U(this.f40754q1, org.telegram.ui.ActionBar.m6.f27998j5, this.I0);
        this.f40754q1.setTextSize(1, 20.0f);
        org.telegram.ui.ActionBar.t6.G(this.f40754q1, org.telegram.ui.ActionBar.m6.f28018k5, this.I0);
        this.f40754q1.setEllipsize(TextUtils.TruncateAt.END);
        this.f40754q1.setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(6.0f));
        this.f40754q1.setGravity(16);
        this.f40754q1.setTypeface(org.telegram.messenger.g0.o());
        this.f28672b.addView(this.f40754q1, c8.ha.d(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        org.telegram.ui.ActionBar.r0 r0Var = new org.telegram.ui.ActionBar.r0(context, null, 0, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.xj, this.I0), false, this.I0);
        this.f40755r1 = r0Var;
        r0Var.setLongClickEnabled(false);
        this.f40755r1.setSubMenuOpenSide(2);
        this.f40755r1.setIcon(2131231244);
        org.telegram.ui.ActionBar.r0 r0Var2 = this.f40755r1;
        int i12 = org.telegram.ui.ActionBar.m6.Bj;
        org.telegram.ui.ActionBar.t6.Q(r0Var2, org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i12, this.I0), 1, -1), null, org.telegram.ui.ActionBar.t6.M(i12), this.I0);
        this.f28672b.addView(this.f40755r1, c8.ha.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        this.f40755r1.e(1, 2131232363, org.telegram.messenger.id.M0(2131744846, null));
        this.f40755r1.e(2, 2131232203, org.telegram.messenger.id.M0(2131751762, null));
        this.f40755r1.setOnClickListener(new hv0(this, 1));
        this.f40755r1.setDelegate(new iv0(this));
        this.f40755r1.setContentDescription(org.telegram.messenger.id.M0(2131754839, null));
        org.telegram.ui.ActionBar.r0 r0Var3 = this.f40755r1;
        if (this.P1 != null) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        r0Var3.setVisibility(i7);
        this.E1.addView(new RadialProgressView(context, null), c8.ha.e(-2, -2, 17));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83);
        layoutParams2.bottomMargin = org.telegram.messenger.g0.L(48.0f);
        View view2 = new View(context);
        viewArr[1] = view2;
        org.telegram.ui.ActionBar.t6.h(i11, view2, this.I0);
        this.f28672b.addView(viewArr[1], layoutParams2);
        i6 i6Var = new i6(context, false, false, false);
        this.f40757t1 = i6Var;
        int i13 = org.telegram.ui.ActionBar.m6.f27963h5;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i13, this.I0);
        int i14 = org.telegram.ui.ActionBar.m6.f27982i6;
        org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.m6.i0(w02, org.telegram.ui.ActionBar.m6.w0(i14, this.I0));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i13);
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i14);
        org.telegram.ui.ActionBar.h6 h6Var = this.I0;
        i6Var.setBackground(i02);
        org.telegram.ui.ActionBar.t6.j(i6Var, i02, M, M2, h6Var);
        i6 i6Var2 = this.f40757t1;
        int i15 = org.telegram.ui.ActionBar.m6.f28071n5;
        this.f40739e2 = i15;
        org.telegram.ui.ActionBar.t6.Y(i6Var2, i15, this.I0);
        this.f40757t1.setTextSize(org.telegram.messenger.g0.L(14.0f));
        this.f40757t1.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        this.f40757t1.setTypeface(org.telegram.messenger.g0.o());
        this.f40757t1.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f40759v1 = frameLayout;
        frameLayout.addView(this.f40757t1, c8.ha.c(48.0f, -1));
        this.f28672b.addView(this.f40759v1, c8.ha.e(-1, -2, 83));
        ug.p0 p0Var = new ug.p0(org.telegram.messenger.g0.L(24.0f), context, this.I0, false);
        this.f40758u1 = p0Var;
        p0Var.setIcon(2131624314);
        this.f40758u1.setVisibility(4);
        this.f28672b.addView(this.f40758u1, c8.ha.d(-1, 48.0f, 87, 8.0f, 0.0f, 8.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f40760w1 = frameLayout2;
        frameLayout2.setVisibility(8);
        this.f40760w1.setSoundEffectsEnabled(false);
        this.f28672b.addView(this.f40760w1, c8.ha.c(-1.0f, -1));
        this.f40760w1.setOnClickListener(new hv0(this, 2));
        k9 k9Var = new k9(context);
        this.f40763z1 = k9Var;
        k9Var.setAspectFit(true);
        this.f40763z1.setLayerNum(7);
        this.f40760w1.addView(this.f40763z1);
        TextView textView = new TextView(context);
        this.A1 = textView;
        textView.setTextSize(1, 30.0f);
        this.A1.setGravity(85);
        this.f40760w1.addView(this.A1);
        TextView textView2 = new TextView(context);
        this.f40761x1 = textView2;
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(this.f40761x1, i15, this.I0);
        org.telegram.ui.ActionBar.t6.Q(this.f40761x1, org.telegram.ui.ActionBar.m6.i0(org.telegram.ui.ActionBar.m6.w0(i13, this.I0), org.telegram.ui.ActionBar.m6.w0(i14, this.I0)), org.telegram.ui.ActionBar.t6.M(i13), org.telegram.ui.ActionBar.t6.M(i14), this.I0);
        this.f40761x1.setGravity(17);
        this.f40761x1.setPadding(org.telegram.messenger.g0.L(29.0f), 0, org.telegram.messenger.g0.L(29.0f), 0);
        this.f40761x1.setTypeface(org.telegram.messenger.g0.o());
        this.f40760w1.addView(this.f40761x1, c8.ha.e(-1, 48, 83));
        this.f40761x1.setOnClickListener(new hv0(this, 3));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83);
        layoutParams3.bottomMargin = org.telegram.messenger.g0.L(48.0f);
        View view3 = new View(context);
        this.f40762y1 = view3;
        org.telegram.ui.ActionBar.t6.h(i11, view3, this.I0);
        this.f40760w1.addView(this.f40762y1, layoutParams3);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25022i4);
        if (this.R1 != null) {
            org.telegram.messenger.qs.f(this.f28669a).c(this, org.telegram.messenger.qs.U1);
            org.telegram.messenger.qs.f(this.f28669a).c(this, org.telegram.messenger.qs.V1);
        }
        org.telegram.messenger.qs.f(this.f28669a).c(this, org.telegram.messenger.qs.f25108x0);
        Z0();
        a1();
        Y0();
        X0(false);
        this.n1.f();
    }

    public final boolean Q0() {
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.M1;
        if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.emojis) {
            if (tL_messages_stickerSet == null && this.K1) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void R0() {
        String str;
        if (this.P1 != null) {
            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(this.f28669a);
            if (this.M1 == null && (str = this.P1.short_name) != null) {
                this.M1 = b02.p0(str);
            }
            if (this.M1 == null) {
                this.M1 = b02.o0(this.P1.f26980id);
            }
            if (this.M1 == null) {
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                tL_messages_getStickerSet.stickerset = this.P1;
                ConnectionsManager.getInstance(this.f28669a).sendRequest(tL_messages_getStickerSet, new org.telegram.ui.ld(20, this, b02));
            } else {
                if (this.n1 != null) {
                    a1();
                    Z0();
                    this.n1.f();
                }
                Y0();
                b02.q1(this.M1);
                J0();
            }
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.M1;
        if (tL_messages_stickerSet != null) {
            this.f40737b2 = !tL_messages_stickerSet.set.masks;
        }
        J0();
    }

    public final void S0(org.telegram.messenger.zy zyVar) {
        int indexOf = this.S1.indexOf(zyVar);
        if (indexOf >= 0) {
            this.S1.remove(indexOf);
            this.n1.s(indexOf);
            if (this.S1.isEmpty()) {
                dismiss();
            } else {
                Z0();
            }
        }
    }

    public final void T0(int i7, boolean z9) {
        Integer num;
        float f10;
        if (this.Q1 == null) {
            View[] viewArr = this.D1;
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
                AnimatorSet[] animatorSetArr = this.C1;
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
        r6 r6Var = new r6(this, 6);
        ViewGroup viewGroup = this.f28672b;
        Drawable[] drawableArr = {this.f28702r0};
        int i7 = org.telegram.ui.ActionBar.m6.f27963h5;
        arrayList.add(new org.telegram.ui.ActionBar.v6(viewGroup, 0, (Class[]) null, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f28672b, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.wj));
        if (this.n1.f38757r.Q1 != null) {
            org.telegram.ui.Cells.u3.a(arrayList, r6Var);
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f40755r1, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Bj));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f40757t1, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        i6 i6Var = this.f40757t1;
        int i10 = org.telegram.ui.ActionBar.m6.f27982i6;
        arrayList.add(new org.telegram.ui.ActionBar.v6(i6Var, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f40757t1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, this.f40739e2));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f40761x1, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f40761x1, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        return arrayList;
    }

    public final void U0(View.OnClickListener onClickListener, String str, int i7) {
        V0(onClickListener, str, i7, -1, -1);
    }

    public final void V0(View.OnClickListener onClickListener, String str, int i7, int i10, int i11) {
        if (i7 >= 0) {
            i6 i6Var = this.f40757t1;
            this.f40739e2 = i7;
            org.telegram.ui.ActionBar.t6.Y(i6Var, i7, this.I0);
        }
        this.f40757t1.c(str, false, true);
        this.f40757t1.setOnClickListener(onClickListener);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f40757t1.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.D1[1].getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.f40747m1.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.E1.getLayoutParams();
        if (onClickListener == null) {
            this.f40757t1.setAlpha(0.0f);
        } else if (i10 >= 0 && i11 >= 0) {
            i6 i6Var2 = this.f40757t1;
            int L = org.telegram.messenger.g0.L(24.0f);
            int w02 = org.telegram.ui.ActionBar.m6.w0(i10, this.I0);
            int w03 = org.telegram.ui.ActionBar.m6.w0(i11, this.I0);
            org.telegram.ui.ActionBar.t6.Q(i6Var2, org.telegram.ui.ActionBar.m6.k0(L, L, L, L, w02, w03, w03), org.telegram.ui.ActionBar.t6.M(i10), org.telegram.ui.ActionBar.t6.M(i11), this.I0);
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27963h5, this.f40759v1, this.I0);
            int L2 = org.telegram.messenger.g0.L(8.0f);
            marginLayoutParams.bottomMargin = L2;
            marginLayoutParams.rightMargin = L2;
            marginLayoutParams.topMargin = L2;
            marginLayoutParams.leftMargin = L2;
            int L3 = org.telegram.messenger.g0.L(64.0f);
            marginLayoutParams2.bottomMargin = L3;
            marginLayoutParams3.bottomMargin = L3;
            marginLayoutParams4.bottomMargin = L3;
            if (this.f40757t1.getAlpha() < 1.0f) {
                org.telegram.messenger.camera.q.l(this.f40757t1.animate().alpha(1.0f), wq.h, 240L);
            }
        } else {
            i6 i6Var3 = this.f40757t1;
            int i12 = org.telegram.ui.ActionBar.m6.f27963h5;
            int w04 = org.telegram.ui.ActionBar.m6.w0(i12, this.I0);
            int i13 = org.telegram.ui.ActionBar.m6.f28131q7;
            org.telegram.ui.ActionBar.t6.Q(i6Var3, org.telegram.ui.ActionBar.m6.i0(w04, org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(i13, this.I0))), org.telegram.ui.ActionBar.t6.M(i12), org.telegram.ui.ActionBar.t6.K(0.1f, i13), this.I0);
            this.f40759v1.setBackgroundColor(0);
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.rightMargin = 0;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            int L4 = org.telegram.messenger.g0.L(48.0f);
            marginLayoutParams2.bottomMargin = L4;
            marginLayoutParams3.bottomMargin = L4;
            marginLayoutParams4.bottomMargin = L4;
            if (this.f40757t1.getAlpha() < 1.0f) {
                org.telegram.messenger.camera.q.l(this.f40757t1.animate().alpha(1.0f), wq.h, 240L);
            }
        }
        this.f28672b.requestLayout();
    }

    public final void W0(int i7) {
        this.Y1 = i7;
        if (this.Q1 == null) {
            float f10 = i7;
            this.f40754q1.setTranslationY(f10);
            if (this.R1 == null) {
                this.f40755r1.setTranslationY(f10);
            }
            this.D1[0].setTranslationY(f10);
        }
        this.f28672b.invalidate();
    }

    public final void X0(boolean z9) {
        this.n1.getClass();
        this.f40754q1.setHighlightColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28036l5, this.I0));
        this.f40760w1.setBackgroundColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27963h5, this.I0) & (-536870913));
        this.f40755r1.setIconColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.xj, this.I0));
        this.f40755r1.O(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.E8, this.I0), false);
        this.f40755r1.O(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.F8, this.I0), true);
        this.f40755r1.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.I5, this.I0));
        this.f40755r1.H(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G8, this.I0));
        if (this.f40756s1 != null) {
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28131q7, this.I0);
            this.f40756s1.d(w02, w02);
            this.f40756s1.setSelectorColor(org.telegram.ui.ActionBar.m6.r1(0.1f, w02));
            if (this.f40756s1.getRightIcon() != null && w02 != this.f40751o2) {
                this.f40751o2 = w02;
                this.f40756s1.getRightIcon().setColorFilter(w02);
            }
        }
        if (z9) {
            if (org.telegram.ui.ActionBar.m6.h1() && this.f40749n2 == null) {
                ArrayList U = U();
                this.f40749n2 = U;
                int size = U.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((org.telegram.ui.ActionBar.v6) this.f40749n2.get(i7)).f28633g = null;
                }
            }
            int size2 = this.f40749n2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                org.telegram.ui.ActionBar.v6 v6Var = (org.telegram.ui.ActionBar.v6) this.f40749n2.get(i10);
                v6Var.e(org.telegram.ui.ActionBar.m6.w0(v6Var.f28631e, this.I0), false, false);
            }
        }
        if (!org.telegram.ui.ActionBar.m6.h1() && this.f40749n2 != null) {
            this.f40749n2 = null;
        }
    }

    public final void Y0() {
        if (this.f28672b != null && !org.telegram.messenger.p10.i(this.f28669a).q()) {
            org.telegram.messenger.ij.V3(this.M1);
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
        if (this.f40754q1 == null) {
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.M1;
        int i15 = 1;
        if (tL_messages_stickerSet != null && (arrayList = tL_messages_stickerSet.documents) != null && !arrayList.isEmpty()) {
            CharSequence m10 = org.telegram.messenger.i6.m(this.M1.set.title, this.f40754q1.getPaint().getFontMetricsInt(), false, null, 0);
            try {
                if (this.l1 == null) {
                    this.l1 = Pattern.compile("@[a-zA-Z\\d_]{1,32}");
                }
                Matcher matcher = this.l1.matcher(m10);
                SpannableStringBuilder spannableStringBuilder = null;
                while (matcher.find()) {
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder(m10);
                    }
                    int start = matcher.start();
                    int end = matcher.end();
                    if (this.M1.set.title.charAt(start) != '@') {
                        start++;
                    }
                    spannableStringBuilder.setSpan(new h4(m10.subSequence(start + 1, end).toString(), 1, this), start, end, 0);
                }
                if (spannableStringBuilder != null) {
                    m10 = spannableStringBuilder;
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            this.f40754q1.setText(m10);
            if (Q0()) {
                int measuredWidth = this.f40747m1.getMeasuredWidth();
                if (measuredWidth == 0) {
                    measuredWidth = org.telegram.messenger.g0.f22567q.x;
                }
                uv0 uv0Var = this.n1;
                if (org.telegram.messenger.g0.Q1()) {
                    f10 = 60.0f;
                } else {
                    f10 = 45.0f;
                }
                uv0Var.d = Math.max(1, measuredWidth / org.telegram.messenger.g0.L(f10));
            } else {
                this.n1.d = 5;
            }
            this.G1.y1(this.n1.d);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.M1;
            int i16 = -1;
            if (tL_messages_stickerSet2 != null && (stickerSet7 = tL_messages_stickerSet2.set) != null && stickerSet7.emojis && !org.telegram.messenger.p10.i(this.f28669a).q() && this.X1 == null) {
                if (this.M1.documents != null) {
                    for (int i17 = 0; i17 < this.M1.documents.size(); i17++) {
                        if (!org.telegram.messenger.ij.m3(this.M1.documents.get(i17))) {
                            this.f40758u1.setVisibility(0);
                            this.f40757t1.setBackground(null);
                            U0(null, null, -1);
                            this.f40758u1.b(org.telegram.messenger.id.M0(2131743865, null), new hv0(this, 0), false);
                            return;
                        }
                    }
                }
            } else {
                this.f40758u1.setVisibility(4);
            }
            org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(this.f28669a);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = this.M1;
            if (tL_messages_stickerSet3 != null && (stickerSet6 = tL_messages_stickerSet3.set) != null && stickerSet6.emojis) {
                ArrayList s02 = b02.s0(5);
                for (int i18 = 0; s02 != null && i18 < s02.size(); i18++) {
                    if (s02.get(i18) != null && ((TLRPC.TL_messages_stickerSet) s02.get(i18)).set != null && ((TLRPC.TL_messages_stickerSet) s02.get(i18)).set.f26987id == this.M1.set.f26987id) {
                        z10 = true;
                        break;
                    }
                }
                z10 = false;
                z9 = !z10;
            } else if (tL_messages_stickerSet3 != null && (stickerSet = tL_messages_stickerSet3.set) != null && b02.B0(stickerSet.f26987id, true)) {
                z9 = false;
            } else {
                z9 = true;
            }
            org.telegram.ui.j50 j50Var = this.X1;
            if (j50Var != null) {
                hv0 hv0Var = new hv0(this, 5);
                boolean z11 = j50Var.f46822a;
                if (j50Var.f46824c.N) {
                    if (z11) {
                        i14 = 2131746310;
                    } else {
                        i14 = 2131745544;
                    }
                    M0 = org.telegram.messenger.id.M0(i14, null);
                } else {
                    if (z11) {
                        i11 = 2131746309;
                    } else {
                        i11 = 2131745543;
                    }
                    M0 = org.telegram.messenger.id.M0(i11, null);
                }
                String str = M0;
                boolean z12 = this.X1.f46822a;
                if (z12) {
                    i12 = org.telegram.ui.ActionBar.m6.f28131q7;
                } else {
                    i12 = org.telegram.ui.ActionBar.m6.Gi;
                }
                if (!z12) {
                    i13 = org.telegram.ui.ActionBar.m6.Ci;
                } else {
                    i13 = -1;
                }
                if (!z12) {
                    i16 = org.telegram.ui.ActionBar.m6.Ei;
                }
                V0(hv0Var, str, i12, i13, i16);
                return;
            }
            if (z9) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = this.M1;
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
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = this.M1;
                if (tL_messages_stickerSet5 != null && (stickerSet3 = tL_messages_stickerSet5.set) != null && stickerSet3.masks) {
                    ArrayList<TLRPC.Document> arrayList3 = tL_messages_stickerSet5.documents;
                    if (arrayList3 == null) {
                        size4 = 0;
                    } else {
                        size4 = arrayList3.size();
                    }
                    G2 = org.telegram.messenger.id.G(size4, "AddManyMasksCount", new Object[0]);
                } else if (tL_messages_stickerSet5 != null && (stickerSet2 = tL_messages_stickerSet5.set) != null && stickerSet2.emojis) {
                    ArrayList<TLRPC.Document> arrayList4 = tL_messages_stickerSet5.documents;
                    if (arrayList4 == null) {
                        size3 = 0;
                    } else {
                        size3 = arrayList4.size();
                    }
                    G2 = org.telegram.messenger.id.G(size3, "AddManyEmojiCount", new Object[0]);
                } else {
                    if (tL_messages_stickerSet5 != null && (arrayList2 = tL_messages_stickerSet5.documents) != null) {
                        i10 = arrayList2.size();
                    } else {
                        i10 = 0;
                    }
                    G2 = org.telegram.messenger.id.G(i10, "AddManyStickersCount", new Object[0]);
                }
                V0(new hv0(this, 9), G2, org.telegram.ui.ActionBar.m6.Gi, org.telegram.ui.ActionBar.m6.Ci, org.telegram.ui.ActionBar.m6.Ei);
            } else {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet6 = this.M1;
                TLRPC.StickerSet stickerSet8 = tL_messages_stickerSet6.set;
                boolean z13 = stickerSet8.creator;
                if (z13) {
                    if (this.L1) {
                        i7 = 2131751354;
                    } else {
                        i7 = 2131751221;
                    }
                    G = org.telegram.messenger.id.M0(i7, null);
                } else if (stickerSet8.masks) {
                    G = org.telegram.messenger.id.G(tL_messages_stickerSet6.documents.size(), "RemoveManyMasksCount", new Object[0]);
                } else if (stickerSet8.emojis) {
                    G = org.telegram.messenger.id.G(tL_messages_stickerSet6.documents.size(), "RemoveManyEmojiCount", new Object[0]);
                } else {
                    G = org.telegram.messenger.id.G(tL_messages_stickerSet6.documents.size(), "RemoveManyStickersCount", new Object[0]);
                }
                String str2 = G;
                if (z13) {
                    V0(new hv0(this, 10), str2, org.telegram.ui.ActionBar.m6.Gi, org.telegram.ui.ActionBar.m6.Ci, org.telegram.ui.ActionBar.m6.Ei);
                } else if (this.M1.set.official) {
                    U0(new hv0(this, 11), str2, org.telegram.ui.ActionBar.m6.f28131q7);
                } else {
                    U0(new hv0(this, 12), str2, org.telegram.ui.ActionBar.m6.f28131q7);
                }
            }
            this.n1.f();
            return;
        }
        ArrayList arrayList5 = this.R1;
        if (arrayList5 != null) {
            w70 w70Var = this.f40754q1;
            ArrayList arrayList6 = this.S1;
            if (arrayList6 != null) {
                size = arrayList6.size();
            } else {
                size = arrayList5.size();
            }
            w70Var.setText(org.telegram.messenger.id.G(size, "Stickers", new Object[0]));
            HashMap hashMap = this.T1;
            if (hashMap != null && !hashMap.isEmpty()) {
                U0(null, org.telegram.messenger.id.M0(2131749229, null), org.telegram.ui.ActionBar.m6.f28129q5);
                this.f40757t1.setEnabled(false);
                return;
            }
            hv0 hv0Var2 = new hv0(this, 13);
            ArrayList arrayList7 = this.S1;
            if (arrayList7 != null) {
                size2 = arrayList7.size();
            } else {
                size2 = arrayList5.size();
            }
            U0(hv0Var2, org.telegram.messenger.id.a0("ImportStickers", null, 2131749242, org.telegram.messenger.id.G(size2, "Stickers", new Object[0])), org.telegram.ui.ActionBar.m6.f28071n5);
            this.f40757t1.setEnabled(true);
            return;
        }
        U0(new hv0(this, 14), org.telegram.messenger.id.M0(2131752041, null), org.telegram.ui.ActionBar.m6.f28071n5);
    }

    public final void a1() {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        Point point = org.telegram.messenger.g0.f22567q;
        int min = (int) ((Math.min(point.x, point.y) / 2) / org.telegram.messenger.g0.f22566p);
        if (this.R1 != null) {
            this.f40761x1.setText(org.telegram.messenger.id.M0(2131749228, null));
            org.telegram.ui.ActionBar.t6.U(this.f40761x1, org.telegram.ui.ActionBar.m6.f28131q7, this.I0);
            float f10 = min;
            this.f40763z1.setLayoutParams(c8.ha.d(min, f10, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.A1.setLayoutParams(c8.ha.d(min, f10, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.f40761x1.setVisibility(0);
            this.f40762y1.setVisibility(0);
        } else if (this.V1 != null && ((tL_messages_stickerSet = this.M1) == null || !tL_messages_stickerSet.set.masks)) {
            this.f40761x1.setText(org.telegram.messenger.id.M0(2131745589, null));
            float f11 = min;
            this.f40763z1.setLayoutParams(c8.ha.d(min, f11, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.A1.setLayoutParams(c8.ha.d(min, f11, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.f40761x1.setVisibility(0);
            this.f40762y1.setVisibility(0);
        } else {
            this.f40761x1.setText(org.telegram.messenger.id.M0(2131752041, null));
            this.f40763z1.setLayoutParams(c8.ha.e(min, min, 17));
            this.A1.setLayoutParams(c8.ha.e(min, min, 17));
            this.f40761x1.setVisibility(8);
            this.f40762y1.setVisibility(8);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25022i4) {
            bi.q1 q1Var = this.f40747m1;
            if (q1Var != null) {
                int childCount = q1Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    this.f40747m1.getChildAt(i11).invalidate();
                }
            }
        } else if (i7 == org.telegram.messenger.qs.U1) {
            HashMap hashMap = this.T1;
            if (hashMap != null) {
                String str = (String) objArr[0];
                org.telegram.messenger.zy zyVar = (org.telegram.messenger.zy) hashMap.get(str);
                if (zyVar != null) {
                    zyVar.a(this.f28669a, (TLRPC.InputFile) objArr[1], new mg(this, str, zyVar, 25));
                }
            }
        } else if (i7 == org.telegram.messenger.qs.V1) {
            HashMap hashMap2 = this.T1;
            if (hashMap2 != null) {
                org.telegram.messenger.zy zyVar2 = (org.telegram.messenger.zy) hashMap2.remove((String) objArr[0]);
                if (zyVar2 != null) {
                    S0(zyVar2);
                }
                if (this.T1.isEmpty()) {
                    Z0();
                }
            }
        } else if (i7 == org.telegram.messenger.qs.f25108x0) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
            if (this.P1 != null) {
                org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(this.f28669a);
                String str2 = this.P1.short_name;
                if (str2 != null) {
                    tL_messages_stickerSet = b02.p0(str2);
                }
                if (tL_messages_stickerSet == null) {
                    tL_messages_stickerSet = b02.o0(this.P1.f26980id);
                }
            }
            if (tL_messages_stickerSet != null && tL_messages_stickerSet != this.M1) {
                this.M1 = tL_messages_stickerSet;
                R0();
            }
            Z0();
        }
    }

    @Override
    public void dismiss() {
        super.dismiss();
        this.f40740f2.q(false);
        Runnable runnable = this.f40748m2;
        if (runnable != null) {
            runnable.run();
        }
        if (this.Z1 != 0) {
            ConnectionsManager.getInstance(this.f28669a).cancelRequest(this.Z1, true);
            this.Z1 = 0;
        }
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25022i4);
        if (this.R1 != null) {
            ArrayList arrayList = this.S1;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    org.telegram.messenger.zy zyVar = (org.telegram.messenger.zy) this.S1.get(i7);
                    if (!zyVar.f26948c) {
                        org.telegram.messenger.w7.G(this.f28669a).b(zyVar.f26946a, false);
                    }
                    if (zyVar.f26949e) {
                        new File(zyVar.f26946a).delete();
                    }
                }
            }
            org.telegram.messenger.qs.f(this.f28669a).n(this, org.telegram.messenger.qs.U1);
            org.telegram.messenger.qs.f(this.f28669a).n(this, org.telegram.messenger.qs.V1);
        }
        org.telegram.messenger.qs.f(this.f28669a).n(this, org.telegram.messenger.qs.f25108x0);
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25030k1, 4);
    }

    @Override
    public final void n(Runnable runnable) {
        this.f40748m2 = runnable;
    }

    @Override
    public final void onBackPressed() {
        if (org.telegram.ui.ns.p().E) {
            org.telegram.ui.ns.p().n();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onStart() {
        super.onStart();
        bc.a((FrameLayout) this.f28672b, new ch.v(this, 9));
    }

    @Override
    public final void onStop() {
        super.onStop();
        bc.h((FrameLayout) this.f28672b);
    }

    @Override
    public final void s0() {
        super.s0();
        X0(false);
        try {
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27963h5, this.I0);
            if (this.f28702r0 != null && w02 != this.f40753p2) {
                this.f40753p2 = w02;
                v0(w02);
            }
            ViewGroup viewGroup = this.f28672b;
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
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25025j1, 4);
    }

    public yv0(Context context, String str, ArrayList arrayList, ArrayList arrayList2) {
        super(1, context, (org.telegram.ui.ActionBar.h6) null, false);
        this.C1 = new AnimatorSet[2];
        this.D1 = new View[2];
        this.d2 = true;
        this.f40740f2 = new a8.b8(6);
        this.f40741g2 = new nv0(this);
        N();
        this.H1 = (Activity) context;
        this.R1 = arrayList;
        this.U1 = str;
        Utilities.f21341e.c(new mg(this, arrayList, arrayList2, 29));
        P0(context);
    }

    public yv0(Context context, org.telegram.ui.ActionBar.f2 f2Var, TLRPC.InputStickerSet inputStickerSet, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, vv0 vv0Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(1, context, h6Var, false);
        this.C1 = new AnimatorSet[2];
        this.D1 = new View[2];
        this.d2 = true;
        this.f40740f2 = new a8.b8(6);
        this.f40741g2 = new nv0(this);
        N();
        this.V1 = vv0Var;
        this.P1 = inputStickerSet;
        this.M1 = tL_messages_stickerSet;
        this.F1 = f2Var;
        R0();
        P0(context);
    }
}
