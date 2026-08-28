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
public final class wy0 extends TableLayout {
    public final org.telegram.ui.ActionBar.b6 f34469a;
    public final Path f34470b;
    public final float[] f34471c;
    public final Paint d;
    public final Paint f34472e;
    public final float f34473f;
    public final float h;

    public wy0(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f34470b = new Path();
        this.f34471c = new float[8];
        this.d = new Paint(1);
        this.f34472e = new Paint(1);
        float max = Math.max(1, AndroidUtilities.dp(0.66f));
        this.f34473f = max;
        this.h = max / 2.0f;
        this.f34469a = b6Var;
        setClipToPadding(false);
        setColumnStretchable(1, true);
    }

    public final uy0 a(CharSequence charSequence) {
        dh.u uVar = new dh.u(getContext());
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        org.telegram.ui.ActionBar.b6 b6Var = this.f34469a;
        uVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        uVar.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23061gc, b6Var));
        uVar.setTextSize(1, 14.0f);
        uVar.setText(Emoji.replaceEmoji(charSequence, uVar.getPaint().getFontMetricsInt(), false));
        NotificationCenter.listenEmojiLoading(uVar);
        uVar.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        uy0 uy0Var = new uy0(this, uVar, true);
        tableRow.addView(uy0Var, layoutParams);
        addView(tableRow);
        return uy0Var;
    }

    public final void b(CharSequence charSequence, ArrayList arrayList) {
        s5 s5Var = new s5(getContext());
        s5Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, this.f34469a));
        s5Var.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        MessageObject.addEntitiesToText(spannableStringBuilder, arrayList, false, false, false, false);
        s5Var.setText(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, s5Var.getPaint().getFontMetricsInt(), false), arrayList, s5Var.getPaint().getFontMetricsInt()));
        NotificationCenter.listenEmojiLoading(s5Var);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        tableRow.addView(new uy0(this, s5Var, false), layoutParams);
        addView(tableRow);
    }

    public final TableRow c(CharSequence charSequence, CharSequence charSequence2, vy0[] vy0VarArr, qc[] qcVarArr) {
        l80 l80Var = new l80(getContext(), null);
        l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, this.f34469a));
        l80Var.setTextSize(1, 14.0f);
        l80Var.setText(Emoji.replaceEmoji(charSequence2, l80Var.getPaint().getFontMetricsInt(), false));
        NotificationCenter.listenEmojiLoading(l80Var);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        vy0 vy0Var = new vy0(this, charSequence);
        if (vy0VarArr != null) {
            vy0VarArr[0] = vy0Var;
        }
        tableRow.addView(vy0Var, layoutParams);
        tableRow.addView(new ty0(this, l80Var, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        if (qcVarArr != 0) {
            qcVarArr[0] = l80Var;
        }
        return tableRow;
    }

    public final TableRow d(CharSequence charSequence, String str) {
        return c(str, charSequence, null, null);
    }

    public final TableRow e(String str, CharSequence charSequence, String str2, Runnable runnable, Integer num) {
        l80 l80Var = new l80(getContext(), null);
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        org.telegram.ui.ActionBar.b6 b6Var = this.f34469a;
        l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        l80Var.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Emoji.replaceEmoji(charSequence, l80Var.getPaint().getFontMetricsInt(), false));
        if (str2 != null) {
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) rc.b(str2, runnable, b6Var, num));
        }
        l80Var.setText(spannableStringBuilder);
        NotificationCenter.listenEmojiLoading(l80Var);
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new vy0(this, str), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new ty0(this, l80Var, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final void f(int i9, String str) {
        long j10 = i9 * 1000;
        c(str, LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(j10)), LocaleController.getInstance().getFormatterDay().format(new Date(j10))), null, null);
    }

    public final void g(String str, String str2, Runnable runnable) {
        Context context = getContext();
        org.telegram.ui.ActionBar.b6 b6Var = this.f34469a;
        l80 l80Var = new l80(context, b6Var);
        l80Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        l80Var.setEllipsize(TextUtils.TruncateAt.END);
        int i9 = org.telegram.ui.ActionBar.f6.f23061gc;
        l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        l80Var.setTextSize(1, 14.0f);
        l80Var.setSingleLine(true);
        l80Var.setDisablePaddingsOffsetY(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        spannableStringBuilder.setSpan(new lc(3, runnable), 0, spannableStringBuilder.length(), 33);
        l80Var.setText(spannableStringBuilder);
        i(l80Var, str);
    }

    public final void h(String str, CharSequence charSequence, int i9, e5.u uVar) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(10.66f), AndroidUtilities.dp(9.33f));
        TextView textView = new TextView(getContext());
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        textView.setTextSize(1, i9);
        int i10 = org.telegram.ui.ActionBar.f6.f23108j5;
        org.telegram.ui.ActionBar.b6 b6Var = this.f34469a;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        textView.setMaxLines(4);
        textView.setSingleLine(false);
        textView.setText(charSequence);
        frameLayout.addView(textView, g7.e6.d(-1, -1.0f, 119, 0.0f, 0.0f, 34.0f, 0.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.msg_copy);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i11 = org.telegram.ui.ActionBar.f6.f23319v6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i11, b6Var), PorterDuff.Mode.SRC_IN));
        imageView.setOnClickListener(new vh0(3, charSequence, uVar));
        g7.g6.a(imageView);
        imageView.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.l1(0.1f, org.telegram.ui.ActionBar.f6.v0(i11, b6Var)), 7, -1));
        frameLayout.addView(imageView, g7.e6.e(30, 30, 21));
        i(frameLayout, str);
    }

    public final TableRow i(View view, CharSequence charSequence) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new vy0(this, charSequence), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new ty0(this, view, true), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final TableRow j(CharSequence charSequence, int i9, long j10, Runnable runnable, String str, Runnable runnable2) {
        boolean z10;
        String str2;
        String str3;
        boolean z11;
        Context context = getContext();
        org.telegram.ui.ActionBar.b6 b6Var = this.f34469a;
        ?? l80Var = new l80(context, b6Var);
        l80Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        l80Var.setEllipsize(TextUtils.TruncateAt.END);
        int i10 = org.telegram.ui.ActionBar.f6.f23061gc;
        l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        l80Var.setTextSize(1, 14.0f);
        l80Var.setSingleLine(true);
        l80Var.setDisablePaddingsOffsetY(true);
        org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(l80Var, 24.0f, i9);
        ImageReceiver imageReceiver = f5Var.f38137b;
        if (j10 == 2666000) {
            str3 = LocaleController.getString(R.string.StarsTransactionHidden);
            fq a2 = gh.ja.a(44, "anonymous");
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            a2.f28545e = dp;
            a2.f28546f = dp2;
            imageReceiver.setImageBitmap(a2);
            z10 = false;
            z11 = false;
        } else {
            if (UserObject.isService(j10)) {
                str3 = LocaleController.getString(R.string.StarsTransactionUnknown);
                fq a3 = gh.ja.a(44, "fragment");
                int dp3 = AndroidUtilities.dp(16.0f);
                int dp4 = AndroidUtilities.dp(16.0f);
                a3.f28545e = dp3;
                a3.f28546f = dp4;
                imageReceiver.setImageBitmap(a3);
                z10 = false;
            } else {
                if (j10 >= 0) {
                    TLRPC.User user = MessagesController.getInstance(i9).getUser(Long.valueOf(j10));
                    if (user == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    str2 = UserObject.getUserName(user);
                    f5Var.e(user);
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i9).getChat(Long.valueOf(-j10));
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
                    f5Var.b(chat);
                }
                str3 = str2;
            }
            z11 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str3));
        spannableStringBuilder.setSpan(f5Var, 0, 1, 33);
        if (z11) {
            spannableStringBuilder.setSpan(new lc(2, runnable), 3, spannableStringBuilder.length(), 33);
        }
        if (str != null) {
            l80Var.I = new rc(str, runnable2, b6Var);
        }
        l80Var.setText(spannableStringBuilder);
        if (!z10) {
            return i(l80Var, charSequence);
        }
        return null;
    }

    public final void k(String str, int i9, long j10, Runnable runnable) {
        j(str, i9, j10, runnable, null, null);
    }

    public final TableRow l(String str, final int i9, final long j10, Runnable runnable) {
        String str2;
        boolean z10;
        Context context = getContext();
        org.telegram.ui.ActionBar.b6 b6Var = this.f34469a;
        final j80 j80Var = new j80(context, b6Var);
        j80Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        int i10 = org.telegram.ui.ActionBar.f6.Oh;
        j80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        j80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        j80Var.setTextSize(14);
        org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(j80Var, 24.0f, i9);
        ImageReceiver imageReceiver = f5Var.f38137b;
        if (j10 == 2666000) {
            str2 = LocaleController.getString(R.string.StarsTransactionHidden);
            fq a2 = gh.ja.a(44, "anonymous");
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            a2.f28545e = dp;
            a2.f28546f = dp2;
            imageReceiver.setImageBitmap(a2);
            z10 = false;
        } else {
            if (UserObject.isService(j10)) {
                str2 = LocaleController.getString(R.string.StarsTransactionUnknown);
                fq a3 = gh.ja.a(44, "fragment");
                int dp3 = AndroidUtilities.dp(16.0f);
                int dp4 = AndroidUtilities.dp(16.0f);
                a3.f28545e = dp3;
                a3.f28546f = dp4;
                imageReceiver.setImageBitmap(a3);
            } else if (j10 >= 0) {
                TLRPC.User user = MessagesController.getInstance(i9).getUser(Long.valueOf(j10));
                str2 = UserObject.getUserName(user);
                f5Var.e(user);
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i9).getChat(Long.valueOf(-j10));
                if (chat == null) {
                    str2 = "";
                } else {
                    str2 = chat.title;
                }
                f5Var.b(chat);
            }
            z10 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str2));
        spannableStringBuilder.setSpan(f5Var, 0, 1, 33);
        if (z10) {
            j80Var.setClickable(true);
            spannableStringBuilder.setSpan(new lc(1, runnable), 3, spannableStringBuilder.length(), 33);
        }
        final int v02 = org.telegram.ui.ActionBar.f6.v0(i10, b6Var);
        final i5 i5Var = new i5(AndroidUtilities.dp(20.0f), j80Var);
        i5Var.k(Integer.valueOf(v02));
        i5Var.E = AndroidUtilities.dp(12.0f);
        i5Var.F = 0;
        j80Var.addOnAttachStateChangeListener(new af.b(i5Var, 14));
        final Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
        Utilities.Callback<Object[]> callback = new Utilities.Callback() {
            @Override
            public final void run(java.lang.Object r12) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sy0.run(java.lang.Object):void");
            }
        };
        callback.run(null);
        j80Var.i(i5Var);
        NotificationCenter.getInstance(i9).listen(j80Var, NotificationCenter.updateInterfaces, callback);
        NotificationCenter.getInstance(i9).listen(j80Var, NotificationCenter.userEmojiStatusUpdated, callback);
        j80Var.l(spannableStringBuilder, false);
        return i(j80Var, str);
    }

    public final void m(String str, CharSequence charSequence, Runnable runnable) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        l80 l80Var = new l80(getContext(), null);
        l80Var.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        l80Var.setTextSize(1, 13.0f);
        int i9 = org.telegram.ui.ActionBar.f6.f23108j5;
        org.telegram.ui.ActionBar.b6 b6Var = this.f34469a;
        l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23061gc, b6Var));
        l80Var.setMaxLines(1);
        l80Var.setSingleLine();
        l80Var.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(charSequence, runnable, 7), 0, spannableStringBuilder.length(), 33);
        l80Var.setText(spannableStringBuilder);
        l80Var.setDisablePaddingsOffsetY(true);
        l80Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(10.66f), AndroidUtilities.dp(9.33f));
        frameLayout.addView(l80Var, g7.e6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
        i(frameLayout, str);
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        super.onLayout(z10, i9, i10, i11, i12);
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f34472e;
        paint.setStyle(style);
        paint.setStrokeWidth(this.f34473f);
        int i13 = org.telegram.ui.ActionBar.f6.f23240qh;
        org.telegram.ui.ActionBar.b6 b6Var = this.f34469a;
        paint.setColor(org.telegram.ui.ActionBar.f6.v0(i13, b6Var));
        Paint.Style style2 = Paint.Style.FILL;
        Paint paint2 = this.d;
        paint2.setStyle(style2);
        paint2.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23221ph, b6Var));
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            if (getChildAt(i14) instanceof TableRow) {
                TableRow tableRow = (TableRow) getChildAt(i14);
                int childCount2 = tableRow.getChildCount();
                for (int i15 = 0; i15 < childCount2; i15++) {
                    View childAt = tableRow.getChildAt(i15);
                    boolean z16 = true;
                    if (childAt instanceof vy0) {
                        vy0 vy0Var = (vy0) childAt;
                        if (i14 == 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (i14 != childCount - 1) {
                            z16 = false;
                        }
                        if (vy0Var.f34027b != z15 || vy0Var.f34028c != z16) {
                            vy0Var.f34027b = z15;
                            vy0Var.f34028c = z16;
                            vy0Var.invalidate();
                        }
                    } else if (childAt instanceof ty0) {
                        ty0 ty0Var = (ty0) childAt;
                        if (i14 == 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (i14 == childCount - 1) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (ty0Var.f32836b != z12 || ty0Var.f32837c != z13) {
                            ty0Var.f32836b = z12;
                            ty0Var.f32837c = z13;
                            ty0Var.invalidate();
                        }
                        if (i15 == 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (i15 != childCount2 - 1) {
                            z16 = false;
                        }
                        if (ty0Var.d != z14 || ty0Var.f32838e != z16) {
                            ty0Var.d = z14;
                            ty0Var.f32838e = z16;
                            ty0Var.invalidate();
                        }
                    } else if (childAt instanceof uy0) {
                        uy0 uy0Var = (uy0) childAt;
                        if (i14 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i14 != childCount - 1) {
                            z16 = false;
                        }
                        if (uy0Var.f33172c != z11 || uy0Var.d != z16) {
                            uy0Var.f33172c = z11;
                            uy0Var.d = z16;
                            uy0Var.invalidate();
                        }
                    }
                }
            }
        }
    }
}
