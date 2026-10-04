package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class k01 extends TableLayout {
    public final org.telegram.ui.ActionBar.d6 f27926a;
    public final Path f27927b;
    public final float[] f27928c;
    public final Paint d;
    public final Paint f27929e;
    public final float f27930f;
    public final float h;

    public k01(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f27927b = new Path();
        this.f27928c = new float[8];
        this.d = new Paint(1);
        this.f27929e = new Paint(1);
        float max = Math.max(1, AndroidUtilities.dp(0.66f));
        this.f27930f = max;
        this.h = max / 2.0f;
        this.f27926a = d6Var;
        setClipToPadding(false);
        setColumnStretchable(1, true);
    }

    public final i01 a(CharSequence charSequence) {
        vh.n nVar = new vh.n(getContext());
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f27926a;
        nVar.setTextColor(org.telegram.ui.ActionBar.i6.v0(i10, d6Var));
        nVar.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.gc, d6Var));
        nVar.setTextSize(1, 14.0f);
        nVar.setText(Emoji.replaceEmoji(charSequence, nVar.getPaint().getFontMetricsInt(), false));
        NotificationCenter.listenEmojiLoading(nVar);
        nVar.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        i01 i01Var = new i01(this, nVar, true);
        tableRow.addView(i01Var, layoutParams);
        addView(tableRow);
        return i01Var;
    }

    public final void b(CharSequence charSequence, ArrayList arrayList) {
        y5 y5Var = new y5(getContext());
        y5Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, this.f27926a));
        y5Var.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        MessageObject.addEntitiesToText(spannableStringBuilder, arrayList, false, false, false, false);
        y5Var.setText(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, y5Var.getPaint().getFontMetricsInt(), false), arrayList, y5Var.getPaint().getFontMetricsInt()));
        NotificationCenter.listenEmojiLoading(y5Var);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        tableRow.addView(new i01(this, y5Var, false), layoutParams);
        addView(tableRow);
    }

    public final TableRow c(CharSequence charSequence, CharSequence charSequence2, j01[] j01VarArr, ad[] adVarArr) {
        q90 q90Var = new q90(getContext(), null);
        q90Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, this.f27926a));
        q90Var.setTextSize(1, 14.0f);
        q90Var.setText(Emoji.replaceEmoji(charSequence2, q90Var.getPaint().getFontMetricsInt(), false));
        NotificationCenter.listenEmojiLoading(q90Var);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        j01 j01Var = new j01(this, charSequence);
        if (j01VarArr != null) {
            j01VarArr[0] = j01Var;
        }
        tableRow.addView(j01Var, layoutParams);
        tableRow.addView(new h01(this, q90Var, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        if (adVarArr != 0) {
            adVarArr[0] = q90Var;
        }
        return tableRow;
    }

    public final TableRow d(CharSequence charSequence, String str) {
        return c(str, charSequence, null, null);
    }

    public final TableRow e(String str, CharSequence charSequence, String str2, Runnable runnable, Integer num) {
        q90 q90Var = new q90(getContext(), null);
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f27926a;
        q90Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i10, d6Var));
        q90Var.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Emoji.replaceEmoji(charSequence, q90Var.getPaint().getFontMetricsInt(), false));
        if (str2 != null) {
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) bd.b(str2, runnable, d6Var, num));
        }
        q90Var.setText(spannableStringBuilder);
        NotificationCenter.listenEmojiLoading(q90Var);
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new j01(this, str), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new h01(this, q90Var, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final void f(int i10, String str) {
        long j3 = i10 * 1000;
        c(str, LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(j3)), LocaleController.getInstance().getFormatterDay().format(new Date(j3))), null, null);
    }

    public final void g(String str, String str2, Runnable runnable) {
        Context context = getContext();
        org.telegram.ui.ActionBar.d6 d6Var = this.f27926a;
        q90 q90Var = new q90(context, d6Var);
        q90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        q90Var.setEllipsize(TextUtils.TruncateAt.END);
        int i10 = org.telegram.ui.ActionBar.i6.gc;
        q90Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i10, d6Var));
        q90Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(i10, d6Var));
        q90Var.setTextSize(1, 14.0f);
        q90Var.setSingleLine(true);
        q90Var.setDisablePaddingsOffsetY(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        spannableStringBuilder.setSpan(new vc(3, runnable), 0, spannableStringBuilder.length(), 33);
        q90Var.setText(spannableStringBuilder);
        i(q90Var, str);
    }

    public final void h(String str, CharSequence charSequence, int i10, yh.r5 r5Var) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(10.66f), AndroidUtilities.dp(9.33f));
        TextView textView = new TextView(getContext());
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        textView.setTextSize(1, i10);
        int i11 = org.telegram.ui.ActionBar.i6.f20925j5;
        org.telegram.ui.ActionBar.d6 d6Var = this.f27926a;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, d6Var));
        textView.setMaxLines(4);
        textView.setSingleLine(false);
        textView.setText(charSequence);
        frameLayout.addView(textView, w7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 34.0f, 0.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.msg_copy);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i12 = org.telegram.ui.ActionBar.i6.f21152v6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i12, d6Var), PorterDuff.Mode.SRC_IN));
        imageView.setOnClickListener(new gt(16, charSequence, r5Var));
        w7.b6.a(imageView);
        imageView.setBackground(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.l1(0.1f, org.telegram.ui.ActionBar.i6.v0(i12, d6Var)), 7, -1));
        frameLayout.addView(imageView, w7.z5.e(30, 30, 21));
        i(frameLayout, str);
    }

    public final TableRow i(View view, CharSequence charSequence) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new j01(this, charSequence), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new h01(this, view, true), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final TableRow j(CharSequence charSequence, int i10, long j3, Runnable runnable, String str, Runnable runnable2) {
        boolean z10;
        String str2;
        String str3;
        boolean z11;
        Context context = getContext();
        org.telegram.ui.ActionBar.d6 d6Var = this.f27926a;
        ?? q90Var = new q90(context, d6Var);
        q90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        q90Var.setEllipsize(TextUtils.TruncateAt.END);
        int i11 = org.telegram.ui.ActionBar.i6.gc;
        q90Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, d6Var));
        q90Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(i11, d6Var));
        q90Var.setTextSize(1, 14.0f);
        q90Var.setSingleLine(true);
        q90Var.setDisablePaddingsOffsetY(true);
        org.telegram.ui.h5 h5Var = new org.telegram.ui.h5(q90Var, 24.0f, i10);
        ImageReceiver imageReceiver = h5Var.f36860b;
        if (j3 == 2666000) {
            str3 = LocaleController.getString(R.string.StarsTransactionHidden);
            sq a2 = yh.r7.a(44, "anonymous");
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            a2.f30851e = dp;
            a2.f30852f = dp2;
            imageReceiver.setImageBitmap(a2);
            z10 = false;
            z11 = false;
        } else {
            if (UserObject.isService(j3)) {
                str3 = LocaleController.getString(R.string.StarsTransactionUnknown);
                sq a10 = yh.r7.a(44, "fragment");
                int dp3 = AndroidUtilities.dp(16.0f);
                int dp4 = AndroidUtilities.dp(16.0f);
                a10.f30851e = dp3;
                a10.f30852f = dp4;
                imageReceiver.setImageBitmap(a10);
                z10 = false;
            } else {
                if (j3 >= 0) {
                    TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
                    if (user == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    str2 = UserObject.getUserName(user);
                    h5Var.e(user);
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
                    if (chat == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (chat == null) {
                        str2 = "";
                    } else {
                        str2 = chat.title;
                    }
                    h5Var.b(chat);
                }
                str3 = str2;
            }
            z11 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str3));
        spannableStringBuilder.setSpan(h5Var, 0, 1, 33);
        if (z11) {
            spannableStringBuilder.setSpan(new vc(2, runnable), 3, spannableStringBuilder.length(), 33);
        }
        if (str != null) {
            q90Var.M = new bd(str, runnable2, d6Var);
        }
        q90Var.setText(spannableStringBuilder);
        if (!z10) {
            return i(q90Var, charSequence);
        }
        return null;
    }

    public final void k(String str, int i10, long j3, Runnable runnable) {
        j(str, i10, j3, runnable, null, null);
    }

    public final TableRow l(String str, final int i10, final long j3, Runnable runnable) {
        String str2;
        boolean z10;
        Context context = getContext();
        org.telegram.ui.ActionBar.d6 d6Var = this.f27926a;
        final o90 o90Var = new o90(context, d6Var);
        o90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        int i11 = org.telegram.ui.ActionBar.i6.Oh;
        o90Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, d6Var));
        o90Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(i11, d6Var));
        o90Var.setTextSize(14);
        org.telegram.ui.h5 h5Var = new org.telegram.ui.h5(o90Var, 24.0f, i10);
        ImageReceiver imageReceiver = h5Var.f36860b;
        if (j3 == 2666000) {
            str2 = LocaleController.getString(R.string.StarsTransactionHidden);
            sq a2 = yh.r7.a(44, "anonymous");
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            a2.f30851e = dp;
            a2.f30852f = dp2;
            imageReceiver.setImageBitmap(a2);
            z10 = false;
        } else {
            if (UserObject.isService(j3)) {
                str2 = LocaleController.getString(R.string.StarsTransactionUnknown);
                sq a10 = yh.r7.a(44, "fragment");
                int dp3 = AndroidUtilities.dp(16.0f);
                int dp4 = AndroidUtilities.dp(16.0f);
                a10.f30851e = dp3;
                a10.f30852f = dp4;
                imageReceiver.setImageBitmap(a10);
            } else if (j3 >= 0) {
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
                str2 = UserObject.getUserName(user);
                h5Var.e(user);
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
                if (chat == null) {
                    str2 = "";
                } else {
                    str2 = chat.title;
                }
                h5Var.b(chat);
            }
            z10 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str2));
        spannableStringBuilder.setSpan(h5Var, 0, 1, 33);
        if (z10) {
            o90Var.setClickable(true);
            spannableStringBuilder.setSpan(new vc(1, runnable), 3, spannableStringBuilder.length(), 33);
        }
        final int v02 = org.telegram.ui.ActionBar.i6.v0(i11, d6Var);
        final o5 o5Var = new o5(AndroidUtilities.dp(20.0f), o90Var);
        o5Var.k(Integer.valueOf(v02));
        o5Var.I = AndroidUtilities.dp(12.0f);
        o5Var.J = 0;
        o90Var.addOnAttachStateChangeListener(new ai.u2(o5Var, 10));
        final Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
        Utilities.Callback<Object[]> callback = new Utilities.Callback() {
            @Override
            public final void run(java.lang.Object r12) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g01.run(java.lang.Object):void");
            }
        };
        callback.run(null);
        o90Var.i(o5Var);
        NotificationCenter.getInstance(i10).listen(o90Var, NotificationCenter.updateInterfaces, callback);
        NotificationCenter.getInstance(i10).listen(o90Var, NotificationCenter.userEmojiStatusUpdated, callback);
        o90Var.l(spannableStringBuilder, false);
        return i(o90Var, str);
    }

    public final void m(String str, CharSequence charSequence, Runnable runnable) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        q90 q90Var = new q90(getContext(), null);
        q90Var.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        q90Var.setTextSize(1, 13.0f);
        int i10 = org.telegram.ui.ActionBar.i6.f20925j5;
        org.telegram.ui.ActionBar.d6 d6Var = this.f27926a;
        q90Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i10, d6Var));
        q90Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.gc, d6Var));
        q90Var.setMaxLines(1);
        q90Var.setSingleLine();
        q90Var.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(charSequence, runnable, 7), 0, spannableStringBuilder.length(), 33);
        q90Var.setText(spannableStringBuilder);
        q90Var.setDisablePaddingsOffsetY(true);
        q90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(10.66f), AndroidUtilities.dp(9.33f));
        frameLayout.addView(q90Var, w7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        i(frameLayout, str);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        super.onLayout(z10, i10, i11, i12, i13);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f27929e;
        paint.setStyle(style);
        paint.setStrokeWidth(this.f27930f);
        int i14 = org.telegram.ui.ActionBar.i6.f21068qh;
        org.telegram.ui.ActionBar.d6 d6Var = this.f27926a;
        paint.setColor(org.telegram.ui.ActionBar.i6.v0(i14, d6Var));
        Paint.Style style2 = Paint.Style.FILL;
        Paint paint2 = this.d;
        paint2.setStyle(style2);
        paint2.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21049ph, d6Var));
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            if (getChildAt(i15) instanceof TableRow) {
                TableRow tableRow = (TableRow) getChildAt(i15);
                int childCount2 = tableRow.getChildCount();
                for (int i16 = 0; i16 < childCount2; i16++) {
                    View childAt = tableRow.getChildAt(i16);
                    boolean z16 = true;
                    if (childAt instanceof j01) {
                        j01 j01Var = (j01) childAt;
                        if (i15 == 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (i15 != childCount - 1) {
                            z16 = false;
                        }
                        if (j01Var.f27550b != z15 || j01Var.f27551c != z16) {
                            j01Var.f27550b = z15;
                            j01Var.f27551c = z16;
                            j01Var.invalidate();
                        }
                    } else if (childAt instanceof h01) {
                        h01 h01Var = (h01) childAt;
                        if (i15 == 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (i15 == childCount - 1) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (h01Var.f26963b != z12 || h01Var.f26964c != z13) {
                            h01Var.f26963b = z12;
                            h01Var.f26964c = z13;
                            h01Var.invalidate();
                        }
                        if (i16 == 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (i16 != childCount2 - 1) {
                            z16 = false;
                        }
                        if (h01Var.d != z14 || h01Var.f26965e != z16) {
                            h01Var.d = z14;
                            h01Var.f26965e = z16;
                            h01Var.invalidate();
                        }
                    } else if (childAt instanceof i01) {
                        i01 i01Var = (i01) childAt;
                        if (i15 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i15 != childCount - 1) {
                            z16 = false;
                        }
                        if (i01Var.f27271c != z11 || i01Var.d != z16) {
                            i01Var.f27271c = z11;
                            i01Var.d = z16;
                            i01Var.invalidate();
                        }
                    }
                }
            }
        }
    }
}
