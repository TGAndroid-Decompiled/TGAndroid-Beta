package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class g8 extends GestureDetector.SimpleOnGestureListener {
    public final Context f36337a;
    public final i8 f36338b;

    public g8(i8 i8Var, Context context) {
        this.f36338b = i8Var;
        this.f36337a = context;
    }

    public final j8 a(float f7, float f10) {
        j8 j8Var;
        i8 i8Var = this.f36338b;
        if (i8Var.f37060n == null) {
            return null;
        }
        int i10 = i8Var.e;
        float measuredWidth = i8Var.getMeasuredWidth() / 7.0f;
        float dp = AndroidUtilities.dp(52.0f);
        int dp2 = AndroidUtilities.dp(44.0f) / 2;
        int i11 = 0;
        for (int i12 = 0; i12 < i8Var.d; i12++) {
            float f11 = (measuredWidth / 2.0f) + (i10 * measuredWidth);
            float dp3 = (dp / 2.0f) + (i11 * dp) + AndroidUtilities.dp(44.0f);
            float f12 = dp2;
            if (f7 >= f11 - f12 && f7 <= f11 + f12 && f10 >= dp3 - f12 && f10 <= dp3 + f12 && (j8Var = (j8) i8Var.f37060n.get(i12, null)) != null) {
                return j8Var;
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
        final j8 a2;
        super.onLongPress(motionEvent);
        i8 i8Var = this.f36338b;
        l8 l8Var = i8Var.f37064x;
        if (l8Var.f37873e0 == 0 && !AndroidUtilities.isTablet() && (a2 = a(motionEvent.getX(), motionEvent.getY())) != null) {
            try {
                i8Var.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            Bundle bundle = new Bundle();
            long j10 = l8Var.f37886x;
            if (j10 > 0) {
                bundle.putLong("user_id", j10);
            } else {
                bundle.putLong("chat_id", -j10);
            }
            bundle.putInt("start_from_date", a2.h);
            bundle.putBoolean("need_remove_previous_same_chat_activity", false);
            fo foVar = new fo(bundle);
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 0, l8Var.getParentActivity(), l8Var.getResourceProvider());
            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(l8Var.getThemedColor(org.telegram.ui.ActionBar.g6.G8));
            org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(l8Var.getParentActivity(), true, false);
            e1Var.g(LocaleController.getString(R.string.JumpToDate), R.drawable.msg_message, null);
            e1Var.setMinimumWidth(160);
            e1Var.setOnClickListener(new View.OnClickListener(this) {
                public final g8 f35184b;

                {
                    this.f35184b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.b5 b5Var;
                    org.telegram.ui.ActionBar.b5 b5Var2;
                    org.telegram.ui.ActionBar.b5 b5Var3;
                    org.telegram.ui.ActionBar.b5 b5Var4;
                    switch (r3) {
                        case 0:
                            g8 g8Var = this.f35184b;
                            l8 l8Var2 = g8Var.f36338b.f37064x;
                            b5Var = ((org.telegram.ui.ActionBar.m2) l8Var2).parentLayout;
                            if (b5Var != null) {
                                b5Var2 = ((org.telegram.ui.ActionBar.m2) l8Var2).parentLayout;
                                if (b5Var2.getFragmentStack().size() >= 3) {
                                    b5Var3 = ((org.telegram.ui.ActionBar.m2) l8Var2).parentLayout;
                                    List fragmentStack = b5Var3.getFragmentStack();
                                    b5Var4 = ((org.telegram.ui.ActionBar.m2) l8Var2).parentLayout;
                                    org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) fragmentStack.get(b5Var4.getFragmentStack().size() - 3);
                                    if (m2Var instanceof fo) {
                                        AndroidUtilities.runOnUIThread(new t1(g8Var, (fo) m2Var, a2, 5), 300L);
                                    }
                                }
                            }
                            l8Var2.finishPreviewFragment();
                            return;
                        default:
                            i8 i8Var2 = this.f35184b.f36338b;
                            l8 l8Var3 = i8Var2.f37064x;
                            int i10 = a2.h;
                            l8Var3.Q = i10;
                            l8Var3.P = i10;
                            l8Var3.G = true;
                            l8Var3.t0();
                            l8 l8Var4 = i8Var2.f37064x;
                            l8Var4.o0();
                            l8Var4.finishPreviewFragment();
                            return;
                    }
                }
            });
            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var);
            if (l8Var.f37872d0) {
                org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(l8Var.getParentActivity(), false, false);
                e1Var2.g(LocaleController.getString(R.string.SelectThisDay), R.drawable.msg_select, null);
                e1Var2.setMinimumWidth(160);
                e1Var2.setOnClickListener(new View.OnClickListener(this) {
                    public final g8 f35184b;

                    {
                        this.f35184b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        org.telegram.ui.ActionBar.b5 b5Var;
                        org.telegram.ui.ActionBar.b5 b5Var2;
                        org.telegram.ui.ActionBar.b5 b5Var3;
                        org.telegram.ui.ActionBar.b5 b5Var4;
                        switch (r3) {
                            case 0:
                                g8 g8Var = this.f35184b;
                                l8 l8Var2 = g8Var.f36338b.f37064x;
                                b5Var = ((org.telegram.ui.ActionBar.m2) l8Var2).parentLayout;
                                if (b5Var != null) {
                                    b5Var2 = ((org.telegram.ui.ActionBar.m2) l8Var2).parentLayout;
                                    if (b5Var2.getFragmentStack().size() >= 3) {
                                        b5Var3 = ((org.telegram.ui.ActionBar.m2) l8Var2).parentLayout;
                                        List fragmentStack = b5Var3.getFragmentStack();
                                        b5Var4 = ((org.telegram.ui.ActionBar.m2) l8Var2).parentLayout;
                                        org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) fragmentStack.get(b5Var4.getFragmentStack().size() - 3);
                                        if (m2Var instanceof fo) {
                                            AndroidUtilities.runOnUIThread(new t1(g8Var, (fo) m2Var, a2, 5), 300L);
                                        }
                                    }
                                }
                                l8Var2.finishPreviewFragment();
                                return;
                            default:
                                i8 i8Var2 = this.f35184b.f36338b;
                                l8 l8Var3 = i8Var2.f37064x;
                                int i10 = a2.h;
                                l8Var3.Q = i10;
                                l8Var3.P = i10;
                                l8Var3.G = true;
                                l8Var3.t0();
                                l8 l8Var4 = i8Var2.f37064x;
                                l8Var4.o0();
                                l8Var4.finishPreviewFragment();
                                return;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var2);
                org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(l8Var.getParentActivity(), false, true);
                e1Var3.g(LocaleController.getString(R.string.ClearHistory), R.drawable.msg_delete, null);
                e1Var3.setMinimumWidth(160);
                e1Var3.setOnClickListener(new View.OnClickListener(this) {
                    public final g8 f35478b;

                    {
                        this.f35478b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        org.telegram.ui.ActionBar.b5 b5Var;
                        org.telegram.ui.ActionBar.b5 b5Var2;
                        org.telegram.ui.ActionBar.b5 b5Var3;
                        switch (r2) {
                            case 0:
                                g8 g8Var = this.f35478b;
                                l8 l8Var2 = g8Var.f36338b.f37064x;
                                b5Var = ((org.telegram.ui.ActionBar.m2) l8Var2).parentLayout;
                                if (b5Var.getFragmentStack().size() >= 3) {
                                    b5Var2 = ((org.telegram.ui.ActionBar.m2) l8Var2).parentLayout;
                                    List fragmentStack = b5Var2.getFragmentStack();
                                    b5Var3 = ((org.telegram.ui.ActionBar.m2) l8Var2).parentLayout;
                                    org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) fragmentStack.get(b5Var3.getFragmentStack().size() - 3);
                                    if (m2Var instanceof fo) {
                                        org.telegram.ui.Components.g5.q(l8Var2, 1, l8Var2.getMessagesController().getUser(Long.valueOf(l8Var2.f37886x)), null, false, new f8(g8Var, (fo) m2Var), null);
                                    }
                                }
                                l8Var2.finishPreviewFragment();
                                return;
                            default:
                                this.f35478b.f36338b.f37064x.finishPreviewFragment();
                                return;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(e1Var3);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
            l8Var.v = new di.ab(this, this.f36337a, 10);
            l8Var.v.setOnClickListener(new View.OnClickListener(this) {
                public final g8 f35478b;

                {
                    this.f35478b = this;
                }

                @Override
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.b5 b5Var;
                    org.telegram.ui.ActionBar.b5 b5Var2;
                    org.telegram.ui.ActionBar.b5 b5Var3;
                    switch (r2) {
                        case 0:
                            g8 g8Var = this.f35478b;
                            l8 l8Var2 = g8Var.f36338b.f37064x;
                            b5Var = ((org.telegram.ui.ActionBar.m2) l8Var2).parentLayout;
                            if (b5Var.getFragmentStack().size() >= 3) {
                                b5Var2 = ((org.telegram.ui.ActionBar.m2) l8Var2).parentLayout;
                                List fragmentStack = b5Var2.getFragmentStack();
                                b5Var3 = ((org.telegram.ui.ActionBar.m2) l8Var2).parentLayout;
                                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) fragmentStack.get(b5Var3.getFragmentStack().size() - 3);
                                if (m2Var instanceof fo) {
                                    org.telegram.ui.Components.g5.q(l8Var2, 1, l8Var2.getMessagesController().getUser(Long.valueOf(l8Var2.f37886x)), null, false, new f8(g8Var, (fo) m2Var), null);
                                }
                            }
                            l8Var2.finishPreviewFragment();
                            return;
                        default:
                            this.f35478b.f36338b.f37064x.finishPreviewFragment();
                            return;
                    }
                }
            });
            l8Var.v.setVisibility(8);
            l8Var.v.setFitsSystemWindows(true);
            l8.a0(l8Var).getOverlayContainerView().addView(l8Var.v, w7.a6.d(-1.0f, -1));
            l8.b0(l8Var);
            l8Var.presentFragmentAsPreviewWithMenu(foVar, actionBarPopupWindow$ActionBarPopupWindowLayout);
        }
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        j8 a2;
        MessageObject messageObject;
        ji.d4 d4Var;
        i8 i8Var = this.f36338b;
        l8 l8Var = i8Var.f37064x;
        if (l8.V(l8Var) != null) {
            if (((l8Var.f37873e0 == 1 && i8Var.f37060n != null) || l8Var.f37875f0 != null) && (a2 = a(motionEvent.getX(), motionEvent.getY())) != null && (messageObject = a2.f37302a) != null && (d4Var = l8Var.M) != null) {
                if (l8Var.f37875f0 != null) {
                    bi.sb orCreateStoryViewer = l8Var.getOrCreateStoryViewer();
                    Context context = i8Var.getContext();
                    MessageObject messageObject2 = a2.f37302a;
                    TL_stories.StoryItem storyItem = messageObject2.storyItem;
                    int id2 = messageObject2.getId();
                    bi.o8 o8Var = l8Var.f37875f0;
                    g gVar = l8Var.f37876g0;
                    orCreateStoryViewer.h = UserConfig.selectedAccount;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(o8Var.d));
                    orCreateStoryViewer.P0 = id2;
                    orCreateStoryViewer.G(context, storyItem, arrayList, 0, o8Var, null, gVar, true);
                } else {
                    int id3 = messageObject.getId();
                    int i10 = a2.f37304c;
                    org.telegram.ui.Components.xv0 xv0Var = (org.telegram.ui.Components.xv0) d4Var.f13233b;
                    int i11 = -1;
                    for (int i12 = 0; i12 < xv0Var.f31384t1[0].f27508a.size(); i12++) {
                        if (((MessageObject) xv0Var.f31384t1[0].f27508a.get(i12)).getId() == id3) {
                            i11 = i12;
                        }
                    }
                    org.telegram.ui.Components.qu0 W = xv0Var.W(0);
                    if (i11 >= 0 && W != null) {
                        W.f28683x.h1(i11, 0);
                    } else {
                        xv0Var.y0(0, id3, i10, true);
                    }
                    if (W != null) {
                        W.J = id3;
                        W.K = false;
                    }
                    l8Var.finishFragment();
                }
            }
            if (i8Var.f37060n != null) {
                if (l8Var.G) {
                    j8 a10 = a(motionEvent.getX(), motionEvent.getY());
                    if (a10 != null) {
                        ValueAnimator valueAnimator = l8Var.R;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            l8Var.R = null;
                        }
                        int i13 = l8Var.P;
                        if (i13 == 0 && l8Var.Q == 0) {
                            int i14 = a10.h;
                            l8Var.Q = i14;
                            l8Var.P = i14;
                        } else {
                            int i15 = a10.h;
                            if (i13 == i15 && l8Var.Q == i15) {
                                l8Var.Q = 0;
                                l8Var.P = 0;
                            } else if (i13 == i15) {
                                l8Var.P = l8Var.Q;
                            } else {
                                int i16 = l8Var.Q;
                                if (i16 == i15) {
                                    l8Var.Q = i13;
                                } else if (i13 == i16) {
                                    if (i15 > i16) {
                                        l8Var.Q = i15;
                                    } else {
                                        l8Var.P = i15;
                                    }
                                } else {
                                    l8Var.Q = i15;
                                    l8Var.P = i15;
                                }
                            }
                        }
                        l8Var.t0();
                        l8Var.o0();
                        return false;
                    }
                } else {
                    j8 a11 = a(motionEvent.getX(), motionEvent.getY());
                    if (a11 != null && l8.W(l8Var) != null && l8.X(l8Var).getFragmentStack().size() >= 2) {
                        org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) l8.Z(l8Var).getFragmentStack().get(l8.Y(l8Var).getFragmentStack().size() - 2);
                        if (m2Var instanceof fo) {
                            l8Var.finishFragment();
                            ((fo) m2Var).L9(a11.h);
                            return false;
                        }
                    } else if (a11 != null && l8Var.N != null) {
                        l8Var.finishFragment();
                        l8Var.N.L9(a11.h);
                    }
                }
            }
        }
        return false;
    }
}
