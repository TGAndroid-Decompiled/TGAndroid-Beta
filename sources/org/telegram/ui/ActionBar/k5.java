package org.telegram.ui.ActionBar;

import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.LaunchActivity;

public final class k5 implements Runnable {

    public final int f23613a;

    public final TLObject f23614b;

    public final int f23615c;

    public k5(int i10, TLObject tLObject) {
        this.f23613a = 0;
        this.f23615c = i10;
        this.f23614b = tLObject;
    }

    @Override
    public final void run() throws Throwable {
        boolean z10;
        f6 f6Var;
        int i10;
        TL_account.TL_themes tL_themes;
        int i11;
        Integer num;
        int i12;
        Integer num2;
        String strQ0;
        f6 f6Var2;
        TLRPC.WallPaperSettings wallPaperSettings;
        Object obj;
        int i13 = this.f23613a;
        Object obj2 = null;
        int i14 = this.f23615c;
        TLObject tLObject = this.f23614b;
        switch (i13) {
            case 0:
                ArrayList arrayList = g6.G;
                Integer num3 = -1;
                HashMap map = g6.H;
                ArrayList arrayList2 = g6.F;
                g6.C[i14] = false;
                if (tLObject instanceof TL_account.TL_themes) {
                    TL_account.TL_themes tL_themes2 = (TL_account.TL_themes) tLObject;
                    g6.E[i14] = tL_themes2.hash;
                    g6.D[i14] = (int) (System.currentTimeMillis() / 1000);
                    ArrayList<TLRPC.TL_theme> arrayList3 = new ArrayList<>();
                    ArrayList arrayList4 = new ArrayList();
                    int size = arrayList2.size();
                    int i15 = 0;
                    while (i15 < size) {
                        f6 f6Var3 = (f6) arrayList2.get(i15);
                        if (f6Var3.B == null || f6Var3.A != i14) {
                            obj = obj2;
                            if (f6Var3.X != null) {
                                for (int i16 = 0; i16 < f6Var3.X.size(); i16++) {
                                    e6 e6Var = (e6) f6Var3.X.get(i16);
                                    if (e6Var.f22898r != null && e6Var.f22900t == i14) {
                                        arrayList4.add(e6Var);
                                    }
                                }
                            }
                        } else {
                            arrayList4.add(f6Var3);
                            obj = obj2;
                        }
                        i15++;
                        obj2 = obj;
                    }
                    Object obj3 = obj2;
                    int size2 = tL_themes2.themes.size();
                    int i17 = 0;
                    boolean z11 = false;
                    boolean z12 = false;
                    while (i17 < size2) {
                        TLRPC.TL_theme tL_theme = tL_themes2.themes.get(i17);
                        if (tL_theme == null) {
                            i10 = size2;
                            tL_themes = tL_themes2;
                            i11 = i17;
                            num = num3;
                        } else {
                            if (tL_theme.isDefault) {
                                arrayList3.add(tL_theme);
                            }
                            ArrayList<TLRPC.ThemeSettings> arrayList5 = tL_theme.settings;
                            if (arrayList5 == null || arrayList5.size() <= 0) {
                                i10 = size2;
                                tL_themes = tL_themes2;
                                i11 = i17;
                                num = num3;
                                String str = "remote" + tL_theme.f22517id;
                                f6 f6Var4 = (f6) map.get(str);
                                if (f6Var4 == null) {
                                    f6Var4 = new f6();
                                    f6Var4.A = i14;
                                    f6Var4.f22943b = new File(ApplicationLoader.getFilesDirFixed(), s3.c.l(str, ".attheme")).getAbsolutePath();
                                    arrayList2.add(f6Var4);
                                    arrayList.add(f6Var4);
                                    z12 = true;
                                } else {
                                    arrayList4.remove(f6Var4);
                                }
                                f6Var4.f22941a = tL_theme.title;
                                f6Var4.B = tL_theme;
                                map.put(f6Var4.m(), f6Var4);
                            } else {
                                int i18 = 0;
                                while (i18 < tL_theme.settings.size()) {
                                    TLRPC.ThemeSettings themeSettings = tL_theme.settings.get(i18);
                                    if (themeSettings == null || (strQ0 = g6.q0(themeSettings)) == null || (f6Var2 = (f6) map.get(strQ0)) == null) {
                                        i12 = size2;
                                    } else {
                                        i12 = size2;
                                        if (f6Var2.X != null) {
                                            e6 e6VarF = (e6) f6Var2.Y.get(tL_theme.f22517id);
                                            if (e6VarF != null) {
                                                if (f6.a(e6VarF, themeSettings)) {
                                                    num2 = num3;
                                                } else {
                                                    File fileD = e6VarF.d();
                                                    if (fileD != null) {
                                                        fileD.delete();
                                                    }
                                                    f6.i(e6VarF, themeSettings);
                                                    f6 f6Var5 = g6.I;
                                                    if (f6Var5 == f6Var2 && f6Var5.U == e6VarF.f22883a) {
                                                        g6.n1(false, false);
                                                        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                                                        int i19 = NotificationCenter.needSetDayNightTheme;
                                                        f6 f6Var6 = g6.I;
                                                        num2 = num3;
                                                        globalInstance.lambda$postNotificationNameOnUIThread$1(i19, f6Var6, Boolean.valueOf(g6.J == f6Var6), obj3, num2);
                                                    } else {
                                                        num2 = num3;
                                                    }
                                                    z11 = true;
                                                    z12 = true;
                                                }
                                                TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                                                e6VarF.f22897q = (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null || !wallPaperSettings.motion) ? false : true;
                                                arrayList4.remove(e6VarF);
                                            } else {
                                                num2 = num3;
                                                e6VarF = f6Var2.f(tL_theme, i14, i18);
                                                if (!TextUtils.isEmpty(e6VarF.f22895o)) {
                                                    z11 = true;
                                                }
                                            }
                                            e6VarF.f22905z = tL_theme.isDefault;
                                        }
                                        i18++;
                                        size2 = i12;
                                        tL_themes2 = tL_themes2;
                                        i17 = i17;
                                        num3 = num2;
                                    }
                                    num2 = num3;
                                    i18++;
                                    size2 = i12;
                                    tL_themes2 = tL_themes2;
                                    i17 = i17;
                                    num3 = num2;
                                }
                                i10 = size2;
                                tL_themes = tL_themes2;
                                i11 = i17;
                                num = num3;
                            }
                        }
                        i17 = i11 + 1;
                        size2 = i10;
                        tL_themes2 = tL_themes;
                        num3 = num;
                    }
                    Integer num4 = num3;
                    int size3 = arrayList4.size();
                    for (int i20 = 0; i20 < size3; i20++) {
                        Object obj4 = arrayList4.get(i20);
                        if (obj4 instanceof f6) {
                            f6 f6Var7 = (f6) obj4;
                            f6Var7.t();
                            arrayList.remove(f6Var7);
                            map.remove(f6Var7.f22941a);
                            z5 z5Var = f6Var7.f22949e0;
                            if (z5Var != null) {
                                z5.a(z5Var);
                            }
                            arrayList2.remove(f6Var7);
                            new File(f6Var7.f22943b).delete();
                            if (g6.K == f6Var7) {
                                g6.K = g6.L;
                            } else {
                                if (g6.J == f6Var7) {
                                    g6.J = (f6) map.get("Dark Blue");
                                    z10 = true;
                                }
                                if (g6.I == f6Var7) {
                                    if (z10) {
                                        f6Var = g6.J;
                                    } else {
                                        f6Var = g6.K;
                                    }
                                    g6.t(f6Var, true, z10);
                                }
                            }
                            z10 = false;
                            if (g6.I == f6Var7) {
                                if (z10) {
                                    f6Var = g6.J;
                                } else {
                                    f6Var = g6.K;
                                }
                                g6.t(f6Var, true, z10);
                            }
                        } else {
                            if (obj4 instanceof e6) {
                                e6 e6Var2 = (e6) obj4;
                                if (g6.j0(e6Var2.f22884b, e6Var2, false) && g6.I == e6Var2.f22884b) {
                                    g6.n1(false, false);
                                    NotificationCenter globalInstance2 = NotificationCenter.getGlobalInstance();
                                    int i21 = NotificationCenter.needSetDayNightTheme;
                                    f6 f6Var8 = g6.I;
                                    globalInstance2.lambda$postNotificationNameOnUIThread$1(i21, f6Var8, Boolean.valueOf(g6.J == f6Var8), obj3, num4);
                                }
                            }
                        }
                    }
                    g6.s1(true, false);
                    Collections.sort(g6.F, new k9.a(9));
                    if (z12) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeListUpdated, new Object[0]);
                    }
                    if (z11) {
                        b6.a(true);
                    }
                    MediaDataController.getInstance(i14).generateEmojiPreviewThemes(arrayList3, i14);
                }
                break;
            case 1:
                Pattern pattern = LaunchActivity.f35496x1;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    MediaDataController.getInstance(i14).loadAttachMenuBots(false, true, null);
                }
                break;
            default:
                Pattern pattern2 = LaunchActivity.f35496x1;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    MediaDataController.getInstance(i14).loadAttachMenuBots(false, true, null);
                }
                break;
        }
    }

    public k5(int i10, TLObject tLObject, int i11) {
        this.f23613a = i11;
        this.f23614b = tLObject;
        this.f23615c = i10;
    }
}
