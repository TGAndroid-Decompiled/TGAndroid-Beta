package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
public final class jy extends org.telegram.ui.Components.vk0 {
    public final Context f39648c;
    public final my d;

    public jy(my myVar, Context context) {
        this.d = myVar;
        this.f39648c = context;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f5505f;
        if (i9 == 1 || i9 == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.v;
    }

    @Override
    public final int j(int i9) {
        if (i9 == 0) {
            return 2;
        }
        my myVar = this.d;
        if (i9 == myVar.h) {
            return 1;
        }
        if (i9 == myVar.f40553s) {
            return 0;
        }
        return 3;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        int i10 = q1Var.f5505f;
        View view = q1Var.f5501a;
        boolean z10 = true;
        my myVar = this.d;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 3) {
                    org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                    Long l10 = (Long) myVar.f40549e.get(i9 - myVar.f40551n);
                    long longValue = l10.longValue();
                    if (DialogObject.isUserDialog(longValue)) {
                        TLRPC.User user = myVar.getMessagesController().getUser(l10);
                        if (i9 == myVar.f40552r - 1) {
                            z10 = false;
                        }
                        g4Var.e(user, null, null, z10);
                        return;
                    }
                    TLRPC.Chat chat = myVar.getMessagesController().getChat(Long.valueOf(-longValue));
                    if (i9 == myVar.f40552r - 1) {
                        z10 = false;
                    }
                    g4Var.e(chat, null, null, z10);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
            p8Var.e(-1, org.telegram.ui.ActionBar.f6.f23229q6);
            Context context = this.f39648c;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23128k7, false), mode));
            org.telegram.ui.Components.fq fqVar = new org.telegram.ui.Components.fq(drawable, drawable2);
            String string = LocaleController.getString(R.string.SelectChats);
            if (myVar.f40551n == -1) {
                z10 = false;
            }
            p8Var.n(string, fqVar, z10);
            p8Var.getImageView().setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
            return;
        }
        org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
        if (i9 == myVar.f40553s) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i11 = myVar.f40554w;
            if (i11 == 0) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.EditWidgetChatsInfo));
            } else if (i11 == 1) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.EditWidgetContactsInfo));
            }
            if (SharedConfig.passcodeHash.length() > 0) {
                spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.WidgetPasscode2)));
            }
            b9Var.setText(spannableStringBuilder);
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        ly lyVar;
        int i10;
        Context context = this.f39648c;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    FrameLayout g4Var = new org.telegram.ui.Cells.g4(context, 0, 0, false);
                    ImageView imageView = new ImageView(context);
                    imageView.setImageResource(R.drawable.list_reorder);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    g4Var.setTag(R.id.object_tag, imageView);
                    if (LocaleController.isRTL) {
                        i10 = 3;
                    } else {
                        i10 = 5;
                    }
                    g4Var.addView(imageView, g7.e6.d(40, -1.0f, i10 | 16, 10.0f, 0.0f, 10.0f, 0.0f));
                    imageView.setOnTouchListener(new kh.r1(5, this, g4Var));
                    imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22968b9, false), PorterDuff.Mode.MULTIPLY));
                    lyVar = g4Var;
                } else {
                    my myVar = this.d;
                    ly lyVar2 = new ly(myVar, context);
                    myVar.f40550f = lyVar2;
                    lyVar = lyVar2;
                }
            } else {
                FrameLayout p8Var = new org.telegram.ui.Cells.p8(context);
                p8Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
                lyVar = p8Var;
            }
        } else {
            FrameLayout b9Var = new org.telegram.ui.Cells.b9(context);
            b9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.f22966b7));
            lyVar = b9Var;
        }
        return new f2.q1(lyVar);
    }

    @Override
    public final void y(f2.q1 q1Var) {
        int i9 = q1Var.f5505f;
        if (i9 != 3 && i9 != 1) {
            return;
        }
        q1Var.f5501a.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
    }
}
