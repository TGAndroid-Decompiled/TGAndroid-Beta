package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

public final class c8 extends GestureDetector.SimpleOnGestureListener {

    public final Context f36992a;

    public final e8 f36993b;

    public c8(e8 e8Var, Context context) {
        this.f36993b = e8Var;
        this.f36992a = context;
    }

    public final f8 a(float f10, float f11) {
        f8 f8Var;
        e8 e8Var = this.f36993b;
        if (e8Var.f37658n == null) {
            return null;
        }
        int i10 = e8Var.f37656e;
        float measuredWidth = e8Var.getMeasuredWidth() / 7.0f;
        float fDp = AndroidUtilities.dp(52.0f);
        int iDp = AndroidUtilities.dp(44.0f) / 2;
        int i11 = 0;
        for (int i12 = 0; i12 < e8Var.d; i12++) {
            float f12 = (measuredWidth / 2.0f) + (i10 * measuredWidth);
            float fDp2 = (fDp / 2.0f) + (i11 * fDp) + AndroidUtilities.dp(44.0f);
            float f13 = iDp;
            if (f10 >= f12 - f13 && f10 <= f12 + f13 && f11 >= fDp2 - f13 && f11 <= fDp2 + f13 && (f8Var = (f8) e8Var.f37658n.get(i12, null)) != null) {
                return f8Var;
            }
            i10++;
            if (i10 >= 7) {
                i11++;
                i10 = 0;
            }
        }
        return null;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        final f8 f8VarA;
        super.onLongPress(motionEvent);
        e8 e8Var = this.f36993b;
        h8 h8Var = e8Var.f37662x;
        if (h8Var.f38699a0 != 0 || AndroidUtilities.isTablet() || (f8VarA = a(motionEvent.getX(), motionEvent.getY())) == null) {
            return;
        }
        try {
            e8Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        Bundle bundle = new Bundle();
        long j10 = h8Var.f38716x;
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        bundle.putInt("start_from_date", f8VarA.h);
        bundle.putBoolean("need_remove_previous_same_chat_activity", false);
        rn rnVar = new rn(bundle);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, h8Var.getParentActivity(), h8Var.getResourceProvider());
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(h8Var.getThemedColor(org.telegram.ui.ActionBar.g6.G8));
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(h8Var.getParentActivity(), true, false);
        f1Var.g(LocaleController.getString(R.string.JumpToDate), R.drawable.msg_message, null);
        f1Var.setMinimumWidth(160);
        final int i10 = 0;
        f1Var.setOnClickListener(new View.OnClickListener(this) {

            public final c8 f45064b;

            {
                this.f45064b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        c8 c8Var = this.f45064b;
                        h8 h8Var2 = c8Var.f36993b.f37662x;
                        if (((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout != null && ((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout.getFragmentStack().size() >= 3) {
                            org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) ((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout.getFragmentStack().get(((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout.getFragmentStack().size() - 3);
                            if (n2Var instanceof rn) {
                                AndroidUtilities.runOnUIThread(new u1(c8Var, (rn) n2Var, f8VarA, 5), 300L);
                            }
                        }
                        h8Var2.finishPreviewFragment();
                        break;
                    default:
                        e8 e8Var2 = this.f45064b.f36993b;
                        h8 h8Var3 = e8Var2.f37662x;
                        int i11 = f8VarA.h;
                        h8Var3.M = i11;
                        h8Var3.L = i11;
                        h8Var3.C = true;
                        h8Var3.t0();
                        h8 h8Var4 = e8Var2.f37662x;
                        h8Var4.o0();
                        h8Var4.finishPreviewFragment();
                        break;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
        if (h8Var.Z) {
            org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(h8Var.getParentActivity(), false, false);
            f1Var2.g(LocaleController.getString(R.string.SelectThisDay), R.drawable.msg_select, null);
            f1Var2.setMinimumWidth(160);
            final int i11 = 1;
            f1Var2.setOnClickListener(new View.OnClickListener(this) {

                public final c8 f45064b;

                {
                    this.f45064b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            c8 c8Var = this.f45064b;
                            h8 h8Var2 = c8Var.f36993b.f37662x;
                            if (((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout != null && ((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout.getFragmentStack().size() >= 3) {
                                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) ((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout.getFragmentStack().get(((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout.getFragmentStack().size() - 3);
                                if (n2Var instanceof rn) {
                                    AndroidUtilities.runOnUIThread(new u1(c8Var, (rn) n2Var, f8VarA, 5), 300L);
                                }
                            }
                            h8Var2.finishPreviewFragment();
                            break;
                        default:
                            e8 e8Var2 = this.f45064b.f36993b;
                            h8 h8Var3 = e8Var2.f37662x;
                            int i12 = f8VarA.h;
                            h8Var3.M = i12;
                            h8Var3.L = i12;
                            h8Var3.C = true;
                            h8Var3.t0();
                            h8 h8Var4 = e8Var2.f37662x;
                            h8Var4.o0();
                            h8Var4.finishPreviewFragment();
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var2);
            org.telegram.ui.ActionBar.f1 f1Var3 = new org.telegram.ui.ActionBar.f1(h8Var.getParentActivity(), false, true);
            f1Var3.g(LocaleController.getString(R.string.ClearHistory), R.drawable.msg_delete, null);
            f1Var3.setMinimumWidth(160);
            final int i12 = 0;
            f1Var3.setOnClickListener(new View.OnClickListener(this) {

                public final c8 f36450b;

                {
                    this.f36450b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            c8 c8Var = this.f36450b;
                            h8 h8Var2 = c8Var.f36993b.f37662x;
                            if (((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout.getFragmentStack().size() >= 3) {
                                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) ((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout.getFragmentStack().get(((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout.getFragmentStack().size() - 3);
                                if (n2Var instanceof rn) {
                                    org.telegram.ui.Components.y4.r(h8Var2, 1, h8Var2.getMessagesController().getUser(Long.valueOf(h8Var2.f38716x)), null, false, new b8(c8Var, (rn) n2Var), null);
                                }
                            }
                            h8Var2.finishPreviewFragment();
                            break;
                        default:
                            this.f36450b.f36993b.f37662x.finishPreviewFragment();
                            break;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var3);
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        h8Var.v = new ag.s0(this, this.f36992a, 9);
        final int i13 = 1;
        h8Var.v.setOnClickListener(new View.OnClickListener(this) {

            public final c8 f36450b;

            {
                this.f36450b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        c8 c8Var = this.f36450b;
                        h8 h8Var2 = c8Var.f36993b.f37662x;
                        if (((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout.getFragmentStack().size() >= 3) {
                            org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) ((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout.getFragmentStack().get(((org.telegram.ui.ActionBar.n2) h8Var2).parentLayout.getFragmentStack().size() - 3);
                            if (n2Var instanceof rn) {
                                org.telegram.ui.Components.y4.r(h8Var2, 1, h8Var2.getMessagesController().getUser(Long.valueOf(h8Var2.f38716x)), null, false, new b8(c8Var, (rn) n2Var), null);
                            }
                        }
                        h8Var2.finishPreviewFragment();
                        break;
                    default:
                        this.f36450b.f36993b.f37662x.finishPreviewFragment();
                        break;
                }
            }
        });
        h8Var.v.setVisibility(8);
        h8Var.v.setFitsSystemWindows(true);
        ((org.telegram.ui.ActionBar.n2) h8Var).parentLayout.getOverlayContainerView().addView(h8Var.v, h7.z5.c(-1.0f, -1));
        h8.b0(h8Var);
        h8Var.presentFragmentAsPreviewWithMenu(rnVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        f8 f8VarA;
        MessageObject messageObject;
        o0.b bVar;
        e8 e8Var = this.f36993b;
        h8 h8Var = e8Var.f37662x;
        if (((org.telegram.ui.ActionBar.n2) h8Var).parentLayout != null) {
            if (((h8Var.f38699a0 == 1 && e8Var.f37658n != null) || h8Var.f38701b0 != null) && (f8VarA = a(motionEvent.getX(), motionEvent.getY())) != null && (messageObject = f8VarA.f37958a) != null && (bVar = h8Var.I) != null) {
                if (h8Var.f38701b0 != null) {
                    jh.i9 orCreateStoryViewer = h8Var.getOrCreateStoryViewer();
                    Context context = e8Var.getContext();
                    MessageObject messageObject2 = f8VarA.f37958a;
                    TL_stories.StoryItem storyItem = messageObject2.storyItem;
                    int id2 = messageObject2.getId();
                    jh.j6 j6Var = h8Var.f38701b0;
                    g gVar = h8Var.f38703c0;
                    orCreateStoryViewer.h = UserConfig.selectedAccount;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(j6Var.d));
                    orCreateStoryViewer.L0 = id2;
                    orCreateStoryViewer.F(context, storyItem, arrayList, 0, j6Var, null, gVar, true);
                } else {
                    int id3 = messageObject.getId();
                    int i10 = f8VarA.f37960c;
                    org.telegram.ui.Components.hu0 hu0Var = (org.telegram.ui.Components.hu0) bVar.f19088b;
                    int i11 = -1;
                    for (int i12 = 0; i12 < hu0Var.f29140p1[0].f34325a.size(); i12++) {
                        if (((MessageObject) hu0Var.f29140p1[0].f34325a.get(i12)).getId() == id3) {
                            i11 = i12;
                        }
                    }
                    org.telegram.ui.Components.zs0 zs0VarW = hu0Var.W(0);
                    if (i11 < 0 || zs0VarW == null) {
                        hu0Var.y0(0, id3, i10, true);
                    } else {
                        zs0VarW.f35343x.h1(i11, 0);
                    }
                    if (zs0VarW != null) {
                        zs0VarW.F = id3;
                        zs0VarW.G = false;
                    }
                    h8Var.finishFragment();
                }
            }
            if (e8Var.f37658n != null) {
                if (h8Var.C) {
                    f8 f8VarA2 = a(motionEvent.getX(), motionEvent.getY());
                    if (f8VarA2 != null) {
                        ValueAnimator valueAnimator = h8Var.N;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            h8Var.N = null;
                        }
                        int i13 = h8Var.L;
                        if (i13 == 0 && h8Var.M == 0) {
                            int i14 = f8VarA2.h;
                            h8Var.M = i14;
                            h8Var.L = i14;
                        } else {
                            int i15 = f8VarA2.h;
                            if (i13 == i15 && h8Var.M == i15) {
                                h8Var.M = 0;
                                h8Var.L = 0;
                            } else if (i13 == i15) {
                                h8Var.L = h8Var.M;
                            } else {
                                int i16 = h8Var.M;
                                if (i16 == i15) {
                                    h8Var.M = i13;
                                } else if (i13 != i16) {
                                    h8Var.M = i15;
                                    h8Var.L = i15;
                                } else if (i15 > i16) {
                                    h8Var.M = i15;
                                } else {
                                    h8Var.L = i15;
                                }
                            }
                        }
                        h8Var.t0();
                        h8Var.o0();
                        return false;
                    }
                } else {
                    f8 f8VarA3 = a(motionEvent.getX(), motionEvent.getY());
                    if (f8VarA3 != null && ((org.telegram.ui.ActionBar.n2) h8Var).parentLayout != null && ((org.telegram.ui.ActionBar.n2) h8Var).parentLayout.getFragmentStack().size() >= 2) {
                        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) ((org.telegram.ui.ActionBar.n2) h8Var).parentLayout.getFragmentStack().get(((org.telegram.ui.ActionBar.n2) h8Var).parentLayout.getFragmentStack().size() - 2);
                        if (n2Var instanceof rn) {
                            h8Var.finishFragment();
                            ((rn) n2Var).G9(f8VarA3.h);
                            return false;
                        }
                    } else if (f8VarA3 != null && h8Var.J != null) {
                        h8Var.finishFragment();
                        h8Var.J.G9(f8VarA3.h);
                    }
                }
            }
        }
        return false;
    }
}
