package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.p11;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.vp;
public final class n extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.Components.u9 f22738a;
    public final org.telegram.ui.ActionBar.n5 f22739b;
    public final org.telegram.ui.ActionBar.n5 f22740c;
    public final org.telegram.ui.Components.f9 d;
    public final ImageView e;
    public TLRPC.Chat f22741f;
    public boolean h;
    public final int f22742n;
    public final vp f22743r;
    public int f22744s;

    public n(Context context, View.OnClickListener onClickListener, boolean z10, int i10) {
        super(context);
        int i11;
        float f7;
        float f10;
        int i12;
        int i13;
        float f11;
        float f12;
        int i14;
        int i15;
        float f13;
        float f14;
        float f15;
        int i16;
        float f16;
        float f17;
        this.f22742n = UserConfig.selectedAccount;
        this.d = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.g6) null);
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
        this.f22738a = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i17 = i11 | 48;
        if (z11) {
            f7 = 0.0f;
        } else {
            f7 = i10 + 12;
        }
        if (z11) {
            f10 = i10 + 12;
        } else {
            f10 = 0.0f;
        }
        addView(u9Var, w7.z5.d(48, 48.0f, i17, f7, 6.0f, f10, 6.0f));
        if (z10) {
            vp vpVar = new vp(context, 21, null);
            this.f22743r = vpVar;
            vpVar.b(-1, org.telegram.ui.ActionBar.k6.f21184d6, org.telegram.ui.ActionBar.k6.f21312k7);
            vpVar.setDrawUnchecked(false);
            vpVar.setDrawBackgroundAsArc(3);
            boolean z12 = LocaleController.isRTL;
            if (z12) {
                i16 = 5;
            } else {
                i16 = 3;
            }
            int i18 = i16 | 48;
            if (z12) {
                f16 = 0.0f;
            } else {
                f16 = i10 + 42;
            }
            if (z12) {
                f17 = i10 + 42;
            } else {
                f17 = 0.0f;
            }
            addView(vpVar, w7.z5.d(24, 24.0f, i18, f16, 32.0f, f17, 0.0f));
        }
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.f22739b = n5Var;
        org.telegram.ui.ActionBar.r6.Z(n5Var, org.telegram.ui.ActionBar.k6.G6, null);
        n5Var.setTextSize(17);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        n5Var.setGravity(i12 | 48);
        boolean z13 = LocaleController.isRTL;
        if (z13) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i19 = i13 | 48;
        if (z13) {
            f11 = 62;
        } else {
            f11 = i10 + 73;
        }
        float f18 = f11;
        if (z13) {
            f12 = i10 + 73;
        } else {
            f12 = 62;
        }
        addView(n5Var, w7.z5.d(-1, 20.0f, i19, f18, 9.5f, f12, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var2 = new org.telegram.ui.ActionBar.n5(context);
        this.f22740c = n5Var2;
        n5Var2.setTextSize(14);
        int i20 = org.telegram.ui.ActionBar.k6.f21572y6;
        org.telegram.ui.ActionBar.r6.Z(n5Var2, i20, null);
        n5Var2.setLinkTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.J6, false));
        if (LocaleController.isRTL) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        n5Var2.setGravity(i14 | 48);
        boolean z14 = LocaleController.isRTL;
        if (z14) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        int i21 = i15 | 48;
        if (z14) {
            f13 = 62;
        } else {
            f13 = i10 + 73;
        }
        addView(n5Var2, w7.z5.d(-1, 20.0f, i21, f13, 32.5f, z14 ? i10 + 73 : 62, 6.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_panel_clear);
        imageView.setOnClickListener(onClickListener);
        int i22 = org.telegram.ui.ActionBar.k6.f21273i6;
        y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.x0(null, i22, false), 1, -1);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i22);
        imageView.setBackground(g02);
        org.telegram.ui.ActionBar.r6.k(imageView, g02, null, O, null);
        org.telegram.ui.ActionBar.r6.t(imageView, i20, null, PorterDuff.Mode.MULTIPLY);
        boolean z15 = LocaleController.isRTL;
        int i23 = (z15 ? 3 : 5) | 48;
        if (z15) {
            f14 = 7.0f;
        } else {
            f14 = 0.0f;
        }
        if (z15) {
            f15 = 0.0f;
        } else {
            f15 = 7.0f;
        }
        addView(imageView, w7.z5.d(48, 48.0f, i23, f14, 6.0f, f15, 0.0f));
    }

    public final void a(TLRPC.Chat chat, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.f22742n;
        String s10 = a1.g.s(sb2, MessagesController.getInstance(i10).linkPrefix, "/");
        this.f22741f = chat;
        org.telegram.ui.Components.f9 f9Var = this.d;
        f9Var.k(i10, chat);
        this.f22739b.l(chat.title, false);
        StringBuilder u10 = a1.g.u(s10);
        u10.append(ChatObject.getPublicUsername(chat));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(u10.toString());
        spannableStringBuilder.setSpan(new p61("", (p11) null), s10.length(), spannableStringBuilder.length(), 33);
        this.f22740c.l(spannableStringBuilder, false);
        this.f22738a.e(chat, f9Var);
        this.h = z10;
    }

    public TLRPC.Chat getCurrentChannel() {
        return this.f22741f;
    }

    public ImageView getDeleteButton() {
        return this.e;
    }

    public org.telegram.ui.ActionBar.n5 getNameTextView() {
        return this.f22739b;
    }

    public org.telegram.ui.ActionBar.n5 getStatusTextView() {
        return this.f22740c;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.h) {
            i12 = 12;
        } else {
            i12 = 0;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i12 + 60), 1073741824));
    }

    @Override
    public final void updateColors() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            try {
                int[] iArr = org.telegram.ui.ActionBar.k6.f21406p8;
                if (i10 >= iArr.length) {
                    break;
                }
                i11 = (i11 * 31) + org.telegram.ui.ActionBar.k6.x0(null, iArr[i10], false);
                i10++;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        if (i11 != this.f22744s) {
            this.f22744s = i11;
            TLRPC.Chat chat = this.f22741f;
            if (chat != null) {
                this.d.k(this.f22742n, chat);
                this.f22738a.invalidate();
            }
        }
        org.telegram.ui.ActionBar.n5 n5Var = this.f22740c;
        if (n5Var != null) {
            n5Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.J6, false));
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
