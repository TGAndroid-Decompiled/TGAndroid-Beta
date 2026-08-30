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
public class x80 extends LinearLayout {
    public u80 B;
    public boolean C;
    public boolean D;
    public final boolean E;
    public final float[] F;
    public String G;
    public String H;
    public final TextView f30603a;
    public String f30604b;
    public final org.telegram.ui.ActionBar.p2 f30605c;
    public final ImageView d;
    public final TextView e;
    public final TextView f30606f;
    public final TextView h;
    public final FrameLayout f30607n;
    public w80 f30608r;
    public org.telegram.ui.ActionBar.p1 f30609s;
    public final dg.v3 v;
    public int f30610w;
    public boolean f30611x;
    public boolean f30612y;

    public x80(Context context, final org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.g3 g3Var, boolean z4, boolean z10) {
        super(context);
        this.D = true;
        this.F = new float[2];
        this.f30605c = p2Var;
        this.f30611x = z4;
        this.E = z10;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f30607n = frameLayout;
        TextView textView = new TextView(context);
        this.f30603a = textView;
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
        frameLayout.addView(imageView, k7.b6.e(40, 48, 21));
        addView(frameLayout, k7.b6.t(-1, -2, 0, 4, 0, 4, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        TextView textView2 = new TextView(context);
        this.e = textView2;
        k7.d6.b(textView2, 0.025f, 1.2f);
        textView2.setGravity(17);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "..").setSpan(new mq(0, context.getDrawable(R.drawable.msg_copy_filled)), 0, 1, 0);
        spannableStringBuilder.setSpan(new org.telegram.ui.Cells.p2(AndroidUtilities.dp(6.0f)), 1, 2, 0);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.LinkActionCopy));
        textView2.setText(spannableStringBuilder);
        textView2.setContentDescription(LocaleController.getString(R.string.LinkActionCopy));
        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setSingleLine(true);
        TextView j10 = org.telegram.ui.yh.j(linearLayout, textView2, k7.b6.p(0, 42, 1.0f, 0, 4, 0, 4, 0), context);
        this.f30606f = j10;
        k7.d6.b(j10, 0.025f, 1.2f);
        j10.setGravity(17);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) "..").setSpan(new mq(0, context.getDrawable(R.drawable.msg_share_filled)), 0, 1, 0);
        spannableStringBuilder2.setSpan(new org.telegram.ui.Cells.p2(AndroidUtilities.dp(6.0f)), 1, 2, 0);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.LinkActionShare));
        j10.setText(spannableStringBuilder2);
        j10.setContentDescription(LocaleController.getString(R.string.LinkActionShare));
        j10.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        j10.setTextSize(1, 14.0f);
        j10.setTypeface(AndroidUtilities.bold());
        j10.setSingleLine(true);
        TextView j11 = org.telegram.ui.yh.j(linearLayout, j10, k7.b6.m(1.0f, 0, 42, 4, 4, 0), context);
        this.h = j11;
        k7.d6.b(j11, 0.025f, 1.2f);
        j11.setGravity(17);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        spannableStringBuilder3.append((CharSequence) "..").setSpan(new mq(0, context.getDrawable(R.drawable.msg_delete_filled)), 0, 1, 0);
        spannableStringBuilder3.setSpan(new org.telegram.ui.Cells.p2(AndroidUtilities.dp(8.0f)), 1, 2, 0);
        spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.DeleteLink));
        spannableStringBuilder3.append((CharSequence) ".").setSpan(new org.telegram.ui.Cells.p2(AndroidUtilities.dp(5.0f)), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 0);
        j11.setText(spannableStringBuilder3);
        j11.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        j11.setTextSize(1, 14.0f);
        j11.setTypeface(AndroidUtilities.bold());
        j11.setSingleLine(true);
        linearLayout.addView(j11, k7.b6.m(1.0f, 0, 42, 4, 4, 0));
        linearLayout.setClickable(true);
        j11.setVisibility(8);
        addView(linearLayout, k7.b6.k(0.0f, 12.0f, 0.0f, 0.0f, -1, -2));
        dg.v3 v3Var = new dg.v3(this, context);
        this.v = v3Var;
        ((v80) v3Var.d).setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        addView(v3Var, k7.b6.k(0.0f, 12.0f, 0.0f, 0.0f, -1, 44));
        textView2.setOnClickListener(new dg.p(this, g3Var, p2Var, 26));
        if (z4) {
            v3Var.setOnClickListener(new q80(this, 0));
        }
        j10.setOnClickListener(new View.OnClickListener(this) {
            public final x80 f28414b;

            {
                this.f28414b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        x80 x80Var = this.f28414b;
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        try {
                            if (x80Var.f30604b != null) {
                                Context context2 = x80Var.getContext();
                                String str = x80Var.f30604b;
                                p2Var2.showDialog(new s80(x80Var, context2, str, str, p2Var2.getResourceProvider()));
                                return;
                            }
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var3.getParentActivity());
                        alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.DeleteLink);
                        alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.DeleteLinkHelp);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new p80(this.f28414b, 0));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        p2Var3.showDialog(alertDialog$Builder.f19503a);
                        return;
                }
            }
        });
        j11.setOnClickListener(new View.OnClickListener(this) {
            public final x80 f28414b;

            {
                this.f28414b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        x80 x80Var = this.f28414b;
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        try {
                            if (x80Var.f30604b != null) {
                                Context context2 = x80Var.getContext();
                                String str = x80Var.f30604b;
                                p2Var2.showDialog(new s80(x80Var, context2, str, str, p2Var2.getResourceProvider()));
                                return;
                            }
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var3.getParentActivity());
                        alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.DeleteLink);
                        alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.DeleteLinkHelp);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new p80(this.f28414b, 0));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        p2Var3.showDialog(alertDialog$Builder.f19503a);
                        return;
                }
            }
        });
        imageView.setOnClickListener(new kh.u3(this, context, g3Var, p2Var, 11));
        frameLayout.setOnClickListener(new androidx.mediarouter.app.y(this, 10));
        f();
    }

    public static void a(FrameLayout frameLayout, FrameLayout frameLayout2, float[] fArr) {
        float f10 = 0.0f;
        float f11 = 0.0f;
        FrameLayout frameLayout3 = frameLayout;
        while (frameLayout3 != frameLayout2) {
            float y10 = frameLayout3.getY() + f10;
            f11 += frameLayout3.getX();
            if (frameLayout3 instanceof ScrollView) {
                y10 -= frameLayout3.getScrollY();
            }
            f10 = y10;
            if (!(frameLayout3.getParent() instanceof View)) {
                break;
            }
            ?? r32 = (View) frameLayout3.getParent();
            boolean z4 = r32 instanceof ViewGroup;
            frameLayout3 = r32;
            if (!z4) {
                return;
            }
        }
        fArr[0] = f11 - frameLayout2.getPaddingLeft();
        fArr[1] = f10 - frameLayout2.getPaddingTop();
    }

    public final void b(boolean z4) {
        if (this.C != z4) {
            this.C = z4;
            ImageView imageView = this.d;
            imageView.setVisibility(0);
            imageView.setImageDrawable(imageView.getContext().getDrawable(R.drawable.ic_ab_other));
        }
    }

    public final void c(TLRPC.TL_chatInviteExported tL_chatInviteExported, long j10) {
        if (tL_chatInviteExported == null) {
            d(0, null, false);
        } else if (!TextUtils.equals(this.H, tL_chatInviteExported.link)) {
            d(tL_chatInviteExported.usage, tL_chatInviteExported.importers, false);
            if (tL_chatInviteExported.usage > 0 && tL_chatInviteExported.importers == null && !this.f30612y) {
                TLRPC.TL_messages_getChatInviteImporters tL_messages_getChatInviteImporters = new TLRPC.TL_messages_getChatInviteImporters();
                String str = tL_chatInviteExported.link;
                if (str != null) {
                    tL_messages_getChatInviteImporters.flags |= 2;
                    tL_messages_getChatInviteImporters.link = str;
                }
                tL_messages_getChatInviteImporters.peer = MessagesController.getInstance(UserConfig.selectedAccount).getInputPeer(-j10);
                tL_messages_getChatInviteImporters.offset_user = new TLRPC.TL_inputUserEmpty();
                tL_messages_getChatInviteImporters.limit = Math.min(tL_chatInviteExported.usage, 3);
                this.f30612y = true;
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_getChatInviteImporters, new org.telegram.ui.lo(11, this, tL_chatInviteExported));
            }
        }
    }

    public final void d(int i10, ArrayList arrayList, boolean z4) {
        this.f30610w = i10;
        dg.v3 v3Var = this.v;
        if (i10 == 0) {
            v3Var.setVisibility(8);
            setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(18.0f));
        } else {
            v3Var.setVisibility(0);
            setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(10.0f));
            ((TextView) v3Var.f4832c).setText(LocaleController.formatPluralString("PeopleJoined", i10, new Object[0]));
            v3Var.requestLayout();
        }
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                MessagesController.getInstance(UserConfig.selectedAccount).putUser((TLRPC.User) arrayList.get(i11), false);
            }
            int min = Math.min(3, Math.min(i10, arrayList.size()));
            ((v80) v3Var.d).setCount(min);
            for (int i12 = 0; i12 < min; i12++) {
                ((v80) v3Var.d).b(i12, (TLObject) arrayList.get(i12), UserConfig.selectedAccount);
            }
        } else {
            ((v80) v3Var.d).setCount(0);
        }
        ((v80) v3Var.d).a(z4);
    }

    public void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        ic Q = qc.a0(this.f30605c).Q(i10, 36, spannableStringBuilder);
        Q.f25680r = false;
        Q.k(true);
    }

    public final void f() {
        int i10 = org.telegram.ui.ActionBar.j6.Sh;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        TextView textView = this.e;
        textView.setTextColor(w02);
        int w03 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        TextView textView2 = this.f30606f;
        textView2.setTextColor(w03);
        int w04 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        TextView textView3 = this.h;
        textView3.setTextColor(w04);
        int dp = AndroidUtilities.dp(21.0f);
        int i11 = org.telegram.ui.ActionBar.j6.Oh;
        int w05 = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.j6.Qh;
        int w06 = org.telegram.ui.ActionBar.j6.w0(null, i12, false);
        textView.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, w05, w06, w06));
        int dp2 = AndroidUtilities.dp(21.0f);
        int w07 = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
        int w08 = org.telegram.ui.ActionBar.j6.w0(null, i12, false);
        textView2.setBackground(org.telegram.ui.ActionBar.j6.i0(dp2, dp2, dp2, dp2, w07, w08, w08));
        int dp3 = AndroidUtilities.dp(21.0f);
        int w09 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20035ka, false);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false), 120);
        textView3.setBackground(org.telegram.ui.ActionBar.j6.i0(dp3, dp3, dp3, dp3, w09, k10, k10));
        int dp4 = AndroidUtilities.dp(21.0f);
        int w010 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19924e7, false);
        int k11 = i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19996i6, false), 76);
        this.f30607n.setBackground(org.telegram.ui.ActionBar.j6.i0(dp4, dp4, dp4, dp4, w010, k11, k11));
        this.f30603a.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        this.d.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20157r5, false));
        dg.v3 v3Var = this.v;
        int i13 = org.telegram.ui.ActionBar.j6.f20085n6;
        ((TextView) v3Var.f4832c).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        int dp5 = AndroidUtilities.dp(6.0f);
        int k12 = i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, i13, false), 76);
        v3Var.setBackground(org.telegram.ui.ActionBar.j6.i0(dp5, dp5, dp5, dp5, 0, k12, k12));
        u80 u80Var = this.B;
        if (u80Var != null) {
            u80Var.n();
        }
    }

    public void setCanEdit(boolean z4) {
        this.D = z4;
    }

    public void setDelegate(w80 w80Var) {
        this.f30608r = w80Var;
    }

    public void setLink(String str) {
        this.f30604b = str;
        TextView textView = this.f30603a;
        if (str == null) {
            textView.setText(LocaleController.getString(R.string.Loading));
        } else if (str.startsWith("https://")) {
            textView.setText(str.substring(8));
        } else {
            textView.setText(str);
        }
    }

    public void setPermanent(boolean z4) {
        this.f30611x = z4;
    }

    public void setQrText(String str) {
        this.G = str;
    }

    public void setRevoke(boolean z4) {
        TextView textView = this.h;
        TextView textView2 = this.e;
        TextView textView3 = this.f30606f;
        ImageView imageView = this.d;
        if (z4) {
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
