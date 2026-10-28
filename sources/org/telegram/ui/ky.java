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
public final class ky extends org.telegram.ui.Components.mm0 {
    public final Context f40933c;
    public Drawable d;
    public Drawable e;
    public final ny f40934f;

    public ky(ny nyVar, Context context) {
        this.f40934f = nyVar;
        this.f40933c = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f47776f;
        if (i10 == 1 || i10 == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f40934f.v;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 2;
        }
        ny nyVar = this.f40934f;
        if (i10 == nyVar.h) {
            return 1;
        }
        if (i10 == nyVar.f41922s) {
            return 0;
        }
        return 3;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        int i11 = e1Var.f47776f;
        View view = e1Var.f47773a;
        boolean z10 = true;
        ny nyVar = this.f40934f;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 3) {
                    org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
                    Long l4 = (Long) nyVar.e.get(i10 - nyVar.f41920n);
                    long longValue = l4.longValue();
                    if (DialogObject.isUserDialog(longValue)) {
                        TLRPC.User user = nyVar.getMessagesController().getUser(l4);
                        if (i10 == nyVar.f41921r - 1) {
                            z10 = false;
                        }
                        k4Var.e(user, null, null, z10);
                        return;
                    }
                    TLRPC.Chat chat = nyVar.getMessagesController().getChat(Long.valueOf(-longValue));
                    if (i10 == nyVar.f41921r - 1) {
                        z10 = false;
                    }
                    k4Var.e(chat, null, null, z10);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
            v8Var.g(-1, org.telegram.ui.ActionBar.y6.f23598q6);
            if (this.d == null) {
                Context context = this.f40933c;
                this.d = context.getResources().getDrawable(R.drawable.poll_add_circle);
                this.e = context.getResources().getDrawable(R.drawable.poll_add_plus);
            }
            Drawable drawable = this.d;
            Drawable drawable2 = this.e;
            int i12 = org.telegram.ui.ActionBar.y6.N6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.f7.y(v8Var, drawable, i12, null, mode);
            org.telegram.ui.ActionBar.f7.y(v8Var, drawable2, org.telegram.ui.ActionBar.y6.f23486k7, null, mode);
            org.telegram.ui.Components.ar arVar = new org.telegram.ui.Components.ar(drawable, drawable2);
            String string = LocaleController.getString(R.string.SelectChats);
            if (nyVar.f41920n == -1) {
                z10 = false;
            }
            v8Var.p(string, arVar, z10);
            v8Var.getImageView().setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
            return;
        }
        org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
        if (i10 == nyVar.f41922s) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i13 = nyVar.f41923w;
            if (i13 == 0) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.EditWidgetChatsInfo));
            } else if (i13 == 1) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.EditWidgetContactsInfo));
            }
            if (SharedConfig.passcodeHash.length() > 0) {
                spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.WidgetPasscode2)));
            }
            i9Var.setText(spannableStringBuilder);
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        my myVar;
        int i11;
        Context context = this.f40933c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    FrameLayout k4Var = new org.telegram.ui.Cells.k4(context, 0, 0, false);
                    ImageView imageView = new ImageView(context);
                    imageView.setImageResource(R.drawable.list_reorder);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    k4Var.setTag(R.id.object_tag, imageView);
                    if (LocaleController.isRTL) {
                        i11 = 3;
                    } else {
                        i11 = 5;
                    }
                    k4Var.addView(imageView, org.telegram.ui.Components.kb1.h(40, -1.0f, i11 | 16, 10.0f, 0.0f, 10.0f, 0.0f));
                    imageView.setOnTouchListener(new fi.o1(5, this, k4Var));
                    org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.f23321b9, null, PorterDuff.Mode.MULTIPLY);
                    myVar = k4Var;
                } else {
                    ny nyVar = this.f40934f;
                    my myVar2 = new my(nyVar, context);
                    nyVar.f41919f = myVar2;
                    myVar = myVar2;
                }
            } else {
                FrameLayout v8Var = new org.telegram.ui.Cells.v8(context);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23357d6, v8Var, null);
                myVar = v8Var;
            }
        } else {
            FrameLayout i9Var = new org.telegram.ui.Cells.i9(context);
            org.telegram.ui.ActionBar.f7.a0(R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.y6.f23319b7, context, i9Var, null);
            myVar = i9Var;
        }
        return new s4.e1(myVar);
    }

    @Override
    public final void y(s4.e1 e1Var) {
        int i10 = e1Var.f47776f;
        if (i10 != 3 && i10 != 1) {
            return;
        }
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23357d6, e1Var.f47773a, null);
    }
}
