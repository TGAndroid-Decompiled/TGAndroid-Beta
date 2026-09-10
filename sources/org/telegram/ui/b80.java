package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class b80 extends z4.a {
    public final int f31180c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public b80(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f31180c = i10;
        this.d = notificationCenterDelegate;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        switch (this.f31180c) {
            case 0:
                gVar.removeView((View) obj);
                return;
            case 1:
                gVar.removeView((View) obj);
                return;
            default:
                gVar.removeView((View) obj);
                return;
        }
    }

    @Override
    public final int b() {
        switch (this.f31180c) {
            case 0:
                return ((c80) this.d).F.length;
            case 1:
                if (((ae1) this.d).f30917b != 0) {
                    return 1;
                }
                return 2;
            default:
                return ((qg.a1) this.d).d.size();
        }
    }

    @Override
    public int c(Object obj) {
        switch (this.f31180c) {
            case 1:
                return -1;
            default:
                return super.c(obj);
        }
    }

    @Override
    public final Object e(z4.g gVar, int i10) {
        View view;
        boolean z10;
        float f7;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        int i11;
        switch (this.f31180c) {
            case 0:
                TextView textView = new TextView(gVar.getContext());
                c80 c80Var = (c80) this.d;
                textView.setTag(c80Var.f31561a);
                TextView textView2 = new TextView(gVar.getContext());
                textView2.setTag(c80Var.f31562b);
                bi.n7 n7Var = new bi.n7(gVar.getContext(), textView, textView2);
                int i12 = org.telegram.ui.ActionBar.j6.G6;
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                textView.setTextSize(1, 26.0f);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(17);
                n7Var.addView(textView, w7.a6.d(-1, -2.0f, 51, 18.0f, 244.0f, 18.0f, 0.0f));
                textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                textView2.setTextSize(1, 15.0f);
                textView2.setLineSpacing(AndroidUtilities.dpf2(2.33f), 1.0f);
                textView2.setGravity(17);
                n7Var.addView(textView2, w7.a6.d(-1, -2.0f, 51, 16.0f, 286.0f, 16.0f, 0.0f));
                gVar.addView(n7Var, 0);
                textView.setText(c80Var.F[i10]);
                textView2.setText(AndroidUtilities.replaceTags(c80Var.G[i10]));
                return n7Var;
            case 1:
                ae1 ae1Var = (ae1) this.d;
                if (i10 == 0) {
                    view = ae1Var.f30966t0;
                } else {
                    view = ae1Var.m0;
                }
                gVar.addView(view);
                return view;
            default:
                qg.a1 a1Var = (qg.a1) this.d;
                qg.z0 z0Var = new qg.z0(a1Var, a1Var.getContext(), i10);
                gVar.addView(z0Var);
                z0Var.f40995a = i10;
                mx0 mx0Var = (mx0) a1Var.d.get(i10);
                int i13 = mx0Var.f35073a;
                String str = mx0Var.d;
                CharSequence charSequence = mx0Var.f35075c;
                int i14 = 8;
                TextView textView3 = z0Var.f40996b;
                org.telegram.ui.Components.m90 m90Var = z0Var.f40997c;
                if (i13 != 0 && i13 != 14 && i13 != 28) {
                    if (a1Var.E) {
                        int i15 = a1Var.f40668y;
                        if (i15 == 4) {
                            textView3.setText(LocaleController.getString(R.string.AdditionalReactions));
                            i11 = R.string.AdditionalReactionsDescription;
                        } else if (i15 == 3) {
                            textView3.setText(LocaleController.getString(R.string.PremiumPreviewNoAds));
                            i11 = R.string.PremiumPreviewNoAdsDescription2;
                        } else if (i15 == 24) {
                            textView3.setText(LocaleController.getString(R.string.PremiumPreviewTags));
                            i11 = R.string.PremiumPreviewTagsDescription;
                        } else if (i15 == 10) {
                            textView3.setText(LocaleController.getString(R.string.PremiumPreviewAppIcon));
                            i11 = R.string.PremiumPreviewAppIconDescription2;
                        } else if (i15 == 2) {
                            textView3.setText(LocaleController.getString(R.string.PremiumPreviewDownloadSpeed));
                            i11 = R.string.PremiumPreviewDownloadSpeedDescription2;
                        } else if (i15 == 9) {
                            textView3.setText(LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement));
                            i11 = R.string.PremiumPreviewAdvancedChatManagementDescription2;
                        } else if (i15 == 8) {
                            textView3.setText(LocaleController.getString(R.string.PremiumPreviewVoiceToText));
                            i11 = R.string.PremiumPreviewVoiceToTextDescription2;
                        } else if (i15 == 13) {
                            textView3.setText(LocaleController.getString(R.string.PremiumPreviewTranslations));
                            i11 = R.string.PremiumPreviewTranslationsDescription;
                        } else if (i15 == 38) {
                            textView3.setText(LocaleController.getString(R.string.PremiumPreviewEffects));
                            i11 = R.string.PremiumPreviewEffectsDescription;
                        } else if (i15 == 22) {
                            textView3.setText(LocaleController.getString(R.string.PremiumPreviewWallpaper));
                            i11 = R.string.PremiumPreviewWallpaperDescription;
                        } else if (i15 == 23) {
                            textView3.setText(LocaleController.getString(R.string.PremiumPreviewProfileColor));
                            i11 = R.string.PremiumPreviewProfileColorDescription;
                        } else if (i15 == 41) {
                            textView3.setText(LocaleController.getString(R.string.PremiumPreviewSharingDisable));
                            i11 = R.string.PremiumPreviewSharingDisableDescription;
                        } else {
                            textView3.setText(charSequence);
                            m90Var.setText(AndroidUtilities.replaceTags(str));
                            z0Var.h = false;
                        }
                        org.telegram.ui.Cells.r6.p(i11, m90Var);
                        z0Var.h = false;
                    } else {
                        textView3.setText(charSequence);
                        m90Var.setText(AndroidUtilities.replaceTags(str));
                        z0Var.h = false;
                    }
                } else {
                    textView3.setText("");
                    m90Var.setText("");
                    z0Var.h = true;
                }
                m90Var.setMaxWidth(bi.x4.a(m90Var.getText(), m90Var.getPaint()));
                z0Var.requestLayout();
                if (mx0Var.f35073a == 40) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && z0Var.d == null) {
                    LinearLayout linearLayout = new LinearLayout(z0Var.getContext());
                    z0Var.d = linearLayout;
                    linearLayout.setOrientation(1);
                    Context context = z0Var.getContext();
                    f6Var = ((org.telegram.ui.ActionBar.h3) a1Var).resourcesProvider;
                    di.l lVar = new di.l(context, f6Var, true);
                    lVar.a(LocaleController.getString(R.string.GiftsFeature1Title), LocaleController.getString(R.string.GiftsFeature1Text), R.drawable.menu_feature_unique);
                    z0Var.d.addView(r2[0], w7.a6.n(-1, -2));
                    Context context2 = z0Var.getContext();
                    f6Var2 = ((org.telegram.ui.ActionBar.h3) a1Var).resourcesProvider;
                    di.l lVar2 = new di.l(context2, f6Var2, true);
                    lVar2.a(LocaleController.getString(R.string.GiftsFeature2Title), LocaleController.getString(R.string.GiftsFeature2Text), R.drawable.menu_feature_tradable);
                    z0Var.d.addView(r2[1], w7.a6.n(-1, -2));
                    Context context3 = z0Var.getContext();
                    f6Var3 = ((org.telegram.ui.ActionBar.h3) a1Var).resourcesProvider;
                    di.l lVar3 = new di.l(context3, f6Var3, true);
                    di.l[] lVarArr = {lVar, lVar2, lVar3};
                    lVar3.a(LocaleController.getString(R.string.GiftsFeature3Title), LocaleController.getString(R.string.GiftsFeature3Text), R.drawable.menu_wear);
                    z0Var.d.addView(lVarArr[2], w7.a6.n(-1, -2));
                    z0Var.addView(z0Var.d, w7.a6.k(0.0f, -4.0f, 0.0f, 0.0f, -1, -2));
                }
                LinearLayout linearLayout2 = z0Var.d;
                if (linearLayout2 != null) {
                    if (z10) {
                        i14 = 0;
                    }
                    linearLayout2.setVisibility(i14);
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) m90Var.getLayoutParams();
                if (z10) {
                    f7 = 6.0f;
                } else {
                    f7 = 10.0f;
                }
                marginLayoutParams.topMargin = AndroidUtilities.dp(f7);
                return z0Var;
        }
    }

    @Override
    public final boolean f(View view, Object obj) {
        switch (this.f31180c) {
            case 0:
                return view.equals(obj);
            case 1:
                if (obj == view) {
                    return true;
                }
                return false;
            default:
                if (view == obj) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public void h(int i10) {
        switch (this.f31180c) {
            case 0:
                c80 c80Var = (c80) this.d;
                c80Var.e.setCurrentPage(i10);
                c80Var.H = i10;
                return;
            default:
                return;
        }
    }
}
