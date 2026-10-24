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
public final class m70 extends z4.a {
    public final int f39452c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public m70(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f39452c = i10;
        this.d = notificationCenterDelegate;
    }

    @Override
    public final void a(z4.h hVar, Object obj) {
        switch (this.f39452c) {
            case 0:
                hVar.removeView((View) obj);
                return;
            case 1:
                hVar.removeView((View) obj);
                return;
            default:
                hVar.removeView((View) obj);
                return;
        }
    }

    @Override
    public final int b() {
        switch (this.f39452c) {
            case 0:
                return ((n70) this.d).F.length;
            case 1:
                if (((pc1) this.d).f40445b != 0) {
                    return 1;
                }
                return 2;
            default:
                return ((sg.y0) this.d).d.size();
        }
    }

    @Override
    public int c(Object obj) {
        switch (this.f39452c) {
            case 1:
                return -1;
            default:
                return super.c(obj);
        }
    }

    @Override
    public final Object e(z4.h hVar, int i10) {
        View view;
        boolean z10;
        float f7;
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        org.telegram.ui.ActionBar.g6 g6Var3;
        int i11;
        switch (this.f39452c) {
            case 0:
                TextView textView = new TextView(hVar.getContext());
                n70 n70Var = (n70) this.d;
                textView.setTag(n70Var.f39753a);
                TextView textView2 = new TextView(hVar.getContext());
                textView2.setTag(n70Var.f39754b);
                ah.v vVar = new ah.v(hVar.getContext(), textView, textView2);
                int i12 = org.telegram.ui.ActionBar.k6.G6;
                org.telegram.messenger.v0.q(textView, i12, null, 1, 26.0f);
                textView.setGravity(17);
                vVar.addView(textView, w7.z5.d(-1, -2.0f, 51, 18.0f, 244.0f, 18.0f, 0.0f));
                org.telegram.ui.ActionBar.r6.W(textView2, i12, null);
                textView2.setTextSize(1, 15.0f);
                textView2.setLineSpacing(AndroidUtilities.dpf2(2.33f), 1.0f);
                textView2.setGravity(17);
                vVar.addView(textView2, w7.z5.d(-1, -2.0f, 51, 16.0f, 286.0f, 16.0f, 0.0f));
                hVar.addView(vVar, 0);
                textView.setText(n70Var.F[i10]);
                textView2.setText(AndroidUtilities.replaceTags(n70Var.G[i10]));
                return vVar;
            case 1:
                pc1 pc1Var = (pc1) this.d;
                if (i10 == 0) {
                    view = pc1Var.f40497u0;
                } else {
                    view = pc1Var.f40481n0;
                }
                hVar.addView(view);
                return view;
            default:
                sg.y0 y0Var = (sg.y0) this.d;
                sg.x0 x0Var = new sg.x0(y0Var, y0Var.getContext(), i10);
                hVar.addView(x0Var);
                x0Var.f46933a = i10;
                rw0 rw0Var = (rw0) y0Var.d.get(i10);
                int i13 = rw0Var.f41244a;
                String str = rw0Var.d;
                CharSequence charSequence = rw0Var.f41246c;
                int i14 = 8;
                TextView textView3 = x0Var.f46934b;
                org.telegram.ui.Components.w90 w90Var = x0Var.f46935c;
                if (i13 != 0 && i13 != 14 && i13 != 28) {
                    if (y0Var.E) {
                        int i15 = y0Var.f46954y;
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
                            w90Var.setText(AndroidUtilities.replaceTags(str));
                            x0Var.h = false;
                        }
                        org.telegram.ui.Cells.b1.r(i11, w90Var);
                        x0Var.h = false;
                    } else {
                        textView3.setText(charSequence);
                        w90Var.setText(AndroidUtilities.replaceTags(str));
                        x0Var.h = false;
                    }
                } else {
                    textView3.setText("");
                    w90Var.setText("");
                    x0Var.h = true;
                }
                w90Var.setMaxWidth(ei.x3.a(w90Var.getText(), w90Var.getPaint()));
                x0Var.requestLayout();
                if (rw0Var.f41244a == 40) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && x0Var.d == null) {
                    LinearLayout linearLayout = new LinearLayout(x0Var.getContext());
                    x0Var.d = linearLayout;
                    linearLayout.setOrientation(1);
                    Context context = x0Var.getContext();
                    g6Var = ((org.telegram.ui.ActionBar.h3) y0Var).resourcesProvider;
                    gi.k kVar = new gi.k(context, g6Var, true);
                    kVar.a(LocaleController.getString(R.string.GiftsFeature1Title), LocaleController.getString(R.string.GiftsFeature1Text), R.drawable.menu_feature_unique);
                    x0Var.d.addView(r2[0], w7.z5.n(-1, -2));
                    Context context2 = x0Var.getContext();
                    g6Var2 = ((org.telegram.ui.ActionBar.h3) y0Var).resourcesProvider;
                    gi.k kVar2 = new gi.k(context2, g6Var2, true);
                    kVar2.a(LocaleController.getString(R.string.GiftsFeature2Title), LocaleController.getString(R.string.GiftsFeature2Text), R.drawable.menu_feature_tradable);
                    x0Var.d.addView(r2[1], w7.z5.n(-1, -2));
                    Context context3 = x0Var.getContext();
                    g6Var3 = ((org.telegram.ui.ActionBar.h3) y0Var).resourcesProvider;
                    gi.k kVar3 = new gi.k(context3, g6Var3, true);
                    gi.k[] kVarArr = {kVar, kVar2, kVar3};
                    kVar3.a(LocaleController.getString(R.string.GiftsFeature3Title), LocaleController.getString(R.string.GiftsFeature3Text), R.drawable.menu_wear);
                    x0Var.d.addView(kVarArr[2], w7.z5.n(-1, -2));
                    x0Var.addView(x0Var.d, w7.z5.k(0.0f, -4.0f, 0.0f, 0.0f, -1, -2));
                }
                LinearLayout linearLayout2 = x0Var.d;
                if (linearLayout2 != null) {
                    if (z10) {
                        i14 = 0;
                    }
                    linearLayout2.setVisibility(i14);
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) w90Var.getLayoutParams();
                if (z10) {
                    f7 = 6.0f;
                } else {
                    f7 = 10.0f;
                }
                marginLayoutParams.topMargin = AndroidUtilities.dp(f7);
                return x0Var;
        }
    }

    @Override
    public final boolean f(View view, Object obj) {
        switch (this.f39452c) {
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
        switch (this.f39452c) {
            case 0:
                n70 n70Var = (n70) this.d;
                n70Var.e.setCurrentPage(i10);
                n70Var.H = i10;
                return;
            default:
                return;
        }
    }
}
