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
public final class iy extends org.telegram.ui.Components.lm0 {
    public final Context f40367c;
    public Drawable d;
    public Drawable e;
    public final ly f40368f;

    public iy(ly lyVar, Context context) {
        this.f40368f = lyVar;
        this.f40367c = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f47741f;
        if (i10 == 1 || i10 == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f40368f.v;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 2;
        }
        ly lyVar = this.f40368f;
        if (i10 == lyVar.h) {
            return 1;
        }
        if (i10 == lyVar.f41398s) {
            return 0;
        }
        return 3;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        int i11 = e1Var.f47741f;
        View view = e1Var.f47738a;
        boolean z10 = true;
        ly lyVar = this.f40368f;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 3) {
                    org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
                    Long l4 = (Long) lyVar.e.get(i10 - lyVar.f41396n);
                    long longValue = l4.longValue();
                    if (DialogObject.isUserDialog(longValue)) {
                        TLRPC.User user = lyVar.getMessagesController().getUser(l4);
                        if (i10 == lyVar.f41397r - 1) {
                            z10 = false;
                        }
                        k4Var.e(user, null, null, z10);
                        return;
                    }
                    TLRPC.Chat chat = lyVar.getMessagesController().getChat(Long.valueOf(-longValue));
                    if (i10 == lyVar.f41397r - 1) {
                        z10 = false;
                    }
                    k4Var.e(chat, null, null, z10);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
            v8Var.g(-1, org.telegram.ui.ActionBar.y6.f23597q6);
            if (this.d == null) {
                Context context = this.f40367c;
                this.d = context.getResources().getDrawable(R.drawable.poll_add_circle);
                this.e = context.getResources().getDrawable(R.drawable.poll_add_plus);
            }
            Drawable drawable = this.d;
            Drawable drawable2 = this.e;
            int i12 = org.telegram.ui.ActionBar.y6.N6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.f7.y(v8Var, drawable, i12, null, mode);
            org.telegram.ui.ActionBar.f7.y(v8Var, drawable2, org.telegram.ui.ActionBar.y6.f23485k7, null, mode);
            org.telegram.ui.Components.ar arVar = new org.telegram.ui.Components.ar(drawable, drawable2);
            String string = LocaleController.getString(R.string.SelectChats);
            if (lyVar.f41396n == -1) {
                z10 = false;
            }
            v8Var.p(string, arVar, z10);
            v8Var.getImageView().setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
            return;
        }
        org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
        if (i10 == lyVar.f41398s) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i13 = lyVar.f41399w;
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
        ky kyVar;
        int i11;
        Context context = this.f40367c;
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
                    k4Var.addView(imageView, org.telegram.ui.Components.gb1.h(40, -1.0f, i11 | 16, 10.0f, 0.0f, 10.0f, 0.0f));
                    imageView.setOnTouchListener(new fi.o1(5, this, k4Var));
                    org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.f23320b9, null, PorterDuff.Mode.MULTIPLY);
                    kyVar = k4Var;
                } else {
                    ly lyVar = this.f40368f;
                    ky kyVar2 = new ky(lyVar, context);
                    lyVar.f41395f = kyVar2;
                    kyVar = kyVar2;
                }
            } else {
                FrameLayout v8Var = new org.telegram.ui.Cells.v8(context);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, v8Var, null);
                kyVar = v8Var;
            }
        } else {
            FrameLayout i9Var = new org.telegram.ui.Cells.i9(context);
            org.telegram.ui.ActionBar.f7.a0(R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.y6.f23318b7, context, i9Var, null);
            kyVar = i9Var;
        }
        return new s4.e1(kyVar);
    }

    @Override
    public final void y(s4.e1 e1Var) {
        int i10 = e1Var.f47741f;
        if (i10 != 3 && i10 != 1) {
            return;
        }
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, e1Var.f47738a, null);
    }
}
