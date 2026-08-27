package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgressView;

public final class ld1 extends org.telegram.ui.ActionBar.n2 {
    public float A;
    public RadialProgressView B;
    public int C;
    public final int D;
    public final w5 E;
    public final b21 F;
    public final dl0 G;

    public org.telegram.ui.Components.zk0 f40055a;

    public org.telegram.ui.Components.zk0 f40056b;

    public TextView f40057c;
    public id1 d;

    public kd1 f40058e;

    public final ArrayList f40059f;
    public final ArrayList h;

    public z71 f40060n;

    public org.telegram.ui.Components.az f40061r;

    public FrameLayout f40062s;
    public int v;

    public final HashSet f40063w;

    public org.telegram.ui.Cells.ja f40064x;

    public ValueAnimator f40065y;

    public ld1(int i10) {
        super(null);
        this.f40059f = new ArrayList();
        this.h = new ArrayList();
        this.f40063w = new HashSet();
        this.D = AndroidUtilities.dp(64.0f);
        this.E = new w5(this, 14);
        this.F = new b21(this, 7);
        this.G = new dl0(this, 23);
        this.arguments = a9.p.g(i10, "type");
    }

    @Override
    public final View createView(Context context) {
        this.C = this.arguments.getInt("type", 0);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.LimitReached));
        this.actionBar.setActionBarMenuOnItemClick(new ed1(0, this));
        org.telegram.ui.ActionBar.v0 v0VarA = this.actionBar.n().a(0, R.drawable.outline_header_search);
        v0VarA.F();
        v0VarA.D = new gd1(this);
        v0VarA.setContentDescription(LocaleController.getString(R.string.Search));
        v0VarA.setSearchFieldHint(LocaleController.getString(R.string.Search));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(context, null);
        this.f40055a = zk0Var;
        zk0Var.setLayoutManager(new f2.k0());
        org.telegram.ui.Components.zk0 zk0Var2 = this.f40055a;
        id1 id1Var = new id1(this);
        this.d = id1Var;
        zk0Var2.setAdapter(id1Var);
        this.f40055a.setClipToPadding(false);
        org.telegram.ui.Components.zk0 zk0Var3 = this.f40055a;
        b21 b21Var = this.F;
        zk0Var3.setOnItemClickListener(b21Var);
        org.telegram.ui.Components.zk0 zk0Var4 = this.f40055a;
        dl0 dl0Var = this.G;
        zk0Var4.setOnItemLongClickListener(dl0Var);
        org.telegram.ui.Components.zk0 zk0Var5 = new org.telegram.ui.Components.zk0(context, null);
        this.f40056b = zk0Var5;
        zk0Var5.setLayoutManager(new f2.k0());
        org.telegram.ui.Components.zk0 zk0Var6 = this.f40056b;
        kd1 kd1Var = new kd1(this);
        this.f40058e = kd1Var;
        zk0Var6.setAdapter(kd1Var);
        this.f40056b.setOnItemClickListener(b21Var);
        this.f40056b.setOnItemLongClickListener(dl0Var);
        this.f40056b.setOnScrollListener(new ib1(this, 1));
        org.telegram.ui.Components.az azVar = new org.telegram.ui.Components.az(context, null);
        this.f40061r = azVar;
        azVar.setShowAtCenter(true);
        this.f40061r.setText(LocaleController.getString(R.string.NoResult));
        this.f40061r.c();
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.B = radialProgressView;
        frameLayout.addView(radialProgressView, h7.z5.c(-2.0f, -2));
        this.d.E();
        this.B.setVisibility(8);
        frameLayout.addView(this.f40055a);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f40062s = frameLayout2;
        frameLayout2.addView(this.f40056b);
        this.f40062s.addView(this.f40061r);
        this.f40062s.setVisibility(8);
        frameLayout.addView(this.f40062s);
        this.d.l();
        this.A = 0.0f;
        AndroidUtilities.runOnUIThread(this.E, 500L);
        getConnectionsManager().sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new n(this, 22));
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.g6.f23053d6;
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        z71 z71Var = new z71(context, 4);
        this.f40060n = z71Var;
        z71Var.setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.f40057c = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
        this.f40057c.setGravity(17);
        this.f40057c.setTextSize(1, 14.0f);
        this.f40057c.setTypeface(AndroidUtilities.bold());
        this.f40057c.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.g6.Oh));
        frameLayout.addView(this.f40060n, h7.z5.e(-1, 64, 80));
        this.f40060n.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        this.f40060n.addView(this.f40057c, h7.z5.d(-1, -1.0f, 0, 16.0f, 12.0f, 16.0f, 12.0f));
        this.f40060n.setVisibility(8);
        this.f40057c.setOnClickListener(new v21(this, 9));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        sx0 sx0Var = new sx0(8, this);
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23322s8));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.f23375v8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kVar, 64, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23341t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.g6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.g6.D8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        int i11 = org.telegram.ui.ActionBar.g6.f23218m9;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40064x, 0, new Class[]{org.telegram.ui.Cells.ja.class}, new String[]{"imageView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40064x, 0, new Class[]{org.telegram.ui.Cells.ja.class}, new String[]{"headerTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40064x, 0, new Class[]{org.telegram.ui.Cells.ja.class}, new String[]{"messageTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23111g9));
        View view = this.fragmentView;
        int i12 = org.telegram.ui.ActionBar.g6.f23053d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 1, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40060n, 1, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40055a, 32, new Class[]{org.telegram.ui.Cells.w6.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23018b7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40055a, 48, new Class[]{org.telegram.ui.Cells.w6.class}, null, null, null, org.telegram.ui.ActionBar.g6.f22999a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40055a, 0, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        int i13 = org.telegram.ui.ActionBar.g6.ai;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40055a, 4, new Class[]{org.telegram.ui.Cells.d4.class}, new String[]{"textView"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.g6.f23145i7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40055a, 4, new Class[]{org.telegram.ui.Cells.d4.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        int i15 = org.telegram.ui.ActionBar.g6.f23163j7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40055a, 4, new Class[]{org.telegram.ui.Cells.d4.class}, new String[]{"checkBox"}, null, null, -1, null, i15));
        int i16 = org.telegram.ui.ActionBar.g6.f23182k7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40055a, 4, new Class[]{org.telegram.ui.Cells.d4.class}, new String[]{"checkBox"}, null, null, -1, null, i16));
        int i17 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40055a, 4, new Class[]{org.telegram.ui.Cells.d4.class}, new String[]{"nameTextView"}, null, null, -1, null, i17));
        int i18 = org.telegram.ui.ActionBar.g6.f23423y6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40055a, 262148, new Class[]{org.telegram.ui.Cells.d4.class}, new String[]{"statusTextView"}, null, null, -1, null, i18));
        Drawable[] drawableArr = org.telegram.ui.ActionBar.g6.f23295r0;
        int i19 = org.telegram.ui.ActionBar.g6.J7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40055a, 0, new Class[]{org.telegram.ui.Cells.d4.class}, null, drawableArr, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40056b, 4, new Class[]{org.telegram.ui.Cells.d4.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40056b, 4, new Class[]{org.telegram.ui.Cells.d4.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40056b, 4, new Class[]{org.telegram.ui.Cells.d4.class}, new String[]{"checkBox"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40056b, 4, new Class[]{org.telegram.ui.Cells.d4.class}, new String[]{"checkBox"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40056b, 4, new Class[]{org.telegram.ui.Cells.d4.class}, new String[]{"nameTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40056b, 262148, new Class[]{org.telegram.ui.Cells.d4.class}, new String[]{"statusTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40056b, 0, new Class[]{org.telegram.ui.Cells.d4.class}, null, drawableArr, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40061r, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f23037c7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40057c, 0, null, null, null, sx0Var, org.telegram.ui.ActionBar.g6.Oh));
        TextView textView = this.f40057c;
        int i20 = org.telegram.ui.ActionBar.g6.Qh;
        arrayList.add(new org.telegram.ui.ActionBar.i6(textView, 0, null, null, null, sx0Var, i20));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.B, 0, null, null, null, sx0Var, i20));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f40064x, 0, new Class[]{org.telegram.ui.Cells.ja.class}, new String[]{"imageLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23269p7));
        return arrayList;
    }
}
