package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
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
public final class ky extends org.telegram.ui.Components.lm0 {
    public final Context f39086c;
    public Drawable d;
    public Drawable e;
    public final ny f39087f;

    public ky(ny nyVar, Context context) {
        this.f39087f = nyVar;
        this.f39086c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f46346f;
        if (i10 == 1 || i10 == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f39087f.v;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 2;
        }
        ny nyVar = this.f39087f;
        if (i10 == nyVar.h) {
            return 1;
        }
        if (i10 == nyVar.f40010s) {
            return 0;
        }
        return 3;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11 = b1Var.f46346f;
        View view = b1Var.f46343a;
        boolean z10 = true;
        ny nyVar = this.f39087f;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 3) {
                    org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
                    Long l4 = (Long) nyVar.e.get(i10 - nyVar.f40008n);
                    long longValue = l4.longValue();
                    if (DialogObject.isUserDialog(longValue)) {
                        TLRPC.User user = nyVar.getMessagesController().getUser(l4);
                        if (i10 == nyVar.f40009r - 1) {
                            z10 = false;
                        }
                        f4Var.e(user, null, null, z10);
                        return;
                    }
                    TLRPC.Chat chat = nyVar.getMessagesController().getChat(Long.valueOf(-longValue));
                    if (i10 == nyVar.f40009r - 1) {
                        z10 = false;
                    }
                    f4Var.e(chat, null, null, z10);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            r8Var.g(-1, org.telegram.ui.ActionBar.k6.q6);
            if (this.d == null) {
                Context context = this.f39086c;
                this.d = context.getResources().getDrawable(R.drawable.poll_add_circle);
                this.e = context.getResources().getDrawable(R.drawable.poll_add_plus);
            }
            Drawable drawable = this.d;
            Drawable drawable2 = this.e;
            int i12 = org.telegram.ui.ActionBar.k6.N6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.r6.z(r8Var, drawable, i12, null, mode);
            org.telegram.ui.ActionBar.r6.z(r8Var, drawable2, org.telegram.ui.ActionBar.k6.f21311k7, null, mode);
            org.telegram.ui.Components.yq yqVar = new org.telegram.ui.Components.yq(drawable, drawable2);
            String string = LocaleController.getString(R.string.SelectChats);
            if (nyVar.f40008n == -1) {
                z10 = false;
            }
            r8Var.p(string, yqVar, z10);
            r8Var.getImageView().setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
            return;
        }
        org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
        if (i10 == nyVar.f40010s) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i13 = nyVar.f40011w;
            if (i13 == 0) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.EditWidgetChatsInfo));
            } else if (i13 == 1) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.EditWidgetContactsInfo));
            }
            if (SharedConfig.passcodeHash.length() > 0) {
                spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.WidgetPasscode2)));
            }
            e9Var.setText(spannableStringBuilder);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        my myVar;
        int i11;
        Context context = this.f39086c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    FrameLayout f4Var = new org.telegram.ui.Cells.f4(context, 0, 0, false);
                    ImageView imageView = new ImageView(context);
                    imageView.setImageResource(R.drawable.list_reorder);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    f4Var.setTag(R.id.object_tag, imageView);
                    if (LocaleController.isRTL) {
                        i11 = 3;
                    } else {
                        i11 = 5;
                    }
                    f4Var.addView(imageView, w7.z5.d(40, -1.0f, i11 | 16, 10.0f, 0.0f, 10.0f, 0.0f));
                    imageView.setOnTouchListener(new ei.p1(5, this, f4Var));
                    org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.f21147b9, null, PorterDuff.Mode.MULTIPLY);
                    myVar = f4Var;
                } else {
                    ny nyVar = this.f39087f;
                    my myVar2 = new my(nyVar, context);
                    nyVar.f40007f = myVar2;
                    myVar = myVar2;
                }
            } else {
                FrameLayout r8Var = new org.telegram.ui.Cells.r8(context);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21183d6, r8Var, null);
                myVar = r8Var;
            }
        } else {
            FrameLayout e9Var = new org.telegram.ui.Cells.e9(context);
            org.telegram.ui.ActionBar.r6.b0(R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.f21145b7, context, e9Var, null);
            myVar = e9Var;
        }
        return new s4.b1(myVar);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        int i10 = b1Var.f46346f;
        if (i10 != 3 && i10 != 1) {
            return;
        }
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21183d6, b1Var.f46343a, null);
    }
}
