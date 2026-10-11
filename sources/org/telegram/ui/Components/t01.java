package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
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
public final class t01 extends TableLayout {
    public final org.telegram.ui.ActionBar.d6 f30922a;
    public final Path f30923b;
    public final float[] f30924c;
    public final Paint d;
    public final Paint f30925e;
    public final float f30926f;
    public final float h;

    public t01(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f30923b = new Path();
        this.f30924c = new float[8];
        this.d = new Paint(1);
        this.f30925e = new Paint(1);
        float max = Math.max(1, AndroidUtilities.dp(0.66f));
        this.f30926f = max;
        this.h = max / 2.0f;
        this.f30922a = d6Var;
        setClipToPadding(false);
        setColumnStretchable(1, true);
    }

    public final r01 a(CharSequence charSequence) {
        vh.n nVar = new vh.n(getContext());
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f30922a;
        nVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        nVar.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.gc, d6Var));
        nVar.setTextSize(1, 14.0f);
        nVar.setText(Emoji.replaceEmoji(charSequence, nVar.getPaint().getFontMetricsInt(), false));
        NotificationCenter.listenEmojiLoading(nVar);
        nVar.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        r01 r01Var = new r01(this, nVar, true);
        tableRow.addView(r01Var, layoutParams);
        addView(tableRow);
        return r01Var;
    }

    public final void b(CharSequence charSequence, ArrayList arrayList) {
        a6 a6Var = new a6(getContext());
        a6Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, this.f30922a));
        a6Var.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        MessageObject.addEntitiesToText(spannableStringBuilder, arrayList, false, false, false, false);
        a6Var.setText(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder, a6Var.getPaint().getFontMetricsInt(), false), arrayList, a6Var.getPaint().getFontMetricsInt()));
        NotificationCenter.listenEmojiLoading(a6Var);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        layoutParams.span = 2;
        tableRow.addView(new r01(this, a6Var, false), layoutParams);
        addView(tableRow);
    }

    public final TableRow c(CharSequence charSequence, CharSequence charSequence2, s01[] s01VarArr, cd[] cdVarArr) {
        cd cdVar = new cd(getContext());
        cdVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, this.f30922a));
        cdVar.setTextSize(1, 14.0f);
        cdVar.setText(Emoji.replaceEmoji(charSequence2, cdVar.getPaint().getFontMetricsInt(), false));
        NotificationCenter.listenEmojiLoading(cdVar);
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        s01 s01Var = new s01(this, charSequence);
        if (s01VarArr != null) {
            s01VarArr[0] = s01Var;
        }
        tableRow.addView(s01Var, layoutParams);
        tableRow.addView(new q01(this, cdVar, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        if (cdVarArr != null) {
            cdVarArr[0] = cdVar;
        }
        return tableRow;
    }

    public final TableRow d(CharSequence charSequence, String str) {
        return c(str, charSequence, null, null);
    }

    public final TableRow e(String str, CharSequence charSequence, String str2, Runnable runnable, Integer num) {
        cd cdVar = new cd(getContext());
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f30922a;
        cdVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        cdVar.setTextSize(1, 14.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Emoji.replaceEmoji(charSequence, cdVar.getPaint().getFontMetricsInt(), false));
        if (str2 != null) {
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) dd.b(str2, runnable, d6Var, num));
        }
        cdVar.setText(spannableStringBuilder);
        NotificationCenter.listenEmojiLoading(cdVar);
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new s01(this, str), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new q01(this, cdVar, false), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final void f(int i10, String str) {
        long j3 = i10 * 1000;
        c(str, LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(j3)), LocaleController.getInstance().getFormatterDay().format(new Date(j3))), null, null);
    }

    public final TableRow g(CharSequence charSequence, CharSequence charSequence2, Runnable runnable, String str, org.telegram.ui.Wallet.u3 u3Var) {
        Context context = getContext();
        org.telegram.ui.ActionBar.d6 d6Var = this.f30922a;
        cd cdVar = new cd(context, d6Var);
        cdVar.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        cdVar.setEllipsize(TextUtils.TruncateAt.END);
        int i10 = org.telegram.ui.ActionBar.h6.gc;
        cdVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        cdVar.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        cdVar.setTextSize(1, 14.0f);
        cdVar.setSingleLine(true);
        cdVar.setDisablePaddingsOffsetY(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence2);
        spannableStringBuilder.setSpan(new xc(3, runnable), 0, spannableStringBuilder.length(), 33);
        cdVar.setText(spannableStringBuilder);
        if (str != null) {
            cdVar.O = new dd(str, u3Var, d6Var);
        }
        return k(cdVar, charSequence);
    }

    public final void h(String str, String str2, Runnable runnable) {
        g(str, str2, runnable, null, null);
    }

    public final TableRow i(CharSequence charSequence, CharSequence charSequence2, int i10, yh.e5 e5Var, String str, org.telegram.ui.Wallet.i iVar) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        final fa0 fa0Var = new fa0(getContext(), null);
        fa0Var.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        float f7 = i10;
        fa0Var.setTextSize(1, f7);
        int i11 = org.telegram.ui.ActionBar.h6.f20894j5;
        org.telegram.ui.ActionBar.d6 d6Var = this.f30922a;
        fa0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        fa0Var.setMaxLines(4);
        int i12 = 0;
        fa0Var.setSingleLine(false);
        fa0Var.setText(charSequence2);
        fa0Var.setDisablePaddingsOffsetY(true);
        fa0Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(10.66f), AndroidUtilities.dp(9.33f));
        frameLayout.addView(fa0Var, w7.x5.a(-1.0f, 0.0f, 0.0f, 34.0f, 0.0f, -1, 119));
        if (str != null) {
            dd ddVar = new dd(str, iVar, d6Var);
            final cd cdVar = new cd(getContext(), d6Var);
            cdVar.setTextSize(1, f7);
            cdVar.setPadding(0, AndroidUtilities.dp(9.33f), 0, AndroidUtilities.dp(9.33f));
            SpannableString spannableString = new SpannableString("btn");
            spannableString.setSpan(ddVar, 0, spannableString.length(), 33);
            cdVar.setText(spannableString);
            if (e5Var != null) {
                i12 = 34;
            }
            float f10 = i12 + 12.66f;
            ((FrameLayout.LayoutParams) fa0Var.getLayoutParams()).rightMargin = AndroidUtilities.dp(f10) + ddVar.a();
            frameLayout.addView(cdVar, w7.x5.a(-2.0f, 0.0f, 0.0f, f10, 0.0f, -2, 53));
            frameLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                @Override
                public final void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
                    fa0 fa0Var2 = fa0.this;
                    if (fa0Var2.getLayout() != null && fa0Var2.getLayout().getLineCount() > 0) {
                        int left = fa0Var2.getLeft();
                        float lineRight = fa0Var2.getLayout().getLineRight(0) + fa0Var2.getPaddingLeft() + left + AndroidUtilities.dp(6.0f);
                        cd cdVar2 = cdVar;
                        cdVar2.setTranslationX(Math.min(0.0f, lineRight - cdVar2.getLeft()));
                    }
                }
            });
        }
        if (e5Var != null) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.msg_copy);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int i13 = org.telegram.ui.ActionBar.h6.f21118v6;
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i13, d6Var), PorterDuff.Mode.SRC_IN));
            imageView.setOnClickListener(new vt(16, charSequence2, e5Var));
            w7.z5.a(imageView);
            imageView.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.m1(0.1f, org.telegram.ui.ActionBar.h6.w0(i13, d6Var)), 7, -1));
            frameLayout.addView(imageView, w7.x5.e(30, 30, 21));
        }
        return k(frameLayout, charSequence);
    }

    public final void j(String str, CharSequence charSequence, int i10, yh.e5 e5Var) {
        i(str, charSequence, i10, e5Var, null, null);
    }

    public final TableRow k(View view, CharSequence charSequence) {
        TableRow tableRow = new TableRow(getContext());
        tableRow.addView(new s01(this, charSequence), new TableRow.LayoutParams(-2, -1));
        tableRow.addView(new q01(this, view, true), new TableRow.LayoutParams(0, -1, 1.0f));
        addView(tableRow);
        return tableRow;
    }

    public final TableRow l(CharSequence charSequence, int i10, long j3, Runnable runnable, String str, Runnable runnable2) {
        boolean z10;
        String str2;
        String str3;
        boolean z11;
        Context context = getContext();
        org.telegram.ui.ActionBar.d6 d6Var = this.f30922a;
        cd cdVar = new cd(context, d6Var);
        cdVar.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        cdVar.setEllipsize(TextUtils.TruncateAt.END);
        int i11 = org.telegram.ui.ActionBar.h6.Oh;
        cdVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        cdVar.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        cdVar.setTextSize(1, 14.0f);
        cdVar.setSingleLine(true);
        cdVar.setDisablePaddingsOffsetY(true);
        org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(cdVar, 24.0f, i10);
        int i12 = (j3 > 2666000L ? 1 : (j3 == 2666000L ? 0 : -1));
        ImageReceiver imageReceiver = f5Var.f37540b;
        if (i12 == 0) {
            str3 = LocaleController.getString(R.string.StarsTransactionHidden);
            fr a2 = yh.j7.a(44, "anonymous");
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            a2.f26470e = dp;
            a2.f26471f = dp2;
            imageReceiver.setImageBitmap(a2);
            z10 = false;
            z11 = false;
        } else if (UserObject.isService(j3)) {
            str3 = LocaleController.getString(R.string.StarsTransactionUnknown);
            fr a10 = yh.j7.a(44, "fragment");
            int dp3 = AndroidUtilities.dp(16.0f);
            int dp4 = AndroidUtilities.dp(16.0f);
            a10.f26470e = dp3;
            a10.f26471f = dp4;
            imageReceiver.setImageBitmap(a10);
            z11 = true;
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
                f5Var.e(user);
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
                f5Var.b(chat);
            }
            str3 = str2;
            z11 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str3));
        spannableStringBuilder.setSpan(f5Var, 0, 1, 33);
        if (z11) {
            spannableStringBuilder.setSpan(new xc(2, runnable), 3, spannableStringBuilder.length(), 33);
        }
        if (str != null) {
            cdVar.O = new dd(str, runnable2, d6Var);
        }
        cdVar.setText(spannableStringBuilder);
        if (!z10) {
            return k(cdVar, charSequence);
        }
        return null;
    }

    public final void m(String str, int i10, long j3, Runnable runnable) {
        l(str, i10, j3, runnable, null, null);
    }

    public final TableRow n(String str, final int i10, final long j3, Runnable runnable) {
        String str2;
        String str3;
        boolean z10;
        Context context = getContext();
        org.telegram.ui.ActionBar.d6 d6Var = this.f30922a;
        final da0 da0Var = new da0(context, d6Var);
        da0Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        int i11 = org.telegram.ui.ActionBar.h6.Oh;
        da0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        da0Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        da0Var.setTextSize(14);
        org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(da0Var, 24.0f, i10);
        int i12 = (j3 > 2666000L ? 1 : (j3 == 2666000L ? 0 : -1));
        ImageReceiver imageReceiver = f5Var.f37540b;
        if (i12 == 0) {
            str3 = LocaleController.getString(R.string.StarsTransactionHidden);
            fr a2 = yh.j7.a(44, "anonymous");
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            a2.f26470e = dp;
            a2.f26471f = dp2;
            imageReceiver.setImageBitmap(a2);
            z10 = false;
        } else {
            if (UserObject.isService(j3)) {
                str3 = LocaleController.getString(R.string.StarsTransactionUnknown);
                fr a10 = yh.j7.a(44, "fragment");
                int dp3 = AndroidUtilities.dp(16.0f);
                int dp4 = AndroidUtilities.dp(16.0f);
                a10.f26470e = dp3;
                a10.f26471f = dp4;
                imageReceiver.setImageBitmap(a10);
            } else {
                if (j3 >= 0) {
                    TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
                    str2 = UserObject.getUserName(user);
                    f5Var.e(user);
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
                    if (chat == null) {
                        str2 = "";
                    } else {
                        str2 = chat.title;
                    }
                    f5Var.b(chat);
                }
                str3 = str2;
            }
            z10 = true;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) str3));
        spannableStringBuilder.setSpan(f5Var, 0, 1, 33);
        if (z10) {
            da0Var.setClickable(true);
            spannableStringBuilder.setSpan(new xc(1, runnable), 3, spannableStringBuilder.length(), 33);
        }
        final int w02 = org.telegram.ui.ActionBar.h6.w0(i11, d6Var);
        final q5 q5Var = new q5(AndroidUtilities.dp(20.0f), da0Var);
        q5Var.k(Integer.valueOf(w02));
        q5Var.I = AndroidUtilities.dp(12.0f);
        q5Var.J = 0;
        da0Var.addOnAttachStateChangeListener(new ai.v2(q5Var, 10));
        final Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        Utilities.Callback<Object[]> callback = new Utilities.Callback() {
            @Override
            public final void run(java.lang.Object r10) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p01.run(java.lang.Object):void");
            }
        };
        callback.run(null);
        da0Var.i(q5Var);
        NotificationCenter.getInstance(i10).listen(da0Var, NotificationCenter.updateInterfaces, callback);
        NotificationCenter.getInstance(i10).listen(da0Var, NotificationCenter.userEmojiStatusUpdated, callback);
        da0Var.l(spannableStringBuilder, false);
        return k(da0Var, str);
    }

    public final void o(String str, CharSequence charSequence, Runnable runnable) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        fa0 fa0Var = new fa0(getContext(), null);
        fa0Var.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
        fa0Var.setTextSize(1, 13.0f);
        int i10 = org.telegram.ui.ActionBar.h6.f20894j5;
        org.telegram.ui.ActionBar.d6 d6Var = this.f30922a;
        fa0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        fa0Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.gc, d6Var));
        fa0Var.setMaxLines(1);
        fa0Var.setSingleLine();
        fa0Var.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(charSequence, runnable, 7), 0, spannableStringBuilder.length(), 33);
        fa0Var.setText(spannableStringBuilder);
        fa0Var.setDisablePaddingsOffsetY(true);
        fa0Var.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(10.66f), AndroidUtilities.dp(9.33f));
        frameLayout.addView(fa0Var, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 119));
        k(frameLayout, str);
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
        Paint paint = this.f30925e;
        paint.setStyle(style);
        paint.setStrokeWidth(this.f30926f);
        int i14 = org.telegram.ui.ActionBar.h6.f21036qh;
        org.telegram.ui.ActionBar.d6 d6Var = this.f30922a;
        paint.setColor(org.telegram.ui.ActionBar.h6.w0(i14, d6Var));
        Paint.Style style2 = Paint.Style.FILL;
        Paint paint2 = this.d;
        paint2.setStyle(style2);
        paint2.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21017ph, d6Var));
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            if (getChildAt(i15) instanceof TableRow) {
                TableRow tableRow = (TableRow) getChildAt(i15);
                int childCount2 = tableRow.getChildCount();
                for (int i16 = 0; i16 < childCount2; i16++) {
                    View childAt = tableRow.getChildAt(i16);
                    boolean z16 = true;
                    if (childAt instanceof s01) {
                        s01 s01Var = (s01) childAt;
                        if (i15 == 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (i15 != childCount - 1) {
                            z16 = false;
                        }
                        if (s01Var.f30579b != z15 || s01Var.f30580c != z16) {
                            s01Var.f30579b = z15;
                            s01Var.f30580c = z16;
                            s01Var.invalidate();
                        }
                    } else if (childAt instanceof q01) {
                        q01 q01Var = (q01) childAt;
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
                        if (q01Var.f29946b != z12 || q01Var.f29947c != z13) {
                            q01Var.f29946b = z12;
                            q01Var.f29947c = z13;
                            q01Var.invalidate();
                        }
                        if (i16 == 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (i16 != childCount2 - 1) {
                            z16 = false;
                        }
                        if (q01Var.d != z14 || q01Var.f29948e != z16) {
                            q01Var.d = z14;
                            q01Var.f29948e = z16;
                            q01Var.invalidate();
                        }
                    } else if (childAt instanceof r01) {
                        r01 r01Var = (r01) childAt;
                        if (i15 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i15 != childCount - 1) {
                            z16 = false;
                        }
                        if (r01Var.f30293c != z11 || r01Var.d != z16) {
                            r01Var.f30293c = z11;
                            r01Var.d = z16;
                            r01Var.invalidate();
                        }
                    }
                }
            }
        }
    }
}
