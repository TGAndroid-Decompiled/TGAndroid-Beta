package org.telegram.ui.Cells;

import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.al;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.nf0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.w61;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.kg1;
public final class qa implements Utilities.Callback {
    public final int f21591a;
    public final int f21592b;
    public final Object f21593c;

    public qa(Object obj, int i10, int i11) {
        this.f21591a = i11;
        this.f21593c = obj;
        this.f21592b = i10;
    }

    @Override
    public final void run(Object obj) {
        float f10;
        int i10;
        int i11 = this.f21591a;
        int i12 = this.f21592b;
        Object obj2 = this.f21593c;
        switch (i11) {
            case 0:
                sa saVar = (sa) obj2;
                ArrayList arrayList = (ArrayList) obj;
                saVar.getClass();
                if (LaunchActivity.f31613z1) {
                    if (arrayList != null && arrayList.size() != 0) {
                        LinearLayout linearLayout = new LinearLayout(saVar.getContext());
                        linearLayout.setOrientation(1);
                        ?? imageView = new ImageView(saVar.getContext());
                        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        imageView.f(R.raw.ic_ban, 50, 50, null);
                        imageView.d();
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        imageView.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I6, false)));
                        linearLayout.addView((View) imageView, k7.b6.t(80, 80, 17, 0, 14, 0, 0));
                        TextView textView = new TextView(saVar.getContext());
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setTextSize(1, 20.0f);
                        textView.setGravity(17);
                        textView.setText(LocaleController.formatPluralString("UnconfirmedAuthDeniedTitle", arrayList.size(), new Object[0]));
                        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20012j5, false));
                        linearLayout.addView(textView, k7.b6.k(28.0f, 14.0f, 28.0f, 0.0f, -1, -2));
                        TextView textView2 = new TextView(saVar.getContext());
                        textView2.setTextSize(1, 14.0f);
                        textView2.setGravity(17);
                        if (arrayList.size() == 1) {
                            textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthDeniedMessageSingle, sa.a((UnconfirmedAuthController.UnconfirmedAuth) arrayList.get(0))));
                        } else {
                            String str = "\n";
                            for (int i13 = 0; i13 < Math.min(arrayList.size(), 10); i13++) {
                                StringBuilder f11 = vh.v2.f(str, "• ");
                                f11.append(sa.a((UnconfirmedAuthController.UnconfirmedAuth) arrayList.get(i13)));
                                f11.append("\n");
                                str = f11.toString();
                            }
                            textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthDeniedMessageMultiple, str));
                        }
                        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20012j5, false));
                        linearLayout.addView(textView2, k7.b6.k(40.0f, 9.0f, 40.0f, 0.0f, -1, -2));
                        FrameLayout frameLayout = new FrameLayout(saVar.getContext());
                        frameLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f));
                        int dp = AndroidUtilities.dp(12.0f);
                        int i14 = org.telegram.ui.ActionBar.j6.f20141q7;
                        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i14, false);
                        if (org.telegram.ui.ActionBar.j6.I.q()) {
                            f10 = 0.2f;
                        } else {
                            f10 = 0.15f;
                        }
                        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.b0(dp, org.telegram.ui.ActionBar.j6.l1(f10, w02)));
                        TextView textView3 = new TextView(saVar.getContext());
                        textView3.setTypeface(AndroidUtilities.bold());
                        textView3.setTextSize(1, 14.0f);
                        textView3.setGravity(17);
                        textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
                        textView3.setText(LocaleController.getString(R.string.UnconfirmedAuthDeniedWarning));
                        frameLayout.addView(textView3, k7.b6.e(-1, -1, 119));
                        linearLayout.addView(frameLayout, k7.b6.k(14.0f, 19.0f, 14.0f, 0.0f, -1, -2));
                        ph.d dVar = new ph.d(saVar.getContext(), null, true);
                        dVar.setRoundRadius(24);
                        k7.d6.b(dVar, 0.02f, 1.5f);
                        dVar.g(LocaleController.getString(R.string.GotIt), false, true);
                        linearLayout.addView(dVar, k7.b6.k(14.0f, 20.0f, 14.0f, 4.0f, -1, 48));
                        org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(saVar.getContext(), null, false, false);
                        g3Var.fixNavigationBar();
                        g3Var.customView = linearLayout;
                        g3Var.show();
                        g3Var.setCanDismissWithSwipe(false);
                        g3Var.setCanDismissWithTouchOutside(false);
                        g gVar = new g(g3Var, 11);
                        AndroidUtilities.cancelRunOnUIThread(dVar.D);
                        dVar.setCountFilled(false);
                        dVar.C = 5;
                        dVar.c(5, false);
                        dVar.setShowZero(false);
                        kg1 kg1Var = new kg1(17, dVar, gVar);
                        dVar.D = kg1Var;
                        AndroidUtilities.runOnUIThread(kg1Var, 1000L);
                        dVar.setOnClickListener(new y2(dVar, g3Var, 1));
                    } else {
                        org.telegram.messenger.y3.s(R.string.UnknownError, new qc(cb.a(saVar.getContext()), null), null);
                    }
                }
                saVar.e.a(false, true);
                MessagesController.getInstance(i12).getUnconfirmedAuthController().cleanup();
                return;
            case 1:
                al alVar = (al) obj2;
                TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeoLive.geo = tL_geoPoint;
                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(alVar.f23431n0.getLatitude());
                tL_messageMediaGeoLive.geo._long = AndroidUtilities.fixLocationCoord(alVar.f23431n0.getLongitude());
                tL_messageMediaGeoLive.period = i12;
                alVar.f23440u0.d(tL_messageMediaGeoLive, alVar.f23441v0, true, 0, ((Long) obj).longValue());
                alVar.f24278b.dismiss(true);
                return;
            case 2:
                ph.l5 l5Var = (ph.l5) obj2;
                int[] iArr = (int[]) obj;
                ph.u6 u6Var = l5Var.d;
                int i15 = iArr[0];
                l5Var.R = i15;
                u6Var.A0 = i15;
                int i16 = iArr[1];
                l5Var.S = i16;
                u6Var.B0 = i16;
                l5Var.Q.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i12, iArr, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                l5Var.invalidate();
                w61 w61Var = l5Var.f41894n;
                if (w61Var != null) {
                    int i17 = l5Var.R;
                    int i18 = l5Var.S;
                    vz vzVar = w61Var.f30249b;
                    if (vzVar == null) {
                        w61Var.f30252n = i17;
                        w61Var.f30253r = i18;
                    } else {
                        vzVar.i(i17, i18);
                    }
                }
                nf0 nf0Var = l5Var.f41901s;
                if (nf0Var != null) {
                    int i19 = l5Var.R;
                    int i20 = l5Var.S;
                    vz vzVar2 = nf0Var.f27248i0;
                    if (vzVar2 != null) {
                        vzVar2.i(i19, i20);
                        return;
                    }
                    nf0Var.G0 = i19;
                    nf0Var.H0 = i20;
                    return;
                }
                return;
            default:
                uf.m1 m1Var = ((uf.f1) obj2).f45306a;
                uf.m1.X(m1Var);
                i10 = ((org.telegram.ui.ActionBar.p2) m1Var).currentAccount;
                uf.p1.f(i10).k(i12, (String) obj);
                return;
        }
    }
}
