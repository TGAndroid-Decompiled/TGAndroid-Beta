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
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public class kw0 extends org.telegram.ui.ActionBar.w2 implements org.telegram.messenger.gs {
    public static final int f37004r2 = 0;
    public q9 A1;
    public TextView B1;
    public o C1;
    public final AnimatorSet[] D1;
    public final View[] E1;
    public bi.e3 F1;
    public final org.telegram.ui.ActionBar.g2 G1;
    public gi.g H1;
    public final Activity I1;
    public int J1;
    public int K1;
    public boolean L1;
    public boolean M1;
    public TLRPC.TL_messages_stickerSet N1;
    public TLRPC.Document O1;
    public org.telegram.messenger.ty P1;
    public TLRPC.InputStickerSet Q1;
    public ArrayList R1;
    public final ArrayList S1;
    public ArrayList T1;
    public HashMap U1;
    public final String V1;
    public final hw0 W1;
    public iw0 X1;
    public org.telegram.ui.i50 Y1;
    public int Z1;
    public int f37005a2;
    public boolean f37006b2;
    public boolean f37007c2;
    public boolean d2;
    public boolean f37008e2;
    public int f37009f2;
    public final a8.b8 f37010g2;
    public final zv0 f37011h2;
    public es0 f37012i2;
    public String f37013j2;
    public int f37014k2;
    public boolean f37015l2;
    public Pattern f37016m1;
    public String f37017m2;
    public di.b1 n1;
    public Runnable f37018n2;
    public gw0 f37019o1;
    public ArrayList f37020o2;
    public v4.z f37021p1;
    public int f37022p2;
    public TLRPC.Document f37023q1;
    public int f37024q2;
    public m80 f37025r1;
    public org.telegram.ui.ActionBar.q0 f37026s1;
    public org.telegram.ui.ActionBar.y0 f37027t1;
    public o6 f37028u1;
    public ug.r0 f37029v1;
    public FrameLayout f37030w1;
    public FrameLayout f37031x1;
    public TextView f37032y1;
    public View f37033z1;

    public kw0(Context context, Object obj, TLObject tLObject, org.telegram.ui.ActionBar.h6 h6Var) {
        super(1, context, h6Var, false);
        this.D1 = new AnimatorSet[2];
        this.E1 = new View[2];
        this.f37008e2 = true;
        this.f37010g2 = new a8.b8(6);
        this.f37011h2 = new zv0(this);
        this.J0 = h6Var;
        O();
        this.I1 = (Activity) context;
        TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = new TLRPC.TL_messages_getAttachedStickers();
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.Photo photo = (TLRPC.Photo) tLObject;
            TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = new TLRPC.TL_inputStickeredMediaPhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputStickeredMediaPhoto.f28504id = tL_inputPhoto;
            tL_inputPhoto.f28453id = photo.f28458id;
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
            tL_inputStickeredMediaDocument.f28503id = tL_inputDocument;
            tL_inputDocument.f28446id = document.f28440id;
            tL_inputDocument.access_hash = document.access_hash;
            byte[] bArr2 = document.file_reference;
            tL_inputDocument.file_reference = bArr2;
            if (bArr2 == null) {
                tL_inputDocument.file_reference = new byte[0];
            }
            tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
        }
        org.telegram.ui.qo0 qo0Var = (org.telegram.ui.qo0) this;
        this.f37005a2 = ConnectionsManager.getInstance(this.f30173a).sendRequest(tL_messages_getAttachedStickers, new bi.k2(qo0Var, obj, tL_messages_getAttachedStickers, new org.telegram.ui.u7(23, qo0Var, tL_messages_getAttachedStickers), 13));
        Q0(context);
    }

    public static void J0(kw0 kw0Var) {
        if (kw0Var.n1.getChildCount() <= 0) {
            kw0Var.X0(kw0Var.n1.getPaddingTop());
            return;
        }
        int i7 = 0;
        View view = null;
        int i10 = -1;
        for (int i11 = 0; i11 < kw0Var.n1.getChildCount(); i11++) {
            View childAt = kw0Var.n1.getChildAt(i11);
            kw0Var.n1.getClass();
            int R = RecyclerView.R(childAt);
            if (i10 == -1 || i10 > R) {
                view = childAt;
                i10 = R;
            }
        }
        if (view != null && view.getTop() >= 0) {
            int top = view.getTop();
            kw0Var.U0(0, false);
            i7 = top;
        } else {
            kw0Var.U0(0, true);
        }
        kw0Var.U0(1, true);
        if (kw0Var.Z1 != i7) {
            kw0Var.X0(i7);
        }
    }

    public static void N0(org.telegram.ui.ActionBar.g2 g2Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, TLRPC.Document document) {
        org.telegram.ui.bn bnVar;
        boolean z10;
        TLRPC.StickerSet stickerSet;
        if (g2Var != null) {
            if (g2Var instanceof org.telegram.ui.bn) {
                bnVar = (org.telegram.ui.bn) g2Var;
            } else {
                bnVar = null;
            }
            if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.creator) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (document != null && document.mime_type.equals("image/webp")) {
                ArrayList arrayList = new ArrayList();
                org.telegram.messenger.w7.G(org.telegram.messenger.k10.f24968t0);
                File J = org.telegram.messenger.w7.J(document, null, true, true);
                if (J != null && J.exists()) {
                    org.telegram.messenger.g0.h3(new kg.q0(J, arrayList, g2Var, bnVar, document, z10, tL_messages_stickerSet), 300L);
                    return;
                }
                return;
            }
            org.telegram.messenger.g0.h3(new ai.i(g2Var, tL_messages_stickerSet, document, bnVar, z10, 11), 300L);
        }
    }

    @Override
    public final void E(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.I5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.F8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.E8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Aj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29527l5));
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final void K0() {
        if (this.N1 != null) {
            TLRPC.TL_messages_stickerSet z02 = org.telegram.messenger.np.u1(this.f30173a).z0(this.N1);
            this.N1 = z02;
            if (z02 == null) {
                dismiss();
            }
        }
    }

    public final void L0(TextView textView, String str, boolean z10) {
        if (z10) {
            textView.setText(org.telegram.messenger.hd.N0(2131749042, null));
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29735w6, this.J0);
            this.f37015l2 = true;
            this.f37013j2 = str;
            return;
        }
        es0 es0Var = this.f37012i2;
        if (es0Var != null) {
            org.telegram.messenger.g0.r(es0Var);
            this.f37012i2 = null;
            this.f37013j2 = null;
            if (this.f37014k2 != 0) {
                ConnectionsManager.getInstance(this.f30173a).cancelRequest(this.f37014k2, true);
            }
        }
        if (TextUtils.isEmpty(str)) {
            textView.setText(org.telegram.messenger.hd.N0(2131749044, null));
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29620q5, this.J0);
            return;
        }
        this.f37015l2 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                int length = str.length();
                for (int i7 = 0; i7 < length; i7++) {
                    char charAt = str.charAt(i7);
                    if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        textView.setText(org.telegram.messenger.hd.N0(2131749044, null));
                        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29602p7, this.J0);
                        return;
                    }
                }
            } else {
                textView.setText(org.telegram.messenger.hd.N0(2131749040, null));
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29602p7, this.J0);
                return;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 32) {
                textView.setText(org.telegram.messenger.hd.N0(2131749039, null));
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29602p7, this.J0);
                return;
            }
            textView.setText(org.telegram.messenger.hd.N0(2131749041, null));
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.F6, this.J0);
            this.f37013j2 = str;
            es0 es0Var2 = new es0(this, str, textView, 4);
            this.f37012i2 = es0Var2;
            org.telegram.messenger.g0.h3(es0Var2, 300L);
            return;
        }
        textView.setText(org.telegram.messenger.hd.N0(2131749038, null));
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29602p7, this.J0);
    }

    public final void M0() {
        if (!this.M1) {
            return;
        }
        this.f37021p1.h(null);
        this.M1 = false;
        this.f37010g2.q(true);
        org.telegram.messenger.g0.d0(this.n1, new fi.e(15));
        this.f37026s1.postDelayed(new vv0(this, 0), 200L);
        this.f37028u1.c(org.telegram.messenger.hd.N0(2131751209, null), true, true);
    }

    public final void O0() {
        if (this.M1) {
            return;
        }
        this.f37021p1.h(this.n1);
        this.M1 = true;
        a8.b8 b8Var = this.f37010g2;
        char c10 = 0;
        b8Var.q(false);
        float f10 = 0.0f;
        Float valueOf = Float.valueOf(0.0f);
        ArrayList arrayList = (ArrayList) b8Var.d;
        if (arrayList.isEmpty()) {
            for (int i7 = 0; i7 < 6; i7++) {
                arrayList.add(valueOf);
                ((ArrayList) b8Var.f344e).add(valueOf);
                ((ArrayList) b8Var.f345f).add(valueOf);
            }
        }
        int i10 = 0;
        for (int i11 = 6; i10 < i11; i11 = 6) {
            long nextFloat = Utilities.f22808b.nextFloat() * 300;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, -2.0f, 0.0f, 2.0f, 0.0f);
            ofFloat.addUpdateListener(new jw0(b8Var, i10, 3));
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
            ofFloat2.addUpdateListener(new jw0(b8Var, i10, 4));
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
            ofFloat3.addUpdateListener(new jw0(b8Var, i10, 5));
            ofFloat3.setRepeatCount(-1);
            ofFloat3.setRepeatMode(1);
            ofFloat3.setInterpolator(new LinearInterpolator());
            ofFloat3.setCurrentPlayTime(nextFloat);
            ofFloat3.setDuration(j3);
            ofFloat3.start();
            ((ArrayList) b8Var.f341a).add(ofFloat);
            ((ArrayList) b8Var.f342b).add(ofFloat2);
            ((ArrayList) b8Var.f343c).add(ofFloat3);
            i10++;
            f10 = f11;
            c10 = c11;
        }
        org.telegram.messenger.g0.d0(this.n1, new fi.e(16));
        this.f37026s1.postDelayed(new vv0(this, 1), 200L);
        this.f37028u1.c(org.telegram.messenger.hd.N0(2131751342, null), true, true);
    }

    public final void P0() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f37031x1, View.ALPHA, 0.0f));
        animatorSet.setDuration(200L);
        animatorSet.addListener(new s60(this, 24));
        animatorSet.start();
    }

    public final void Q0(Context context) {
        int i7;
        cw0 cw0Var = new cw0(this, context);
        this.f30176b = cw0Var;
        cw0Var.setWillNotDraw(false);
        ViewGroup viewGroup = this.f30176b;
        int i10 = this.f30211u0;
        viewGroup.setPadding(i10, 0, i10, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 51);
        layoutParams.topMargin = org.telegram.messenger.g0.L(48.0f);
        View view = new View(context);
        View[] viewArr = this.E1;
        viewArr[0] = view;
        int i11 = org.telegram.ui.ActionBar.m6.V5;
        org.telegram.ui.ActionBar.t6.h(i11, view, this.J0);
        viewArr[0].setAlpha(0.0f);
        viewArr[0].setVisibility(4);
        viewArr[0].setTag(1);
        this.f30176b.addView(viewArr[0], layoutParams);
        di.b1 b1Var = new di.b1(27, context, this);
        this.n1 = b1Var;
        b1Var.setTag(14);
        di.b1 b1Var2 = this.n1;
        getContext();
        gi.g gVar = new gi.g(this);
        this.H1 = gVar;
        b1Var2.setLayoutManager(gVar);
        this.H1.O = new bi.w2(this, 13);
        this.f37021p1 = new v4.z(new dw0(this));
        di.b1 b1Var3 = this.n1;
        gw0 gw0Var = new gw0(this, context);
        this.f37019o1 = gw0Var;
        b1Var3.setAdapter(gw0Var);
        this.n1.setVerticalScrollBarEnabled(false);
        this.n1.i(new fi.k(12));
        this.n1.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        this.n1.setClipToPadding(false);
        this.n1.setEnabled(true);
        org.telegram.ui.ActionBar.t6.H(this.n1, org.telegram.ui.ActionBar.m6.A5, this.J0);
        this.n1.setOnTouchListener(new qk(this, 6));
        this.n1.setOnScrollListener(new oa(this, 21));
        o oVar = new o(this, 16);
        this.C1 = oVar;
        this.n1.setOnItemClickListener(oVar);
        this.f30176b.addView(this.n1, c8.ma.d(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 48.0f));
        bi.e3 e3Var = new bi.e3(28, context, this);
        this.F1 = e3Var;
        this.f30176b.addView(e3Var, c8.ma.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.n1.setEmptyView(this.F1);
        this.F1.setOnTouchListener(new gi.a(25));
        m80 m80Var = new m80(context, null);
        this.f37025r1 = m80Var;
        m80Var.setLines(1);
        this.f37025r1.setSingleLine(true);
        org.telegram.ui.ActionBar.t6.U(this.f37025r1, org.telegram.ui.ActionBar.m6.f29489j5, this.J0);
        this.f37025r1.setTextSize(1, 20.0f);
        org.telegram.ui.ActionBar.t6.G(this.f37025r1, org.telegram.ui.ActionBar.m6.f29509k5, this.J0);
        this.f37025r1.setEllipsize(TextUtils.TruncateAt.END);
        this.f37025r1.setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(6.0f));
        this.f37025r1.setGravity(16);
        this.f37025r1.setTypeface(org.telegram.messenger.g0.o());
        this.f30176b.addView(this.f37025r1, c8.ma.d(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        org.telegram.ui.ActionBar.q0 q0Var = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Aj, this.J0), false, this.J0);
        this.f37026s1 = q0Var;
        q0Var.setLongClickEnabled(false);
        this.f37026s1.setSubMenuOpenSide(2);
        this.f37026s1.setIcon(2131231244);
        org.telegram.ui.ActionBar.q0 q0Var2 = this.f37026s1;
        int i12 = org.telegram.ui.ActionBar.m6.Ej;
        org.telegram.ui.ActionBar.t6.Q(q0Var2, org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i12, this.J0), 1, -1), null, org.telegram.ui.ActionBar.t6.M(i12), this.J0);
        this.f30176b.addView(this.f37026s1, c8.ma.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        this.f37026s1.e(1, 2131232365, org.telegram.messenger.hd.N0(2131744603, null));
        this.f37026s1.e(2, 2131232205, org.telegram.messenger.hd.N0(2131751750, null));
        this.f37026s1.setOnClickListener(new tv0(this, 1));
        this.f37026s1.setDelegate(new uv0(this));
        this.f37026s1.setContentDescription(org.telegram.messenger.hd.N0(2131754838, null));
        org.telegram.ui.ActionBar.q0 q0Var3 = this.f37026s1;
        if (this.Q1 != null) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        q0Var3.setVisibility(i7);
        this.F1.addView(new RadialProgressView(context, null), c8.ma.e(-2, -2, 17));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83);
        layoutParams2.bottomMargin = org.telegram.messenger.g0.L(48.0f);
        View view2 = new View(context);
        viewArr[1] = view2;
        org.telegram.ui.ActionBar.t6.h(i11, view2, this.J0);
        this.f30176b.addView(viewArr[1], layoutParams2);
        o6 o6Var = new o6(context, false, false, false);
        this.f37028u1 = o6Var;
        int i13 = org.telegram.ui.ActionBar.m6.f29454h5;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i13, this.J0);
        int i14 = org.telegram.ui.ActionBar.m6.f29473i6;
        org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.m6.i0(w02, org.telegram.ui.ActionBar.m6.w0(i14, this.J0));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i13);
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i14);
        org.telegram.ui.ActionBar.h6 h6Var = this.J0;
        o6Var.setBackground(i02);
        org.telegram.ui.ActionBar.t6.j(o6Var, i02, M, M2, h6Var);
        o6 o6Var2 = this.f37028u1;
        int i15 = org.telegram.ui.ActionBar.m6.f29562n5;
        this.f37009f2 = i15;
        org.telegram.ui.ActionBar.t6.Y(o6Var2, i15, this.J0);
        this.f37028u1.setTextSize(org.telegram.messenger.g0.L(14.0f));
        this.f37028u1.setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        this.f37028u1.setTypeface(org.telegram.messenger.g0.o());
        this.f37028u1.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f37030w1 = frameLayout;
        frameLayout.addView(this.f37028u1, c8.ma.c(48.0f, -1));
        this.f30176b.addView(this.f37030w1, c8.ma.e(-1, -2, 83));
        ug.r0 r0Var = new ug.r0(org.telegram.messenger.g0.L(24.0f), context, this.J0, false);
        this.f37029v1 = r0Var;
        r0Var.setIcon(2131624315);
        this.f37029v1.setVisibility(4);
        this.f30176b.addView(this.f37029v1, c8.ma.d(-1, 48.0f, 87, 8.0f, 0.0f, 8.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f37031x1 = frameLayout2;
        frameLayout2.setVisibility(8);
        this.f37031x1.setSoundEffectsEnabled(false);
        this.f30176b.addView(this.f37031x1, c8.ma.c(-1.0f, -1));
        this.f37031x1.setOnClickListener(new tv0(this, 2));
        q9 q9Var = new q9(context);
        this.A1 = q9Var;
        q9Var.setAspectFit(true);
        this.A1.setLayerNum(7);
        this.f37031x1.addView(this.A1);
        TextView textView = new TextView(context);
        this.B1 = textView;
        textView.setTextSize(1, 30.0f);
        this.B1.setGravity(85);
        this.f37031x1.addView(this.B1);
        TextView textView2 = new TextView(context);
        this.f37032y1 = textView2;
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(this.f37032y1, i15, this.J0);
        org.telegram.ui.ActionBar.t6.Q(this.f37032y1, org.telegram.ui.ActionBar.m6.i0(org.telegram.ui.ActionBar.m6.w0(i13, this.J0), org.telegram.ui.ActionBar.m6.w0(i14, this.J0)), org.telegram.ui.ActionBar.t6.M(i13), org.telegram.ui.ActionBar.t6.M(i14), this.J0);
        this.f37032y1.setGravity(17);
        this.f37032y1.setPadding(org.telegram.messenger.g0.L(29.0f), 0, org.telegram.messenger.g0.L(29.0f), 0);
        this.f37032y1.setTypeface(org.telegram.messenger.g0.o());
        this.f37031x1.addView(this.f37032y1, c8.ma.e(-1, 48, 83));
        this.f37032y1.setOnClickListener(new tv0(this, 3));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.f1(), 83);
        layoutParams3.bottomMargin = org.telegram.messenger.g0.L(48.0f);
        View view3 = new View(context);
        this.f37033z1 = view3;
        org.telegram.ui.ActionBar.t6.h(i11, view3, this.J0);
        this.f37031x1.addView(this.f37033z1, layoutParams3);
        org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.f25342l4);
        if (this.S1 != null) {
            org.telegram.messenger.ls.f(this.f30173a).c(this, org.telegram.messenger.ls.U1);
            org.telegram.messenger.ls.f(this.f30173a).c(this, org.telegram.messenger.ls.V1);
        }
        org.telegram.messenger.ls.f(this.f30173a).c(this, org.telegram.messenger.ls.f25412x0);
        a1();
        b1();
        Z0();
        Y0(false);
        this.f37019o1.f();
    }

    public final boolean R0() {
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.N1;
        if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.emojis) {
            if (tL_messages_stickerSet == null && this.L1) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void S0() {
        String str;
        if (this.Q1 != null) {
            org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(this.f30173a);
            if (this.N1 == null && (str = this.Q1.short_name) != null) {
                this.N1 = d02.r0(str);
            }
            if (this.N1 == null) {
                this.N1 = d02.q0(this.Q1.f28454id);
            }
            if (this.N1 == null) {
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                tL_messages_getStickerSet.stickerset = this.Q1;
                ConnectionsManager.getInstance(this.f30173a).sendRequest(tL_messages_getStickerSet, new org.telegram.ui.u7(22, this, d02));
            } else {
                if (this.f37019o1 != null) {
                    b1();
                    a1();
                    this.f37019o1.f();
                }
                Z0();
                d02.t1(this.N1);
                K0();
            }
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.N1;
        if (tL_messages_stickerSet != null) {
            this.f37007c2 = !tL_messages_stickerSet.set.masks;
        }
        K0();
    }

    public final void T0(org.telegram.messenger.ty tyVar) {
        int indexOf = this.T1.indexOf(tyVar);
        if (indexOf >= 0) {
            this.T1.remove(indexOf);
            this.f37019o1.s(indexOf);
            if (this.T1.isEmpty()) {
                dismiss();
            } else {
                a1();
            }
        }
    }

    public final void U0(int i7, boolean z10) {
        Integer num;
        float f10;
        if (this.R1 == null) {
            View[] viewArr = this.E1;
            if ((z10 && viewArr[i7].getTag() != null) || (!z10 && viewArr[i7].getTag() == null)) {
                View view = viewArr[i7];
                if (z10) {
                    num = null;
                } else {
                    num = 1;
                }
                view.setTag(num);
                if (z10) {
                    viewArr[i7].setVisibility(0);
                }
                AnimatorSet[] animatorSetArr = this.D1;
                AnimatorSet animatorSet = animatorSetArr[i7];
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSetArr[i7] = animatorSet2;
                View view2 = viewArr[i7];
                Property property = View.ALPHA;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                animatorSet2.playTogether(ObjectAnimator.ofFloat(view2, property, f10));
                animatorSetArr[i7].setDuration(150L);
                animatorSetArr[i7].addListener(new yv0(this, i7, z10));
                animatorSetArr[i7].start();
            }
        }
    }

    @Override
    public final ArrayList V() {
        ArrayList arrayList = new ArrayList();
        x6 x6Var = new x6(this, 6);
        ViewGroup viewGroup = this.f30176b;
        Drawable[] drawableArr = {this.f30209s0};
        int i7 = org.telegram.ui.ActionBar.m6.f29454h5;
        arrayList.add(new org.telegram.ui.ActionBar.v6(viewGroup, 0, (Class[]) null, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f30176b, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.zj));
        if (this.f37019o1.f35692r.R1 != null) {
            org.telegram.ui.Cells.v3.a(arrayList, x6Var);
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f37026s1, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Ej));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f37028u1, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        o6 o6Var = this.f37028u1;
        int i10 = org.telegram.ui.ActionBar.m6.f29473i6;
        arrayList.add(new org.telegram.ui.ActionBar.v6(o6Var, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f37028u1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, this.f37009f2));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f37032y1, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f37032y1, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, i10));
        return arrayList;
    }

    public final void V0(View.OnClickListener onClickListener, String str, int i7) {
        W0(onClickListener, str, i7, -1, -1);
    }

    public final void W0(View.OnClickListener onClickListener, String str, int i7, int i10, int i11) {
        if (i7 >= 0) {
            o6 o6Var = this.f37028u1;
            this.f37009f2 = i7;
            org.telegram.ui.ActionBar.t6.Y(o6Var, i7, this.J0);
        }
        this.f37028u1.c(str, false, true);
        this.f37028u1.setOnClickListener(onClickListener);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f37028u1.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.E1[1].getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.n1.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.F1.getLayoutParams();
        if (onClickListener == null) {
            this.f37028u1.setAlpha(0.0f);
        } else if (i10 >= 0 && i11 >= 0) {
            o6 o6Var2 = this.f37028u1;
            int L = org.telegram.messenger.g0.L(24.0f);
            int w02 = org.telegram.ui.ActionBar.m6.w0(i10, this.J0);
            int w03 = org.telegram.ui.ActionBar.m6.w0(i11, this.J0);
            org.telegram.ui.ActionBar.t6.Q(o6Var2, org.telegram.ui.ActionBar.m6.k0(L, L, L, L, w02, w03, w03), org.telegram.ui.ActionBar.t6.M(i10), org.telegram.ui.ActionBar.t6.M(i11), this.J0);
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29454h5, this.f37030w1, this.J0);
            int L2 = org.telegram.messenger.g0.L(8.0f);
            marginLayoutParams.bottomMargin = L2;
            marginLayoutParams.rightMargin = L2;
            marginLayoutParams.topMargin = L2;
            marginLayoutParams.leftMargin = L2;
            int L3 = org.telegram.messenger.g0.L(64.0f);
            marginLayoutParams2.bottomMargin = L3;
            marginLayoutParams3.bottomMargin = L3;
            marginLayoutParams4.bottomMargin = L3;
            if (this.f37028u1.getAlpha() < 1.0f) {
                org.telegram.messenger.o10.o(this.f37028u1.animate().alpha(1.0f), nr.h, 240L);
            }
        } else {
            o6 o6Var3 = this.f37028u1;
            int i12 = org.telegram.ui.ActionBar.m6.f29454h5;
            int w04 = org.telegram.ui.ActionBar.m6.w0(i12, this.J0);
            int i13 = org.telegram.ui.ActionBar.m6.f29622q7;
            org.telegram.ui.ActionBar.t6.Q(o6Var3, org.telegram.ui.ActionBar.m6.i0(w04, org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(i13, this.J0))), org.telegram.ui.ActionBar.t6.M(i12), org.telegram.ui.ActionBar.t6.K(0.1f, i13), this.J0);
            this.f37030w1.setBackgroundColor(0);
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.rightMargin = 0;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            int L4 = org.telegram.messenger.g0.L(48.0f);
            marginLayoutParams2.bottomMargin = L4;
            marginLayoutParams3.bottomMargin = L4;
            marginLayoutParams4.bottomMargin = L4;
            if (this.f37028u1.getAlpha() < 1.0f) {
                org.telegram.messenger.o10.o(this.f37028u1.animate().alpha(1.0f), nr.h, 240L);
            }
        }
        this.f30176b.requestLayout();
    }

    public final void X0(int i7) {
        this.Z1 = i7;
        if (this.R1 == null) {
            float f10 = i7;
            this.f37025r1.setTranslationY(f10);
            if (this.S1 == null) {
                this.f37026s1.setTranslationY(f10);
            }
            this.E1[0].setTranslationY(f10);
        }
        this.f30176b.invalidate();
    }

    public final void Y0(boolean z10) {
        this.f37019o1.getClass();
        this.f37025r1.setHighlightColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29527l5, this.J0));
        this.f37031x1.setBackgroundColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29454h5, this.J0) & (-536870913));
        this.f37026s1.setIconColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Aj, this.J0));
        this.f37026s1.P(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.E8, this.J0), false);
        this.f37026s1.P(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.F8, this.J0), true);
        this.f37026s1.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.I5, this.J0));
        this.f37026s1.I(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G8, this.J0));
        if (this.f37027t1 != null) {
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29622q7, this.J0);
            this.f37027t1.d(w02, w02);
            this.f37027t1.setSelectorColor(org.telegram.ui.ActionBar.m6.r1(0.1f, w02));
            if (this.f37027t1.getRightIcon() != null && w02 != this.f37022p2) {
                this.f37022p2 = w02;
                this.f37027t1.getRightIcon().setColorFilter(w02);
            }
        }
        if (z10) {
            if (org.telegram.ui.ActionBar.m6.h1() && this.f37020o2 == null) {
                ArrayList V = V();
                this.f37020o2 = V;
                int size = V.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((org.telegram.ui.ActionBar.v6) this.f37020o2.get(i7)).f30143g = null;
                }
            }
            int size2 = this.f37020o2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                org.telegram.ui.ActionBar.v6 v6Var = (org.telegram.ui.ActionBar.v6) this.f37020o2.get(i10);
                v6Var.e(org.telegram.ui.ActionBar.m6.w0(v6Var.f30141e, this.J0), false, false);
            }
        }
        if (!org.telegram.ui.ActionBar.m6.h1() && this.f37020o2 != null) {
            this.f37020o2 = null;
        }
    }

    public final void Z0() {
        if (this.f30176b != null && !org.telegram.messenger.k10.i(this.f30173a).q()) {
            org.telegram.messenger.gj.V3(this.N1);
        }
    }

    public final void a1() {
        int size;
        int size2;
        ArrayList<TLRPC.Document> arrayList;
        boolean z10;
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
        String N0;
        int i12;
        int i13;
        int i14;
        TLRPC.StickerSet stickerSet6;
        boolean z11;
        TLRPC.StickerSet stickerSet7;
        float f10;
        if (this.f37025r1 == null) {
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.N1;
        int i15 = 1;
        if (tL_messages_stickerSet != null && (arrayList = tL_messages_stickerSet.documents) != null && !arrayList.isEmpty()) {
            CharSequence m10 = org.telegram.messenger.j6.m(this.N1.set.title, this.f37025r1.getPaint().getFontMetricsInt(), false, null, 0);
            try {
                if (this.f37016m1 == null) {
                    this.f37016m1 = Pattern.compile("@[a-zA-Z\\d_]{1,32}");
                }
                Matcher matcher = this.f37016m1.matcher(m10);
                SpannableStringBuilder spannableStringBuilder = null;
                while (matcher.find()) {
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder(m10);
                    }
                    int start = matcher.start();
                    int end = matcher.end();
                    if (this.N1.set.title.charAt(start) != '@') {
                        start++;
                    }
                    spannableStringBuilder.setSpan(new p4(m10.subSequence(start + 1, end).toString(), 1, this), start, end, 0);
                }
                if (spannableStringBuilder != null) {
                    m10 = spannableStringBuilder;
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            this.f37025r1.setText(m10);
            if (R0()) {
                int measuredWidth = this.n1.getMeasuredWidth();
                if (measuredWidth == 0) {
                    measuredWidth = org.telegram.messenger.g0.f24046q.x;
                }
                gw0 gw0Var = this.f37019o1;
                if (org.telegram.messenger.g0.Q1()) {
                    f10 = 60.0f;
                } else {
                    f10 = 45.0f;
                }
                gw0Var.d = Math.max(1, measuredWidth / org.telegram.messenger.g0.L(f10));
            } else {
                this.f37019o1.d = 5;
            }
            this.H1.y1(this.f37019o1.d);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.N1;
            int i16 = -1;
            if (tL_messages_stickerSet2 != null && (stickerSet7 = tL_messages_stickerSet2.set) != null && stickerSet7.emojis && !org.telegram.messenger.k10.i(this.f30173a).q() && this.Y1 == null) {
                if (this.N1.documents != null) {
                    for (int i17 = 0; i17 < this.N1.documents.size(); i17++) {
                        if (!org.telegram.messenger.gj.m3(this.N1.documents.get(i17))) {
                            this.f37029v1.setVisibility(0);
                            this.f37028u1.setBackground(null);
                            V0(null, null, -1);
                            this.f37029v1.b(org.telegram.messenger.hd.N0(2131743620, null), new tv0(this, 0), false);
                            return;
                        }
                    }
                }
            } else {
                this.f37029v1.setVisibility(4);
            }
            org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(this.f30173a);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = this.N1;
            if (tL_messages_stickerSet3 != null && (stickerSet6 = tL_messages_stickerSet3.set) != null && stickerSet6.emojis) {
                ArrayList u02 = d02.u0(5);
                for (int i18 = 0; u02 != null && i18 < u02.size(); i18++) {
                    if (u02.get(i18) != null && ((TLRPC.TL_messages_stickerSet) u02.get(i18)).set != null && ((TLRPC.TL_messages_stickerSet) u02.get(i18)).set.f28461id == this.N1.set.f28461id) {
                        z11 = true;
                        break;
                    }
                }
                z11 = false;
                z10 = !z11;
            } else if (tL_messages_stickerSet3 != null && (stickerSet = tL_messages_stickerSet3.set) != null && d02.E0(stickerSet.f28461id, true)) {
                z10 = false;
            } else {
                z10 = true;
            }
            org.telegram.ui.i50 i50Var = this.Y1;
            if (i50Var != null) {
                tv0 tv0Var = new tv0(this, 5);
                boolean z12 = i50Var.f48582a;
                if (i50Var.f48584c.O) {
                    if (z12) {
                        i14 = 2131746114;
                    } else {
                        i14 = 2131745348;
                    }
                    N0 = org.telegram.messenger.hd.N0(i14, null);
                } else {
                    if (z12) {
                        i11 = 2131746113;
                    } else {
                        i11 = 2131745347;
                    }
                    N0 = org.telegram.messenger.hd.N0(i11, null);
                }
                String str = N0;
                boolean z13 = this.Y1.f48582a;
                if (z13) {
                    i12 = org.telegram.ui.ActionBar.m6.f29622q7;
                } else {
                    i12 = org.telegram.ui.ActionBar.m6.Ji;
                }
                if (!z13) {
                    i13 = org.telegram.ui.ActionBar.m6.Fi;
                } else {
                    i13 = -1;
                }
                if (!z13) {
                    i16 = org.telegram.ui.ActionBar.m6.Hi;
                }
                W0(tv0Var, str, i12, i13, i16);
                return;
            }
            if (z10) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = this.N1;
                if (tL_messages_stickerSet4 != null && (stickerSet5 = tL_messages_stickerSet4.set) != null && stickerSet5.emojis) {
                    i15 = 5;
                } else if (tL_messages_stickerSet4 == null || (stickerSet4 = tL_messages_stickerSet4.set) == null || !stickerSet4.masks) {
                    i15 = 0;
                }
                if (!d02.X[i15]) {
                    d02.D(i15);
                    W0(null, "", -1, -1, -1);
                    return;
                }
            }
            if (z10) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = this.N1;
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
                W0(new tv0(this, 9), G2, org.telegram.ui.ActionBar.m6.Ji, org.telegram.ui.ActionBar.m6.Fi, org.telegram.ui.ActionBar.m6.Hi);
            } else {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet6 = this.N1;
                TLRPC.StickerSet stickerSet8 = tL_messages_stickerSet6.set;
                boolean z14 = stickerSet8.creator;
                if (z14) {
                    if (this.M1) {
                        i7 = 2131751342;
                    } else {
                        i7 = 2131751209;
                    }
                    G = org.telegram.messenger.hd.N0(i7, null);
                } else if (stickerSet8.masks) {
                    G = org.telegram.messenger.hd.G(tL_messages_stickerSet6.documents.size(), "RemoveManyMasksCount", new Object[0]);
                } else if (stickerSet8.emojis) {
                    G = org.telegram.messenger.hd.G(tL_messages_stickerSet6.documents.size(), "RemoveManyEmojiCount", new Object[0]);
                } else {
                    G = org.telegram.messenger.hd.G(tL_messages_stickerSet6.documents.size(), "RemoveManyStickersCount", new Object[0]);
                }
                String str2 = G;
                if (z14) {
                    W0(new tv0(this, 10), str2, org.telegram.ui.ActionBar.m6.Ji, org.telegram.ui.ActionBar.m6.Fi, org.telegram.ui.ActionBar.m6.Hi);
                } else if (this.N1.set.official) {
                    V0(new tv0(this, 11), str2, org.telegram.ui.ActionBar.m6.f29622q7);
                } else {
                    V0(new tv0(this, 12), str2, org.telegram.ui.ActionBar.m6.f29622q7);
                }
            }
            this.f37019o1.f();
            return;
        }
        ArrayList arrayList5 = this.S1;
        if (arrayList5 != null) {
            m80 m80Var = this.f37025r1;
            ArrayList arrayList6 = this.T1;
            if (arrayList6 != null) {
                size = arrayList6.size();
            } else {
                size = arrayList5.size();
            }
            m80Var.setText(org.telegram.messenger.hd.G(size, "Stickers", new Object[0]));
            HashMap hashMap = this.U1;
            if (hashMap != null && !hashMap.isEmpty()) {
                V0(null, org.telegram.messenger.hd.N0(2131749036, null), org.telegram.ui.ActionBar.m6.f29620q5);
                this.f37028u1.setEnabled(false);
                return;
            }
            tv0 tv0Var2 = new tv0(this, 13);
            ArrayList arrayList7 = this.T1;
            if (arrayList7 != null) {
                size2 = arrayList7.size();
            } else {
                size2 = arrayList5.size();
            }
            V0(tv0Var2, org.telegram.messenger.hd.a0("ImportStickers", null, 2131749049, org.telegram.messenger.hd.G(size2, "Stickers", new Object[0])), org.telegram.ui.ActionBar.m6.f29562n5);
            this.f37028u1.setEnabled(true);
            return;
        }
        V0(new tv0(this, 14), org.telegram.messenger.hd.N0(2131752029, null), org.telegram.ui.ActionBar.m6.f29562n5);
    }

    public final void b1() {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        Point point = org.telegram.messenger.g0.f24046q;
        int min = (int) ((Math.min(point.x, point.y) / 2) / org.telegram.messenger.g0.f24045p);
        if (this.S1 != null) {
            this.f37032y1.setText(org.telegram.messenger.hd.N0(2131749035, null));
            org.telegram.ui.ActionBar.t6.U(this.f37032y1, org.telegram.ui.ActionBar.m6.f29622q7, this.J0);
            float f10 = min;
            this.A1.setLayoutParams(c8.ma.d(min, f10, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.B1.setLayoutParams(c8.ma.d(min, f10, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.f37032y1.setVisibility(0);
            this.f37033z1.setVisibility(0);
        } else if (this.W1 != null && ((tL_messages_stickerSet = this.N1) == null || !tL_messages_stickerSet.set.masks)) {
            this.f37032y1.setText(org.telegram.messenger.hd.N0(2131745393, null));
            float f11 = min;
            this.A1.setLayoutParams(c8.ma.d(min, f11, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.B1.setLayoutParams(c8.ma.d(min, f11, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.f37032y1.setVisibility(0);
            this.f37033z1.setVisibility(0);
        } else {
            this.f37032y1.setText(org.telegram.messenger.hd.N0(2131752029, null));
            this.A1.setLayoutParams(c8.ma.e(min, min, 17));
            this.B1.setLayoutParams(c8.ma.e(min, min, 17));
            this.f37032y1.setVisibility(8);
            this.f37033z1.setVisibility(8);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ls.f25342l4) {
            di.b1 b1Var = this.n1;
            if (b1Var != null) {
                int childCount = b1Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    this.n1.getChildAt(i11).invalidate();
                }
            }
        } else if (i7 == org.telegram.messenger.ls.U1) {
            HashMap hashMap = this.U1;
            if (hashMap != null) {
                String str = (String) objArr[0];
                org.telegram.messenger.ty tyVar = (org.telegram.messenger.ty) hashMap.get(str);
                if (tyVar != null) {
                    tyVar.a(this.f30173a, (TLRPC.InputFile) objArr[1], new es0(this, str, tyVar, 1));
                }
            }
        } else if (i7 == org.telegram.messenger.ls.V1) {
            HashMap hashMap2 = this.U1;
            if (hashMap2 != null) {
                org.telegram.messenger.ty tyVar2 = (org.telegram.messenger.ty) hashMap2.remove((String) objArr[0]);
                if (tyVar2 != null) {
                    T0(tyVar2);
                }
                if (this.U1.isEmpty()) {
                    a1();
                }
            }
        } else if (i7 == org.telegram.messenger.ls.f25412x0) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
            if (this.Q1 != null) {
                org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(this.f30173a);
                String str2 = this.Q1.short_name;
                if (str2 != null) {
                    tL_messages_stickerSet = d02.r0(str2);
                }
                if (tL_messages_stickerSet == null) {
                    tL_messages_stickerSet = d02.q0(this.Q1.f28454id);
                }
            }
            if (tL_messages_stickerSet != null && tL_messages_stickerSet != this.N1) {
                this.N1 = tL_messages_stickerSet;
                S0();
            }
            a1();
        }
    }

    @Override
    public void dismiss() {
        super.dismiss();
        this.f37010g2.q(false);
        Runnable runnable = this.f37018n2;
        if (runnable != null) {
            runnable.run();
        }
        if (this.f37005a2 != 0) {
            ConnectionsManager.getInstance(this.f30173a).cancelRequest(this.f37005a2, true);
            this.f37005a2 = 0;
        }
        org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.f25342l4);
        if (this.S1 != null) {
            ArrayList arrayList = this.T1;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    org.telegram.messenger.ty tyVar = (org.telegram.messenger.ty) this.T1.get(i7);
                    if (!tyVar.f27130c) {
                        org.telegram.messenger.w7.G(this.f30173a).b(tyVar.f27128a, false);
                    }
                    if (tyVar.f27131e) {
                        new File(tyVar.f27128a).delete();
                    }
                }
            }
            org.telegram.messenger.ls.f(this.f30173a).n(this, org.telegram.messenger.ls.U1);
            org.telegram.messenger.ls.f(this.f30173a).n(this, org.telegram.messenger.ls.V1);
        }
        org.telegram.messenger.ls.f(this.f30173a).n(this, org.telegram.messenger.ls.f25412x0);
        org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.f25334k1, 4);
    }

    @Override
    public final void n(Runnable runnable) {
        this.f37018n2 = runnable;
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
        gc.a((FrameLayout) this.f30176b, new bi.i1(this, 10));
    }

    @Override
    public final void onStop() {
        super.onStop();
        gc.h((FrameLayout) this.f30176b);
    }

    @Override
    public final void s0() {
        super.s0();
        Y0(false);
        try {
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29454h5, this.J0);
            if (this.f30209s0 != null && w02 != this.f37024q2) {
                this.f37024q2 = w02;
                v0(w02);
            }
            ViewGroup viewGroup = this.f30176b;
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
        org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.f25329j1, 4);
    }

    public kw0(Context context, String str, ArrayList arrayList, ArrayList arrayList2) {
        super(1, context, (org.telegram.ui.ActionBar.h6) null, false);
        this.D1 = new AnimatorSet[2];
        this.E1 = new View[2];
        this.f37008e2 = true;
        this.f37010g2 = new a8.b8(6);
        this.f37011h2 = new zv0(this);
        O();
        this.I1 = (Activity) context;
        this.S1 = arrayList;
        this.V1 = str;
        Utilities.f22810e.c(new es0((Object) this, (Object) arrayList, (Serializable) arrayList2, 5));
        Q0(context);
    }

    public kw0(Context context, org.telegram.ui.ActionBar.g2 g2Var, TLRPC.InputStickerSet inputStickerSet, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, hw0 hw0Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(1, context, h6Var, false);
        this.D1 = new AnimatorSet[2];
        this.E1 = new View[2];
        this.f37008e2 = true;
        this.f37010g2 = new a8.b8(6);
        this.f37011h2 = new zv0(this);
        O();
        this.W1 = hw0Var;
        this.Q1 = inputStickerSet;
        this.N1 = tL_messages_stickerSet;
        this.G1 = g2Var;
        S0();
        Q0(context);
    }
}
