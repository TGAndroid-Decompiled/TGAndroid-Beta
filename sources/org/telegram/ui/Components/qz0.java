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
public final class qz0 extends TableLayout {
    public final org.telegram.ui.ActionBar.f6 f27462a;
    public final Path f27463b;
    public final float[] f27464c;
    public final Paint d;
    public final Paint e;
    public final float f27465f;
    public final float h;

    public qz0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f27463b = new Path();
        this.f27464c = new float[8];
        this.d = new Paint(1);
        this.e = new Paint(1);
        float max = Math.max(1, AndroidUtilities.dp(0.66f));
        this.f27465f = max;
        this.h = max / 2.0f;
        this.f27462a = f6Var;
        setClipToPadding(false);
        setColumnStretchable(1, true);
    }

    public final oz0 a(CharSequence charSequence) {
        vh.o oVar = new vh.o(getContext());
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.f27462a;
        oVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        oVar.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var));
        oVar.setTextSize(1, 14.0f);
        oVar.setText(Emoji.replaceEmoji(charSequence, oVar.getPaint().getFontMetricsInt(), false));
        NotificationCenter.listenEmojiLoading(oVar);
        oVar.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        oz0 oz0Var = new oz0(this, oVar, true);
        tableRow.addView(oz0Var, layoutParams);
        addView(tableRow);
        return oz0Var;
    }

    public final void b(CharSequence charSequence, ArrayList arrayList) {
        w5 w5Var = new w5(getContext());
        w5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, this.f27462a));
        w5Var.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        MessageObject.addEntitiesToText(spannableStringBuilder, arrayList, false, false, false, false);
        w5Var.setText(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, w5Var.getPaint().getFontMetricsInt(), false), arrayList, w5Var.getPaint().getFontMetricsInt()));
        NotificationCenter.listenEmojiLoading(w5Var);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        tableRow.addView(new oz0(this, w5Var, false), layoutParams);
        addView(tableRow);
    }

    public final TableRow c(CharSequence charSequence, CharSequence charSequence2, pz0[] pz0VarArr, xc[] xcVarArr) {
        c90 c90Var = new c90(getContext(), null);
        c90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, this.f27462a));
        c90Var.setTextSize(1, 14.0f);
        c90Var.setText(Emoji.replaceEmoji(charSequence2, c90Var.getPaint().getFontMetricsInt(), false));
        NotificationCenter.listenEmojiLoading(c90Var);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        pz0 pz0Var = new pz0(this, charSequence);
        if (pz0VarArr != null) {
            pz0VarArr[0] = pz0Var;
        }
        tableRow.addView(pz0Var, layoutParams);
        tableRow.addView(new nz0(this, c90Var, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        if (xcVarArr != 0) {
            xcVarArr[0] = c90Var;
        }
        return tableRow;
    }

    public final TableRow d(CharSequence charSequence, String str) {
        return c(str, charSequence, null, null);
    }

    public final TableRow e(String str, CharSequence charSequence, String str2, Runnable runnable, Integer num) {
        c90 c90Var = new c90(getContext(), null);
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.f27462a;
        c90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        c90Var.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Emoji.replaceEmoji(charSequence, c90Var.getPaint().getFontMetricsInt(), false));
        if (str2 != null) {
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) yc.b(str2, runnable, f6Var, num));
        }
        c90Var.setText(spannableStringBuilder);
        NotificationCenter.listenEmojiLoading(c90Var);
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new pz0(this, str), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new nz0(this, c90Var, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final void f(int i10, String str) {
        long j3 = i10 * 1000;
        c(str, LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(j3)), LocaleController.getInstance().getFormatterDay().format(new Date(j3))), null, null);
    }

    public final void g(String str, String str2, Runnable runnable) {
        Context context = getContext();
        org.telegram.ui.ActionBar.f6 f6Var = this.f27462a;
        c90 c90Var = new c90(context, f6Var);
        c90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        c90Var.setEllipsize(TextUtils.TruncateAt.END);
        int i10 = org.telegram.ui.ActionBar.j6.gc;
        c90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        c90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        c90Var.setTextSize(1, 14.0f);
        c90Var.setSingleLine(true);
        c90Var.setDisablePaddingsOffsetY(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        spannableStringBuilder.setSpan(new sc(3, runnable), 0, spannableStringBuilder.length(), 33);
        c90Var.setText(spannableStringBuilder);
        i(c90Var, str);
    }

    public final void h(String str, CharSequence charSequence, int i10, uh.i iVar) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(10.66f), AndroidUtilities.dp(9.33f));
        TextView textView = new TextView(getContext());
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        textView.setTextSize(1, i10);
        int i11 = org.telegram.ui.ActionBar.j6.f18969j5;
        org.telegram.ui.ActionBar.f6 f6Var = this.f27462a;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        textView.setMaxLines(4);
        textView.setSingleLine(false);
        textView.setText(charSequence);
        frameLayout.addView(textView, w7.x5.d(-1, -1.0f, 119, 0.0f, 0.0f, 34.0f, 0.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.msg_copy);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i12 = org.telegram.ui.ActionBar.j6.f19192v6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i12, f6Var), PorterDuff.Mode.SRC_IN));
        imageView.setOnClickListener(new dt(16, charSequence, iVar));
        w7.z5.a(imageView);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(i12, f6Var)), 7, -1));
        frameLayout.addView(imageView, w7.x5.e(30, 30, 21));
        i(frameLayout, str);
    }

    public final TableRow i(View view, CharSequence charSequence) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new pz0(this, charSequence), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new nz0(this, view, true), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final TableRow j(CharSequence charSequence, int i10, long j3, Runnable runnable, String str, Runnable runnable2) {
        boolean z10;
        String str2;
        String str3;
        boolean z11;
        Context context = getContext();
        org.telegram.ui.ActionBar.f6 f6Var = this.f27462a;
        ?? c90Var = new c90(context, f6Var);
        c90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        c90Var.setEllipsize(TextUtils.TruncateAt.END);
        int i11 = org.telegram.ui.ActionBar.j6.gc;
        c90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        c90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        c90Var.setTextSize(1, 14.0f);
        c90Var.setSingleLine(true);
        c90Var.setDisablePaddingsOffsetY(true);
        org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(c90Var, 24.0f, i10);
        ImageReceiver imageReceiver = g5Var.f33849b;
        if (j3 == 2666000) {
            str3 = LocaleController.getString(R.string.StarsTransactionHidden);
            pq a2 = yh.s7.a(44, "anonymous");
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            a2.e = dp;
            a2.f27109f = dp2;
            imageReceiver.setImageBitmap(a2);
            z10 = false;
            z11 = false;
        } else {
            if (UserObject.isService(j3)) {
                str3 = LocaleController.getString(R.string.StarsTransactionUnknown);
                pq a10 = yh.s7.a(44, "fragment");
                int dp3 = AndroidUtilities.dp(16.0f);
                int dp4 = AndroidUtilities.dp(16.0f);
                a10.e = dp3;
                a10.f27109f = dp4;
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
            spannableStringBuilder.setSpan(new sc(2, runnable), 3, spannableStringBuilder.length(), 33);
        }
        if (str != null) {
            c90Var.M = new yc(str, runnable2, f6Var);
        }
        c90Var.setText(spannableStringBuilder);
        if (!z10) {
            return i(c90Var, charSequence);
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
        org.telegram.ui.ActionBar.f6 f6Var = this.f27462a;
        final a90 a90Var = new a90(context, f6Var);
        a90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        int i11 = org.telegram.ui.ActionBar.j6.Oh;
        a90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        a90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        a90Var.setTextSize(14);
        org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(a90Var, 24.0f, i10);
        ImageReceiver imageReceiver = g5Var.f33849b;
        if (j3 == 2666000) {
            str2 = LocaleController.getString(R.string.StarsTransactionHidden);
            pq a2 = yh.s7.a(44, "anonymous");
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            a2.e = dp;
            a2.f27109f = dp2;
            imageReceiver.setImageBitmap(a2);
            z10 = false;
        } else {
            if (UserObject.isService(j3)) {
                str2 = LocaleController.getString(R.string.StarsTransactionUnknown);
                pq a10 = yh.s7.a(44, "fragment");
                int dp3 = AndroidUtilities.dp(16.0f);
                int dp4 = AndroidUtilities.dp(16.0f);
                a10.e = dp3;
                a10.f27109f = dp4;
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
            a90Var.setClickable(true);
            spannableStringBuilder.setSpan(new sc(1, runnable), 3, spannableStringBuilder.length(), 33);
        }
        final int v02 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        final m5 m5Var = new m5(AndroidUtilities.dp(20.0f), a90Var);
        m5Var.k(Integer.valueOf(v02));
        m5Var.I = AndroidUtilities.dp(12.0f);
        m5Var.J = 0;
        a90Var.addOnAttachStateChangeListener(new ai.u2(m5Var, 10));
        final Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
        Utilities.Callback<Object[]> callback = new Utilities.Callback() {
            @Override
            public final void run(java.lang.Object r12) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mz0.run(java.lang.Object):void");
            }
        };
        callback.run(null);
        a90Var.i(m5Var);
        NotificationCenter.getInstance(i10).listen(a90Var, NotificationCenter.updateInterfaces, callback);
        NotificationCenter.getInstance(i10).listen(a90Var, NotificationCenter.userEmojiStatusUpdated, callback);
        a90Var.l(spannableStringBuilder, false);
        return i(a90Var, str);
    }

    public final void m(String str, CharSequence charSequence, Runnable runnable) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        c90 c90Var = new c90(getContext(), null);
        c90Var.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        c90Var.setTextSize(1, 13.0f);
        int i10 = org.telegram.ui.ActionBar.j6.f18969j5;
        org.telegram.ui.ActionBar.f6 f6Var = this.f27462a;
        c90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        c90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var));
        c90Var.setMaxLines(1);
        c90Var.setSingleLine();
        c90Var.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(charSequence, runnable, 7), 0, spannableStringBuilder.length(), 33);
        c90Var.setText(spannableStringBuilder);
        c90Var.setDisablePaddingsOffsetY(true);
        c90Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(10.66f), AndroidUtilities.dp(9.33f));
        frameLayout.addView(c90Var, w7.x5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
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
        paint.setStrokeWidth(this.f27465f);
        int i14 = org.telegram.ui.ActionBar.j6.f19110qh;
        org.telegram.ui.ActionBar.f6 f6Var = this.f27462a;
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
        Paint.Style style2 = Paint.Style.FILL;
        Paint paint2 = this.d;
        paint2.setStyle(style2);
        paint2.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19092ph, f6Var));
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            if (getChildAt(i15) instanceof TableRow) {
                TableRow tableRow = (TableRow) getChildAt(i15);
                int childCount2 = tableRow.getChildCount();
                for (int i16 = 0; i16 < childCount2; i16++) {
                    View childAt = tableRow.getChildAt(i16);
                    boolean z16 = true;
                    if (childAt instanceof pz0) {
                        pz0 pz0Var = (pz0) childAt;
                        if (i15 == 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (i15 != childCount - 1) {
                            z16 = false;
                        }
                        if (pz0Var.f27162b != z15 || pz0Var.f27163c != z16) {
                            pz0Var.f27162b = z15;
                            pz0Var.f27163c = z16;
                            pz0Var.invalidate();
                        }
                    } else if (childAt instanceof nz0) {
                        nz0 nz0Var = (nz0) childAt;
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
                        if (nz0Var.f26564b != z12 || nz0Var.f26565c != z13) {
                            nz0Var.f26564b = z12;
                            nz0Var.f26565c = z13;
                            nz0Var.invalidate();
                        }
                        if (i16 == 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (i16 != childCount2 - 1) {
                            z16 = false;
                        }
                        if (nz0Var.d != z14 || nz0Var.e != z16) {
                            nz0Var.d = z14;
                            nz0Var.e = z16;
                            nz0Var.invalidate();
                        }
                    } else if (childAt instanceof oz0) {
                        oz0 oz0Var = (oz0) childAt;
                        if (i15 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i15 != childCount - 1) {
                            z16 = false;
                        }
                        if (oz0Var.f26898c != z11 || oz0Var.d != z16) {
                            oz0Var.f26898c = z11;
                            oz0Var.d = z16;
                            oz0Var.invalidate();
                        }
                    }
                }
            }
        }
    }
}
