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
public final class c80 extends z4.a {
    public final int f35022c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public c80(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f35022c = i10;
        this.d = notificationCenterDelegate;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        switch (this.f35022c) {
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
        switch (this.f35022c) {
            case 0:
                return ((d80) this.d).F.length;
            case 1:
                if (((wd1) this.d).f41917b != 0) {
                    return 1;
                }
                return 2;
            default:
                return ((sg.a1) this.d).d.size();
        }
    }

    @Override
    public int c(Object obj) {
        switch (this.f35022c) {
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
        switch (this.f35022c) {
            case 0:
                TextView textView = new TextView(gVar.getContext());
                d80 d80Var = (d80) this.d;
                textView.setTag(d80Var.f35711a);
                TextView textView2 = new TextView(gVar.getContext());
                textView2.setTag(d80Var.f35712b);
                ah.w wVar = new ah.w(gVar.getContext(), textView, textView2);
                int i12 = org.telegram.ui.ActionBar.j6.G6;
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                textView.setTextSize(1, 26.0f);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(17);
                wVar.addView(textView, w7.x5.d(-1, -2.0f, 51, 18.0f, 244.0f, 18.0f, 0.0f));
                textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                textView2.setTextSize(1, 15.0f);
                textView2.setLineSpacing(AndroidUtilities.dpf2(2.33f), 1.0f);
                textView2.setGravity(17);
                wVar.addView(textView2, w7.x5.d(-1, -2.0f, 51, 16.0f, 286.0f, 16.0f, 0.0f));
                gVar.addView(wVar, 0);
                textView.setText(d80Var.F[i10]);
                textView2.setText(AndroidUtilities.replaceTags(d80Var.G[i10]));
                return wVar;
            case 1:
                wd1 wd1Var = (wd1) this.d;
                if (i10 == 0) {
                    view = wd1Var.f41967t0;
                } else {
                    view = wd1Var.m0;
                }
                gVar.addView(view);
                return view;
            default:
                sg.a1 a1Var = (sg.a1) this.d;
                sg.z0 z0Var = new sg.z0(a1Var, a1Var.getContext(), i10);
                gVar.addView(z0Var);
                z0Var.f46370a = i10;
                kx0 kx0Var = (kx0) a1Var.d.get(i10);
                int i13 = kx0Var.f38147a;
                String str = kx0Var.d;
                CharSequence charSequence = kx0Var.f38149c;
                int i14 = 8;
                TextView textView3 = z0Var.f46371b;
                org.telegram.ui.Components.d90 d90Var = z0Var.f46372c;
                if (i13 != 0 && i13 != 14 && i13 != 28) {
                    if (a1Var.E) {
                        int i15 = a1Var.f46020y;
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
                            d90Var.setText(AndroidUtilities.replaceTags(str));
                            z0Var.h = false;
                        }
                        org.telegram.ui.Cells.p6.p(i11, d90Var);
                        z0Var.h = false;
                    } else {
                        textView3.setText(charSequence);
                        d90Var.setText(AndroidUtilities.replaceTags(str));
                        z0Var.h = false;
                    }
                } else {
                    textView3.setText("");
                    d90Var.setText("");
                    z0Var.h = true;
                }
                d90Var.setMaxWidth(di.f4.a(d90Var.getText(), d90Var.getPaint()));
                z0Var.requestLayout();
                if (kx0Var.f38147a == 40) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && z0Var.d == null) {
                    LinearLayout linearLayout = new LinearLayout(z0Var.getContext());
                    z0Var.d = linearLayout;
                    linearLayout.setOrientation(1);
                    Context context = z0Var.getContext();
                    f6Var = ((org.telegram.ui.ActionBar.f3) a1Var).resourcesProvider;
                    fi.l lVar = new fi.l(context, f6Var, true);
                    lVar.a(LocaleController.getString(R.string.GiftsFeature1Title), LocaleController.getString(R.string.GiftsFeature1Text), R.drawable.menu_feature_unique);
                    z0Var.d.addView(r2[0], w7.x5.n(-1, -2));
                    Context context2 = z0Var.getContext();
                    f6Var2 = ((org.telegram.ui.ActionBar.f3) a1Var).resourcesProvider;
                    fi.l lVar2 = new fi.l(context2, f6Var2, true);
                    lVar2.a(LocaleController.getString(R.string.GiftsFeature2Title), LocaleController.getString(R.string.GiftsFeature2Text), R.drawable.menu_feature_tradable);
                    z0Var.d.addView(r2[1], w7.x5.n(-1, -2));
                    Context context3 = z0Var.getContext();
                    f6Var3 = ((org.telegram.ui.ActionBar.f3) a1Var).resourcesProvider;
                    fi.l lVar3 = new fi.l(context3, f6Var3, true);
                    fi.l[] lVarArr = {lVar, lVar2, lVar3};
                    lVar3.a(LocaleController.getString(R.string.GiftsFeature3Title), LocaleController.getString(R.string.GiftsFeature3Text), R.drawable.menu_wear);
                    z0Var.d.addView(lVarArr[2], w7.x5.n(-1, -2));
                    z0Var.addView(z0Var.d, w7.x5.k(0.0f, -4.0f, 0.0f, 0.0f, -1, -2));
                }
                LinearLayout linearLayout2 = z0Var.d;
                if (linearLayout2 != null) {
                    if (z10) {
                        i14 = 0;
                    }
                    linearLayout2.setVisibility(i14);
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) d90Var.getLayoutParams();
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
        switch (this.f35022c) {
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
        switch (this.f35022c) {
            case 0:
                d80 d80Var = (d80) this.d;
                d80Var.f35714e.setCurrentPage(i10);
                d80Var.H = i10;
                return;
            default:
                return;
        }
    }
}
