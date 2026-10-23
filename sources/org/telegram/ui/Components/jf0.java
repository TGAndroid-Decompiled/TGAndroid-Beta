package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class jf0 {
    public final mf0 f27683a;

    public jf0(mf0 mf0Var) {
        this.f27683a = mf0Var;
    }

    public final ViewGroup a(Context context, int i10) {
        boolean z10;
        boolean z11;
        String str;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.g6 g6Var;
        int i13;
        org.telegram.ui.ActionBar.g6 g6Var2;
        LinearLayout linearLayout;
        AndroidUtilities.VcardItem vcardItem;
        int i14;
        boolean z12;
        org.telegram.ui.ActionBar.g6 g6Var3;
        int i15;
        int i16;
        float f7;
        int i17;
        float f10;
        org.telegram.ui.ActionBar.g6 g6Var4;
        int i18;
        int i19;
        float f11;
        int i20;
        float f12;
        org.telegram.ui.ActionBar.g6 g6Var5;
        int i21;
        float f13;
        float f14;
        int i22;
        int i23;
        int i24;
        mf0 mf0Var = this.f27683a;
        ArrayList arrayList = mf0Var.L;
        ArrayList arrayList2 = mf0Var.M;
        if (i10 == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            ?? frameLayout = new FrameLayout(context);
            TextView textView = new TextView(context);
            frameLayout.f28030a = textView;
            int i25 = org.telegram.ui.ActionBar.k6.G6;
            g6Var3 = ((org.telegram.ui.ActionBar.h3) mf0Var).resourcesProvider;
            boolean z13 = mf0Var.J;
            org.telegram.ui.ActionBar.r6.W(textView, i25, g6Var3);
            textView.setTextSize(1, 16.0f);
            textView.setSingleLine(false);
            if (LocaleController.isRTL) {
                i15 = 5;
            } else {
                i15 = 3;
            }
            textView.setGravity(i15 | 48);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            boolean z14 = LocaleController.isRTL;
            if (z14) {
                i16 = 5;
            } else {
                i16 = 3;
            }
            int i26 = i16 | 48;
            if (z14) {
                if (z13) {
                    i24 = 17;
                } else {
                    i24 = 64;
                }
                f7 = i24;
            } else {
                f7 = 72.0f;
            }
            if (z14) {
                f10 = 72.0f;
            } else {
                if (z13) {
                    i17 = 17;
                } else {
                    i17 = 64;
                }
                f10 = i17;
            }
            frameLayout.addView(textView, w7.z5.d(-1, -1.0f, i26, f7, 10.0f, f10, 0.0f));
            TextView textView2 = new TextView(context);
            frameLayout.f28031b = textView2;
            int i27 = org.telegram.ui.ActionBar.k6.f21588z6;
            g6Var4 = ((org.telegram.ui.ActionBar.h3) mf0Var).resourcesProvider;
            org.telegram.ui.ActionBar.r6.W(textView2, i27, g6Var4);
            textView2.setTextSize(1, 13.0f);
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            if (LocaleController.isRTL) {
                i18 = 5;
            } else {
                i18 = 3;
            }
            textView2.setGravity(i18);
            boolean z15 = LocaleController.isRTL;
            if (z15) {
                i19 = 5;
            } else {
                i19 = 3;
            }
            if (z15) {
                if (z13) {
                    i23 = 17;
                } else {
                    i23 = 64;
                }
                f11 = i23;
            } else {
                f11 = 72.0f;
            }
            if (z15) {
                f12 = 72.0f;
            } else {
                if (z13) {
                    i20 = 17;
                } else {
                    i20 = 64;
                }
                f12 = i20;
            }
            frameLayout.addView(textView2, w7.z5.d(-2, -2.0f, i19, f11, 35.0f, f12, 0.0f));
            ImageView imageView = new ImageView(context);
            frameLayout.f28032c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i28 = org.telegram.ui.ActionBar.k6.f21346m6;
            g6Var5 = ((org.telegram.ui.ActionBar.h3) mf0Var).resourcesProvider;
            org.telegram.ui.ActionBar.r6.t(imageView, i28, g6Var5, PorterDuff.Mode.MULTIPLY);
            boolean z16 = LocaleController.isRTL;
            if (z16) {
                i21 = 5;
            } else {
                i21 = 3;
            }
            int i29 = i21 | 48;
            if (z16) {
                f13 = 0.0f;
            } else {
                f13 = 20.0f;
            }
            if (z16) {
                f14 = 20.0f;
            } else {
                f14 = 0.0f;
            }
            frameLayout.addView(imageView, w7.z5.d(-2, -2.0f, i29, f13, 20.0f, f14, 0.0f));
            linearLayout = frameLayout;
            if (!z13) {
                Switch r92 = new Switch(context, null);
                frameLayout.d = r92;
                int i30 = org.telegram.ui.ActionBar.k6.M6;
                int i31 = org.telegram.ui.ActionBar.k6.N6;
                int i32 = org.telegram.ui.ActionBar.k6.f21183d6;
                r92.d(i30, i31, i32, i32);
                if (LocaleController.isRTL) {
                    i22 = 3;
                } else {
                    i22 = 5;
                }
                frameLayout.addView(r92, w7.z5.d(37, 40.0f, i22 | 16, 22.0f, 0.0f, 22.0f, 0.0f));
                linearLayout = frameLayout;
            }
        } else {
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(1);
            TLRPC.TL_userContact_old2 tL_userContact_old2 = mf0Var.N;
            if (arrayList2.size() == 1 && arrayList.size() == 0) {
                str = ((AndroidUtilities.VcardItem) arrayList2.get(0)).getValue(true);
                z11 = false;
            } else {
                TLRPC.UserStatus userStatus = tL_userContact_old2.status;
                if (userStatus != null && userStatus.expires != 0) {
                    i11 = ((org.telegram.ui.ActionBar.h3) mf0Var).currentAccount;
                    str = LocaleController.formatUserStatus(i11, tL_userContact_old2);
                    z11 = true;
                } else {
                    z11 = true;
                    str = null;
                }
            }
            h9 h9Var = new h9((org.telegram.ui.ActionBar.g6) null);
            h9Var.u(AndroidUtilities.dp(30.0f));
            i12 = ((org.telegram.ui.ActionBar.h3) mf0Var).currentAccount;
            h9Var.m(i12, tL_userContact_old2);
            w9 w9Var = new w9(context);
            w9Var.setRoundRadius(AndroidUtilities.dp(40.0f));
            w9Var.e(tL_userContact_old2, h9Var);
            linearLayout2.addView(w9Var, w7.z5.t(80, 80, 49, 0, 32, 0, 0));
            TextView textView3 = new TextView(context);
            org.telegram.messenger.sl.k(17.0f, 1, textView3);
            int i33 = org.telegram.ui.ActionBar.k6.f21289j5;
            g6Var = ((org.telegram.ui.ActionBar.h3) mf0Var).resourcesProvider;
            org.telegram.ui.ActionBar.r6.W(textView3, i33, g6Var);
            textView3.setSingleLine(true);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView3.setEllipsize(truncateAt);
            textView3.setText(ContactsController.formatName(tL_userContact_old2.first_name, tL_userContact_old2.last_name));
            int i34 = 27;
            if (str != null) {
                i13 = 0;
            } else {
                i13 = 27;
            }
            linearLayout2.addView(textView3, w7.z5.t(-2, -2, 49, 10, 10, 10, i13));
            linearLayout = linearLayout2;
            if (str != null) {
                TextView g10 = org.telegram.messenger.v0.g(context, 1, 14.0f);
                int i35 = org.telegram.ui.ActionBar.k6.f21439r5;
                g6Var2 = ((org.telegram.ui.ActionBar.h3) mf0Var).resourcesProvider;
                org.telegram.ui.ActionBar.r6.W(g10, i35, g6Var2);
                g10.setSingleLine(true);
                g10.setEllipsize(truncateAt);
                g10.setText(str);
                if (!z11) {
                    i34 = 11;
                }
                linearLayout2.addView(g10, w7.z5.t(-2, -2, 49, 10, 3, 10, i34));
                linearLayout = linearLayout2;
            }
        }
        if (z10) {
            kf0 kf0Var = (kf0) linearLayout;
            int i36 = mf0Var.F;
            if (i10 >= i36 && i10 < mf0Var.G) {
                vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(i10 - i36);
                i14 = R.drawable.msg_calls;
            } else {
                vcardItem = (AndroidUtilities.VcardItem) arrayList.get(i10 - mf0Var.H);
                int i37 = vcardItem.type;
                if (i37 == 1) {
                    i14 = R.drawable.msg_mention;
                } else if (i37 == 2) {
                    i14 = R.drawable.msg_location;
                } else if (i37 == 3) {
                    i14 = R.drawable.msg_link;
                } else if (i37 == 4) {
                    i14 = R.drawable.msg_info;
                } else if (i37 == 5) {
                    i14 = R.drawable.msg_calendar2;
                } else if (i37 == 6) {
                    if ("ORG".equalsIgnoreCase(vcardItem.getRawType(true))) {
                        i14 = R.drawable.msg_work;
                    } else {
                        i14 = R.drawable.msg_jobtitle;
                    }
                } else if (i37 == 20) {
                    i14 = R.drawable.msg_info;
                } else {
                    i14 = R.drawable.msg_info;
                }
            }
            if (i10 != mf0Var.E - 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            ImageView imageView2 = kf0Var.f28032c;
            kf0Var.f28030a.setText(vcardItem.getValue(true));
            kf0Var.f28031b.setText(vcardItem.getType());
            Switch r82 = kf0Var.d;
            if (r82 != null) {
                r82.c(vcardItem.checked, false);
            }
            if (i14 != 0) {
                imageView2.setImageResource(i14);
            } else {
                imageView2.setImageDrawable(null);
            }
            kf0Var.e = z12;
            kf0Var.setWillNotDraw(!z12);
        }
        return linearLayout;
    }
}
