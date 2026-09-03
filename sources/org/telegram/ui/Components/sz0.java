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
public final class sz0 extends TableLayout {
    public final org.telegram.ui.ActionBar.g6 f31217a;
    public final Path f31218b;
    public final float[] f31219c;
    public final Paint d;
    public final Paint f31220e;
    public final float f31221f;
    public final float h;

    public sz0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f31218b = new Path();
        this.f31219c = new float[8];
        this.d = new Paint(1);
        this.f31220e = new Paint(1);
        float max = Math.max(1, AndroidUtilities.dp(0.66f));
        this.f31221f = max;
        this.h = max / 2.0f;
        this.f31217a = g6Var;
        setClipToPadding(false);
        setColumnStretchable(1, true);
    }

    public final qz0 a(CharSequence charSequence) {
        jh.s sVar = new jh.s(getContext());
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = this.f31217a;
        sVar.setTextColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        sVar.setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21722gc, g6Var));
        sVar.setTextSize(1, 14.0f);
        sVar.setText(Emoji.replaceEmoji(charSequence, sVar.getPaint().getFontMetricsInt(), false));
        NotificationCenter.listenEmojiLoading(sVar);
        sVar.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        qz0 qz0Var = new qz0(this, sVar, true);
        tableRow.addView(qz0Var, layoutParams);
        addView(tableRow);
        return qz0Var;
    }

    public final void b(CharSequence charSequence, ArrayList arrayList) {
        t5 t5Var = new t5(getContext());
        t5Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, this.f31217a));
        t5Var.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        MessageObject.addEntitiesToText(spannableStringBuilder, arrayList, false, false, false, false);
        t5Var.setText(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, t5Var.getPaint().getFontMetricsInt(), false), arrayList, t5Var.getPaint().getFontMetricsInt()));
        NotificationCenter.listenEmojiLoading(t5Var);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        tableRow.addView(new qz0(this, t5Var, false), layoutParams);
        addView(tableRow);
    }

    public final TableRow c(CharSequence charSequence, CharSequence charSequence2, rz0[] rz0VarArr, sc[] scVarArr) {
        g90 g90Var = new g90(getContext(), null);
        g90Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, this.f31217a));
        g90Var.setTextSize(1, 14.0f);
        g90Var.setText(Emoji.replaceEmoji(charSequence2, g90Var.getPaint().getFontMetricsInt(), false));
        NotificationCenter.listenEmojiLoading(g90Var);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        rz0 rz0Var = new rz0(this, charSequence);
        if (rz0VarArr != null) {
            rz0VarArr[0] = rz0Var;
        }
        tableRow.addView(rz0Var, layoutParams);
        tableRow.addView(new pz0(this, g90Var, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        if (scVarArr != 0) {
            scVarArr[0] = g90Var;
        }
        return tableRow;
    }

    public final TableRow d(CharSequence charSequence, String str) {
        return c(str, charSequence, null, null);
    }

    public final TableRow e(String str, CharSequence charSequence, String str2, Runnable runnable, Integer num) {
        g90 g90Var = new g90(getContext(), null);
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = this.f31217a;
        g90Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        g90Var.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Emoji.replaceEmoji(charSequence, g90Var.getPaint().getFontMetricsInt(), false));
        if (str2 != null) {
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) tc.b(str2, runnable, g6Var, num));
        }
        g90Var.setText(spannableStringBuilder);
        NotificationCenter.listenEmojiLoading(g90Var);
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new rz0(this, str), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new pz0(this, g90Var, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final void f(int i10, String str) {
        long j10 = i10 * 1000;
        c(str, LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(j10)), LocaleController.getInstance().getFormatterDay().format(new Date(j10))), null, null);
    }

    public final void g(String str, String str2, Runnable runnable) {
        Context context = getContext();
        org.telegram.ui.ActionBar.g6 g6Var = this.f31217a;
        g90 g90Var = new g90(context, g6Var);
        g90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        g90Var.setEllipsize(TextUtils.TruncateAt.END);
        int i10 = org.telegram.ui.ActionBar.k6.f21722gc;
        g90Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        g90Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        g90Var.setTextSize(1, 14.0f);
        g90Var.setSingleLine(true);
        g90Var.setDisablePaddingsOffsetY(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        spannableStringBuilder.setSpan(new nc(3, runnable), 0, spannableStringBuilder.length(), 33);
        g90Var.setText(spannableStringBuilder);
        i(g90Var, str);
    }

    public final void h(String str, CharSequence charSequence, int i10, mh.m2 m2Var) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(10.66f), AndroidUtilities.dp(9.33f));
        TextView textView = new TextView(getContext());
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        textView.setTextSize(1, i10);
        int i11 = org.telegram.ui.ActionBar.k6.f21768j5;
        org.telegram.ui.ActionBar.g6 g6Var = this.f31217a;
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        textView.setMaxLines(4);
        textView.setSingleLine(false);
        textView.setText(charSequence);
        frameLayout.addView(textView, k7.c6.d(-1, -1.0f, 119, 0.0f, 0.0f, 34.0f, 0.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.msg_copy);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i12 = org.telegram.ui.ActionBar.k6.f21981v6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(i12, g6Var), PorterDuff.Mode.SRC_IN));
        imageView.setOnClickListener(new rx0(1, charSequence, m2Var));
        k7.e6.a(imageView);
        imageView.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.l1(0.1f, org.telegram.ui.ActionBar.k6.v0(i12, g6Var)), 7, -1));
        frameLayout.addView(imageView, k7.c6.e(30, 30, 21));
        i(frameLayout, str);
    }

    public final TableRow i(View view, CharSequence charSequence) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new rz0(this, charSequence), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new pz0(this, view, true), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final TableRow j(CharSequence charSequence, int i10, long j10, Runnable runnable, String str, Runnable runnable2) {
        boolean z4;
        String str2;
        String str3;
        boolean z10;
        Context context = getContext();
        org.telegram.ui.ActionBar.g6 g6Var = this.f31217a;
        ?? g90Var = new g90(context, g6Var);
        g90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        g90Var.setEllipsize(TextUtils.TruncateAt.END);
        int i11 = org.telegram.ui.ActionBar.k6.f21722gc;
        g90Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        g90Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        g90Var.setTextSize(1, 14.0f);
        g90Var.setSingleLine(true);
        g90Var.setDisablePaddingsOffsetY(true);
        org.telegram.ui.i5 i5Var = new org.telegram.ui.i5(g90Var, 24.0f, i10);
        ImageReceiver imageReceiver = i5Var.f37543b;
        if (j10 == 2666000) {
            str3 = LocaleController.getString(R.string.StarsTransactionHidden);
            pq a2 = mh.ea.a(44, "anonymous");
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            a2.f30161e = dp;
            a2.f30162f = dp2;
            imageReceiver.setImageBitmap(a2);
            z4 = false;
            z10 = false;
        } else {
            if (UserObject.isService(j10)) {
                str3 = LocaleController.getString(R.string.StarsTransactionUnknown);
                pq a10 = mh.ea.a(44, "fragment");
                int dp3 = AndroidUtilities.dp(16.0f);
                int dp4 = AndroidUtilities.dp(16.0f);
                a10.f30161e = dp3;
                a10.f30162f = dp4;
                imageReceiver.setImageBitmap(a10);
                z4 = false;
            } else {
                if (j10 >= 0) {
                    TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                    if (user == null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    str2 = UserObject.getUserName(user);
                    i5Var.e(user);
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
                    if (chat == null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (chat == null) {
                        str2 = "";
                    } else {
                        str2 = chat.title;
                    }
                    i5Var.b(chat);
                }
                str3 = str2;
            }
            z10 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str3));
        spannableStringBuilder.setSpan(i5Var, 0, 1, 33);
        if (z10) {
            spannableStringBuilder.setSpan(new nc(2, runnable), 3, spannableStringBuilder.length(), 33);
        }
        if (str != null) {
            g90Var.J = new tc(str, runnable2, g6Var);
        }
        g90Var.setText(spannableStringBuilder);
        if (!z4) {
            return i(g90Var, charSequence);
        }
        return null;
    }

    public final void k(String str, int i10, long j10, Runnable runnable) {
        j(str, i10, j10, runnable, null, null);
    }

    public final TableRow l(String str, final int i10, final long j10, Runnable runnable) {
        String str2;
        boolean z4;
        Context context = getContext();
        org.telegram.ui.ActionBar.g6 g6Var = this.f31217a;
        final e90 e90Var = new e90(context, g6Var);
        e90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        int i11 = org.telegram.ui.ActionBar.k6.Oh;
        e90Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        e90Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        e90Var.setTextSize(14);
        org.telegram.ui.i5 i5Var = new org.telegram.ui.i5(e90Var, 24.0f, i10);
        ImageReceiver imageReceiver = i5Var.f37543b;
        if (j10 == 2666000) {
            str2 = LocaleController.getString(R.string.StarsTransactionHidden);
            pq a2 = mh.ea.a(44, "anonymous");
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            a2.f30161e = dp;
            a2.f30162f = dp2;
            imageReceiver.setImageBitmap(a2);
            z4 = false;
        } else {
            if (UserObject.isService(j10)) {
                str2 = LocaleController.getString(R.string.StarsTransactionUnknown);
                pq a10 = mh.ea.a(44, "fragment");
                int dp3 = AndroidUtilities.dp(16.0f);
                int dp4 = AndroidUtilities.dp(16.0f);
                a10.f30161e = dp3;
                a10.f30162f = dp4;
                imageReceiver.setImageBitmap(a10);
            } else if (j10 >= 0) {
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                str2 = UserObject.getUserName(user);
                i5Var.e(user);
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
                if (chat == null) {
                    str2 = "";
                } else {
                    str2 = chat.title;
                }
                i5Var.b(chat);
            }
            z4 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str2));
        spannableStringBuilder.setSpan(i5Var, 0, 1, 33);
        if (z4) {
            e90Var.setClickable(true);
            spannableStringBuilder.setSpan(new nc(1, runnable), 3, spannableStringBuilder.length(), 33);
        }
        final int v02 = org.telegram.ui.ActionBar.k6.v0(i11, g6Var);
        final j5 j5Var = new j5(AndroidUtilities.dp(20.0f), e90Var);
        j5Var.k(Integer.valueOf(v02));
        j5Var.F = AndroidUtilities.dp(12.0f);
        j5Var.G = 0;
        e90Var.addOnAttachStateChangeListener(new ff.b(j5Var, 14));
        final Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
        Utilities.Callback<Object[]> callback = new Utilities.Callback() {
            @Override
            public final void run(java.lang.Object r12) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.oz0.run(java.lang.Object):void");
            }
        };
        callback.run(null);
        e90Var.i(j5Var);
        NotificationCenter.getInstance(i10).listen(e90Var, NotificationCenter.updateInterfaces, callback);
        NotificationCenter.getInstance(i10).listen(e90Var, NotificationCenter.userEmojiStatusUpdated, callback);
        e90Var.l(spannableStringBuilder, false);
        return i(e90Var, str);
    }

    public final void m(String str, CharSequence charSequence, Runnable runnable) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        g90 g90Var = new g90(getContext(), null);
        g90Var.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        g90Var.setTextSize(1, 13.0f);
        int i10 = org.telegram.ui.ActionBar.k6.f21768j5;
        org.telegram.ui.ActionBar.g6 g6Var = this.f31217a;
        g90Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        g90Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21722gc, g6Var));
        g90Var.setMaxLines(1);
        g90Var.setSingleLine();
        g90Var.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(charSequence, runnable, 7), 0, spannableStringBuilder.length(), 33);
        g90Var.setText(spannableStringBuilder);
        g90Var.setDisablePaddingsOffsetY(true);
        g90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(10.66f), AndroidUtilities.dp(9.33f));
        frameLayout.addView(g90Var, k7.c6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        i(frameLayout, str);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        super.onLayout(z4, i10, i11, i12, i13);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f31220e;
        paint.setStyle(style);
        paint.setStrokeWidth(this.f31221f);
        int i14 = org.telegram.ui.ActionBar.k6.f21906qh;
        org.telegram.ui.ActionBar.g6 g6Var = this.f31217a;
        paint.setColor(org.telegram.ui.ActionBar.k6.v0(i14, g6Var));
        Paint.Style style2 = Paint.Style.FILL;
        Paint paint2 = this.d;
        paint2.setStyle(style2);
        paint2.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21888ph, g6Var));
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            if (getChildAt(i15) instanceof TableRow) {
                TableRow tableRow = (TableRow) getChildAt(i15);
                int childCount2 = tableRow.getChildCount();
                for (int i16 = 0; i16 < childCount2; i16++) {
                    View childAt = tableRow.getChildAt(i16);
                    boolean z15 = true;
                    if (childAt instanceof rz0) {
                        rz0 rz0Var = (rz0) childAt;
                        if (i15 == 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (i15 != childCount - 1) {
                            z15 = false;
                        }
                        if (rz0Var.f30932b != z14 || rz0Var.f30933c != z15) {
                            rz0Var.f30932b = z14;
                            rz0Var.f30933c = z15;
                            rz0Var.invalidate();
                        }
                    } else if (childAt instanceof pz0) {
                        pz0 pz0Var = (pz0) childAt;
                        if (i15 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i15 == childCount - 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (pz0Var.f30243b != z11 || pz0Var.f30244c != z12) {
                            pz0Var.f30243b = z11;
                            pz0Var.f30244c = z12;
                            pz0Var.invalidate();
                        }
                        if (i16 == 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (i16 != childCount2 - 1) {
                            z15 = false;
                        }
                        if (pz0Var.d != z13 || pz0Var.f30245e != z15) {
                            pz0Var.d = z13;
                            pz0Var.f30245e = z15;
                            pz0Var.invalidate();
                        }
                    } else if (childAt instanceof qz0) {
                        qz0 qz0Var = (qz0) childAt;
                        if (i15 == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (i15 != childCount - 1) {
                            z15 = false;
                        }
                        if (qz0Var.f30572c != z10 || qz0Var.d != z15) {
                            qz0Var.f30572c = z10;
                            qz0Var.d = z15;
                            qz0Var.invalidate();
                        }
                    }
                }
            }
        }
    }
}
