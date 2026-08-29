package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public class r80 extends LinearLayout {
    public o80 A;
    public boolean B;
    public boolean C;
    public final boolean D;
    public final float[] E;
    public String F;
    public String G;
    public final TextView f32231a;
    public String f32232b;
    public final org.telegram.ui.ActionBar.o2 f32233c;
    public final ImageView d;
    public final TextView f32234e;
    public final TextView f32235f;
    public final TextView h;
    public final FrameLayout f32236n;
    public q80 f32237r;
    public org.telegram.ui.ActionBar.o1 f32238s;
    public final bg.z3 v;
    public int f32239w;
    public boolean f32240x;
    public boolean f32241y;

    public r80(Context context, final org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.f3 f3Var, boolean z10, boolean z11) {
        super(context);
        this.C = true;
        this.E = new float[2];
        this.f32233c = o2Var;
        this.f32240x = z10;
        this.D = z11;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f32236n = frameLayout;
        TextView textView = new TextView(context);
        this.f32231a = textView;
        textView.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(13.0f));
        textView.setTextSize(1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setSingleLine(true);
        frameLayout.addView(textView);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout.addView(imageView, i7.f6.e(40, 48, 21));
        addView(frameLayout, i7.f6.t(-1, -2, 0, 4, 0, 4, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        TextView textView2 = new TextView(context);
        this.f32234e = textView2;
        i7.h6.b(textView2, 0.025f, 1.2f);
        textView2.setGravity(17);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "..").setSpan(new iq(0, context.getDrawable(R.drawable.msg_copy_filled)), 0, 1, 0);
        spannableStringBuilder.setSpan(new org.telegram.ui.Cells.n2(AndroidUtilities.dp(6.0f)), 1, 2, 0);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.LinkActionCopy));
        textView2.setText(spannableStringBuilder);
        textView2.setContentDescription(LocaleController.getString(R.string.LinkActionCopy));
        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setSingleLine(true);
        TextView i10 = org.telegram.ui.th.i(linearLayout, textView2, i7.f6.p(0, 42, 1.0f, 0, 4, 0, 4, 0), context);
        this.f32235f = i10;
        i7.h6.b(i10, 0.025f, 1.2f);
        i10.setGravity(17);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) "..").setSpan(new iq(0, context.getDrawable(R.drawable.msg_share_filled)), 0, 1, 0);
        spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.n2(AndroidUtilities.dp(6.0f)), 1, 2, 0);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.LinkActionShare));
        i10.setText(spannableStringBuilder2);
        i10.setContentDescription(LocaleController.getString(R.string.LinkActionShare));
        i10.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        i10.setTextSize(1, 14.0f);
        i10.setTypeface(AndroidUtilities.bold());
        i10.setSingleLine(true);
        TextView i11 = org.telegram.ui.th.i(linearLayout, i10, i7.f6.m(1.0f, 0, 42, 4, 4, 0), context);
        this.h = i11;
        i7.h6.b(i11, 0.025f, 1.2f);
        i11.setGravity(17);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "..").setSpan(new iq(0, context.getDrawable(R.drawable.msg_delete_filled)), 0, 1, 0);
        spannableStringBuilder3.setSpan(new org.telegram.ui.Cells.n2(AndroidUtilities.dp(8.0f)), 1, 2, 0);
        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.DeleteLink));
        spannableStringBuilder3.append((CharSequence) ".").setSpan(new org.telegram.ui.Cells.n2(AndroidUtilities.dp(5.0f)), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 0);
        i11.setText(spannableStringBuilder3);
        i11.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        i11.setTextSize(1, 14.0f);
        i11.setTypeface(AndroidUtilities.bold());
        i11.setSingleLine(true);
        linearLayout.addView(i11, i7.f6.m(1.0f, 0, 42, 4, 4, 0));
        linearLayout.setClickable(true);
        i11.setVisibility(8);
        addView(linearLayout, i7.f6.k(0.0f, 12.0f, 0.0f, 0.0f, -1, -2));
        bg.z3 z3Var = new bg.z3(this, context);
        this.v = z3Var;
        ((p80) z3Var.d).setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        addView(z3Var, i7.f6.k(0.0f, 12.0f, 0.0f, 0.0f, -1, 44));
        textView2.setOnClickListener(new bg.q(this, f3Var, o2Var, 29));
        if (z10) {
            z3Var.setOnClickListener(new k80(this, 0));
        }
        i10.setOnClickListener(new View.OnClickListener(this) {
            public final r80 f30260b;

            {
                this.f30260b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        r80 r80Var = this.f30260b;
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        try {
                            if (r80Var.f32232b != null) {
                                Context context2 = r80Var.getContext();
                                String str = r80Var.f32232b;
                                o2Var2.showDialog(new m80(r80Var, context2, str, str, o2Var2.getResourceProvider()));
                                return;
                            }
                            return;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            return;
                        }
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var3.getParentActivity());
                        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.DeleteLink);
                        alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.DeleteLinkHelp);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new j80(this.f30260b, 0));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        o2Var3.showDialog(alertDialog$Builder.f22714a);
                        return;
                }
            }
        });
        i11.setOnClickListener(new View.OnClickListener(this) {
            public final r80 f30260b;

            {
                this.f30260b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        r80 r80Var = this.f30260b;
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        try {
                            if (r80Var.f32232b != null) {
                                Context context2 = r80Var.getContext();
                                String str = r80Var.f32232b;
                                o2Var2.showDialog(new m80(r80Var, context2, str, str, o2Var2.getResourceProvider()));
                                return;
                            }
                            return;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            return;
                        }
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var3.getParentActivity());
                        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.DeleteLink);
                        alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.DeleteLinkHelp);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new j80(this.f30260b, 0));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        o2Var3.showDialog(alertDialog$Builder.f22714a);
                        return;
                }
            }
        });
        imageView.setOnClickListener(new ih.u3(this, context, f3Var, o2Var, 11));
        frameLayout.setOnClickListener(new androidx.mediarouter.app.v(this, 10));
        f();
    }

    public static void a(FrameLayout frameLayout, FrameLayout frameLayout2, float[] fArr) {
        float f9 = 0.0f;
        float f10 = 0.0f;
        FrameLayout frameLayout3 = frameLayout;
        while (frameLayout3 != frameLayout2) {
            float y8 = frameLayout3.getY() + f9;
            f10 += frameLayout3.getX();
            if (frameLayout3 instanceof ScrollView) {
                y8 -= frameLayout3.getScrollY();
            }
            f9 = y8;
            if (!(frameLayout3.getParent() instanceof View)) {
                break;
            }
            ?? r32 = (View) frameLayout3.getParent();
            boolean z10 = r32 instanceof ViewGroup;
            frameLayout3 = r32;
            if (!z10) {
                return;
            }
        }
        fArr[0] = f10 - frameLayout2.getPaddingLeft();
        fArr[1] = f9 - frameLayout2.getPaddingTop();
    }

    public final void b(boolean z10) {
        if (this.B != z10) {
            this.B = z10;
            ImageView imageView = this.d;
            imageView.setVisibility(0);
            imageView.setImageDrawable(imageView.getContext().getDrawable(R.drawable.ic_ab_other));
        }
    }

    public final void c(TLRPC.TL_chatInviteExported tL_chatInviteExported, long j10) {
        if (tL_chatInviteExported == null) {
            d(0, null, false);
        } else if (!TextUtils.equals(this.G, tL_chatInviteExported.link)) {
            d(tL_chatInviteExported.usage, tL_chatInviteExported.importers, false);
            if (tL_chatInviteExported.usage > 0 && tL_chatInviteExported.importers == null && !this.f32241y) {
                TLRPC.TL_messages_getChatInviteImporters tL_messages_getChatInviteImporters = new TLRPC.TL_messages_getChatInviteImporters();
                String str = tL_chatInviteExported.link;
                if (str != null) {
                    tL_messages_getChatInviteImporters.flags |= 2;
                    tL_messages_getChatInviteImporters.link = str;
                }
                tL_messages_getChatInviteImporters.peer = MessagesController.getInstance(UserConfig.selectedAccount).getInputPeer(-j10);
                tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
                tL_messages_getChatInviteImporters.limit = Math.min(tL_chatInviteExported.usage, 3);
                this.f32241y = true;
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_getChatInviteImporters, new org.telegram.ui.zg(14, this, tL_chatInviteExported));
            }
        }
    }

    public final void d(int i10, ArrayList arrayList, boolean z10) {
        this.f32239w = i10;
        bg.z3 z3Var = this.v;
        if (i10 == 0) {
            z3Var.setVisibility(8);
            setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(18.0f));
        } else {
            z3Var.setVisibility(0);
            setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(10.0f));
            ((TextView) z3Var.f2640c).setText(LocaleController.formatPluralString("PeopleJoined", i10, new Object[0]));
            z3Var.requestLayout();
        }
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                MessagesController.getInstance(UserConfig.selectedAccount).putUser((TLRPC.User) arrayList.get(i11), false);
            }
            int min = Math.min(3, Math.min(i10, arrayList.size()));
            ((p80) z3Var.d).setCount(min);
            for (int i12 = 0; i12 < min; i12++) {
                ((p80) z3Var.d).b(i12, (TLObject) arrayList.get(i12), UserConfig.selectedAccount);
            }
        } else {
            ((p80) z3Var.d).setCount(0);
        }
        ((p80) z3Var.d).a(z10);
    }

    public void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        mc Q = tc.a0(this.f32233c).Q(i10, 36, spannableStringBuilder);
        Q.f30660r = false;
        Q.k(true);
    }

    public final void f() {
        int i10 = org.telegram.ui.ActionBar.g6.Sh;
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        TextView textView = this.f32234e;
        textView.setTextColor(w02);
        int w03 = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        TextView textView2 = this.f32235f;
        textView2.setTextColor(w03);
        int w04 = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        TextView textView3 = this.h;
        textView3.setTextColor(w04);
        int dp = AndroidUtilities.dp(21.0f);
        int i11 = org.telegram.ui.ActionBar.g6.Oh;
        int w05 = org.telegram.ui.ActionBar.g6.w0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.g6.Qh;
        int w06 = org.telegram.ui.ActionBar.g6.w0(null, i12, false);
        textView.setBackground(org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, w05, w06, w06));
        int dp2 = AndroidUtilities.dp(21.0f);
        int w07 = org.telegram.ui.ActionBar.g6.w0(null, i11, false);
        int w08 = org.telegram.ui.ActionBar.g6.w0(null, i12, false);
        textView2.setBackground(org.telegram.ui.ActionBar.g6.i0(dp2, dp2, dp2, dp2, w07, w08, w08));
        int dp3 = AndroidUtilities.dp(21.0f);
        int w09 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23192ka, false);
        int k9 = i0.a.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false), 120);
        textView3.setBackground(org.telegram.ui.ActionBar.g6.i0(dp3, dp3, dp3, dp3, w09, k9, k9));
        int dp4 = AndroidUtilities.dp(21.0f);
        int w010 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23081e7, false);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23152i6, false), 76);
        this.f32236n.setBackground(org.telegram.ui.ActionBar.g6.i0(dp4, dp4, dp4, dp4, w010, k10, k10));
        this.f32231a.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        this.d.setColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23310r5, false));
        bg.z3 z3Var = this.v;
        int i13 = org.telegram.ui.ActionBar.g6.f23241n6;
        ((TextView) z3Var.f2640c).setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        int dp5 = AndroidUtilities.dp(6.0f);
        int k11 = i0.a.k(org.telegram.ui.ActionBar.g6.w0(null, i13, false), 76);
        z3Var.setBackground(org.telegram.ui.ActionBar.g6.i0(dp5, dp5, dp5, dp5, 0, k11, k11));
        o80 o80Var = this.A;
        if (o80Var != null) {
            o80Var.n();
        }
    }

    public void setCanEdit(boolean z10) {
        this.C = z10;
    }

    public void setDelegate(q80 q80Var) {
        this.f32237r = q80Var;
    }

    public void setLink(String str) {
        this.f32232b = str;
        TextView textView = this.f32231a;
        if (str == null) {
            textView.setText(LocaleController.getString(R.string.Loading));
        } else if (str.startsWith("https://")) {
            textView.setText(str.substring(8));
        } else {
            textView.setText(str);
        }
    }

    public void setPermanent(boolean z10) {
        this.f32240x = z10;
    }

    public void setQrText(String str) {
        this.F = str;
    }

    public void setRevoke(boolean z10) {
        TextView textView = this.h;
        TextView textView2 = this.f32234e;
        TextView textView3 = this.f32235f;
        ImageView imageView = this.d;
        if (z10) {
            imageView.setVisibility(8);
            textView3.setVisibility(8);
            textView2.setVisibility(8);
            textView.setVisibility(0);
            return;
        }
        imageView.setVisibility(0);
        textView3.setVisibility(0);
        textView2.setVisibility(0);
        textView.setVisibility(8);
    }
}
