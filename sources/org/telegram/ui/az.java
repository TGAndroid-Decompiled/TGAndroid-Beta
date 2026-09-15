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
public final class az extends org.telegram.ui.Components.kl0 {
    public final Context f32008c;
    public final dz d;

    public az(dz dzVar, Context context) {
        this.d = dzVar;
        this.f32008c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42678f;
        if (i10 == 1 || i10 == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.v;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 2;
        }
        dz dzVar = this.d;
        if (i10 == dzVar.h) {
            return 1;
        }
        if (i10 == dzVar.f33169s) {
            return 0;
        }
        return 3;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f42678f;
        View view = c1Var.f42675a;
        boolean z10 = true;
        dz dzVar = this.d;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 3) {
                    org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
                    Long l4 = (Long) dzVar.e.get(i10 - dzVar.f33167n);
                    long longValue = l4.longValue();
                    if (DialogObject.isUserDialog(longValue)) {
                        TLRPC.User user = dzVar.getMessagesController().getUser(l4);
                        if (i10 == dzVar.f33168r - 1) {
                            z10 = false;
                        }
                        f4Var.e(user, null, null, z10);
                        return;
                    }
                    TLRPC.Chat chat = dzVar.getMessagesController().getChat(Long.valueOf(-longValue));
                    if (i10 == dzVar.f33168r - 1) {
                        z10 = false;
                    }
                    f4Var.e(chat, null, null, z10);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            r8Var.e(-1, org.telegram.ui.ActionBar.i6.q6);
            Context context = this.f32008c;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18965k7, false), mode));
            org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(drawable, drawable2);
            String string = LocaleController.getString(R.string.SelectChats);
            if (dzVar.f33167n == -1) {
                z10 = false;
            }
            r8Var.n(string, pqVar, z10);
            r8Var.getImageView().setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
            return;
        }
        org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
        if (i10 == dzVar.f33169s) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i12 = dzVar.f33170w;
            if (i12 == 0) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.EditWidgetChatsInfo));
            } else if (i12 == 1) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.EditWidgetContactsInfo));
            }
            if (SharedConfig.passcodeHash.length() > 0) {
                spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.WidgetPasscode2)));
            }
            e9Var.setText(spannableStringBuilder);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        cz czVar;
        int i11;
        Context context = this.f32008c;
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
                    f4Var.addView(imageView, w7.x5.d(40, -1.0f, i11 | 16, 10.0f, 0.0f, 10.0f, 0.0f));
                    imageView.setOnTouchListener(new ci.q1(5, this, f4Var));
                    imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18802b9, false), PorterDuff.Mode.MULTIPLY));
                    czVar = f4Var;
                } else {
                    dz dzVar = this.d;
                    cz czVar2 = new cz(dzVar, context);
                    dzVar.f33166f = czVar2;
                    czVar = czVar2;
                }
            } else {
                FrameLayout r8Var = new org.telegram.ui.Cells.r8(context);
                r8Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18836d6, false));
                czVar = r8Var;
            }
        } else {
            FrameLayout e9Var = new org.telegram.ui.Cells.e9(context);
            e9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.i6.f18800b7));
            czVar = e9Var;
        }
        return new s4.c1(czVar);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        int i10 = c1Var.f42678f;
        if (i10 != 3 && i10 != 1) {
            return;
        }
        c1Var.f42675a.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18836d6, false));
    }
}
