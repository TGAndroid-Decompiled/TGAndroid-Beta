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
public final class o70 extends a5.a {
    public final int f42110c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public o70(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f42110c = i10;
        this.d = notificationCenterDelegate;
    }

    @Override
    public final void a(a5.m mVar, Object obj) {
        switch (this.f42110c) {
            case 0:
                mVar.removeView((View) obj);
                return;
            case 1:
                mVar.removeView((View) obj);
                return;
            default:
                mVar.removeView((View) obj);
                return;
        }
    }

    @Override
    public final int b() {
        switch (this.f42110c) {
            case 0:
                return ((p70) this.d).F.length;
            case 1:
                if (((tc1) this.d).f43736b != 0) {
                    return 1;
                }
                return 2;
            default:
                return ((tg.y0) this.d).d.size();
        }
    }

    @Override
    public int c(Object obj) {
        switch (this.f42110c) {
            case 1:
                return -1;
            default:
                return super.c(obj);
        }
    }

    @Override
    public final Object e(a5.m mVar, int i10) {
        View view;
        boolean z10;
        float f7;
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        org.telegram.ui.ActionBar.u6 u6Var3;
        int i11;
        switch (this.f42110c) {
            case 0:
                TextView textView = new TextView(mVar.getContext());
                p70 p70Var = (p70) this.d;
                textView.setTag(p70Var.f42379a);
                TextView textView2 = new TextView(mVar.getContext());
                textView2.setTag(p70Var.f42380b);
                bh.p pVar = new bh.p(mVar.getContext(), textView, textView2);
                int i12 = org.telegram.ui.ActionBar.y6.G6;
                org.telegram.messenger.t.r(textView, i12, null, 1, 26.0f);
                textView.setGravity(17);
                pVar.addView(textView, org.telegram.ui.Components.gb1.h(-1, -2.0f, 51, 18.0f, 244.0f, 18.0f, 0.0f));
                org.telegram.ui.ActionBar.f7.V(textView2, i12, null);
                textView2.setTextSize(1, 15.0f);
                textView2.setLineSpacing(AndroidUtilities.dpf2(2.33f), 1.0f);
                textView2.setGravity(17);
                pVar.addView(textView2, org.telegram.ui.Components.gb1.h(-1, -2.0f, 51, 16.0f, 286.0f, 16.0f, 0.0f));
                mVar.addView(pVar, 0);
                textView.setText(p70Var.F[i10]);
                textView2.setText(AndroidUtilities.replaceTags(p70Var.G[i10]));
                return pVar;
            case 1:
                tc1 tc1Var = (tc1) this.d;
                if (i10 == 0) {
                    view = tc1Var.f43788u0;
                } else {
                    view = tc1Var.f43772n0;
                }
                mVar.addView(view);
                return view;
            default:
                tg.y0 y0Var = (tg.y0) this.d;
                tg.x0 x0Var = new tg.x0(y0Var, y0Var.getContext(), i10);
                mVar.addView(x0Var);
                x0Var.f49111a = i10;
                ww0 ww0Var = (ww0) y0Var.d.get(i10);
                int i13 = ww0Var.f45563a;
                String str = ww0Var.d;
                CharSequence charSequence = ww0Var.f45565c;
                int i14 = 8;
                TextView textView3 = x0Var.f49112b;
                org.telegram.ui.Components.z90 z90Var = x0Var.f49113c;
                if (i13 != 0 && i13 != 14 && i13 != 28) {
                    if (y0Var.E) {
                        int i15 = y0Var.f49132y;
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
                            z90Var.setText(AndroidUtilities.replaceTags(str));
                            x0Var.h = false;
                        }
                        d3.s(i11, z90Var);
                        x0Var.h = false;
                    } else {
                        textView3.setText(charSequence);
                        z90Var.setText(AndroidUtilities.replaceTags(str));
                        x0Var.h = false;
                    }
                } else {
                    textView3.setText("");
                    z90Var.setText("");
                    x0Var.h = true;
                }
                z90Var.setMaxWidth(fi.v3.a(z90Var.getText(), z90Var.getPaint()));
                x0Var.requestLayout();
                if (ww0Var.f45563a == 40) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && x0Var.d == null) {
                    LinearLayout linearLayout = new LinearLayout(x0Var.getContext());
                    x0Var.d = linearLayout;
                    linearLayout.setOrientation(1);
                    Context context = x0Var.getContext();
                    u6Var = ((org.telegram.ui.ActionBar.k3) y0Var).resourcesProvider;
                    hi.j jVar = new hi.j(context, u6Var, true);
                    jVar.a(LocaleController.getString(R.string.GiftsFeature1Title), LocaleController.getString(R.string.GiftsFeature1Text), R.drawable.menu_feature_unique);
                    x0Var.d.addView(r2[0], org.telegram.ui.Components.gb1.r(-1, -2));
                    Context context2 = x0Var.getContext();
                    u6Var2 = ((org.telegram.ui.ActionBar.k3) y0Var).resourcesProvider;
                    hi.j jVar2 = new hi.j(context2, u6Var2, true);
                    jVar2.a(LocaleController.getString(R.string.GiftsFeature2Title), LocaleController.getString(R.string.GiftsFeature2Text), R.drawable.menu_feature_tradable);
                    x0Var.d.addView(r2[1], org.telegram.ui.Components.gb1.r(-1, -2));
                    Context context3 = x0Var.getContext();
                    u6Var3 = ((org.telegram.ui.ActionBar.k3) y0Var).resourcesProvider;
                    hi.j jVar3 = new hi.j(context3, u6Var3, true);
                    hi.j[] jVarArr = {jVar, jVar2, jVar3};
                    jVar3.a(LocaleController.getString(R.string.GiftsFeature3Title), LocaleController.getString(R.string.GiftsFeature3Text), R.drawable.menu_wear);
                    x0Var.d.addView(jVarArr[2], org.telegram.ui.Components.gb1.r(-1, -2));
                    x0Var.addView(x0Var.d, org.telegram.ui.Components.gb1.o(0.0f, -4.0f, 0.0f, 0.0f, -1, -2));
                }
                LinearLayout linearLayout2 = x0Var.d;
                if (linearLayout2 != null) {
                    if (z10) {
                        i14 = 0;
                    }
                    linearLayout2.setVisibility(i14);
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) z90Var.getLayoutParams();
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
        switch (this.f42110c) {
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
        switch (this.f42110c) {
            case 0:
                p70 p70Var = (p70) this.d;
                p70Var.e.setCurrentPage(i10);
                p70Var.H = i10;
                return;
            default:
                return;
        }
    }
}
