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
    public final int f32585c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public c80(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f32585c = i10;
        this.d = notificationCenterDelegate;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        switch (this.f32585c) {
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
        switch (this.f32585c) {
            case 0:
                return ((d80) this.d).F.length;
            case 1:
                if (((vd1) this.d).f38470b != 0) {
                    return 1;
                }
                return 2;
            default:
                return ((rg.x0) this.d).d.size();
        }
    }

    @Override
    public int c(Object obj) {
        switch (this.f32585c) {
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
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.ActionBar.e6 e6Var3;
        int i11;
        switch (this.f32585c) {
            case 0:
                TextView textView = new TextView(gVar.getContext());
                d80 d80Var = (d80) this.d;
                textView.setTag(d80Var.f32890a);
                TextView textView2 = new TextView(gVar.getContext());
                textView2.setTag(d80Var.f32891b);
                ci.n6 n6Var = new ci.n6(gVar.getContext(), textView, textView2);
                int i12 = org.telegram.ui.ActionBar.j6.G6;
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                textView.setTextSize(1, 26.0f);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(17);
                n6Var.addView(textView, w7.y5.d(-1, -2.0f, 51, 18.0f, 244.0f, 18.0f, 0.0f));
                textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                textView2.setTextSize(1, 15.0f);
                textView2.setLineSpacing(AndroidUtilities.dpf2(2.33f), 1.0f);
                textView2.setGravity(17);
                n6Var.addView(textView2, w7.y5.d(-1, -2.0f, 51, 16.0f, 286.0f, 16.0f, 0.0f));
                gVar.addView(n6Var, 0);
                textView.setText(d80Var.F[i10]);
                textView2.setText(AndroidUtilities.replaceTags(d80Var.G[i10]));
                return n6Var;
            case 1:
                vd1 vd1Var = (vd1) this.d;
                if (i10 == 0) {
                    view = vd1Var.f38519t0;
                } else {
                    view = vd1Var.m0;
                }
                gVar.addView(view);
                return view;
            default:
                rg.x0 x0Var = (rg.x0) this.d;
                rg.w0 w0Var = new rg.w0(x0Var, x0Var.getContext(), i10);
                gVar.addView(w0Var);
                w0Var.f42782a = i10;
                kx0 kx0Var = (kx0) x0Var.d.get(i10);
                int i13 = kx0Var.f35197a;
                String str = kx0Var.d;
                CharSequence charSequence = kx0Var.f35199c;
                int i14 = 8;
                TextView textView3 = w0Var.f42783b;
                org.telegram.ui.Components.l90 l90Var = w0Var.f42784c;
                if (i13 != 0 && i13 != 14 && i13 != 28) {
                    if (x0Var.E) {
                        int i15 = x0Var.f42799y;
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
                            l90Var.setText(AndroidUtilities.replaceTags(str));
                            w0Var.h = false;
                        }
                        org.telegram.ui.Cells.c1.o(i11, l90Var);
                        w0Var.h = false;
                    } else {
                        textView3.setText(charSequence);
                        l90Var.setText(AndroidUtilities.replaceTags(str));
                        w0Var.h = false;
                    }
                } else {
                    textView3.setText("");
                    l90Var.setText("");
                    w0Var.h = true;
                }
                l90Var.setMaxWidth(ci.f4.a(l90Var.getText(), l90Var.getPaint()));
                w0Var.requestLayout();
                if (kx0Var.f35197a == 40) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && w0Var.d == null) {
                    LinearLayout linearLayout = new LinearLayout(w0Var.getContext());
                    w0Var.d = linearLayout;
                    linearLayout.setOrientation(1);
                    Context context = w0Var.getContext();
                    e6Var = ((org.telegram.ui.ActionBar.f3) x0Var).resourcesProvider;
                    ei.k kVar = new ei.k(context, e6Var, true);
                    kVar.a(LocaleController.getString(R.string.GiftsFeature1Title), LocaleController.getString(R.string.GiftsFeature1Text), R.drawable.menu_feature_unique);
                    w0Var.d.addView(r2[0], w7.y5.n(-1, -2));
                    Context context2 = w0Var.getContext();
                    e6Var2 = ((org.telegram.ui.ActionBar.f3) x0Var).resourcesProvider;
                    ei.k kVar2 = new ei.k(context2, e6Var2, true);
                    kVar2.a(LocaleController.getString(R.string.GiftsFeature2Title), LocaleController.getString(R.string.GiftsFeature2Text), R.drawable.menu_feature_tradable);
                    w0Var.d.addView(r2[1], w7.y5.n(-1, -2));
                    Context context3 = w0Var.getContext();
                    e6Var3 = ((org.telegram.ui.ActionBar.f3) x0Var).resourcesProvider;
                    ei.k kVar3 = new ei.k(context3, e6Var3, true);
                    ei.k[] kVarArr = {kVar, kVar2, kVar3};
                    kVar3.a(LocaleController.getString(R.string.GiftsFeature3Title), LocaleController.getString(R.string.GiftsFeature3Text), R.drawable.menu_wear);
                    w0Var.d.addView(kVarArr[2], w7.y5.n(-1, -2));
                    w0Var.addView(w0Var.d, w7.y5.k(0.0f, -4.0f, 0.0f, 0.0f, -1, -2));
                }
                LinearLayout linearLayout2 = w0Var.d;
                if (linearLayout2 != null) {
                    if (z10) {
                        i14 = 0;
                    }
                    linearLayout2.setVisibility(i14);
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) l90Var.getLayoutParams();
                if (z10) {
                    f7 = 6.0f;
                } else {
                    f7 = 10.0f;
                }
                marginLayoutParams.topMargin = AndroidUtilities.dp(f7);
                return w0Var;
        }
    }

    @Override
    public final boolean f(View view, Object obj) {
        switch (this.f32585c) {
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
        switch (this.f32585c) {
            case 0:
                d80 d80Var = (d80) this.d;
                d80Var.e.setCurrentPage(i10);
                d80Var.H = i10;
                return;
            default:
                return;
        }
    }
}
