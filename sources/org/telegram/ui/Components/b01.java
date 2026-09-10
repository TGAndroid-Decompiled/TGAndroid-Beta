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
public final class b01 extends TableLayout {
    public final org.telegram.ui.ActionBar.f6 f21671a;
    public final Path f21672b;
    public final float[] f21673c;
    public final Paint d;
    public final Paint e;
    public final float f21674f;
    public final float h;

    public b01(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f21672b = new Path();
        this.f21673c = new float[8];
        this.d = new Paint(1);
        this.e = new Paint(1);
        float max = Math.max(1, AndroidUtilities.dp(0.66f));
        this.f21674f = max;
        this.h = max / 2.0f;
        this.f21671a = f6Var;
        setClipToPadding(false);
        setColumnStretchable(1, true);
    }

    public final zz0 a(CharSequence charSequence) {
        uh.o oVar = new uh.o(getContext());
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.f21671a;
        oVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        oVar.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var));
        oVar.setTextSize(1, 14.0f);
        oVar.setText(Emoji.replaceEmoji(charSequence, oVar.getPaint().getFontMetricsInt(), false));
        NotificationCenter.listenEmojiLoading(oVar);
        oVar.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        zz0 zz0Var = new zz0(this, oVar, true);
        tableRow.addView(zz0Var, layoutParams);
        addView(tableRow);
        return zz0Var;
    }

    public final void b(CharSequence charSequence, ArrayList arrayList) {
        x5 x5Var = new x5(getContext());
        x5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, this.f21671a));
        x5Var.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        MessageObject.addEntitiesToText(spannableStringBuilder, arrayList, false, false, false, false);
        x5Var.setText(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, x5Var.getPaint().getFontMetricsInt(), false), arrayList, x5Var.getPaint().getFontMetricsInt()));
        NotificationCenter.listenEmojiLoading(x5Var);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        tableRow.addView(new zz0(this, x5Var, false), layoutParams);
        addView(tableRow);
    }

    public final TableRow c(CharSequence charSequence, CharSequence charSequence2, a01[] a01VarArr, yc[] ycVarArr) {
        m90 m90Var = new m90(getContext(), null);
        m90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, this.f21671a));
        m90Var.setTextSize(1, 14.0f);
        m90Var.setText(Emoji.replaceEmoji(charSequence2, m90Var.getPaint().getFontMetricsInt(), false));
        NotificationCenter.listenEmojiLoading(m90Var);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        a01 a01Var = new a01(this, charSequence);
        if (a01VarArr != null) {
            a01VarArr[0] = a01Var;
        }
        tableRow.addView(a01Var, layoutParams);
        tableRow.addView(new yz0(this, m90Var, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        if (ycVarArr != 0) {
            ycVarArr[0] = m90Var;
        }
        return tableRow;
    }

    public final TableRow d(CharSequence charSequence, String str) {
        return c(str, charSequence, null, null);
    }

    public final TableRow e(String str, CharSequence charSequence, String str2, Runnable runnable, Integer num) {
        m90 m90Var = new m90(getContext(), null);
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.f21671a;
        m90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        m90Var.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Emoji.replaceEmoji(charSequence, m90Var.getPaint().getFontMetricsInt(), false));
        if (str2 != null) {
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) zc.b(str2, runnable, f6Var, num));
        }
        m90Var.setText(spannableStringBuilder);
        NotificationCenter.listenEmojiLoading(m90Var);
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new a01(this, str), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new yz0(this, m90Var, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final void f(int i10, String str) {
        long j3 = i10 * 1000;
        c(str, LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(j3)), LocaleController.getInstance().getFormatterDay().format(new Date(j3))), null, null);
    }

    public final void g(String str, String str2, Runnable runnable) {
        Context context = getContext();
        org.telegram.ui.ActionBar.f6 f6Var = this.f21671a;
        m90 m90Var = new m90(context, f6Var);
        m90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        m90Var.setEllipsize(TextUtils.TruncateAt.END);
        int i10 = org.telegram.ui.ActionBar.j6.gc;
        m90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        m90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        m90Var.setTextSize(1, 14.0f);
        m90Var.setSingleLine(true);
        m90Var.setDisablePaddingsOffsetY(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        spannableStringBuilder.setSpan(new tc(3, runnable), 0, spannableStringBuilder.length(), 33);
        m90Var.setText(spannableStringBuilder);
        i(m90Var, str);
    }

    public final void h(String str, CharSequence charSequence, int i10, u2.k0 k0Var) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(10.66f), AndroidUtilities.dp(9.33f));
        TextView textView = new TextView(getContext());
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        textView.setTextSize(1, i10);
        int i11 = org.telegram.ui.ActionBar.j6.f18034j5;
        org.telegram.ui.ActionBar.f6 f6Var = this.f21671a;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        textView.setMaxLines(4);
        textView.setSingleLine(false);
        textView.setText(charSequence);
        frameLayout.addView(textView, w7.a6.d(-1, -1.0f, 119, 0.0f, 0.0f, 34.0f, 0.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.msg_copy);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i12 = org.telegram.ui.ActionBar.j6.f18254v6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i12, f6Var), PorterDuff.Mode.SRC_IN));
        imageView.setOnClickListener(new u10(13, charSequence, k0Var));
        w7.c6.a(imageView);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(i12, f6Var)), 7, -1));
        frameLayout.addView(imageView, w7.a6.e(30, 30, 21));
        i(frameLayout, str);
    }

    public final TableRow i(View view, CharSequence charSequence) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new a01(this, charSequence), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new yz0(this, view, true), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final TableRow j(CharSequence charSequence, int i10, long j3, Runnable runnable, String str, Runnable runnable2) {
        boolean z10;
        String str2;
        String str3;
        boolean z11;
        Context context = getContext();
        org.telegram.ui.ActionBar.f6 f6Var = this.f21671a;
        ?? m90Var = new m90(context, f6Var);
        m90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        m90Var.setEllipsize(TextUtils.TruncateAt.END);
        int i11 = org.telegram.ui.ActionBar.j6.gc;
        m90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        m90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        m90Var.setTextSize(1, 14.0f);
        m90Var.setSingleLine(true);
        m90Var.setDisablePaddingsOffsetY(true);
        org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(m90Var, 24.0f, i10);
        ImageReceiver imageReceiver = g5Var.f32996b;
        if (j3 == 2666000) {
            str3 = LocaleController.getString(R.string.StarsTransactionHidden);
            vq a2 = xh.t7.a(44, "anonymous");
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            a2.e = dp;
            a2.f28576f = dp2;
            imageReceiver.setImageBitmap(a2);
            z10 = false;
            z11 = false;
        } else {
            if (UserObject.isService(j3)) {
                str3 = LocaleController.getString(R.string.StarsTransactionUnknown);
                vq a10 = xh.t7.a(44, "fragment");
                int dp3 = AndroidUtilities.dp(16.0f);
                int dp4 = AndroidUtilities.dp(16.0f);
                a10.e = dp3;
                a10.f28576f = dp4;
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
                    g5Var.e(user);
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
                    g5Var.b(chat);
                }
                str3 = str2;
            }
            z11 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str3));
        spannableStringBuilder.setSpan(g5Var, 0, 1, 33);
        if (z11) {
            spannableStringBuilder.setSpan(new tc(2, runnable), 3, spannableStringBuilder.length(), 33);
        }
        if (str != null) {
            m90Var.M = new zc(str, runnable2, f6Var);
        }
        m90Var.setText(spannableStringBuilder);
        if (!z10) {
            return i(m90Var, charSequence);
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
        org.telegram.ui.ActionBar.f6 f6Var = this.f21671a;
        final k90 k90Var = new k90(context, f6Var);
        k90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        int i11 = org.telegram.ui.ActionBar.j6.Oh;
        k90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        k90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        k90Var.setTextSize(14);
        org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(k90Var, 24.0f, i10);
        ImageReceiver imageReceiver = g5Var.f32996b;
        if (j3 == 2666000) {
            str2 = LocaleController.getString(R.string.StarsTransactionHidden);
            vq a2 = xh.t7.a(44, "anonymous");
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            a2.e = dp;
            a2.f28576f = dp2;
            imageReceiver.setImageBitmap(a2);
            z10 = false;
        } else {
            if (UserObject.isService(j3)) {
                str2 = LocaleController.getString(R.string.StarsTransactionUnknown);
                vq a10 = xh.t7.a(44, "fragment");
                int dp3 = AndroidUtilities.dp(16.0f);
                int dp4 = AndroidUtilities.dp(16.0f);
                a10.e = dp3;
                a10.f28576f = dp4;
                imageReceiver.setImageBitmap(a10);
            } else if (j3 >= 0) {
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
                str2 = UserObject.getUserName(user);
                g5Var.e(user);
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
                if (chat == null) {
                    str2 = "";
                } else {
                    str2 = chat.title;
                }
                g5Var.b(chat);
            }
            z10 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str2));
        spannableStringBuilder.setSpan(g5Var, 0, 1, 33);
        if (z10) {
            k90Var.setClickable(true);
            spannableStringBuilder.setSpan(new tc(1, runnable), 3, spannableStringBuilder.length(), 33);
        }
        final int v02 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        final n5 n5Var = new n5(AndroidUtilities.dp(20.0f), k90Var);
        n5Var.k(Integer.valueOf(v02));
        n5Var.I = AndroidUtilities.dp(12.0f);
        n5Var.J = 0;
        k90Var.addOnAttachStateChangeListener(new l.d(n5Var, 8));
        final Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
        Utilities.Callback<Object[]> callback = new Utilities.Callback() {
            @Override
            public final void run(java.lang.Object r12) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xz0.run(java.lang.Object):void");
            }
        };
        callback.run(null);
        k90Var.i(n5Var);
        NotificationCenter.getInstance(i10).listen(k90Var, NotificationCenter.updateInterfaces, callback);
        NotificationCenter.getInstance(i10).listen(k90Var, NotificationCenter.userEmojiStatusUpdated, callback);
        k90Var.l(spannableStringBuilder, false);
        return i(k90Var, str);
    }

    public final void m(String str, CharSequence charSequence, Runnable runnable) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        m90 m90Var = new m90(getContext(), null);
        m90Var.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        m90Var.setTextSize(1, 13.0f);
        int i10 = org.telegram.ui.ActionBar.j6.f18034j5;
        org.telegram.ui.ActionBar.f6 f6Var = this.f21671a;
        m90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        m90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var));
        m90Var.setMaxLines(1);
        m90Var.setSingleLine();
        m90Var.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(charSequence, runnable, 7), 0, spannableStringBuilder.length(), 33);
        m90Var.setText(spannableStringBuilder);
        m90Var.setDisablePaddingsOffsetY(true);
        m90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(10.66f), AndroidUtilities.dp(9.33f));
        frameLayout.addView(m90Var, w7.a6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
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
        Paint paint = this.e;
        paint.setStyle(style);
        paint.setStrokeWidth(this.f21674f);
        int i14 = org.telegram.ui.ActionBar.j6.f18172qh;
        org.telegram.ui.ActionBar.f6 f6Var = this.f21671a;
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
        Paint.Style style2 = Paint.Style.FILL;
        Paint paint2 = this.d;
        paint2.setStyle(style2);
        paint2.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18154ph, f6Var));
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            if (getChildAt(i15) instanceof TableRow) {
                TableRow tableRow = (TableRow) getChildAt(i15);
                int childCount2 = tableRow.getChildCount();
                for (int i16 = 0; i16 < childCount2; i16++) {
                    View childAt = tableRow.getChildAt(i16);
                    boolean z16 = true;
                    if (childAt instanceof a01) {
                        a01 a01Var = (a01) childAt;
                        if (i15 == 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (i15 != childCount - 1) {
                            z16 = false;
                        }
                        if (a01Var.f21335b != z15 || a01Var.f21336c != z16) {
                            a01Var.f21335b = z15;
                            a01Var.f21336c = z16;
                            a01Var.invalidate();
                        }
                    } else if (childAt instanceof yz0) {
                        yz0 yz0Var = (yz0) childAt;
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
                        if (yz0Var.f29536b != z12 || yz0Var.f29537c != z13) {
                            yz0Var.f29536b = z12;
                            yz0Var.f29537c = z13;
                            yz0Var.invalidate();
                        }
                        if (i16 == 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (i16 != childCount2 - 1) {
                            z16 = false;
                        }
                        if (yz0Var.d != z14 || yz0Var.e != z16) {
                            yz0Var.d = z14;
                            yz0Var.e = z16;
                            yz0Var.invalidate();
                        }
                    } else if (childAt instanceof zz0) {
                        zz0 zz0Var = (zz0) childAt;
                        if (i15 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i15 != childCount - 1) {
                            z16 = false;
                        }
                        if (zz0Var.f29846c != z11 || zz0Var.d != z16) {
                            zz0Var.f29846c = z11;
                            zz0Var.d = z16;
                            zz0Var.invalidate();
                        }
                    }
                }
            }
        }
    }
}
