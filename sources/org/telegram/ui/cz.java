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
public final class cz extends org.telegram.ui.Components.ul0 {
    public final Context f31790c;
    public final fz d;

    public cz(fz fzVar, Context context) {
        this.d = fzVar;
        this.f31790c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f41613f;
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
        fz fzVar = this.d;
        if (i10 == fzVar.h) {
            return 1;
        }
        if (i10 == fzVar.f32942s) {
            return 0;
        }
        return 3;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f41613f;
        View view = c1Var.f41610a;
        boolean z10 = true;
        fz fzVar = this.d;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 3) {
                    org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
                    Long l4 = (Long) fzVar.e.get(i10 - fzVar.f32940n);
                    long longValue = l4.longValue();
                    if (DialogObject.isUserDialog(longValue)) {
                        TLRPC.User user = fzVar.getMessagesController().getUser(l4);
                        if (i10 == fzVar.f32941r - 1) {
                            z10 = false;
                        }
                        g4Var.e(user, null, null, z10);
                        return;
                    }
                    TLRPC.Chat chat = fzVar.getMessagesController().getChat(Long.valueOf(-longValue));
                    if (i10 == fzVar.f32941r - 1) {
                        z10 = false;
                    }
                    g4Var.e(chat, null, null, z10);
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
            s8Var.e(-1, org.telegram.ui.ActionBar.j6.q6);
            Context context = this.f31790c;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18056k7, false), mode));
            org.telegram.ui.Components.vq vqVar = new org.telegram.ui.Components.vq(drawable, drawable2);
            String string = LocaleController.getString(R.string.SelectChats);
            if (fzVar.f32940n == -1) {
                z10 = false;
            }
            s8Var.n(string, vqVar, z10);
            s8Var.getImageView().setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
            return;
        }
        org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
        if (i10 == fzVar.f32942s) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i12 = fzVar.f32943w;
            if (i12 == 0) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.EditWidgetChatsInfo));
            } else if (i12 == 1) {
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.EditWidgetContactsInfo));
            }
            if (SharedConfig.passcodeHash.length() > 0) {
                spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.WidgetPasscode2)));
            }
            f9Var.setText(spannableStringBuilder);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        ez ezVar;
        int i11;
        Context context = this.f31790c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    FrameLayout g4Var = new org.telegram.ui.Cells.g4(context, 0, 0, false);
                    ImageView imageView = new ImageView(context);
                    imageView.setImageResource(R.drawable.list_reorder);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    g4Var.setTag(R.id.object_tag, imageView);
                    if (LocaleController.isRTL) {
                        i11 = 3;
                    } else {
                        i11 = 5;
                    }
                    g4Var.addView(imageView, w7.a6.d(40, -1.0f, i11 | 16, 10.0f, 0.0f, 10.0f, 0.0f));
                    imageView.setOnTouchListener(new bi.x1(5, this, g4Var));
                    imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17894b9, false), PorterDuff.Mode.MULTIPLY));
                    ezVar = g4Var;
                } else {
                    fz fzVar = this.d;
                    ez ezVar2 = new ez(fzVar, context);
                    fzVar.f32939f = ezVar2;
                    ezVar = ezVar2;
                }
            } else {
                FrameLayout s8Var = new org.telegram.ui.Cells.s8(context);
                s8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
                ezVar = s8Var;
            }
        } else {
            FrameLayout f9Var = new org.telegram.ui.Cells.f9(context);
            f9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f17892b7));
            ezVar = f9Var;
        }
        return new s4.c1(ezVar);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        int i10 = c1Var.f41613f;
        if (i10 != 3 && i10 != 1) {
            return;
        }
        c1Var.f41610a.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
    }
}
