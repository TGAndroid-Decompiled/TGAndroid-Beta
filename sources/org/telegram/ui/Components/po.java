package org.telegram.ui.Components;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Path;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class po {
    public final org.telegram.ui.ActionBar.z0 f38504a;
    public final org.telegram.ui.ActionBar.z0 f38505b;
    public final org.telegram.ui.ActionBar.z0 f38506c;
    public final org.telegram.ui.ActionBar.z0 d;
    public final org.telegram.ui.ActionBar.z0 f38507e;
    public final no f38508f;
    public final int f38509g;
    public org.telegram.ui.ActionBar.h1 h;
    public final oo f38510i;
    public long f38511j;
    public int f38512k;
    public int f38513l;
    public final FrameLayout f38514m;
    public final TextView f38515n;
    public int f38516o;

    public po(Context context, int i7, if0 if0Var, boolean z10, final oo ooVar, org.telegram.ui.ActionBar.i6 i6Var) {
        int i10;
        no noVar;
        final int i11;
        Integer num;
        this.f38509g = i7;
        this.f38510i = ooVar;
        if (z10) {
            i10 = 2131232566;
        } else {
            i10 = 0;
        }
        no noVar2 = new no(i10, 0, 0, context, i6Var);
        noVar2.V = new Path();
        this.f38508f = noVar2;
        noVar2.setFitItems(true);
        if (if0Var != null) {
            num = 1;
            noVar = noVar2;
            i11 = 1;
            org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.r0.c(false, false, noVar, 2131232059, org.telegram.messenger.gd.M0(2131753754, null), false, i6Var);
            this.f38504a = c10;
            c10.setOnClickListener(new i8(if0Var, 1));
        } else {
            noVar = noVar2;
            i11 = 1;
            num = 1;
        }
        org.telegram.ui.ActionBar.z0 c11 = org.telegram.ui.ActionBar.r0.c(false, false, noVar, 2131232405, org.telegram.messenger.gd.M0(2131745080, null), false, i6Var);
        this.f38505b = c11;
        c11.setOnClickListener(new View.OnClickListener(this) {
            public final po f36834b;

            {
                this.f36834b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        this.f36834b.a();
                        ooVar.w();
                        return;
                    case 1:
                        po poVar = this.f36834b;
                        poVar.a();
                        ooVar.B(poVar.f38513l);
                        return;
                    case 2:
                        po poVar2 = this.f36834b;
                        poVar2.a();
                        ooVar.B(poVar2.f38512k);
                        return;
                    case 3:
                        this.f36834b.a();
                        ooVar.u();
                        return;
                    case 4:
                        this.f36834b.a();
                        org.telegram.messenger.g0.g3(new mo(ooVar, 0));
                        return;
                    default:
                        ooVar.p();
                        this.f36834b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.z0 c12 = org.telegram.ui.ActionBar.r0.c(false, false, noVar, 2131232259, org.telegram.messenger.gd.M0(2131748119, null), false, i6Var);
        this.d = c12;
        c12.setOnClickListener(new View.OnClickListener(this) {
            public final po f36834b;

            {
                this.f36834b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f36834b.a();
                        ooVar.w();
                        return;
                    case 1:
                        po poVar = this.f36834b;
                        poVar.a();
                        ooVar.B(poVar.f38513l);
                        return;
                    case 2:
                        po poVar2 = this.f36834b;
                        poVar2.a();
                        ooVar.B(poVar2.f38512k);
                        return;
                    case 3:
                        this.f36834b.a();
                        ooVar.u();
                        return;
                    case 4:
                        this.f36834b.a();
                        org.telegram.messenger.g0.g3(new mo(ooVar, 0));
                        return;
                    default:
                        ooVar.p();
                        this.f36834b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.z0 c13 = org.telegram.ui.ActionBar.r0.c(false, false, noVar, 2131232259, org.telegram.messenger.gd.M0(2131748119, null), false, i6Var);
        this.f38507e = c13;
        c13.setOnClickListener(new View.OnClickListener(this) {
            public final po f36834b;

            {
                this.f36834b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f36834b.a();
                        ooVar.w();
                        return;
                    case 1:
                        po poVar = this.f36834b;
                        poVar.a();
                        ooVar.B(poVar.f38513l);
                        return;
                    case 2:
                        po poVar2 = this.f36834b;
                        poVar2.a();
                        ooVar.B(poVar2.f38512k);
                        return;
                    case 3:
                        this.f36834b.a();
                        ooVar.u();
                        return;
                    case 4:
                        this.f36834b.a();
                        org.telegram.messenger.g0.g3(new mo(ooVar, 0));
                        return;
                    default:
                        ooVar.p();
                        this.f36834b.a();
                        return;
                }
            }
        });
        Integer num2 = num;
        org.telegram.ui.ActionBar.r0.c(false, false, noVar, 2131232260, org.telegram.messenger.gd.M0(2131748116, null), false, i6Var).setOnClickListener(new lo(this, context, i6Var, i7, ooVar, 0));
        org.telegram.ui.ActionBar.r0.c(false, false, noVar, 2131232108, org.telegram.messenger.gd.M0(2131747724, null), false, i6Var).setOnClickListener(new View.OnClickListener(this) {
            public final po f36834b;

            {
                this.f36834b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f36834b.a();
                        ooVar.w();
                        return;
                    case 1:
                        po poVar = this.f36834b;
                        poVar.a();
                        ooVar.B(poVar.f38513l);
                        return;
                    case 2:
                        po poVar2 = this.f36834b;
                        poVar2.a();
                        ooVar.B(poVar2.f38512k);
                        return;
                    case 3:
                        this.f36834b.a();
                        ooVar.u();
                        return;
                    case 4:
                        this.f36834b.a();
                        org.telegram.messenger.g0.g3(new mo(ooVar, 0));
                        return;
                    default:
                        ooVar.p();
                        this.f36834b.a();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.z0 c14 = org.telegram.ui.ActionBar.r0.c(false, false, noVar, 0, "", false, i6Var);
        this.f38506c = c14;
        c14.setOnClickListener(new View.OnClickListener(this) {
            public final po f36834b;

            {
                this.f36834b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f36834b.a();
                        ooVar.w();
                        return;
                    case 1:
                        po poVar = this.f36834b;
                        poVar.a();
                        ooVar.B(poVar.f38513l);
                        return;
                    case 2:
                        po poVar2 = this.f36834b;
                        poVar2.a();
                        ooVar.B(poVar2.f38512k);
                        return;
                    case 3:
                        this.f36834b.a();
                        ooVar.u();
                        return;
                    case 4:
                        this.f36834b.a();
                        org.telegram.messenger.g0.g3(new mo(ooVar, 0));
                        return;
                    default:
                        ooVar.p();
                        this.f36834b.a();
                        return;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.f38514m = frameLayout;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.H8, frameLayout, i6Var);
        noVar.a(frameLayout, c8.ma.o(-1, 8));
        TextView textView = new TextView(context);
        this.f38515n = textView;
        textView.setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
        textView.setTextSize(i11, 13.0f);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.E8, i6Var);
        frameLayout.setTag(2131296437, num2);
        textView.setTag(2131296437, num2);
        noVar.a(textView, c8.ma.o(-2, -2));
        int i12 = org.telegram.ui.ActionBar.n6.I5;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.w0(i12, i6Var), 0, 6);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i12);
        textView.setBackground(a02);
        org.telegram.ui.ActionBar.u6.j(textView, a02, null, M, i6Var);
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final po f36834b;

            {
                this.f36834b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f36834b.a();
                        ooVar.w();
                        return;
                    case 1:
                        po poVar = this.f36834b;
                        poVar.a();
                        ooVar.B(poVar.f38513l);
                        return;
                    case 2:
                        po poVar2 = this.f36834b;
                        poVar2.a();
                        ooVar.B(poVar2.f38512k);
                        return;
                    case 3:
                        this.f36834b.a();
                        ooVar.u();
                        return;
                    case 4:
                        this.f36834b.a();
                        org.telegram.messenger.g0.g3(new mo(ooVar, 0));
                        return;
                    default:
                        ooVar.p();
                        this.f36834b.a();
                        return;
                }
            }
        });
    }

    public static String b(int i7) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = i7 / 86400;
        int i11 = i7 - (86400 * i10);
        int i12 = i11 / 3600;
        int i13 = (i11 - (i12 * 3600)) / 60;
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append(org.telegram.messenger.gd.M0(2131745497, null));
        }
        if (i12 != 0) {
            if (sb2.length() > 0) {
                sb2.append(" ");
            }
            sb2.append(i12);
            sb2.append(org.telegram.messenger.gd.M0(2131745496, null));
        }
        if (i13 != 0) {
            if (sb2.length() > 0) {
                sb2.append(" ");
            }
            sb2.append(i13);
            sb2.append(org.telegram.messenger.gd.M0(2131745495, null));
        }
        return org.telegram.messenger.gd.a0("MuteForButton", null, 2131748117, sb2.toString());
    }

    public static void c(org.telegram.ui.ActionBar.z0 z0Var, int i7) {
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, i7, false);
        z0Var.c(i7, i7);
        z0Var.h(0.1f, i7);
        if (z0Var.getTextView() != null && z0Var.getTextView().getCurrentTextColor() == x02) {
            return;
        }
        z0Var.d(x02, x02);
        z0Var.setSelectorColor(org.telegram.ui.ActionBar.n6.r1(0.1f, x02));
    }

    public final void a() {
        org.telegram.ui.ActionBar.h1 h1Var = this.h;
        if (h1Var != null) {
            h1Var.d(true);
            this.h.d(true);
        }
        this.f38510i.dismiss();
        this.f38511j = System.currentTimeMillis();
    }

    public final void d(org.telegram.ui.ActionBar.h2 h2Var, View view, float f10, float f11, boolean z10) {
        float measuredWidth;
        float measuredHeight;
        if (h2Var.getFragmentView() != null) {
            no noVar = this.f38508f;
            org.telegram.ui.ActionBar.h1 h1Var = new org.telegram.ui.ActionBar.h1(noVar, -2, -2);
            this.h = h1Var;
            h1Var.f28991e = true;
            h1Var.f28990c = 220;
            h1Var.setOutsideTouchable(true);
            this.h.setClippingEnabled(true);
            this.h.setAnimationStyle(2131755192);
            this.h.setFocusable(true);
            noVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), Integer.MIN_VALUE));
            this.h.setInputMethodMode(2);
            this.h.getContentView().setFocusableInTouchMode(true);
            while (view != h2Var.getFragmentView()) {
                if (view.getParent() == null) {
                    return;
                }
                f10 += view.getX();
                f11 += view.getY();
                view = (View) view.getParent();
            }
            if (z10) {
                measuredWidth = f10 - org.telegram.messenger.g0.N(8.0f);
                measuredHeight = org.telegram.messenger.g0.N(16.0f);
            } else {
                measuredWidth = f10 - (noVar.getMeasuredWidth() / 2.0f);
                measuredHeight = noVar.getMeasuredHeight() / 2.0f;
            }
            this.h.showAtLocation(h2Var.getFragmentView(), 0, (int) measuredWidth, (int) (f11 - measuredHeight));
            this.h.b();
        }
    }

    public final void e(long j3, long j10, HashSet hashSet) {
        int i7;
        int i10;
        int i11;
        if (System.currentTimeMillis() - this.f38511j < 200) {
            org.telegram.messenger.g0.g3(new d3.e0(this, j3, j10, hashSet, 5));
            return;
        }
        int i12 = this.f38509g;
        boolean u22 = org.telegram.messenger.mp.u1(i12).u2(j3, j10, null);
        org.telegram.ui.ActionBar.z0 z0Var = this.f38506c;
        org.telegram.ui.ActionBar.z0 z0Var2 = this.f38505b;
        if (u22) {
            z0Var.j(org.telegram.messenger.gd.M0(2131743611, null), 2131232414, null);
            i7 = org.telegram.ui.ActionBar.n6.f29767x6;
            z0Var2.setVisibility(8);
        } else {
            z0Var.j(org.telegram.messenger.gd.M0(2131748114, null), 2131232258, null);
            int i13 = org.telegram.ui.ActionBar.n6.f29635q7;
            z0Var2.setVisibility(0);
            if (org.telegram.messenger.mp.u1(i12).v2(j3, j10)) {
                z0Var2.j(org.telegram.messenger.gd.M0(2131745082, null), 2131232404, null);
            } else {
                z0Var2.j(org.telegram.messenger.gd.M0(2131745080, null), 2131232405, null);
            }
            i7 = i13;
        }
        if (this.f38516o == 1) {
            this.f38504a.setVisibility(8);
        }
        if (!u22 && this.f38516o != 1) {
            SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(i12).f25658g7;
            i11 = sharedPreferences.getInt("last_selected_mute_until_time", 0);
            i10 = sharedPreferences.getInt("last_selected_mute_until_time2", 0);
        } else {
            i10 = 0;
            i11 = 0;
        }
        org.telegram.ui.ActionBar.z0 z0Var3 = this.d;
        if (i11 != 0) {
            this.f38513l = i11;
            z0Var3.setVisibility(0);
            z0Var3.getImageView().setImageDrawable(k01.a(i11));
            z0Var3.setText(b(i11));
        } else {
            z0Var3.setVisibility(8);
        }
        org.telegram.ui.ActionBar.z0 z0Var4 = this.f38507e;
        if (i10 != 0) {
            this.f38512k = i10;
            z0Var4.setVisibility(0);
            z0Var4.getImageView().setImageDrawable(k01.a(i10));
            z0Var4.setText(b(i10));
        } else {
            z0Var4.setVisibility(8);
        }
        c(z0Var, i7);
        FrameLayout frameLayout = this.f38514m;
        TextView textView = this.f38515n;
        if (hashSet != null && !hashSet.isEmpty()) {
            frameLayout.setVisibility(0);
            textView.setVisibility(0);
            textView.setText(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.G(hashSet.size(), "TopicNotificationsExceptions", new Object[0]), org.telegram.ui.ActionBar.n6.f29576n6, 1, null, null));
            return;
        }
        frameLayout.setVisibility(8);
        textView.setVisibility(8);
    }
}
