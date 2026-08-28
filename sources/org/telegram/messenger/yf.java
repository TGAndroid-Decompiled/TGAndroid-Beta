package org.telegram.messenger;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dy;
public final class yf implements Runnable {
    public final int f22250a;
    public final long f22251b;
    public final boolean f22252c;
    public final int d;
    public final Object f22253e;
    public final Object f22254f;

    public yf(BaseController baseController, long j10, List list, boolean z10, int i9, int i10) {
        this.f22250a = i10;
        this.f22253e = baseController;
        this.f22251b = j10;
        this.f22254f = list;
        this.f22252c = z10;
        this.d = i9;
    }

    @Override
    public final void run() {
        ih.e7 e7Var;
        TL_stories.StoryItem storyItem;
        int i9 = this.f22250a;
        Object obj = this.f22254f;
        Object obj2 = this.f22253e;
        switch (i9) {
            case 0:
                ((MessagesStorage) obj2).lambda$saveTopics$47(this.f22251b, (List) obj, this.f22252c, this.d);
                return;
            case 1:
                ((TopicsController) obj2).lambda$loadTopics$0(this.f22251b, (ArrayList) obj, this.f22252c, this.d);
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.f35493x1;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    int i10 = 0;
                    while (true) {
                        e7Var = null;
                        if (i10 < tL_stories_stories.stories.size()) {
                            if (tL_stories_stories.stories.get(i10).f22617id == this.d) {
                                storyItem = tL_stories_stories.stories.get(i10);
                            } else {
                                i10++;
                            }
                        } else {
                            storyItem = null;
                        }
                    }
                    if (storyItem != null) {
                        long j10 = this.f22251b;
                        storyItem.dialogId = j10;
                        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                        if (R != null) {
                            if (R instanceof dy) {
                                try {
                                    e7Var = ih.e7.a(((dy) R).A0.h);
                                } catch (Exception unused) {
                                }
                            }
                            ih.e7 e7Var2 = e7Var;
                            R.getOrCreateStoryViewer().v();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(Long.valueOf(j10));
                            if (this.f22252c) {
                                R.getOrCreateStoryViewer().f11826s1 = true;
                            }
                            R.getOrCreateStoryViewer().G(launchActivity, storyItem, arrayList, 0, null, null, e7Var2, false);
                            return;
                        }
                        return;
                    }
                }
                org.telegram.ui.Components.oc.X().Q(R.raw.error, 36, LocaleController.getString(R.string.StoryNotFound)).k(false);
                return;
        }
    }

    public yf(LaunchActivity launchActivity, TLObject tLObject, int i9, long j10, boolean z10) {
        this.f22250a = 2;
        this.f22253e = launchActivity;
        this.f22254f = tLObject;
        this.d = i9;
        this.f22251b = j10;
        this.f22252c = z10;
    }
}
